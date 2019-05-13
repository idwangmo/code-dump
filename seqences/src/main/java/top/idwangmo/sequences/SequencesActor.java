package top.idwangmo.sequences;

import akka.actor.AbstractActor;
import akka.actor.Props;
import akka.japi.pf.ReceiveBuilder;
import clojure.lang.Compiler;
import clojure.lang.IFn;
import jaskell.util.CR;
import top.idwangmo.messages.CreateSequences;
import top.idwangmo.messages.ListSequences;
import top.idwangmo.messages.NextValue;

/**
 * @author idwangmo
 */
public class SequencesActor extends AbstractActor {
    private final static String seq_namespace = "top.idwangmo.sequences.seq";
    private static IFn creator;
    private static IFn nextVal;
    private static IFn listSeq;

    static {
        CR.require(seq_namespace);
        creator = CR.var(seq_namespace, "create-seq").fn();
        nextVal = CR.var(seq_namespace, "next-val").fn();
        listSeq = CR.var(seq_namespace, "list-seq").fn();
    }

    public static Props props() {
        return Props.create(SequencesActor.class, SequencesActor::new);
    }

    @Override
    public Receive createReceive() {
        return ReceiveBuilder.create().match(CreateSequences.class, msg -> {
            sender().tell(creator.invoke(msg.getName()), self());
        }).match(NextValue.class, msg -> {
            sender().tell(nextVal.invoke(msg.getName()), self());
        }).match(ListSequences.class, msg -> {
            sender().tell(listSeq.invoke(), self());
        }).build();
    }

}

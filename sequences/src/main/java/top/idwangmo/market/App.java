package top.idwangmo.market;

import akka.actor.AbstractActor;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.event.Logging;
import akka.event.LoggingAdapter;
import akka.japi.pf.ReceiveBuilder;
import cn.hutool.core.thread.ThreadUtil;

/**
 * @author idwangmo
 */
public class App extends AbstractActor {

    private final LoggingAdapter log = Logging.getLogger(this.context().system(), this.getClass());

    @Override
    public Receive createReceive() {
        return ReceiveBuilder.create().match(Long.class, msg -> {
            log.info("received long: {}", msg);
        }).build();
    }

    public static void main(String[] args) {
        ActorSystem secSys = ActorSystem.create("sequences");
        ActorSystem appSys = ActorSystem.create("app");
        var seqRef = secSys.actorOf(SequencesActor.props(), "sequences");
        var mineRef = appSys.actorOf(Props.create(App.class), "ask");
        while (true) {
            seqRef.tell("next", mineRef);
            ThreadUtil.safeSleep(500);
        }
    }

}

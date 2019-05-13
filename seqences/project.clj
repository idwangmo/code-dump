(defproject seqences "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [com.typesafe.akka/akka-actor_2.12 "2.5.19"]
                 [liu.mars/jaskell "0.1.1"]
                 [message/message "0.1.0-SNAPSHOT"]
                 [org.postgresql/postgresql "42.2.5"]
                 [org.clojure/java.jdbc "0.7.8"]
                 [org.clojure/core.specs.alpha "0.1.10" :exclusions [[org.clojure/clojure] [org.clojure/spec.alpha]]]
                 [org.clojure/spec.alpha "0.1.123" :exclusions [[org.clojure/clojure]]]]
  :target-path "target/%s"
  :aot :all
  :java-source-paths ["src/main/java"]
  :source-paths ["src/main/clojure"]
  :main top.idwangmo.sequences.App
  )

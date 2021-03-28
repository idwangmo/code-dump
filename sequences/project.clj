(defproject sequences "1.0"
  :description "a demo use akka"
  :dependencies [[org.clojure/clojure "1.10.1"]
                 ;; https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor
                 [com.typesafe.akka/akka-actor_2.13 "2.6.13"]
                 ;; https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core
                 [com.fasterxml.jackson.core/jackson-core "2.12.2"]
                 ;; https://mvnrepository.com/artifact/cn.hutool/hutool-all
                 [cn.hutool/hutool-all "5.6.1"]
                 ;; https://mvnrepository.com/artifact/liu.mars/jaskell
                 [liu.mars/jaskell "0.2.9"]
                 ;; https://mvnrepository.com/artifact/org.postgresql/postgresql
                 [org.postgresql/postgresql "42.2.19"]
                 ;; https://mvnrepository.com/artifact/org.clojure/java.jdbc
                 [org.clojure/java.jdbc "0.7.12"]
                 ;; https://mvnrepository.com/artifact/org.clojure/core.specs.alpha
                 [org.clojure/core.specs.alpha "0.2.56"]
                 ;; https://mvnrepository.com/artifact/org.clojure/spec.alpha
                 [org.clojure/spec.alpha "0.2.194"]
                 [top.idwangmo/message "1.0"]
                 ]
  :source-paths ["src/main/clojure"]
  :java-source-paths ["src/main/java"]
  :aot :all
  :main top.idwangmo.market.App)

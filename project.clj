(defproject scalding-lein "0.1.0-SNAPSHOT"
  :repositories [["conjars" "http://conjars.org/repo"]]
  :plugins [[lein-scalac "0.1.0"]]
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.scala-lang/scala-library "2.9.2"]
                 [com.twitter/scalding-core_2.9.2 "0.8.4"]
                 [org.apache.hadoop/hadoop-core "1.1.2"]]
  :scala-source-path "src/main/scala"
  :prep-tasks ["scalac"]
  :main com.twitter.scalding.Tool)

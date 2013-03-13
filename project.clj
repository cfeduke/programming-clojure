(defproject programming-clojure "1.3.0"
  :description "Examples from Programming Clojure"
  :aot [examples.tasklist]
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/java.jdbc "0.2.3"]
                 [org.clojure/test.generative "0.4.0"]
                 [ring "0.3.11" :exclusions [org.clojure/clojure
                                             org.clojure/clojure-contrib]]
                 [compojure "1.1.5"]
                 [hiccup "1.0.2"]
                 [jline "0.9.94"]
                 [hsqldb "1.8.0.10"]])

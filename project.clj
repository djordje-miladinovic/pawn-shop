(defproject pawn-shop "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [ring "1.9.1"]
                 [ring/ring-json "0.5.0"]
                 [compojure "1.6.2"]
                 [hiccup "1.0.5"]
                 [org.clojure/java.jdbc "0.7.11"]
                 [mysql/mysql-connector-java "8.0.20"]]
  :repl-options {:init-ns pawn-shop.core}
  :plugins [[lein-ring "0.12.5"]]
  :ring {:handler pawn-shop.core/app}
)

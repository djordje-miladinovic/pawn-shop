(ns pawn-shop.db
  (:require [clojure.java.jdbc :as sql])
)

(def mysql-db {
               :subprotocol "mysql"
               :subname "//localhost/pawn-shop"
               :user "root"
               :password "root"
               })

(defn get-clients []
  (sql/query mysql-db
             ["SELECT * FROM client"]
             ))

(defn get-client [id]
  (sql/query mysql-db
             ["SELECT * FROM client WHERE id = ?" id]
             ))
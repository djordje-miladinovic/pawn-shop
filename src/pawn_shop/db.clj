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

(defn get-contracts []
  (sql/query mysql-db
             ["SELECT * FROM contract"]
             ))

(defn get-contract [id]
  (sql/query mysql-db
             ["SELECT * FROM contract WHERE id = ?" id]
             ))

(defn get-contract-items []
  (sql/query mysql-db
             ["SELECT * FROM contract_item"]
             ))

(defn get-contract-item [id]
  (sql/query mysql-db
             ["SELECT * FROM contract_item WHERE id = ?" id]
             ))

(defn get-contract-item-types []
  (sql/query mysql-db
             ["SELECT * FROM contract_item_type"]
             ))
(ns pawn-shop.core
  (:use compojure.core
        ring.middleware.json
        ring.util.response)
  (:require [compojure.route :as route]
            [pawn-shop.view :as view]
            [pawn-shop.db :as db]))

(defroutes handler
           (GET "/" [] (view/demo-page))
           (GET "/clients" [] (db/get-clients))
           (GET "/clients/:id" [id] (db/get-client id))
           (GET "/contracts" [] (db/get-contracts))
           (GET "/contracts/:id" [id] (db/get-contract id))
           (GET "/contract-items" [] (db/get-contract-items))
           (GET "/contract-items/:id" [id] (db/get-contract-item id))
           (GET "/contract-item-types" [] (db/get-contract-item-types))
           (GET "/api" [] (response {:username "admin" :password "admin"}))
           (route/resources "/"))

(def app (wrap-json-response handler))
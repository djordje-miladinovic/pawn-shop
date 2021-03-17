(ns pawn-shop.core
  (:use compojure.core
        ring.middleware.json
        ring.util.response)
  (:require [compojure.route :as route]
            [pawn-shop.view :as view]
            [pawn-shop.db :as db]))

(defroutes handler
           ;(GET "/" [] (view/demo-page))
           ;(GET "/" [] (database/get-client 1))
           (GET "/" [] (db/get-clients))
           (GET "/api" [] (response {:username "admin" :password "admin"}))
           (route/resources "/"))

(def app (wrap-json-response handler))
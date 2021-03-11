(ns pawn-shop.core
  (:use compojure.core
        ring.middleware.json
        ring.util.response)
  (:require [compojure.route :as route]
            [pawn-shop.view :as view]))

(defroutes handler
           (GET "/" [] (view/demo-page))
           (GET "/api" [] (response {:username "admin" :password "admin"}))
           (route/resources "/"))

(def app (wrap-json-response handler))
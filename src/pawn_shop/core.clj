(ns pawn-shop.core
  (:use compojure.core)
  (:require [compojure.route :as route]
            [pawn-shop.view :as view]))

(defroutes handler
           (GET "/" [] (view/demo-page))
           (route/resources "/"))
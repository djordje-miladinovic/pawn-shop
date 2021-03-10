(ns pawn-shop.core
  (:use compojure.core)
  (:require [compojure.route :as route]))

(defn foo [name] (str "Hello, " name))

(defroutes handler
           (GET "/" [] (foo "Djordje"))
           (route/resources "/"))
(ns pawn-shop.view
  (:use hiccup.page
        hiccup.element))

(defn demo-page [] (html5
                     [:html
                      [:body
                       [:h1 {:style "color: seagreen"} "Zalagaonica"]
                       ]
                      ]
                     ))
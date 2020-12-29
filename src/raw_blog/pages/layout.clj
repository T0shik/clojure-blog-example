(ns raw-blog.pages.layout
  (:require [hiccup.core :refer [html]]))

(defn layout [render-ctx]
  (let [{title :title
         css :css
         content :content} render-ctx]
    (html [:head 
           [:title title]
           [:style css]]
          [:body
           [:div]
           [:div.content content]])))

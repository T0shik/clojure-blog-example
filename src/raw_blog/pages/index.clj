(ns raw-blog.pages.index
  (:require [raw-blog.blogs :as blg])
  (:require [raw-blog.pages.layout :refer [layout]]))

(defn- blog-preview [key blog]
  [:a {:href (str "/" key)}
   [:div
    [:h5 (blog :title)]
    [:p (blog :desc)]]])

(defn- blog-previews [blogs]
  (let [blog-keys (keys blogs)]
    (->> blog-keys
         (map (fn [key] (blog-preview key (blogs key)))))))

(def page (blog-previews blg/all))

(defn index-page [ctx]
  (layout {:title "Raw Coding Blog"
           :content page}))

(ns raw-blog.pages.index
  (:require [raw-blog.blogs.all :refer [blogs]])
  (:require [raw-blog.pages.layout :refer [layout]]))

(defn- blog-preview [key blog]
  [:a {:href (str "/" key)}
   [:div.post
    [:h2 (blog :title)]
    [:p (blog :desc)]]])

(defn- blog-previews [blogs]
  (let [blog-keys (keys blogs)]
    (->> blog-keys
         (map (fn [key] (blog-preview key (blogs key)))))))

(def css "
a {
  text-decoration: none;
  color: white;
}
")

(defn index-page []
  (layout {:title "Raw Coding Blog"
           :css css
           :content (blog-previews blogs)}))

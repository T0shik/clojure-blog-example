(ns raw-blog.pages.post
  (:require [raw-blog.pages.layout :refer [layout]]
            [raw-blog.blogs.all :refer [blogs]]))

(def default-css "
li {
  font-size: .9rem;
  margin-bottom: 0.25rem;
}
")

(defn post-page [n]
  (let [post (blogs n)]
    (when post
      (let [{t :title
             c :content} post]
        (layout 
         {:title t
          :css default-css
          :content c})))))

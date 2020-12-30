(ns raw-blog.pages.layout
  (:require [hiccup.core :refer [html]]))

(def default-css "
body {
  background: #1B0F1E;
}

* {
  color: white !important;
  font-family: 'Nunito', sans-serif !important;
}

div.content {
  margin: auto;
  max-width: 800px;
}

.post {
  padding: 1rem;
  border-radius: 5px;
  background: #5f5762;
}
")

(defn layout [render-ctx]
  (let [{title :title
         css :css
         content :content} render-ctx]
    (html [:head 
           [:title title]
           [:style (str default-css "\n" css)]]
          [:body
           [:div.content content]])))



(ns raw-blog.core
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [raw-blog.pages.index :refer [index-page]]
            [raw-blog.pages.post :refer [post-page]])
  (:gen-class))


(defroutes app-routes
  (GET "/" _ (index-page))
  (GET "/:post" [post] (post-page post))
  (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))

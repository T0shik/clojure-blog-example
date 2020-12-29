(ns raw-blog.core
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [raw-blog.pages.index :refer [index-page]])
  (:gen-class))


(defroutes app-routes
  (GET "/" [] index-page)
  (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))

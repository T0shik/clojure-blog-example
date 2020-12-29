(ns raw-blog.blogs
  (:require [clojure.java.io :refer [resource file]])
  (:require [clojure.string :as str]))

(defn load-blog [resource]
  (let [key (-> resource 
                 (.getName) 
                 (str/split #"\.")
                 (first))
        content (read-string (slurp resource))]
    {key content}))

(defn- load-blogs []
  (->> (file "./resources")
       (file-seq)
       (drop 1)
       (map load-blog)
       (reduce merge)))

(def all (load-blogs))

(defn get [n] (all n))


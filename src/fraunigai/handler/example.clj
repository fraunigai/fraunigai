(ns fraunigai.handler.example
  (:require [ataraxy.core :as ataraxy]
            [ataraxy.response :as response] 
            [clojure.java.io :as io]
            [integrant.core :as ig]))

(defmethod ig/init-key :fraunigai.handler/example [_ options]
  (fn [{[_] :ataraxy/result}]
    [::response/ok (io/resource "fraunigai/handler/example/example.html")]))

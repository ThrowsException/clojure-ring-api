(ns web-api.core
  (:use [ring.adapter.jetty])
  (:gen-class))

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "plain/text"}
   :body "Hello World"})

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (ring.adapter.jetty/run-jetty handler {:port 3000}))

(ns clj-osgi-namespaces-hello-world.activator
  (:use [clj-osgi-namespaces-hello-world.core]))

(defn start
  [bundle-context]
    (hello))

(defn stop
  [bundle-context]
    (goodbye))

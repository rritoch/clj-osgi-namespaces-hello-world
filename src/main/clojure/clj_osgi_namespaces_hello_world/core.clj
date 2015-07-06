(ns clj-osgi-namespaces-hello-world.core)

(defn hello
  "I don't do a whole lot."
  []
  (binding [*out* *err*]
    (println "Hello, World!")))

(defn goodbye
  "I don't do a whole lot."
  []
  (binding [*out* *err*]
    (println "Goodbye, World!")))

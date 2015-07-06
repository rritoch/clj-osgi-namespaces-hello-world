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


(defn hello-other
  "I don't do a whole lot."
  []
  (binding [*out* *err*]
    (println "Hello, Other World!")))

(defn goodbye-other
  "I don't do a whole lot."
  []
  (binding [*out* *err*]
    (println "Goodbye, Other World!")))

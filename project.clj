(defproject clj-osgi-namespaces-hello-world "0.1.0-SNAPSHOT"
  :description "Clojure OSGI Namespaces Hello World"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :source-paths ["src/main/clojure"]
  :java-source-paths ["src/main/java"]  ; Java source is stored separately.
  :test-paths ["test" "src/test/clojure"]
  
  :manifest {"Bundle-ManifestVersion" "2"
             "Bundle-SymbolicName" "clojure-osgi-namespaces-hello-world"
             "Bundle-Version" "0.1.0"
             "Bundle-Name" "Clojure OSGI Namespaces Hello World"
             "Import-Package" "com.vnetpublishing.clojure.osgi.namespaces;version=\"0.1.0\",clojure;version=\"1.7.0\",clojure.asm;version=\"1.7.0\",clojure.asm.commons;version=\"1.7.0\",clojure.java.api;version=\"1.7.0\",clojure.lang;version=\"1.7.0\",clojure.core;version=\"1.7.0\",clojure.java.clojure.pprint;version=\"1.7.0\",clojure.reflect;version=\"1.7.0\",clojure.test;version=\"1.7.0\""
             "Export-Package" "clj_osgi_namespaces_hello_world"
             "Clojure-Activator" "clj-osgi-namespaces-hello-world.activator"
             "Clojure-Imports" "clojure.core"
             "Clojure-Exports" "clj-osgi-namespaces-hello-world.core"
            }
  :resource-paths ["src/main/resource"] ; Non-code files included in classpath/jar.
  :profiles {:dev {:dependencies [[clj-osgi-namespaces "0.1.0-SNAPSHOT"]]
                  }
            })

(defproject com.gateprotect/data.json "0.2.2"
  :description "Generating/parsing JSON from/to Clojure data structures.
  AOT-compiled version."
  :url "https://github.com/gateprotect/data.json"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :aot [#"^clojure.data.*"]
  :source-paths ["src/main/clojure"]
  :dependencies [[org.clojure/clojure "1.3.0"]])

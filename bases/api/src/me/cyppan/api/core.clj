(ns me.cyppan.api.core
  (:require [schema.core :as s]
            [me.cyppan.schema.interface :as schema])
  (:gen-class))

(defn -main [& args]
  (println (schema/test)))




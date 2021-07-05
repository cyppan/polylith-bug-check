(ns me.cyppan.core
  (:require [me.cyppan.schema.interface :as schema]
            [schema.core :as s]))

(println (schema/test))
(def prismatic-schema s/Str)

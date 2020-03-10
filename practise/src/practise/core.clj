(ns practise.core
  (:gen-class))

(defn big?
  [st n]
  (> (count st) n))

(defn collection-type
  [col]
  (cond
    (vector? col) :vector
    (list? col) :list
    (map? col) :map
    :else :unknown-type))



(fn [& sets]
  (letfn [(ps [s] (reduce (fn [ss e] (into ss (map #(conj % e) ss))) #{#{}} s))]
    (not (empty?
           (apply clojure.set/intersection
                  (map (fn [s] (set (map #(apply + %) (disj (ps s) #{})))) sets))))))

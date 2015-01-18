(fn [k s]
  (letfn [(ps [s] (reduce (fn [ss e] (into ss (map #(conj % e) ss))) #{#{}} s))]
    (set (remove #(not= (count %) k) (ps s)))))

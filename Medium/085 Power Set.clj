(fn [s]
  (reduce (fn [ss e] (into ss (map #(conj % e) ss)))
          #{#{}} s))

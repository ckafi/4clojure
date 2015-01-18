(fn sh [n coll]
  (letfn [(value [x] (if (number? x) x (apply + (map value x))))]
    (cond
      (empty? coll) []
      (<= (value (first coll)) n) (cons
                                   (first coll)
                                   (sh (- n (value (first coll))) (rest coll)))
      (number? (first coll)) []
      :else (remove empty? [(sh n (first coll))]))))

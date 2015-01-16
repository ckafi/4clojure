(fn [x]
  (letfn [(pascal [x] (map #(apply +' %) (partition 2 1 [0] (cons 0 x))))]
    (iterate pascal x)))

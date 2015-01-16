(fn [c]
  (letfn [(deconst [x] (map (comp read-string str) (str x)))
          (sqr [x] (* x x))]
    (count (filter #(< % (apply + (map sqr (deconst %)))) c))))

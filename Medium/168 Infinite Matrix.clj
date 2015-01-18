(fn im 
  ([f] (im f 0 0))
  ([f m n] (letfn [(r [x] (lazy-cat [x] (r (inc x))))]
             (map #(map (partial f %) (r n)) (r m))))
  ([f m n s t] (take s (map #(take t %) (im f m n)))))

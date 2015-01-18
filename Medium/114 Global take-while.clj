(fn [n p coll]
  (take
    (first (last (take n (filter #(p (second %)) (map-indexed vector coll)))))
    coll))

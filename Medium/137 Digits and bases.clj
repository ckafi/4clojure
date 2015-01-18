(fn [n b]
  (letfn
    [(r [x coll]
       (if (zero? x) coll
         (recur (quot x b) (cons (rem x b) coll))))]
    (if (zero? n) [0]
      (r n []))))

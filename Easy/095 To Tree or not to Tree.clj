(fn c [n]
  (cond (not (coll? n)) (nil? n)
        (not= 3 (count n)) false
        :else (and (c (second n)) (c (second (rest n))))))

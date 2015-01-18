(fn [coll]
  (letfn
    [(r [coll m] 
       (if (empty? coll) m
         (recur (drop-while #(not (keyword? %)) (rest coll))
                (assoc m (first coll) (take-while #(not (keyword? %)) (rest coll))))))]
    (r coll {})))

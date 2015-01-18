(fn [x] (letfn [(sieve [coll]
  (let [limit (apply max coll)]
    (loop [table (zipmap (filter odd? coll) (repeat false))
           cand 3
           testn (* cand cand)]
      (cond
        (> (* cand cand) limit)
        (conj (filter #(not (table %)) (keys table)) 2)
        (or (table cand) (> testn limit))
        (let [nextc (+ 2 cand)] (recur table nextc (* nextc nextc)))
        :else (recur (assoc table testn true) cand (+ cand testn))))))]
   (take x (sort (sieve (range 2 600))))))

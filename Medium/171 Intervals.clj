(fn [s]
  (let [i (atom (first s))
        f (fn [x] (let [d (- x @i)] (reset! i x) (> d 1) ))]
    (map #(vector (first %) (last %)) (partition-by f (sort s)))))

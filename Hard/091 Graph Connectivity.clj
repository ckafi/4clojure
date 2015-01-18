(fn [edges]
  (letfn [(connected? [s e] (boolean (some #(some (into #{} e) %) s)))]
    (loop [s #{(first edges)} es (rest edges)]
      (let [c (group-by #(connected? s %) es)]
        (cond (empty? (c false)) true
              (empty? (c true)) false
              :else (recur (set (c true)) (c false)))))))

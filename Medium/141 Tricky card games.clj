(fn [trump]
  (fn [cards]
    (let [trump (if (nil? trump) (:suit (first cards)) trump)]
      (apply max-key :rank (filter #(= trump (:suit %)) cards)))))

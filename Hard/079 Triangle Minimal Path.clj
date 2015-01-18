(fn [c]
  (let [f #(map + %2 (map (partial apply min) (partition 2 1 %1)))]
  (->> c reverse (reduce f) first)))

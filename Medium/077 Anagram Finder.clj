(fn [x]
  (set (map set (filter #(< 1 (count %)) (vals (group-by set x))))))

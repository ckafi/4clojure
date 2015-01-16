(fn [& xs]
  (reduce #(if (> %1 %2) %1 %2) xs))

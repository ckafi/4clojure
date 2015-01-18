(fn [x]
  (let [dvs (filter #(zero? (mod x %)) (range 1 x))]
    (= x (apply + dvs))))

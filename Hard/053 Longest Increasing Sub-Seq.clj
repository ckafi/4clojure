(fn [x]
  (let [last (atom -1)
        increasing (fn [n] (if (> n @last)
                             (do (swap! last (constantly n)) true)
                             (do (swap! last (constantly -1)) false)))
        incsubs (filter #(< 1 (count %)) (partition-by increasing x))]
    (reduce #(if (> (count %2) (count %1)) %2 %1) [] incsubs)))

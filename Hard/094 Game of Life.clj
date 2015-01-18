(fn conway [sarray]
  (let
    [dim (count sarray)
     neighbours (fn [[x y]]
                  (map (fn [a] (map #(mod % dim) a))
                       (for [dx [-1 0 1] dy [-1 0 1] :when (not= [0 0] [dx dy])]
                         (map - [x y] [dx dy]))))
     is-alive (fn [[x y]] (= \# (nth (nth sarray y) x)))
     alive-cells (filter is-alive (for [x (range dim) y (range dim)] [x y]))]
    (map #(apply str %)
         (partition dim
                    (for [y (range dim) x (range dim)]
                      (let [count-alive-neighbours
                            (count (clojure.set/intersection (set alive-cells)
                                                             (set (neighbours [x y]))))]
                        (cond (> count-alive-neighbours 3) \space
                              (< count-alive-neighbours 2) \space
                              (= count-alive-neighbours 3) \#
                              :else (nth (nth sarray y) x))))))))

(fn number-maze [start end]
  (loop
    [candidates #{start}
     round 1]
    (if (contains? candidates end)
      round
      (recur
        (into #{}
              (concat (mapcat (juxt (partial * 2) (partial + 2)) candidates)
                      (map #(/ % 2) (filter even? candidates))))
        (inc round)))))

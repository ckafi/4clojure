(fn [tree]
  (let [paths (mapcat #(map (partial vector %) (keys (tree %))) (keys tree))]
    (into {} (for [p paths] [p (get-in tree p)]))))

(fn [coll]
  (letfn [(pron [c] (flatten (for [x (partition-by identity c)] [(count x) (first x)])))]
    (rest (iterate pron coll))))

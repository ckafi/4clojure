(fn r [coll]
  (if (not (sequential? (first coll))) [coll]
    (apply concat (map r coll))))

(fn flat [x]
  (if (coll? x) (mapcat flat x) [x]))

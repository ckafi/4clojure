(fn my-merge-with
  [f m & xs]
  (if (empty? xs) m
    (apply my-merge-with f
      (reduce
        #(update-in
           %1 [(%2 0)]
           (fn [x y] (if (nil? x) y (f x y)))
           (%2 1))
        m
        (first xs))
      (rest xs))))

(fn [f x1 x2]
  (cond (f x2 x1) :gt
        (f x1 x2) :lt
        :else :eq))

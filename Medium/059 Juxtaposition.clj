(fn [& fs]
  (fn [& a]
    (for [f fs] (apply f a))))

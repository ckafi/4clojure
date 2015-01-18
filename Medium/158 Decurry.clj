(fn decurry [f]
  (fn [& args]
    (loop [v (f (first args)), args (rest args)]
      (if (fn? v) (recur (v (first args)) (rest args))
        v))))

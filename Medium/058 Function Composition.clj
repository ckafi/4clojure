(fn [& fs]
  (fn [& a]
    (loop [fs fs a a]
      (if (empty? fs) (first a) 
        (recur (butlast fs) [(apply (last fs) a)])))))

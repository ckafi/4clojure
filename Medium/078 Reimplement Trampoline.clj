(fn tramp [f & args]
  (cond (not (fn? f)) f
        (empty? args) (tramp (f))
        :else (tramp (apply f args))))

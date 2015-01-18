(fn [f s]
    (let
      [r (fn r [m s]
           (if (empty? s) m
             (r (update-in
                  m
                  [(f (first s))]
                  (comp set conj)
                  (first s))
                (rest s))))]
      (set (vals (r {} s)))))

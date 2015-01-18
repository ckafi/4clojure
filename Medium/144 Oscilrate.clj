(fn oscilrate [x & fs]
  (letfn
    [(r [x fs]
       (cons ((first fs) x)
             (lazy-seq (r ((first fs) x) (rest fs)))))]
    (cons x (r x (cycle fs)))))

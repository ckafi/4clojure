(fn m [f c]
  (if (empty? c) nil
    (cons (f (first c))
          (lazy-seq (m f (rest c))))))

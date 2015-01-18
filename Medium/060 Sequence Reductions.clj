(fn reducts 
  ([f c] (reducts f (first c) (rest c)))
  ([f i c]
   (if (empty? c) [i]
     (lazy-cat [i] (reducts f (f i (first c)) (rest c))))))

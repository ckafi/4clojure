(fn f [p v coll]
  (if (empty? (rest coll)) coll
      (lazy-cat 
        (if (p (first coll) (second coll))
          [(first coll) v]
          [(first coll)])
        (f p v (rest coll)))))

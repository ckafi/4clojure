#(letfn [(gcd [a b] (if (zero? b) a (gcd b (mod a b))))
         (gcd-mult [c] (reduce gcd 0 c))]
   (/ (apply * %&) (gcd-mult %&)))

(fn sandwich [n]
  (let 
    [sieve (fn sieve [s]
             (cons (first s)
                   (lazy-seq (sieve (remove #(zero? (mod % (first s)))
                                            (rest s))))))
     primes (sieve (iterate inc 2))
     triple (last (take-while #(<= (second %) n) (partition 3 1 primes)))]
    (not (or (not= (second triple) n)
             (not= (/ (+ (first triple) (last triple)) 2) n)))))

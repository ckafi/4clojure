(fn [n]
  (letfn [(gcd [a b] (if (= 0 b) a (gcd b (mod a b))))]
    (count (filter #(= 1 (gcd n %)) (range 1 (inc n))))))

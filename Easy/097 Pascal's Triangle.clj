#(letfn [(fac [x] (reduce * 1 (range 1 (inc x))))
         (binom [n k] (/ (fac n) (* (fac k) (fac (- n k)))))]
   (map (partial binom (dec %)) (range %)))

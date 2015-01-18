(fn bigdiv [n a b]
  (letfn [(sumto [x] (/ (* (bigint x) (inc x)) 2))
          (smu [x] (* x (sumto (quot (dec n) x))))]
    (- (+ (smu a) (smu b)) (smu (* a b)))))

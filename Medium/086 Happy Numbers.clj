(fn [n]
  (let [square-sum
        (fn [n] (apply + (map #(* % %) (map #(- (int %) 48) (str n)))))
        test-number
        (fn test-number [t n]
          (cond (some #(= n %) t) false
                (= 1 n) true
                :else (test-number (conj t n) (square-sum n))))]
    (test-number [] n)))

(fn [n]
  (let
    [ls (iterate
          (fn [n]
            (if (every? #(= \9 %) (str n)) (+ n 2)
              (let
                [strn (str n)
                 front (+ (if (= strn (apply str (reverse strn))) 1 0)
                          (Integer/parseInt (apply str (take (int (/ (inc (count strn)) 2)) strn))))
                 back (if (zero? (mod (count strn) 2))
                        (apply str (reverse (str front)))
                        (apply str (rest (reverse (str front)))))]
                (Integer/parseInt (str front back)))))
          n)]
    ((if (= (str n) (apply str (reverse (str n)))) identity rest)
       (remove #(< % n) ls))))

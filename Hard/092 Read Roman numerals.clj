(fn [s]
  (let [m {\I 1, \V 5, \X 10, \L 50, \C 100, \D 500, \M 1000}]
    (- (apply + (map m s))
       (+ (if (re-find #"IV" s) 2 0)
          (if (re-find #"IX" s) 2 0)
          (if (re-find #"XL" s) 20 0)
          (if (re-find #"XC" s) 20 0)
          (if (re-find #"CD" s) 200 0)
          (if (re-find #"CM" s) 200 0)))))

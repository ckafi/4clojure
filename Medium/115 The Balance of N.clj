(fn [n]
  (let [half (int (/ (inc (count (str n))) 2))
        left (take half (str n))
        right (take-last half (str n))
        f (fn [x] (apply + (map #(- (int %) 48) x)))]
    (apply = (map f [left right]))))

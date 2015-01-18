(fn [x]
  (let [rows x
        cols (apply map vector x)
        diags [(take-nth 4 (flatten x))
               (take-nth 4 (flatten (map reverse x)))]
        all (concat rows cols diags)
        won? (fn [s] (some #(every? (partial = s) %) all))]
    (cond (won? :x) :x
          (won? :o) :o
          :else nil)))

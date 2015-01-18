(fn [c]
  (letfn [(mc [c e] (reduce #(if (= (first %2) (last e))
                                 (conj %1 [(first e) (last %2)]) %1) c c))]
    (reduce mc c c)))

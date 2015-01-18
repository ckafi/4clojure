(fn [x]
  (let [ex (empty x)
        t (conj ex [:a 0] [:a 0] [:a 1])
        ct (count t)]
    (cond (= 1 ct) :map
          (= 2 ct) :set
          (= 3 ct) (if (= [:a 1] (last t))
                     :vector
                     :list))))

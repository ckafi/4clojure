(defn f [n]
  (letfn [(rec [open close s]
            (if (and (zero? open) (zero? close))
                #{s}
                (clojure.set/union
                  (if (> open 0)
                    (rec (dec open) (inc close) (str s "(")))
                  (if (> close 0)
                    (rec open (dec close) (str s ")"))))))]
    (rec n 0 "")))

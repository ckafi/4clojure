#((fn r [x] (if (zero? x) [] (conj (r (quot x 10)) (rem x 10)))) (* %1 %2))

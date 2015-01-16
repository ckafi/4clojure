(fn [[n l r]]
  (letfn
    [(rec-rev [[n l r]]
       [n (if r (rec-rev r)) (if l (rec-rev l))])]
    (= l (rec-rev r))))

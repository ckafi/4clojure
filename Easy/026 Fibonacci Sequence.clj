#(letfn [(fibs [] (lazy-cat [1] (reductions + 1 (fibs))))] (take % (fibs)))

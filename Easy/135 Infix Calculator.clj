#(loop [v (first %&) o (rest %&)]
   (if (empty? o) v
     (recur ((first o) v (second o)) (drop 2 o))))

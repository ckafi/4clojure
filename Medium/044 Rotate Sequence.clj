#(let [x (mod %1 (count %2))]
   (concat (drop x %2) (take x %2)))

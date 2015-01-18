#(loop [p [] r %2]
   (if (< (count r) %1) p
     (recur (conj p (take %1 r)) (drop %1 r))))

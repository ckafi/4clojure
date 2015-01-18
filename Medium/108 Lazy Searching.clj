(fn search [& colls]
  (if (apply = (map first colls)) (first (first colls))
    (let [sorted-colls (sort-by first colls)]
      (recur (conj (rest sorted-colls) (rest (first sorted-colls)))))))

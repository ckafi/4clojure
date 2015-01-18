(fn [s] (sort-by #(.toLowerCase %) (re-seq #"\w+" s)))

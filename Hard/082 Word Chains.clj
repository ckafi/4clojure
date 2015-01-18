(fn [coll]
  (letfn
    [(drop-nth [n coll] (concat (take n coll) (drop (inc n) coll)))
     (one-dist? [w1 w2]
       (let [[minw maxw] (sort-by count [w1 w2])
             count-trans #(->> %& (apply map =) (remove true?) count)]
         (case (- (count maxw) (count minw))
           0 (>= 1 (count-trans w1 w2))
           1 (->> maxw count range
                  (map #(-> % (drop-nth maxw) ((partial apply str)) (= minw)))
                  (some true?))
           false)))
     (is-word-chain? [coll] (every? true? (map one-dist? coll (rest coll))))
     (perm [s]
       (if (= 1 (count s)) [(vec s)]
         (apply concat (for [x s] (map #(conj % x) (perm (disj s x)))))))]
    (boolean (some is-word-chain? (perm coll)))))

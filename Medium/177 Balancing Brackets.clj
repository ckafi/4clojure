(fn [s]
  (let [sww (clojure.string/replace s #"[^\(\)\[\]\{\}]" "")
        prx #"\(\)|\[\]|\{\}"
        ps (clojure.string/replace sww prx "")]
    (cond (= ps "") true
          (re-find prx ps) (recur ps)
          :else) false))

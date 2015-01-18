(fn [s]
  (->> (clojure.string/split s #",")
       (map read-string)
       (filter #(= 0.0 (rem (Math/sqrt %) 1)))
       (clojure.string/join ",")))

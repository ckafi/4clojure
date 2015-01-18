(fn [s] (clojure.string/replace s #"(-)(.)" #(clojure.string/upper-case (% 2))))

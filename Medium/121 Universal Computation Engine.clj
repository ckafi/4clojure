(fn uce [exp]
  (fn [env]
    (letfn [(ev [exp]
              (cond
                (number? exp) exp
                (symbol? exp) (env exp)
                :else (apply ({'+ + '- - '/ / '* *} (first exp))
                             (map ev (rest exp)))))]
      (ev exp))))

#(let [suitmap {\D :diamond, \H :heart, \C :club, \S :spade}
       rankmap {\2 0, \3 1, \4 2, \5 3, \6 4, \7 5, \8 6, \9 7,
                \T 8, \J 9, \Q 10, \K 11, \A 12}]
   {:suit (suitmap ((vec %) 0)) :rank (rankmap ((vec %) 1))})

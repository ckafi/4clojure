(fn [f c] (apply merge-with concat (for [x c] {(f x) [x]})))

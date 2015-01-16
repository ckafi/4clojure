(fn [c n] (keep-indexed #(if (< (mod %1 n) (dec n)) %2) c))

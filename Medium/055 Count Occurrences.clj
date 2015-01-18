#(into {} (for [[k v] (group-by identity %)] [k (count v)]))

#(if (zero? %2) %1 (recur %2 (mod %1 %2)))

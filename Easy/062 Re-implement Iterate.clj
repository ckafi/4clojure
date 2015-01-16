(fn it [f x] (lazy-cat [x] (it f (f x))))

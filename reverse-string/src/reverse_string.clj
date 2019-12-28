(ns reverse-string)

(defn reverse-string [s] ;; <- arglist goes here
  ;; your code goes here
   (reduce (fn [x acc] (str acc x)) "" s)
)

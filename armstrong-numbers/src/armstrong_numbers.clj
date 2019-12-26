(ns armstrong-numbers)

(defn armstrong? [num] ;; <- arglist goes here
  ;; your code goes here
  (def numstr (str num))
  (def length (count numstr))
  (def nums (into [] (for [x (range length)] (- (int (get numstr x)) 48))))
  (def sum (reduce + (for [x (range length)] (reduce * (repeat length (get nums x))))))
  (= sum num)
)

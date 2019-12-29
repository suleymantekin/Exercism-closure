(ns bob)

(defn upper-case? [s] (= (clojure.string/upper-case s) s))
(defn question? [s] (= (str (last s)) "?"))
(defn empty? [s] (= (clojure.string/trim s) ""))
(defn contains-letters? [s] (some #(Character/isLetter %) s))

(defn response-for [s] ;; <- arglist goes here
  ;; your code goes here
  (cond
    (empty? s) "Fine. Be that way!"
    (and (upper-case? s) (contains-letters? s)) 
      (if (question? s) 
        "Calm down, I know what I'm doing!" 
        "Whoa, chill out!")
    (question? s) "Sure."
    :else "Whatever.")
)

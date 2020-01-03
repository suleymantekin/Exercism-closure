(ns rna-transcription)

(def memo { \G "C" \C "G" \T "A" \A "U"})

(defn get-char [dna-char]
  (if-let [rna-char (get memo dna-char)] rna-char (throw (AssertionError. "Wrong Input")))
  )

(defn to-rna [dna] ;; <- arglist goes here
  ;; your code goes here
  (def chars (into [] dna))
  (def rna-chars (map #(get-char %) chars))
  (clojure.string/join "" rna-chars)
)

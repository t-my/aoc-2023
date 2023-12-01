(ns aoc-2023.day01
  (:require [clojure.string :as s]))

(def input (s/split-lines (slurp "resources/day1.txt")))

#_(def input ["1abc2"
              "pqr3stu8vwx"
              "a1b2c3d4e5f"
              "treb7uchet"])

(defn extract-number [s]
  (when (not-empty s)
    (Integer/parseInt
     (let [digits (s/join (filter #(Character/isDigit %) s))]
       (str (first digits) (last digits))))))

;; classic
(defn solve-classic [i] 
  (reduce + (map (fn [line]
                   (Integer/parseInt
                    (let [digits (s/join (filter #(Character/isDigit %) line))]
                      (str (first digits) (last digits))))) 
                 i)))

;; cool style
(defn solve-cool [i]
  (->> i
       (map seq)
       (map extract-number)
       (reduce +)))

(solve-classic input)
(solve-cool input) 
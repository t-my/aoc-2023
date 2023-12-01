(ns aoc-2023.day01-test 
  (:require [clojure.test :refer [deftest is]]
            [aoc-2023.day01 :refer [extract-number]]))

(deftest extract-number-test
  (is (= 12 (extract-number "1abc2")))
  (is (= 38 (extract-number "pqr3stu8vwx")))
  (is (= 15 (extract-number "a1b2c3d4e5f")))
  (is (= 77 (extract-number "treb7uchet")))
  (is (= 77 (extract-number "treb7uchet"))))

comment(
         (clojure.test/run-tests *ns*)
)



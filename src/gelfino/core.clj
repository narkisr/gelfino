(ns gelfino.core
  (:gen-class)
  (:use 
   (gelfino bootstrap streams)))

(set! *warn-on-reflection* true)

(defn -main [host port]
  (start-processing host port))



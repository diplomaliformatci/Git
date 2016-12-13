//
//  main.swift
//  deneme3
//
//  Created by Can KINCAL on 2.09.2016.
//  Copyright © 2016 Can KINCAL. All rights reserved.
//

import Foundation
func calculateStatistics(scores: [Int]) -> (min: Int, max: Int,sum: Int){
    var min = scores[0]
    var max = scores[0]
    var sum = 0
    for score in scores{
        if score > max {
            max = score
        }
        else if score < min {
            min = score
        }
        sum += score
    }
    return (min,max,sum)
}
let statics = calculateStatistics([5,3,2,6,10,4,15])
print(statics.sum)
print (statics.1)
func sumOf(numbers: Int...) -> Int {
    var sum = 0
    var sayac = 0
    for number in numbers {
        sum += number
        sayac += 1
    }
    sum /= sayac
    return sum
}
//print(sumOf())
print(sumOf(42,492,12,23,21,3,213,21,32,13,21,3))
print (sumOf(5,5,5,5,5,5,5,5,5,4))

func returnFifteen() -> Int {
    var y = 10
    func add(){
        y += 5
    }
    add()
    add()
    return y
}
print(returnFifteen())

func makeIncrementer () -> ((Int) -> Int){
    func addOne (number : Int) -> Int {
        return 1+number
    }
    return addOne
}
var Increment = makeIncrementer()
print(Increment(10))
print("Hello, World!")


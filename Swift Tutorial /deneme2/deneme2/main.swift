//
//  main.swift
//  deneme2
//
//  Created by Can KINCAL on 2.09.2016.
//  Copyright © 2016 Can KINCAL. All rights reserved.
//

import Foundation
/*let interestingNumbers = [
    "Prime" : [2,3,5,7,11,13],
    "Fibonacci" : [1,1,2,3,5,8],
    "Square" : [1,4,9,16,25],
]
var largest = 0
for (kind,numbers) in interestingNumbers {
    for number in numbers{
        if number > largest {
            largest = number
        }
    }
}
var degisken = largest
print (degisken) */

/*var n = 2
while n < 100 {
    n = n*2
    
}
print (n)
var m = 2
repeat{
    m = m*2
}while m < 100
print (m)
var total = 0
for i in 0..<4 {
    total += i
}
print (total) */

func greet( perison: String , day: String) -> String {
    let emptyarray = [String]()
   
    return "Hello \(perison), today is \(emptyarray)."
  
}
print(greet ( "duck" , day: "tuesday"))

print("Hello, World!")


func greet2 (_ person: String , on day: String) -> String {
    return "Hello \(person) , today is \(day)"
}
print(greet2("person",on: "day"))

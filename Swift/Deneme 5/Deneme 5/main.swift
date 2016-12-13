//
//  main.swift
//  Deneme 5
//
//  Created by Can KINCAL on 2.09.2016.
//  Copyright © 2016 Can KINCAL. All rights reserved.
//

import Foundation
var numbers = [10,15]
//var SortedNumbers:
let mappedNumbers = numbers.map({number in 3 * number})
print(mappedNumbers)
//mappedNubers = numbers.map((Int) numbers -> Int)
 numbers.map({
    (number: Int) -> Int in
    let result = number * 3
   return 0
})
//SortedNumbers = numbers.sorted { $0 > $1 }
//print (SortedNumbers)

print("Hello, World!")


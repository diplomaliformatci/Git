//
//  main.swift
//  Deneme 4
//
//  Created by Can KINCAL on 2.09.2016.
//  Copyright © 2016 Can KINCAL. All rights reserved.
//

import Foundation
func hasAnyMatches ( list : [Int] , condition : (Int) -> Bool) -> Bool {
    for item in list {
        if condition(item) {
            return true
        }
    }
    return false
}
func lessThanTen ( number : Int) -> Bool {
    return number < 10
}
var numbers = [20,19,17,15,1]
print(hasAnyMatches(numbers,condition: lessThanTen))
print("Hello, World!")


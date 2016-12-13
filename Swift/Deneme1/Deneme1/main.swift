//
//  main.swift
//  Deneme1
//
//  Created by Can KINCAL on 2.09.2016.
//  Copyright © 2016 Can KINCAL. All rights reserved.
//

import Foundation
let vegetable = "dknfjdsf pepper"
switch vegetable {
    case "celery":
    print("add some rainins and make ants on a log")
    case "cucumber" ,"watercress":
    print("that would make a good tea sandwitch")
case let x where x.hasSuffix("pepper"):
    print("ıs ıt a spicy \(x)?")
default :
    print("everyting tastes good in soup")
}

print("Hello, World!")


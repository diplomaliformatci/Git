//
//  main.swift
//  Deneme 10
//
//  Created by Can KINCAL on 4.09.2016.
//  Copyright © 2016 Can KINCAL. All rights reserved.
//

import Foundation
protocol ExampleProtocol {
    var simpleDescription: String { get }
    mutating func adjust()
}
class SimpleClass: ExampleProtocol {
    var simpleDescription: String = " a very simple class"
    var anotherProperty: Int = 69105
    func adjust() {
        simpleDescription += " Now 100% adjusted"
        
    }
    
}
var a = SimpleClass()
a.adjust()
let aDescription = a.simpleDescription
struct simpleStructure: ExampleProtocol{
    var simpleDescription: String = "a very simple struct"
    mutating func adjust(){
        simpleDescription += "(adjusted)"
        
    }
    
}
var b = simpleStructure()
b.adjust()
let bDescription = b.simpleDescription
print("Hello, World!")


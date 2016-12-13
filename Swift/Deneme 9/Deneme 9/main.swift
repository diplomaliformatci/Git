//
//  main.swift
//  Deneme 9
//
//  Created by Can KINCAL on 4.09.2016.
//  Copyright © 2016 Can KINCAL. All rights reserved.
//

import Foundation

protocol ExampleProtocol {
    var simpleDescription: String { get }
    mutating func adjust()
}
enum ServerResponse {
    case result (String , String)
    case failure ( String)
    
}
class SimpleClass: ExampleProtocol {
    var simpleDescription: String = "A very simple class"
    var anotherproperty: Int = 69105
    func adjust() {
        simpleDescription += "Now 100 % adjusted"
        
    }
}

var a = SimpleClass()
a.adjust()

extension Int:  ExampleProtocol {
    var simpleDescription: String {
        return "the numer \(self)"
    }
    mutating func adjust() {
        self += 42
    }
    
}

print(7.simpleDescription)
print(7.simpleDescription)


let aDescription = a.simpleDescription
struct SimpleStructure: ExampleProtocol {
    var simpleDescription: String = "A veri simple Structure"
    mutating func adjust() {
        simpleDescription += "(adjusted)"
    }
}
 var b = SimpleStructure()
   b.adjust()
let bDescription = b.simpleDescription








let success = ServerResponse.result("6:00" , "15:00")
let failure = ServerResponse.failure("out of chase")
switch (success){
case let .result(sunrise,sunset):
    print ("sunrise at \(sunrise) , sunset at \(sunset)")
case let .failure(message):
    print ("failure \(message)")
}
print("Hello, World!")


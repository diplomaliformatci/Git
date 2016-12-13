//
//  main.swift
//  Deneme 6
//
//  Created by Can KINCAL on 2.09.2016.
//  Copyright © 2016 Can KINCAL. All rights reserved.
//

import Foundation
class NamedShape {
    var numberOfSides : Int = 0
    var name: String
    init (name : String){
        self.name = name
    }
    func simpleDescription() -> String {
        return "A shape with \(numberOfSides) \n\n\n\n \(name) sides"
    }
    
}
class Shape
{
    
    var NumbersOfSides = 0
    let degismez = 0
   
    
    func SimpleDescription() -> String {
        return "A shape with \(NumbersOfSides) sides"
        
    }
    func Degismez (isim : String) -> String {
        return "A shabe with \(isim) sides"
    }
}
 var shape = Shape()
    var namedshape = NamedShape.init(name: "Deneme")
    var namedfunc = namedshape.simpleDescription()
print (namedfunc)
deinit
shape.NumbersOfSides  = 7
var shapeDegismez = shape.Degismez("can")
var shapeDescription = shape.SimpleDescription()
print( shapeDegismez,"\n", shapeDescription )


print("Hello, World!")


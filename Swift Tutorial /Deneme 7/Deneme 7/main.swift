//
//  main.swift
//  Deneme 7
//
//  Created by Can KINCAL on 4.09.2016.
//  Copyright © 2016 Can KINCAL. All rights reserved.
//

import Foundation
class NamedShape {
    var NumberOfSides: Int = 0
    var name: String
    init (name: String) {
        self.name = name
    }
    func simleDescription () -> String {
    return "A shape with  \(NumberOfSides) sides."
    }
}
class Square: NamedShape {
    var sideLength: Double = 0.0
    init (sideLength: Double , name: String ) {
        self.sideLength = sideLength
        super.init(name: name)
        NumberOfSides = 4
        
    }
    func area() -> Double {
        return sideLength * sideLength
    }
     func simpleDescription() -> String {
        return " A square with sides of length \(sideLength)."
    }
    
    
}
class Square2: NamedShape {
    var name1: String = ""
    var radius: Double = 0.0
    func getname (name1: String) -> String {
        self.name1 = name1
        return self.name1
    }
    init (name1: String , radius: Double){
        super.init(name: name1)
        self.radius = radius
        NumberOfSides = 2
        
    }
    func area() -> Double {
        return radius * radius * 3.14
    }
    
}
class EquiLateralTriangle: NamedShape {
    var sideLength: Double = 0.0
    init (sideLength: Double , name: String){
    self.sideLength = sideLength
    super.init(name: name)
    NumberOfSides = 3
    
}
    var perimeter: Double {
        get {
            return 3.0 * sideLength
        }
        set {
            sideLength = newValue / 3.0
        }
    }
     func simpleDescription() -> String {
        return "an equilateral triangle with sides of length \(sideLength)"
        
    }
    
    
    
}
class TriangleAndSquare {
    var triangle: EquiLateralTriangle {
        willSet {
            square.sideLength = newValue.sideLength
        }
    }
    var square: Square {
        willSet {
            triangle.sideLength = newValue.sideLength
    }
        
}
    init (size: Double , name: String) {
        square = Square(sideLength: size, name: name)
        triangle = EquiLateralTriangle(sideLength: size, name: name)
    }
}
var triangleandsquare = TriangleAndSquare(size: 10.0, name: "another test shape")
print(triangleandsquare.square.sideLength)
print(triangleandsquare.triangle.sideLength)
print(triangleandsquare.square = Square (sideLength: 50, name: "lergar square"))
print(triangleandsquare.triangle.sideLength)
var deneme: String
deneme = "lelele"
var triangle = EquiLateralTriangle(sideLength: 3.1, name: "a")
print (triangle.perimeter)
triangle.perimeter = 9.9
print (triangle.sideLength)

let test = Square(sideLength: 5.2 , name: "my test Square")
let test2 = Square2 (name1: "ahmet" , radius: 20)
test2.getname(deneme)
print(test2.area())
print(test2.name1)
//test2.simpleDescription()
test.area()
test.simpleDescription()


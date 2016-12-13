//
//  main.swift
//  Deneme 8
//
//  Created by Can KINCAL on 4.09.2016.
//  Copyright © 2016 Can KINCAL. All rights reserved.
//

import Foundation
enum Rank: Int {
    case ace = 1
    case two , three , four , five , six , seven , eight , nine , ten
    case jack , queen , king
    func simpleDescription () -> String{
        switch self {
        case .ace:
            return "ace"
        case .jack:
            return "jack"
        case .queen:
            return "queen"
        case .king:
            return "king"
        default:
            return String(self.rawValue)
        }
    }
}
enum Suit {
    case spades , hearts , diamonds , clubs
    func simpleDescription() -> String {
        switch self {
        case .spades:
            return "spades"
        case .hearts:
            return "hearts"
        case .diamonds:
            return "diamonds"
        case .clubs:
            return "clubs"
        }
    }
    func color (simpleDescription_: ()) -> String {
            switch self{
            case .spades:
                return "black"
            case .hearts:
                return "red"
            case .diamonds:
                return "blue"
            case .clubs:
                return "black"
            }
        
            
    }
}
struct Card {
    var rank: Rank
    var suit: Suit
    func simpleDescriptions() -> String {
        return "the \(rank.simpleDescription()) of \(suit.simpleDescription()) "
    }
    func CreateDeck () -> String{
        switch (suit) {
        case .spades:
            switch (rank) {
            case .ace:
                return "\(suit) +++ \(rank)"
            case .jack:
                return "\(suit) +++ \(rank)"
            case .queen:
                return "\(suit) +++ \(rank)"
            case .king:
                return "\(suit) +++ \(rank)"
                
            }
        case .hearts:
            switch (rank) {
            case .ace:
                return "\(suit) +++ \(rank)"
            case .jack:
                return "\(suit) +++ \(rank)"
            case .queen:
                return "\(suit) +++ \(rank)"
            case .king:
                return "\(suit) +++ \(rank)"
    
        }
        case .diamonds:
        switch (rank) {
        case .ace:
        return "\(suit) +++ \(rank)"
        case .jack:
        return "\(suit) +++ \(rank)"
        case .queen:
        return "\(suit) +++ \(rank)"
        case .king:
        return "\(suit) +++ \(rank)"
    }
    case .clubs:
    switch (rank) {
    case .ace:
    return "\(suit) +++ \(rank)"
    case .jack:
    return "\(suit) +++ \(rank)"
    case .queen:
    return "\(suit) +++ \(rank)"
    case .king:
    return "\(suit) +++ \(rank)"
    
}
}
let i = 0
while i < 52 {
    
}
let threeofSpades = Card(rank: .three,suit: .spades)
let threeofSpadesdescription = threeofSpades.simpleDescriptions()
print (threeofSpades)
print(threeofSpadesdescription)
let hearts = Suit.hearts
let heartsDescription = hearts.simpleDescription()
let ace = Rank.ace
let aceRawValue = ace.rawValue
print("Hello, World!")


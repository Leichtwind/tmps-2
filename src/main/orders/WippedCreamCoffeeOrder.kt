package main.orders

import main.coffee_maker.CoffeeMaker

class WippedCreamCoffeeOrder : Order {
  override fun execute() = CoffeeMaker.makeWippedCreamCoffee()
}

package main.orders

import main.coffee_maker.CoffeeMaker

class LatteOrder : Order {
  override fun execute() = CoffeeMaker.makeLatte()
}

package main.orders

import main.coffee_maker.CoffeeMaker

class AmericanoOrder : Order {
  override fun execute() = CoffeeMaker.makeAmeriacano()
}

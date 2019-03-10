package main.orders

import main.coffee_maker.CoffeeMaker

class CaramelLatteOrder : Order {
  override fun execute() = CoffeeMaker.makeCaramelLatte()
}
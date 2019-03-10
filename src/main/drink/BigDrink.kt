package main.drink

import main.coffee.CoffeeComponent

class BigDrink(content: CoffeeComponent) : Drink(content) {
  override val volume = 500
}

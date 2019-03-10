package main.drink

import main.coffee.CoffeeComponent

class MediumDrink(content: CoffeeComponent) : Drink(content) {
  override val volume = 300
}

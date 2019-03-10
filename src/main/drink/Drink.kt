package main.drink

import main.coffee.CoffeeComponent

abstract class Drink(private val content: CoffeeComponent) {
  abstract val volume: Int

  val name
    get() = "$volume ml of ${content.name}"
}

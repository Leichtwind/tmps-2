package main

import main.coffee_machine.CoffeeMachineInterface
import main.coffee_machine.PoliteCoffeeMachine
import main.coffee_machine.RegularCoffeeMachine
import main.orders.CaramelLatteOrder

object Main {
  @JvmStatic
  fun main(args: Array<String>) {
    val coffeeMachine: CoffeeMachineInterface = PoliteCoffeeMachine(RegularCoffeeMachine())

    // any order you desire
    val order = CaramelLatteOrder()

    coffeeMachine.cookYourOrder(order)
  }
}

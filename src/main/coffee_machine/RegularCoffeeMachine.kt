package main.coffee_machine

import main.orders.Order

class RegularCoffeeMachine : CoffeeMachineInterface {

  override fun cookYourOrder(order: Order) {
    val drink = order.execute()

    println(drink.name)
  }
}

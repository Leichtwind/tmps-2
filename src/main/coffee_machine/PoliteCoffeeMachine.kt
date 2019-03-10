package main.coffee_machine

import main.orders.Order

class PoliteCoffeeMachine(private val coffeeMachine: RegularCoffeeMachine) : CoffeeMachineInterface {
  override fun cookYourOrder(order: Order) {
    println("Please, wait until your order is ready.")

    coffeeMachine.cookYourOrder(order)

    println("Thank you for using our coffee machine! Have a nice day!")
  }
}

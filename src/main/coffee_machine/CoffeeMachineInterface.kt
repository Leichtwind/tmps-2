package main.coffee_machine

import main.orders.Order

interface CoffeeMachineInterface {
  fun cookYourOrder(order: Order)
}
package main.orders

import main.drink.Drink

interface Order {
  fun execute(): Drink
}

package main.coffee_maker

import main.coffee.Caramel
import main.coffee.Coffee
import main.coffee.Milk
import main.coffee.WhippedCream
import main.drink.BigDrink
import main.drink.MediumDrink

object CoffeeMaker {

  fun makeAmeriacano() = BigDrink(Coffee())

  fun makeLatte() = BigDrink(Milk(Coffee()))

  fun makeCaramelLatte() = BigDrink(Caramel(Milk(Coffee())))

  fun makeWippedCreamCoffee() = MediumDrink(WhippedCream(Coffee()))
}

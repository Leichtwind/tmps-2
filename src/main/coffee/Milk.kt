package main.coffee

class Milk(private val base: CoffeeComponent) : CoffeeComponent {
  override val name = base.name + " with Milk"
}

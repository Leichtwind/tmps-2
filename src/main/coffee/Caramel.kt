package main.coffee

class Caramel constructor(private val base: CoffeeComponent) : CoffeeComponent {
  override val name = base.name + " with Caramel"
}

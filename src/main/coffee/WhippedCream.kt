package main.coffee

class WhippedCream(private val base: CoffeeComponent) : CoffeeComponent {
  override val name = base.name + " with Whipped Cream"
}

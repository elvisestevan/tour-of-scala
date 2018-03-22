package intro

object Methods extends App {

  def add(x: Int, y: Int): Int = x + y

  println(add(2, 3))

  def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int = (x + y) * multiplier

  println(addThenMultiply(3, 2)(4))

  def name: String = System.getProperty("user.name")

  println("Hello, " + name + "!")
}

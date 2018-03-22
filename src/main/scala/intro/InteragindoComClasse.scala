package intro

object InteragindoComClasse extends App {

  val greeter = new Greeter("Hello, ", "!")

  greeter.greet("Elvis Estevancase class Point(x: Int, y: Int)")

  val point = Point(1, 2)

  println(point)

  val idFactory = IdFactory.create()
  println("idFactory: " + idFactory)

  val idFactory2 = IdFactory.create()
  println("idFactory2: " + idFactory2)


}

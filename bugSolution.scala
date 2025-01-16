```scala
class MyClass[T](val value: T) {
  def myMethod[U](f: T => U): U = f(value)
}

object Main extends App {
  val myInstance = new MyClass(5)
  val result: String = myInstance.myMethod(x => x.toString) 
  println(result) // Correctly prints "5"
  val myInstance2 = new MyClass("hello")
  val result2 = myInstance2.myMethod(x => x.length)
  println(result2) // Correctly prints 5
}
```
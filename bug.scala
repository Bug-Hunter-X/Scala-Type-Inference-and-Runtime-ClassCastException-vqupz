```scala
class MyClass[T](val value: T) {
  def myMethod(f: T => T): T = f(value)
}

object Main extends App {
  val myInstance = new MyClass(5)
  val result = myInstance.myMethod(x => x.toString)
  println(result) // This will compile but will throw an exception at runtime
}
```
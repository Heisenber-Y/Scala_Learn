package myextends

/**
  * Created by yml on 2019/8/2.
  */
object MethosOverride01 {
  def main(args: Array[String]) {
val emp: Emp = new Emp
    emp.printName()
  }

class Person100{
  var name:String="tom"
  def printName(): Unit ={
    println("person printName()"+name)
  }
def sayHi(): Unit ={
  println("sayHi")
}
}

  class Emp extends  Person100{
    override def printName(): Unit ={
      println("Emp printName"+name)
      super.printName()
      sayHi()
    }

  }

}

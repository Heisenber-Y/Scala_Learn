package myextends

/**
  * Created by yml on 2019/8/2.
  */
object TypeConvert {
  def main(args: Array[String]) {
/*    println(classOf[String])
  var s ="King"
    println(s.getClass.getName)*/
  var p1: Person = new Person
    var emp: Emp = new Emp
//
    p1=emp

    val emp1: Emp = p1.asInstanceOf[Emp]
    emp1.sayHello()
  }

  class Person{
    var name:String="tom"
    def printName(): Unit ={
      println("Person printName="+name)
    }
    def sayHi(): Unit ={
      println("sayHi")
    }
  }
  class Emp extends Person{
  override def printName(): Unit ={
    println("Emp printNaME"+name)
    super.printName()
    sayHi()
  }
def sayHello(): Unit ={

}

  }

}

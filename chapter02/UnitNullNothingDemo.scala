/**
  * Created by yml on 2019/7/31.
  */
object UnitNullNothingDemo {

  def main(args: Array[String]) {
val res: Unit = sayHello()
    println("res="+res)

var dog:Dog=null  //错误



  }
//Unit等价于java的void ，只有一盒实例值()
  def sayHello(): Unit ={
  }

  class Dog{

  }
}

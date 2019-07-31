/**
  * Created by yml on 2019/7/31.
  */
object UnitNullNothingDemo {

  def main(args: Array[String]) {
val res: Unit = sayHello()
    println("res="+res)

var dog:Dog=null
//var char1:Char =null //运行会报错
    //print(10 max 2 )

    var a ="crazy"
    //print(a*3)

    var b="make"
    val str = b.takeRight(1)
    b.reverse
    //val str = "make".take(1)
print(str)
  }
//Unit等价于java的void ，只有一盒实例值()
  def sayHello(): Unit ={
  }

  class Dog{

  }
}

/**
  * Created by yml on 2019/8/7.
  */
object ImplicitClassDemo {
  def main(args: Array[String]) {

  implicit class DB1(var m:Mysql1){
  def assSuffix(): String ={
    m+"Scala"
  }
}

    val mysql: Mysql1 = new Mysql1
    mysql.sayOK() //本身的方法
    mysql.assSuffix() //如何关联到DB1的方法

  }
}
class DB1{}
class Mysql1{
  def sayOK(): Unit ={
    println("sayOK")
  }
}
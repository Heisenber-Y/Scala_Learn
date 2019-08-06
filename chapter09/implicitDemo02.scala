/**
  * Created by yml on 2019/8/6.
  */
object implicitDemo02 {
  def main(args: Array[String]) {

    //编写一个隐士函数，丰富mysql功能
    implicit def addDelete(mysql:Mysql): DB ={
  new DB
    }
    val mysql: Mysql = new Mysql
    mysql.insert()
    mysql.delete()
    mysql.update()
  }
}
class Mysql{
  def insert(): Unit ={
    println("insert")
  }
}
class DB{
  def delete(): Unit ={
    println("delete")
  }
  def update(): Unit ={
    println("update")
  }
}
class Dog{}
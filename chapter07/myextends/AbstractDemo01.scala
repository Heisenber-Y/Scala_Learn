package myextends

/**
  * Created by yml on 2019/8/5.
  */
object AbstractDemo01 {
  def main(args: Array[String]) {
    println("xxx")
  }
}
abstract class Animal{
  var name:String
  var age:Int   //抽象字段
  var color:String="black" //普通属性
  def cry() //抽象方法
}
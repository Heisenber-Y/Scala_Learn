/**
  * Created by yml on 2019/8/7.
  */
object ImplicitNotice {
  def main(args: Array[String]) {

    //隐士转换不能有二义性
    //隐士转换不能嵌套使用

    implicit def f1(d:Double): Int ={
      d.toInt
    }
    var num1:Int=1.1
    println(num1)
  }
}

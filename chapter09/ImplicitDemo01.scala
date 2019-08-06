/**
  * Created by yml on 2019/8/6.
  */
object ImplicitDemo01 {
  def main(args: Array[String]) {

 // var num:Int=3.5  //错误 高精度》低精度


    //编写一个隐式函数转成Double=> Int 转换
    //隐士函数应当在作用于才能生效

    implicit def f1(d:Double): Int ={
    d.toInt
    }
    implicit def f2(f:Float): Int ={
    f.toInt
    }

    val num:Int=3.5
    var num2:Int=4.5f
  println("num="+num)
    println("num2="+num2)
  }
}

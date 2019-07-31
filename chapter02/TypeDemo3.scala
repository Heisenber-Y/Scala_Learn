/**
  * Created by yml on 2019/7/31.
  */
object TypeDemo3 {

  def main(args: Array[String]) {
    println("long的最大值："+Long.MaxValue+"~"+Long.MinValue)
  }

  var num1:Float =2.23456789f
  var num2:Double=2.23456789
  //var num3:Float=2.1 报错
  var e =9999999999999l   //(指定为Long类型)
  println(num1+"---"+num2)

}

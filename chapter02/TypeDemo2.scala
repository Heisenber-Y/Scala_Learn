/**
  * Created by yml on 2019/7/31.
  */
object TypeDemo2 {
  def main(args: Array[String]) {
    println(sayHello)
    var num =1.2
    var num2=1.7f
   // num2=num ,error  修改成     num2=num.toFloat

  }
def  sayHello(): Nothing ={

throw  new Exception("抛出异常")

}

}

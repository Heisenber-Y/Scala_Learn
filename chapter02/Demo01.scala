/**
  * Created by yml on 2019/7/31.
  */
object Demo01 {
  def main(args: Array[String]) {
    var n1=10
    var n2 =1.1f
    var n3 =n1+n2
//(byte ,short) 和char 之间不会自动转换类型
    var n4:Byte=10
    //var char1:Char=n4  报错，byte不能自动转换成char


/*    var num1:Int =10
    println(num1.toDouble +"\t"+num1.toString+100.toDouble)
  var isPass=true
    println(isPass.toString)*/


//sayHi()
  }

def sayHi(): Unit ={
println("say hi")

}

}

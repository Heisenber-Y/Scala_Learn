/**
  * Created by yml on 2019/7/31.
  */
object Demo02 {

  def main(args: Array[String]) {
//20190730 11 aa
//强制类型转换

/*    val num1:Int=10*3.5.toInt+6*1.5.toInt
    var num2:Int= (10*3.5+6*1.5).toInt
    println("num1="+num1 +","+"num2="+num2)
    var char1:Char=1
    var num3=1*/
    //var char2:Char=num3  b报错

    var s4="12.5"
    //println(s4.toInt) //error
    println(s4.toDouble)


//Char 类型可以报错Int类型的常量值，但不能保存Int的变量值，需要强转
//Byte和Short 类型在运算时，当作Int类型处理
  }



}

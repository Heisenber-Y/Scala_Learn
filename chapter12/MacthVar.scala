/**
  * Created by yml on 2019/8/12.
  */
object MacthVar {
  def main(args: Array[String]) {

    //如果在case关键字后边跟变量，nammatch前表达式的值会赋给该变量
    /*    val ch='U'
    ch match {
      case  '+'=> println("ok")
      case mychar=>println("ok"+mychar)
      case _ =>println("moren")
  }*/
println("========")
       var ch1='+'
        //match 是一个表达式。因此可以有返回值
        //返回值就是匹配到代码块的最后一句话的值
        val res=ch1 match {
          case '+'=> ch1+"helo"
          case _=> println("ok!~!!")
        }
        println("res="+res)



  }
}

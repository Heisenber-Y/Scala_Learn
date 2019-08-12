/**
  * Created by yml on 2019/8/12.
  */
object MatchTypeDetail01 {
  def main(args: Array[String]) {
    //在进行类型匹配是，编译器会预先检测是否有可能的匹配，如果没有则报错
    val obj=10
    val result=obj match {
      case a:Int=>a
      //case b:Map[String,Int]=>"map集合"  //注释打开则会报错
      case _ =>"啥也不是"
    }
  }
}

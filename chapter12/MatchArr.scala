/**
  * Created by yml on 2019/8/12.
  */
object MatchArr {
  def main(args: Array[String]) {

        val arrs = Array(Array(0), Array(1, 0), Array(0, 1, 0),
          Array(1, 1, 0), Array(1, 1, 0, 1))

        for (arr <- arrs ) {
          val result = arr match {
            case Array(0) => "0"
            case Array(x, y) => x + "=" + y
            case Array(0, _*) => "以0开头和数组"
            case _ => "什么集合都不是"
          }
          // result = 0
          // result = 1 = 0
          // result = 以0开头和数组
          // result = 什么集合都不是
          // result = 什么集合都不是
          println("result = " + result)
        }



  }
}

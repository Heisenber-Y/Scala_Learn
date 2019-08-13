/**
  * Created by yml on 2019/8/13.
  */
object MatchObject {
  def main(args: Array[String]) {
    //对象匹配
    //模式匹配使用：
    val number: Double = Square(5.0)
    number match {
      case Square(n) => println("匹配成功n=" + n)
      case _ => println("nothing match")
    }


  }
}
  object Square{
    //unapply 方法是对象提取器
    def unapply(z:Double):Option[Double] ={
  println("unapply方法被嗲用"+z)
    //Some(math.sqrt(z))
      None
    }

    def apply(z:Double):Double=z*z

}

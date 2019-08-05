package myextends

/**
  * Created by yml on 2019/8/5.
  */
object ScalaFiledOverrideDetail02 {
  def main(args: Array[String]) {
  println("xxx")
    val bbb: BBB = new BBB
    println(bbb.sal)
    val bbb1: AAA = new BBB
    println("b2.sal="+bbb1.sal())

  }

  class AAA{
    def sal(): Int ={
      return 10
    }
  }
  class BBB extends AAA{
    override val sal: Int = 0
  }
}

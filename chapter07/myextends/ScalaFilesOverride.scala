package myextends

/**
  * Created by yml on 2019/8/5.
  */
object ScalaFilesOverride {
  def main(args: Array[String]) {
  val bbb: AAA = new BBB()
    val bbb1: BBB = new BBB
println(bbb.age+"\t"+bbb1.age)


  }
  class AAA{
    val age:Int=10
  }
  class BBB extends AAA{
    override val age: Int = 20
  }
}

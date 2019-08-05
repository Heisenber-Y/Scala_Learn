/**
  * Created by yml on 2019/8/5.
  */
object Apply {
  def main(args: Array[String]) {
  val list: List[Int] = List(1,2,3)
    println(list)

    val pig: Pig = new Pig("笑话")
    val pig1: Pig = Pig("xiaohei")
    val pig2: Pig = Pig()
    println(pig1.name)
    println(pig2.name)

  }
  class Pig(pName:String){
  var name:String=pName
  }
  object Pig{
//伴生对象
def apply(pName: String): Pig = new Pig(pName)

    def apply(): Pig = new Pig("匿名")
  }
}

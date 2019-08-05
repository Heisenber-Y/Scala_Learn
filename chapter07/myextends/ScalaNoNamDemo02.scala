package myextends

/**
  * Created by yml on 2019/8/5.
  */
object ScalaNoNamDemo02 {
  def main(args: Array[String]) {

val minster=new Monster {
  override def cry(): Unit = {
    println("ahaha")
  }

  override var name: String = _
}
minster.cry()
  }
  abstract class Monster{
    var name:String
    def cry()
  }
}

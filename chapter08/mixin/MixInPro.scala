package mixin

/**
  * Created by yml on 2019/8/6.
  */
object MixInPro {
  def main(args: Array[String]) {
    val mysql= new Mysql06 with DB6{
      override var sal =11
    }

  }
}
trait DB6{
  var sal:Int //抽象字段
  var opertype:String="insert"
  def insert: Unit ={
  }
}
class Mysql06{
  
}

/**
  * Created by yml on 2019/8/5.
  */
object AccompanyObject {
  def main(args: Array[String]) {

println(ScalaPerson.sex)
ScalaPerson.sayHi()
  }
  //伴生类
  class ScalaPerson{
    var name:String=_
  }
  //伴生对象
  object ScalaPerson{
    var sex:Boolean=true

    def sayHi(): Unit ={
      println("object ScalaPerson sayHi~~")
    }
  }
}

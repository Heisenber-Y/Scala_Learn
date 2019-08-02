package oop

/**
  * Created by yml on 2019/8/1.
  */
object CatDemo {
  def main(args: Array[String]): Unit = {
  val cat: Cat = new Cat
    cat.name="xiaobai"
    cat.age=11
    cat.color="baise"
    println("ok~~")
    println("\n 小猫的信息如下：%s %d %s",cat.age,cat.name,cat.color)


  }
  class Cat {
    var name:String = ""
    var age:Int = _
    var color:String = _
  }
}

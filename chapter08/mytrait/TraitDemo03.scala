package mytrait

/**
  * Created by yml on 2019/8/5.
  */
object TraitDemo03 {
  def main(args: Array[String]) {
  val sheep: Sheep = new Sheep
    sheep.sayhi()
    sheep.sayHello()

  }
  trait Trait03{
  //抽象方法
  def sayhi()
  //普通方法
   def  sayHello(): Unit ={
    println("say Hello")
  }
  }

  class Sheep extends Trait03{
    //普通方法
   def sayhi(): Unit ={
      println(" 小样 撒野hi")
    }
  }
}

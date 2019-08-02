package myextends

/**
  * Created by yml on 2019/8/2.
  */
object Extends02 {
  def main(args: Array[String]) {
  val sub: Sub = new Sub
    sub.sayOk()

  }
  //父类
class Base{
    var n1:Int=1
    protected var n2:Int=2
    private var n3:Int=3
  def test100(): Unit ={
    println("base 100")
  }
   protected def test200(): Unit ={
     println("base 200")
   }
    private  def test300(): Unit ={
      println("base 300")
    }

  }
//Sub继承Base
  class Sub extends Base{
  def sayOk(): Unit ={
    this.n1=20
    this.n2=40
println("范围:"+this.n1+this.n2)
    test100()
    test200()

  }
}


}

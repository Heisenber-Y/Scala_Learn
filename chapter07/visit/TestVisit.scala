package visit

import scala.collection.mutable.{HashMap}


/**
  * Created by yml on 2019/8/2.
  */
object TestVisit {
  def main(args: Array[String]) {


    var map = new HashMap()



val c: Clerk = new Clerk()
    c.showInfo()
    Clerk.test(c)
//class Clerk 为伴生类
 //object Clerk 为伴生对象
    // 伴生类 写非静态的内容  伴生对象 就是静态的内容

  }
  class Clerk{
    var name:String="jack"
    private var sal:Double=9999
    def showInfo(): Unit ={
      println("name="+name+"sal="+sal)
    }
  }
  object Clerk{
    def test(c:Clerk): Unit ={
      println("test()name="+c.name+"sal="+c.sal)
    }
  }

}

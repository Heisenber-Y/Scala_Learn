package mytrait

/**
  * Created by yml on 2019/8/5.
  */
object TraitDemo02 {
  def main(args: Array[String]) {
val c: C = new C
    val f: F = new F
    c.getConnect()
    f.getConnect()
  }

  trait  Trait01{
    def getConnect()
  }

  class A {}

  class B extends A{}

  class C extends A with Trait01{
    override def getConnect(): Unit ={
      println("连接mysql数据库")
    }
  }
  class D{}
  class F extends D with Trait01{
    override def getConnect(): Unit ={
      println("连接Oracle")
    }
  }
}

package mixin

/**
  * Created by yml on 2019/8/6.
  */
object MixInDemo01 {
  def main(args: Array[String]) {
//在不修改类的定义基础上，可以使用trait方法
  val oracleDB= new OracleDB with Operate3
  oracleDB.insert(100)

  val mysql= new Mysql3 with Operate3
    mysql.insert(200)

  val mysql_ =  new Mysql3_  with Operate3{
      override def sayhi(): Unit = {
        println("say jihoh")
      }
    }
mysql_.insert(999)
    mysql_.sayhi()
    

  }

  trait Operate3{
    def insert(id:Int): Unit ={
      println("插入数据="+id)
    }
  }
  class OracleDB {
  }
  abstract class Mysql3{
  }
  abstract class Mysql3_{
    def sayhi()
  }

}

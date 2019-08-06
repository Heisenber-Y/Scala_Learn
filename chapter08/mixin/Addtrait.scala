package mixin

import com.sun.corba.se.impl.encoding.IDLJavaSerializationInputStream

/**
  * Created by yml on 2019/8/6.
  */
object Addtrait {
  def main(args: Array[String]) {
     val mysql= new Mysql4 with  DB4 with File4
   // println(mysql)
    mysql.insert(100)
  }


}
trait Operate4{
  println("Operate04---")
  def insert(id:Int)//抽象方法
}
trait Data3 extends Operate4{
  println("Data4")
  override def insert(id:Int): Unit ={
    println("插入数据="+id)
  }
}
trait DB4 extends Data3{
  println("DB4")
  override def insert(id:Int): Unit ={
    println("想数据库")
    super.insert(id)
  }
}
trait File4 extends Data3{
  println("Filed4")

  override def insert(id: Int): Unit = {
    println("向文件")
    super.insert(id)
  }
}
class Mysql4{}
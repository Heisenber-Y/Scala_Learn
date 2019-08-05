package myextends

import javax.print.attribute.standard.PrinterName

/**
  * Created by yml on 2019/8/5.
  */
object ScalaBaseConstator {
  def main(args: Array[String]) {
  val emp: Emp = new Emp()
    println("====")
  val emp1: Emp = new Emp("mary")
    println("***")
  val emp2: Emp = new Emp("smith")


  }

  class Person(pName:String){
    var name=pName
    println("Person")
    def this(){
      this("默认的名字")
      println("默认的名字")
    }
  }
  class Emp extends Person{
    println("Emp..")
    def this(name:String){
      this
      this.name=name
      println("EMp 辅助构造器")
    }
  }
}

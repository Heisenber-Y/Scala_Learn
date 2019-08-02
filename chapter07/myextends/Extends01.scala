package myextends

/**
  * Created by yml on 2019/8/2.
  */
object Extends01 {
  def main(args: Array[String]) {
    val student: Student = new Student
    student.name="jack"

    student.studyIng()
    student.showInfo()

  }


  class Person{
    var name:String=_
    var age:Int=_
  def showInfo(): Unit ={
    println("学生的信息如下：")
    println("名字："+this.name)
  }

  }

  class Student extends Person{

    def studyIng(): Unit ={
      println(this.name+"学习Scala")
    }
  }

}

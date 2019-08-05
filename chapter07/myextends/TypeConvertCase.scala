package myextends

/**
  * Created by yml on 2019/8/5.
  */
object TypeConvertCase {
  def main(args: Array[String]) {
  val stu: Student400 = new Student400
    val emp: Emp400 = new Emp400
  //test(stu)
    test(emp)

  }

  def test(p:Person): Unit ={
  if(p.isInstanceOf[Emp400]){
    p.asInstanceOf[Emp400].showInfo
  }else if(p.isInstanceOf[Student400]){
    p.asInstanceOf[Student400].cry
  }else{
    println("转换失败")
  }
  }



  class Person{
   def printName: Unit ={
     println("Person400 printName")
   }
    def sayOk: Unit ={
      println("Person400 SayOk")
    }
  }

  class Student400 extends Person{
  val stuId=100

    override def printName: Unit = {
      println("Student400 printName ")
    }
    def cry: Unit ={
      println("学生的ID"+this.stuId)
    }

  }
  class Emp400 extends Person{
    var empid=800

    override def printName: Unit = {
      println("EMpno400 printName")

    }
    def showInfo: Unit ={
      println("雇员的IF"+empid)
    }
  }

}

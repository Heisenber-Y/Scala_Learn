import scala.io.StdIn

object InputDemo {

  def main(args: Array[String]): Unit = {
    println("请输入姓名")
    val name = StdIn.readLine()
    println("年龄")
    val age = StdIn.readInt()
    println("xingshui")
  val sal = StdIn.readDouble()


  //Cat.sayHay()
   // Cat.sayHai

  }
//声明领一个对象（伴生对象）
  object Cat extends AAA {

def sayHay(): Unit ={

println("nihao ")

}

  }

//特质 等价于Java中的Interface + abstract class
  trait AAA{


    def sayHai: Unit ={

  println("------")


    }
  }


}

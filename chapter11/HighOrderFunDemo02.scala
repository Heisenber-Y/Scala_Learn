/**
  * Created by yml on 2019/8/9.
  */
object HighOrderFunDemo02 {
  def main(args: Array[String]) {

test2(sayOK)

    //test2是一个高阶函数 ，可以接受一个没有输入，返回值为Unit的函数
    def test2(f:()=>Unit): Unit ={
      f()
    }


    def sayOK(): Unit ={
      println("OOOKKK")
    }
    def sub(n1:Int): Unit ={

    }
  }
}

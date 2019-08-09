

/**
  * Created by yml on 2019/8/9.
  */
object HighOrderFunDemo01 {
  def main(args: Array[String]) {
  //高阶函数的基本使用

//  val res = test(sum2 _,3.5)
  //  println("res="+res)

//在scala中。可以把一个函数直接复制给一个变量，但是不执行函数
/*  val f1 = myPrint _
    f1()
    def myPrint(): Unit ={
      println("hello world")
    }*/

    //1：test 就是一个高阶函数
    //2：f:Double=>Double ，表示一个函数，该函数可以接受一个Double 返回Double
    //3：n1:Double 普通参数
    //4：f(n1) 在test函数中 ，执行你传入的函数

    def test(f:Double=>Double,n1:Double){
      f(n1)
    }

    //普通的函数，可以接受一个Double 但会Double
 def  sum2(d:Double): Double ={
      println("sum2被调用")
      d+d
    }

  }
}

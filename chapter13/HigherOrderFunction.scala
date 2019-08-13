/**
  * Created by yml on 2019/8/13.
  */
object HigherOrderFunction {
  def main(args: Array[String]) {
//高阶函数
      //能够接受函数作为参数的函数
    def test(f:Double=>Double,f2:Double=>Int,n1:Double)={
  f(f2(n1))
}
   def sum(d:Double):Double={
     d+d
   }
def mod(d:Double):Int={
  d.toInt%2
}
   val res= test(sum,mod,5.0)
    println("res="+res)
  }
}

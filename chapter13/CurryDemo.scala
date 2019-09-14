/**
  * Created by yml on 2019/8/14.
  */
object CurryDemo {
  def main(args: Array[String]) {
    def mul(x:Int,y:Int)=x*y
    println(mul(10,10))

   def mulCurry(x:Int)=(y:Int)=>x*y
    println(mulCurry(10)(9))

   def mulCurry2(x:Int)(y:Int)=x*y
    println(mulCurry2(10)(8))
  }
}

/**
  * Created by yml on 2019/8/14.
  */
object CurryDemo02 {
  def main(args: Array[String]) {
    //这是一个函数，可以接收两个字符串，比较是否相等
    def eq(s1:String,s2:String):Boolean={
      s1.equals(s2)
    }
//隐士类
    implicit  class Testeq(s:String){
  //体现了将比较字符串的事情，分解成两个任务
  //1.cheekEq 完成大小写转换
  //2，f函数万层比较任务
  def cheekEq(ss:String)(f:(String,String)=>Boolean):Boolean={
    f(s.toLowerCase,ss.toLowerCase)
  }
}
    val str1= "hello"
    println(str1.cheekEq("HeLLo")(eq))
  }
}

/**
  * Created by yml on 2019/8/13.
  */
object Funpatameter {
  def main(args: Array[String]) {
  def plus(x:Int)=
      3+x

val map: Array[Int] = Array(1,2,3,4).map(plus(_))
    println(map.mkString(","))
//在scala中函数也是有类型的，plus的就是<function>
    println("plus的函数类型是="+(plus _))
  }
}

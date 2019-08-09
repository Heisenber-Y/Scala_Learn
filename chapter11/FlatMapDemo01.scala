/**
  * Created by yml on 2019/8/9.
  */
object FlatMapDemo01 {
  def main(args: Array[String]) {

//扁平化说明，就是将集合中的每个元素的子元素映射到某个函数并返回新的集合

  val names: List[String] = List("Alice","Bob","Nick")

val names2 = names.flatMap(upper)
   println("names2="+names2)



  }

  def upper(s:String):String={
  s.toUpperCase
  }

}

/**
  * Created by yml on 2019/8/9.
  */
object FilterDemo01 {
  def main(args: Array[String]) {


val names: List[String] = List("Alice","Bob","Nick")
val name2=  names.filter(startA)
println("names="+names)
    println("name2="+name2)

  }
  def startA(str:String): Boolean ={
    str.startsWith("A")
  }
}

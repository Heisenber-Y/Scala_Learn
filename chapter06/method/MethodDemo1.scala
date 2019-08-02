package method

/**
  * Created by yml on 2019/8/2.
  */
object MethodDemo1 {
  def main(args: Array[String]) {
  val dog: Dog = new Dog
    val cal: Int = dog.cal(1,2)
    println(cal)
  }

  class Dog{
  private var sal:Double=_
    var food:String=_
def cal(n1:Int, n2:Int): Int ={
  return n1+n2
}

  }
}

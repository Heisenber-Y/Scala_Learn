/**
  * Created by yml on 2019/8/9.
  */
object FlodDemo02 {
  def main(args: Array[String]) {


    val list: List[Int] = List(1,9)
    def minus(num1:Int,num2:Int): Int ={
    num1-num2
    }

    var i6=(1 /: list)(minus) //等价于 =》 list4.foldLeft(1)(minus)
println("i6="+i6)

    i6=(100 /: list)(minus)   //等价于 list.foldLeft(100)(minus)
    println(i6)

    i6=(list :\ 10)(minus)   //等价于 list.foldRoght(10)(minus)
  println(i6)

  }
}

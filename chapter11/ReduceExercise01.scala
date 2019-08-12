/**
  * Created by yml on 2019/8/9.
  */
object ReduceExercise01 {
  def main(args: Array[String]) {

//求出LIst(3,4,2,5,7的最小值)
    val list: List[Int] = List(1,2,3,4,5)
def minus(n1:Int,n2:Int): Int ={
  n1-n2
}
println(list.reduceLeft(minus))
println(list.reduceRight(minus))
println("minval="+list.reduceLeft(min))


  }
  def min(n1:Int,n2:Int): Int ={
    if (n1>n2) n2 else n1
  }
}

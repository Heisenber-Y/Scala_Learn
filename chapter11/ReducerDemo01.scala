/**
  * Created by yml on 2019/8/9.
  */
object ReducerDemo01 {
  def main(args: Array[String]) {

    //使用花间的方法计算list的和

val list: List[Int] = List(1,20,30,4,5)
val res: Int = list.reduceLeft(sum)
    println("res="+res)

  }
  def sum(n1:Int,n2:Int): Int ={
    println("sum被调用")
    n1+n2
  }
}

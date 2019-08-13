/**
  * Created by yml on 2019/8/13.
  */
object ParameterInfer {
  def main(args: Array[String]) {
    val list: List[Int] = List(1,2,3,4)
    println(list.map((x:Int)=>x+1))
    println(list.map((x)=>x+1))
    println(list.map(x=>x+1))
    println(list.map(_ +1))
  }
}

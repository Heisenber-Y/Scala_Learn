/**
  * Created by yml on 2019/8/13.
  */
object PartialFun03 {
  def main(args: Array[String]) {
def partialFun2:PartialFunction[Any,Int]={
  case i:Int=>i+1
  case j:Double=>(j*2).toInt
}

    val list: List[Any] = List(1,2,3,4,1.2,2.4,1.9f,"hello")
    val list2: List[Int] = list.collect(partialFun2)
    println("list2="+list2)
//第二种简写方式
   val list3=list.collect{
      case i:Int=>i+1
      case j:Double=>(j*2).toInt
      case k:Float=>(k*3).toInt
    }
    println("list3="+list3)
  }
}

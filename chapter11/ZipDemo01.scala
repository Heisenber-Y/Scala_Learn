/**
  * Created by yml on 2019/8/9.
  */
object ZipDemo01 {
  def main(args: Array[String]) {
    //扩展  拉链（合并）
//如果两盒集合个数不对应，会造成数据丢失
    val list1: List[Int] = List(1,2,3)
  val list2: List[Int] = List(4,5,6,7)

    val list3: List[(Int, Int)] = list1.zip(list2)
    println(list3)
//如果要取出合并后的各个对偶元组的数据，可以遍历
    for(item<-list3){
    println(item._1+"=="+item._2)
    }
  }
}

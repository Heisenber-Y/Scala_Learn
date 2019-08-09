import scala.collection.mutable

/**
  * Created by yml on 2019/8/9.
  */
object SetDemo01 {
  def main(args: Array[String]) {

/*    val set: Set[Int] = Set(1,2,3)
    println(set)

    val set2= mutable.Set(1,2,"hello")
    println(set2)
    */
    //可变集合的元素添加
/*val set: mutable.Set[Any] = mutable.Set(1,2,"hah")
/*    set.add("a")
    set+=6
     set+=(5)*/

    //可变集合的元素删除
    set.remove(1)
    set -=2
    println(set)*/

//set 集合的便利操作
    val set: mutable.Set[Any] = mutable.Set(1,2,3,"abc")
    for (item<-set){
      println(item)
    }

  }
}

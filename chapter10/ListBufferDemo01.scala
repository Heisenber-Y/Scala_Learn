import scala.collection.mutable.ListBuffer

/**
  * Created by yml on 2019/8/7.
  */
object ListBufferDemo01 {
  def main(args: Array[String]) {

//动态的添加元素，list1就会变化 ，增加一个一个的元素
val list0= ListBuffer[Int](1,2,3)
    val list1= new ListBuffer[Int]()
    list1 += 4
    list1.append(5)
    list0 ++=list1
    println("list0="+list0)
   val list2: ListBuffer[Int] = list0++ list1
    println("list2="+list2)
    val list3: ListBuffer[Int] = list0 :+ 5
    println("list3="+list3)

    println("==========删除")
println("list1="+list1)
list1.remove(1)   //将下标为1的元素删除
    for(item<- list1){
      println(item)
    }


/*    val list0= ListBuffer[Int](1,2,3)
  println("list0="+list0(2))
    for (item<- list0){
      println(item)
    }*/

  }
}

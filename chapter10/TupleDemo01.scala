/**
  * Created by yml on 2019/8/7.
  */
object TupleDemo01 {
  def main(args: Array[String]) {
    val tuple1 = (1,2,3,"hello",5)
    println(tuple1)

    println("==================访问元组=========================")
    //访问元组
    val t1= (1,"a","b",true,2)
    println(t1._1+"==="+t1._4)
  println(t1.productElement(0))


    println("==================遍历元组=========================")

   for(item<- t1.productIterator){
     println("item="+item)
   }

  }
}

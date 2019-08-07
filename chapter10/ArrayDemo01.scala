/**
  * Created by yml on 2019/8/7.
  */
object ArrayDemo01 {
  def main(args: Array[String]) {
    val arr01: Array[Int] = new Array[Int](10)
    /*println(arr01.length)
    println("arr01(0)="+arr01(0))*/
//数据的遍历
    for (i<- arr01){
      println(i)
    }
    println("-----")
arr01(3)=10
   for (i<-arr01){
     println(i)
   }

  }
}

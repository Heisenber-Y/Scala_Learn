package ifelse

import scala.collection.immutable.IndexedSeq

/**
  * Created by yml on 2019/8/1.
  */
object Demo01 {
  def main(args: Array[String]) {

  //循环返回值

val res=  for(i<- 1 to 10)yield {
  if (i % 2 == 0) {
    i
  }
  else {
    "不是偶数"
  }
}
    println(res)
    /*  val res: IndexedSeq[Int] = for(i<- 1 to 10)yield i
    println(res)*/
    //yield i 将每次循环得到的i 放入到集合 vector 中 并返回给res




  //循环守卫
/*    for(i<- 1 to 3 if i !=2){
      println(i)
    }*/



/*    for (i<- 1 until 3){
      println(i)

    }*/
  }

}

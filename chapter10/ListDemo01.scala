import scala.collection.immutable.Nil

/**
  * Created by yml on 2019/8/7.
  */
object ListDemo01 {
  def main(args: Array[String]) {

 //在列表的最后追加数据
    // 符号 :: 表示向集合中添加元素
    // 运算时，集合对象一定要防止在最右边
    // 运算规则： 从右向左
    // ::: 运算符是将集合中的每一个元素假如到集合中

    val list4: List[Any] = List(1,2,3,"abc")
    val list5: List[Any] = 4::5::6::list4::Nil
    println("list5="+list5)



/*//追加数据
    val list1= List(1,2,3,"abc")
//通过 :+ 或者 +： 给list 追加元素(本身的集合没有变化)
   var list2= list1 :+ 4
  println(list1)
    println(list2)
val list3: List[Any] = 10 +:list1
    println(list3)*/


    //在默认情况下，List是scala.collection.immutable.List 即不可变
    //在Scala中List就是不可变的，如果使用可变的 则使用LisyBuffer
  //List 在package object scala 做了val List=scala.collection.immutable.List
    //val Nil=scala.collection.immutable.Nil
   // val list01: List[Int] = List(1,2,3) //创建时。直接分配元素
/*    println(list01)
    val nil: Nil.type = Nil  //空集合
    println(nil)*/

/*  val list: Int = list01(1)
    println(list)*/

  }
}

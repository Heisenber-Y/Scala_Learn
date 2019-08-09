/**
  * Created by yml on 2019/8/9.
  */
object MapOperateDemo02 {
  def main(args: Array[String]) {

    /*
 请将List(3,5,7) 中的所有元素都 * 2 ，
 将其结果放到一个新的集合中返回，即返回一个新的List(6,10,14), 请编写程序实现.

  */


    val list = List(3, 5, 7, 9)
   var list2= list.map(mutiple)
println("list2="+list2)
  }

def mutiple(n:Int): Int ={
    println("mutiple被调用")
  n*2
}
}
    class MyList {
      var list1 = List(3, 5, 7, 9)
      //新的集合
      var list2 = List[Int]()
      //写map

      def map(f: Int => Int): List[Int] = {
        for (item <- this.list1) {
          list2 = list2 :+ f(item)
          println(list2+"=========")
        }
        list2
      }
    }
object MyList{
  def apply: MyList = new MyList()
}






import scala.collection.mutable
/**
  * Created by yml on 2019/8/9.
  */
object MapDemo01 {
  def main(args: Array[String]) {
    //默认Map是 immutable.Map 即不可变的
    //key-value 类型支持Any
    //在Map的底层，每对key-vale 是Tuple2
 /*   val map1 = Map("Alice"->10,"Bob"->20,"Tom"->30)
  println(map1)*/

    //构造可变隐射
    //1.从输出的结果看到，可变的map输出顺序和声明顺序不一致
/*    val map2: Any = mutable.Map("Alice"->10,"Bob"->20,"Tom"->30)
  println(map2)*/

    //创建空的映射
/*    val map3= new scala.collection.mutable.HashMap[String,Int]
    println(map3)*/

    //对偶元组

/*    val map4= mutable.Map(("Alice",10),("Bob",20),("Tom",30))
    println(map4)*/
    //println(map4("Alice")) //获取value 通过map(key)
   // println(map4("Alice~"))  //NoSuchElementException 抛出异常
/*  val contains: Boolean = map4.contains("Alicec")
    println(contains)*/

//使用map.get(key).get 取值
    //r如果存在map.get(key) 就会反追Some（值） ，然后Some(值).get 就可以取出
    //如果不存在 ，则返回None
/*    println(map4.get("Alice").get)
  println(map4.get("Alice~").get)*/

    //方式4 使用map.getOrElse() 取值
  //  println(map4.getOrElse("Alice", "默认的值"))

//更新Map的元素   当增加一个Key_value  如果存在就是跟新  如果不存在就是添加
  // val map5= mutable.Map("A"->1,"B"->2,"C"->3)
    /*  //map5("A")=20 //增加
      map5+=("D"->4)

        println(map5)*/

    //删除元素    A B 就是要删除的key ，可以删除多个  如果key存在 就删除，如果不存在，也不会报错
/*map5 -=("A","B","AAA")
println(map5)*/

//Map的遍历
/*    val map1: mutable.Map[String, Int] = mutable.Map(("A",1),("B",2),("C",3))

  for ((k,v)<-map1){
    println(k+"is mapped to"+v)
    for(k<-map1.keys){
      println(k)
    }
    println("========")

    for(v<-map1.values){
      println(v)
    }
    println("=====")
for (v<-map1){
  println(v)
}*/


    //map的遍历
    val map6= mutable.Map(("A",1),("B","北京"),("C",3))

    for(v<-map6){ //这样取的v类型是Tuple2
      println(v+"key-"+v._1+"val-"+v._2)
    }

  }
}

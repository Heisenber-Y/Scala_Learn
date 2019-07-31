package cn.bmsoft

import scala.collection.mutable.ArrayBuffer

object Arrays {

  def main(args: Array[String]): Unit = {



 //20190504 获取映射中的值：
   //val bobScore=scores("Bob")  //类似与Java中的 scores.get("Bob")
  //val bobScore=  if(scores.contains("Bob")) scores("Bob") else 0
  // 快捷写法：
  //val bobscores= scores.getOrElse("Bob",0);

//更新映射中的值：
    //更新键"Bob"对应的值
   //val scores("Bob")=10
    //增加信的键值对偶到score
    //scores("Fred")=7

//添加对歌关系使用 ：+=
//    scores+=("Bob"->10,"Fred"->7)
//要移除某个键和对应的值使用：-=
//    scores -="Alice"

//不能更新一个不可变的映射，但是可以获取一个包含所有需要更新的新映射

    //val newScores=scores+("Bob"->10,"Fred->7")


//迭代映射：

//for((k,v),<-映射) //处理K和v
  //scores.keySet    一个类似Set（"A","B"）的集合
//for (v <- scores.values) print(v)  //将打印 10 ，8 ，7 ，8 或者其他排列组合

//已排序映射

//元组：元组是通过将单个的值包含在圆括号中构成的 ：
   // (1,3.15,Fred) 是一个元组 类型卫：Tuple3(Int,Double,java.lang.String)
    // 类型也可以定义卫（Int,Double,java.lang.String）
    //t._2 和t _2 都可以（是空格而不是句点），但是不能写t_2，元组的各组员从1开始不是0
/*    val t=(1,3.14,"Fred")
    //val secend=t._2;
    val secend=t _2;
    print(secend)*/

  /* val a= "New York".partition(_.isUpper);
  print(a)*/

//拉链操作













//20190501
    //1,操作符用来创建对偶
 // val a="Alice"->10
//也可以用下面这种方法创建对偶：
  //  val score=Map(("Alice",10),("Bob",10),("Candy",8))


    //2.构造对偶
    //该代码构造出一个不可变的Map[String,Int],其值不能被改变，
    //val scores1=Map("Alice"->10,"Bob"->3,"Candy"->8)
//一个可变的Map
    //val scores2=new scala.collection.mutable.Map("Alice"->10,"Bob"->3,"Candy"->8)

//获取对偶中的值：




//多唯数组：
  //val matrix=Array.ofDim[Double](3,4)

  //常用算法：
//toString 方法
    //val a=Array(1,2,3,4)
    //println(a.toString());


//指定前缀和后缀
/*  val a=Array(1,2,3,4)
   println(a.mkString(" and "))
    println(a.mkString("<",",",">"))*/


//sort 方法：
/*    val a=ArrayBuffer(1,2,6,4)
    val  b = a.sort
  println(b)*/

//   val b= ArrayBuffer("1","2","aaa","dddd").min
//  println("最大的是:"+b)

    //  val a=Array(1,2,3,4,5).sum
//  println(a+"-----")


//unitl 是RichInt类的方法，返回所有小于(但不包括)上线的数字
  //如果想要每两个元素一跳，则可以使用(o until a.lenth ,2)
    // 如果要从数组尾端开始，则可以使用 (0 until a.length).reverse
//  val a = Array(1, 2, 3, 4, 5)
//
//    for (i<- 0 until a.length)
//      println(i+":"+a(i))


 // for (i <- 1 to 3 ; j <- 1 to 4 ) println(10*i+j)

    //多唯数组啊是的
    //val a=Array.ofDim[Double](3,4)


    //可以对数组排序，但是不能对数组缓冲排序
    //val a= Array(1,3,2,4)
    // val sort = scala.util.Sorting.quickSort(a)



    //sorted方法将数组经过排序并返回数组，这个过程不会修改原始版本
    // val a: ArrayBuffer[Int] = ArrayBuffer(1,4,2,3)
    //val sorted= a.sorted.reverse
    // val sortWith= a.sortWith(_>_)
    //  val sortWith= a.sortWith(_<_)
    //  println(sortWith)


    //min和max 输出数组和数组缓冲的最大值和最小值
    //val max: String = ArrayBuffer("a","aa","aaa").max
    //  println(max)


    //常用算法
    // val sum = Array(1,2,3).sum
    //println(sum)

    //数组转换
    // val a = Array(1, 2, 3, 4, 5)

    //   val result= for(elem <- a ) yield  2 * elem

    //  println(result)




    //遍历数组和数组缓冲
    // var a = 4
    //  for (i <- (0 until (10,2)).reverse) print(i)




    //变长数组，数组缓冲
    // val strings = ArrayBuffer[String]()

    // strings  +=("1","2","3")
    //  strings.insert(2,"a","b","c")
    //for (elem<- strings) print(elem)
    //第一个参数表示插入或者删除的位置。第二个参数表示需要移除多少个元素
    //strings.remove(2,3)
    //  for(elem <- strings) println("111")
    //   for(elem <- strings) print(elem)


    //val b = ArrayBuffer[Int]()
    // b += (1,2,3,4,5)

    //b.insert(2,9)
    //for (elem <- b) print(elem+"-")



    //b +=1
    //for(elem <- b) print(elem+"--")
    //b += (1,2,3,4,5)
    //for(elem <- b) print(elem+"---")
    //b += (8,13,21)
    // print("--------------")
    // for(elem <- b ) println(elem+"----")
    //移除最后5个元素
    //b.trimEnd(5)
    //for (elem <- b) println(b+"---")


    //在尾端添加多个元素，亿括号抱起来
    // val ints = ArrayBuffer(1,2,3,4,5)
    //for (elem <- ints) print(elem+"-")


    //一个空的数组，准备存放数据
    // val b = ArrayBuffer[Int]()
    //b +=1





    //长度为2的Array[STRING] --类型是推断出来的
    //说明：以提供初始值就不需要new
    //val value = Array("Hello","world")



    //10个元素的字符串数组，所有元素初始化为null
     //val strings = new Array[String](10)
    //for (elem <- strings) print(elem+"--")



    //val nums = new Array[Int](10)
    //10个整数的数组，所有元素的初始化为0
    //for (elem <- nums) print(elem+"---")


  }


}

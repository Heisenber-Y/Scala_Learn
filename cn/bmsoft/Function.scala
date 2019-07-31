package cn.bmsoft

object Function {

  def main(args: Array[String]): Unit = {






//当val被声明为lazy时，他的初始化将被推迟，知道我们对他首次取值
//   lazy val word= scala.io.Source.fromFile("F:/yml/1.txt").mkString
//  println(word+"-----")

  //可以使用任意多的参数来调用改函数，函数得到的式Seq 函数
//def  sum(args:Int*)={
//
//var result =0
//  for(arg <- args) result += arg
//
//result
//
//}
// val i = sum(1,2,3,4,5)
//    println(i)

 //如果sum函数被调用式传入的是单个参数，则参数必须是单个整数
    //而不是一个区间，解决办法：追加 _* 即可
//    val i = sum(1 to 5:_*)

 //常见使用案例
//
//   def  recursiveSum(args: Int*): Int={
//
//if(args.length==0) 0
//      else args.head + recursiveSum(args.tail:_*)
//
//    }
// print(recursiveSum(1,2,3))


    // 错误示范： 如果已经有一个值的序列，则不能直接将他传入上述参数
   // val i = sum(1 to 5)

//print(i)






    // 默认参数和带名参数
  // def decorate(str:String ,left:String = "[", right :String = "]")=left + str+right

    //也可以在提供参数值的时候，指定参数名称,注意 带参数名并不需要跟参数列表的顺序完全一直 如：


  // print(decorate(left = "<<<",str = "hello",right = ">>>"))

    // left  和right 都有默认参数
//print(decorate("222"))
   //有默认参数但是使用自定义的参数
//print(decorate("sss","<<<",">>>"))
   //如果给的参数不够的话，默认参数会从后往前逐个应用进来
 //print(decorate("aaa","<<<"))


  //定义函数
//def abs(x: Double)= if(x >=6) x else -x

//print(abs(3))
  }
}

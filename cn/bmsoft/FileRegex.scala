package cn.bmsoft

import java.io.PrintWriter

import sys.process
import scala.io.{BufferedSource, Source}
import scala.util.matching
import scala.util.matching.Regex
import  scala.math._
/**
  * Created by yml on 2019/6/20.
  */
object FileRegex {
  def main(args: Array[String]) {

    //集合
/*val sum: Int = List(8,5,4).sum
    println(sum)*/









  //函数

/*  val num =3.14
  val fun=ceil _
val map: Array[Double] = Array(3.14,1.42,2.0).map(fun)
  for(m <- map) {
    println(m)
  }*/



  //正则
/*  val numpattent: Regex = "[0-9]+".r

    val r: Regex = """\s+[0-9]+\s+""".r

    val in: Option[String] = r.findFirstIn("99 bottles,98 bottles")
    println(in)

   for (matchString<- numpattent.findAllIn("99 bottles,98 bottles")){
println(matchString)

    }*/





    //进程控制
/*  val  result="ls -al .." ！
println(result)*/

//写入文本文件
/*    val writer: PrintWriter = new PrintWriter("F:\\myfile.txt","UTF-8")
    for(i <- 1 to 100) writer.println(i)
  writer.close()*/

  //从URL获取其他源读取

    //val uRL: BufferedSource = Source.fromURL("aaa")


    //读取词法单元和数字 107页
/*    val source=  Source.fromFile("F:\\myfile.txt","UTF-8");
  val split: Array[String] = source.mkString.split("\\-")
    for (c <- split) {
      println(c + "----")

    }*/


      //查看某个字符，但是不处理
/*    val source=  Source.fromFile("F:\\myfile.txt","UTF-8");
    val iter: BufferedIterator[Char] = source.buffered
    while (iter.hasNext){
    if(iter.head.equals("1"))
  println(iter.head+"head 是不是")
    else println("不是1 开头")
    }

source.close();*/

    // /读取单个字符
/* val source=  Source.fromFile("F:\\myfile.txt","UTF-8");
  for (c <- source) {
    println(c)
  }*/

  //文件和正则表达式
/* val source= Source.fromFile("F:\\myfile.txt","UTF-8")

  var lineIterator=source.getLines
   //
   var lineArray= source.getLines().toArray;
    var contents=source.mkString
    println(contents+"hah")
   println(lineArray+"shuzu")
   for ( l<- lineArray ) {
    println(l+"shuju")
    }*/
  }
}

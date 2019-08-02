package mybreak
import scala.Unit
import util.control.Breaks._
/**
  * Created by yml on 2019/8/1.
  */
object WhileBreak {
  def main(args: Array[String]) {

  // breakable()
    // 是一个高阶函数 ，是一个能接受函数的函数

//def breakable(op : => scala.Unit)

    //1：op: =>Unit 表示接受的参数是一个没有输入。也没有返回值的函数
      //2：  即可以简单理解可以接受一段代码块
    //breakable 对 break（）抛出的异常做了处理 ，代码继续运行
    var n =1
    breakable(
      while (n<20){
      n+=1
    println("n="+n)
        if(n==18){
          break()
        }
      }

    )

println("ok")




/*var n =1
    def breakable(){
  try {
    op
  }catch {
    case ex:BreakControl=>
if(ex ne breakException) throw  ex
  }

    }

    breakable{

      while (n<=20){
        n+=1
        println("n="+n)
        if(n==18){
          break()
        }

      }


    }*/

  }



println("ok~~~~")

}

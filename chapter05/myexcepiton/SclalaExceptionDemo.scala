package myexcepiton

/**
  * Created by yml on 2019/8/1.
  */
object SclalaExceptionDemo {
  def main(args: Array[String]) {
  try{
    var r=10/0
  }catch {
    case ex:ArithmeticException=>{
      println("捕获出书为0的异常")
    }
    case ex:Exception=>{
      println("捕获异常")
    }
    }
  finally {
    println("ok")
  }


  }
}

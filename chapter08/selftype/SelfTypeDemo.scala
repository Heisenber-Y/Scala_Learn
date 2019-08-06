package selftype

/**
  * Created by yml on 2019/8/6.
  */
object SelfTypeDemo {
  def main(args: Array[String]) {


  }
}
trait Logger {
  this:Exception=>
  def log: Unit ={
    println(getMessage())
  }
}
//class Console extends Logger{}  //错误
//class Console extends Exception with Logger{}
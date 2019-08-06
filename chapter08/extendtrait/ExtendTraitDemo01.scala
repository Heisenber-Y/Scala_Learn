package extendtrait

/**
  * Created by yml on 2019/8/6.
  */
object ExtendTraitDemo01 {
  def main(args: Array[String]) {

    println("haha")
  }
}
trait LoggedException extends Exception{
  def log: Unit ={
    println(getMessage)
  }
}
class UnhappyException extends LoggedException{
  override def getMessage="错误"
}

/*class UnhappyException3 extends CCC with LoggedException{
  override def getMessage="错误"
}*/
class CCC{

}
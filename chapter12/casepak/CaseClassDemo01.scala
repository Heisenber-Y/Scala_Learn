package casepak

/**
  * Created by yml on 2019/8/13.
  */
object CaseClassDemo01 {
  def main(args: Array[String]) {
println("hello~~~~")

  }
}
abstract class Amount
case class Dollar(value:Double)  extends Amount //样例类
case class Currency(value:Double,unit: String) extends Amount //样例类
case object NoAmount extends Amount //样例类


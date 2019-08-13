package casepak

/**
  * Created by yml on 2019/8/13.
  */
object CaseClassDemo02 {
  def main(args: Array[String]) {
    for(amt<- Array(Dollar2(1000.00),Currnncy2(1000.00,"RMB"),NoAmount2)){
val result= amt match {
  case Dollar2(v)=>"$"+v
  case Currnncy2(v,u)=>v+""+u
  case NoAmount2=>""
}
      println(amt+"=="+result)
    }
  }
}
abstract class Amount2
case class Dollar2(value:Double) extends Amount2
case class Currnncy2(value:Double,unit:String) extends Amount2
case object NoAmount2 extends Amount2

/**
  * Created by yml on 2019/8/13.
  */
object CaseClassDemo03 {
  def main(args: Array[String]) {
    val amt: Currency3 = new Currency3(3000.00,"RMB")
    val amt2: Currency3 = amt.copy()  //克隆，创建的对象和amt的属性一样
    println(amt2.value+"=="+amt2.unit)
    println(amt2)
val amt3: Currency3 = amt.copy(value = 8000.00)
    println(amt3)

    val amt4: Currency3 = amt.copy(unit = "美元")
println(amt4)
  }
}

abstract class Amount3
case class Dollar3(value:Double) extends Amount3
case class Currency3(value:Double,unit:String) extends Amount3
case object NoAmount3 extends Amount3
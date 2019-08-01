package fundetails

/**
  * Created by yml on 2019/8/1.
  */
object Details04 {


//在申明函数时，直接复制初始值，
// 如果没有实参，则会使用默认值，如果有实参，则会覆盖默认值
  def main(args: Array[String]) {
    println(sayok("mary"))
  }

  def sayok(s: String="jack"): Any = {
    return s+"ok"


  }



}

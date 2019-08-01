package fundetails

/**
  * Created by yml on 2019/8/1.
  */
object Details {



  def main(args: Array[String]) {
    //形参列表和返回值的数据类型可以时值类型和引用类型

val tiger: Tiger = new Tiger
  val tiger2=test01(10,tiger)

    println(tiger2.name)
    println(tiger.name)
    println(tiger.hashCode()+"---"+tiger2.hashCode())
  }
  def test01(i: Int, tiger: Tiger): Tiger = {
  println("i="+i)
    tiger.name="jack"
    tiger
  }

}
class Tiger{
  var name=""
}
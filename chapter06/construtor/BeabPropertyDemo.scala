package construtor

import scala.beans.BeanProperty

/**
  * Created by yml on 2019/8/2.
  */
object BeabPropertyDemo {
  def main(args: Array[String]) {
    val car: Car = new Car()
    car.name="BMW"
    println(car.name)

    car.setName("benz")
    println(car.getName)

  }

  class Car{
    //@BeanProperty   自动生成set和get方法
   @BeanProperty var name:String=null
  }
}

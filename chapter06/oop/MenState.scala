package oop

/**
  * Created by yml on 2019/8/2.
  */
object MenState {
  def main(args: Array[String]) {
    val person: Person2 = new Person2
    person.name="jack"
    person.age=11
  val p2=person
    println(p2==person)
    person.name="tom"
    println("p2.name="+p2.name)

  }

  class Person2{
    var name=""
    var age:Int=_
  }
}

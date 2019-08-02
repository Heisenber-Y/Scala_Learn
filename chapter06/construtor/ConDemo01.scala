package construtor

/**
  * Created by yml on 2019/8/2.
  */
object ConDemo01 {
  def main(args: Array[String]) {
/*    val p1: Person = new Person("jack",20)
    println(p1)*/

    val p2: Person = new Person("tom")
    println(p2)

  }

  //构造器的快速入门


  class Person(inName:String,inAge:Int){
    var name:String=inName
    var age:Int=inAge
    age+=10
    println("-----")


    override def toString:String ={
      "name="+this.name+"\t age"+this.age

    }
    println("ok~~~~~")
    println("age="+age)

def  this(name:String){
      this("jack",10)
  this.name=name
}
  }


}

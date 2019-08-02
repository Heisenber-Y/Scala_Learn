package construtor



/**
  * Created by yml on 2019/8/2.
  */
object ConDemo02 {
  def main(args: Array[String]) {
      val p1: Person2 = new Person2("jack")

println(p1)

    
  }

   class Person2 private(){
    var name:String=_
     var age:Int=_

def this(name:String){
    this()   //直接调用主构造器
  this.name=name

}
     //辅助构造器
   def  this(name:String,age:Int){
       this()  //直接调用主构造器
       this.name=name
       this.age=age
     }
def  this(age:Int){
    this("匿名")//调用主构造器，用为def this(name:String) 中
                  //调用了主构造器
  this.age=age
}
def showInfo(): Unit ={
  println("person信息如下")
  println("name="+this.name)
  println("age="+this.age)
}


   }

}

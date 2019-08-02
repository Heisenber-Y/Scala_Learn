package construtor

/**
  * Created by yml on 2019/8/2.
  */
object ConDemo03 {
  def main(args: Array[String]) {
  /*  val worker: Worker = new Worker("jack")
    worker.inName   //不能访问inName*/

 //  val worker: Worker2 = new Worker2("jack")
    //worker.inName="hello"  //可以访问inName 报错
    //worker.inName  //可以访问inName 但是 只读  不报错

   /* val worker: Worker3 = new Worker3("jack")
    worker.inName="mary"
    println(worker.inName)*/



  }
//如果著构造其时Worker(inName:String) 那么inName就是一个局部变量
  class Worker(inName:String){
    var name=inName
  }
  //如果主构造器时Worker2(val inName:String)
  //那么inName 就是work2的一个private 只读属性
  class Worker2(val inName:String){
    var name=inName
   // println("hello")
  }
  class Worker3(var inName:String){
    var name=inName
    //println()
  }


}

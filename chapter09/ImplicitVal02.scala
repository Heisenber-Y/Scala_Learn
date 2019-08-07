/**
  * Created by yml on 2019/8/7.
  */
object ImplicitVal02 {
  def main(args: Array[String]) {

    //隐士变量
    //implicit var name:String="Scala"

    //隐士参数
    def hello(implicit content:String="jack"): Unit ={
    println("hello"+content)
    }
    hello

//当同时又implicit 和默认值 ，implicit 优先级高

  def hello2(implicit name:String="jack"): Unit ={
    println("hello2"+name)
  }
hello2

    //当一个隐士参数匹配不到隐士值，仍愿会使用默认值
  implicit val name:Int=10
    def hello3(implicit content:String="jack"): Unit ={
        println("Hello3"+content)
    }
    hello3

  }
}

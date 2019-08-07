/**
  * Created by yml on 2019/8/7.
  */
object ImplcitValDemo03 {
  def main(args: Array[String]) {
    implicit var str1:String="jack"   //表示隐士值
   // implicit var str2:String="tom"
 // implicit   name:String:name
    def hello(implicit name:String): Unit ={
    println(name+"hello")
    }
    hello
  }
}

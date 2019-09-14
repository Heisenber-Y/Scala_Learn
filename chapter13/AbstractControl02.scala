/**
  * Created by yml on 2019/8/14.
  */
object AbstractControl02 {
  def main(args: Array[String]) {
    var x = 10

    //说明
    //1 函数名为 until , 实现了类似 while循环的效果
    //2. condition: => Boolean 是后一个没有输入值，返回Boolean类型函数
    //3. block: => Unit 没有输入值，也没有返回值的韩
def myWhile(condition: =>Boolean)(block: =>Unit):Unit={

      if(!condition){
        myWhile(condition)(block)
      }
    }
    myWhile(x==0){
      x-=1
      println("x="+x)
    }

  }
}

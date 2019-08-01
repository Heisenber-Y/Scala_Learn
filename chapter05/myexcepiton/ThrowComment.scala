package myexcepiton

/**
  * Created by yml on 2019/8/1.
  */
object ThrowComment {



  def main(args: Array[String]) {
    f11()
    @throws(classOf[NumberFormatException])
    def f11(){
  "abc".toInt

    }

    
  }
}

package mylazy

/**
  * Created by yml on 2019/8/1.
  */
object LaztDemo {



  def main(args: Array[String]) {
   lazy val res = sum(10, 20)
     println("res="+res)
  }
    def sum(n1: Int, n2: Int): Int ={
    println("sum()执行了")
    return n1+n2
    }


}

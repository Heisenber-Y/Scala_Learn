package fundetails

/**
  * Created by yml on 2019/8/1.
  */
object VarParameters {



  def main(args: Array[String]) {

println(sum(10,30,10,3,45,7))
    def sum(n1: Int,args:Int*): Any = {
  println("args.length="+args.length)
//遍历
      var sum=n1
      println(n1)
      for(item<- args){
        sum+=item
      }
      sum
    }
  }
}

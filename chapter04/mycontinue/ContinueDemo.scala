package mycontinue

/**
  * Created by yml on 2019/8/1.
  */
object ContinueDemo {
  def main(args: Array[String]) {
    var loop =true
    var sum2=0
    for(i<-1 to 100 if loop==true){
      sum2+=i
      println(sum2+"sum2=")
      if(sum2>20){
        loop=false
      }
      println("i="+i)
    }




/*    for(i<- 1 to 10 if(i!=2&&i!=3)){
println("i="+i)

    }*/
  }
}

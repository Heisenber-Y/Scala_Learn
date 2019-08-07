/**
  * Created by yml on 2019/8/7.
  */
object ArratDemo02 {
  def main(args: Array[String]) {
    val arr02: Array[Any] = Array(1,2,"xx")
    arr02(1)="xx"
    for (i<-arr02){
      println(i)
    }
  }
}

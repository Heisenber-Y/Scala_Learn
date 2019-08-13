/**
  * Created by yml on 2019/8/13.
  */
object MatchForDemo {
  def main(args: Array[String]) {
    val map= Map("A"->1,"B"->0,"C"->3)
    for ((k,v)<-map){
    println(k+"=="+v) //出来三个k,v
      //说明：只便利出valu=0的k,v ，其他的过滤掉
    }
    println("=====================")
    for ((k,0)<-map){
      println(k+"==="+0)
    }
    //另外一种写法
    println("===========")
    for ((k,v)<-map if v>=0){
    println(k+"=="+v)
    }
  }

}

/**
  * Created by yml on 2019/8/12.
  */
object MatchIfDemo02 {
  def main(args: Array[String]) {
    //守卫

    for(ch<- "+-3!"){  //是对“+-3！ 遍历
      println("ch="+ch)
    var sign =0
      var digit=0
      ch match {
        case '+'=>sign=1
        case  '-'=> sign = -1
        case _ if ch.toString.equals("3") =>digit=3
        case _ if(ch>1000||ch<120)=>println("ch>10")
        case _=>sign=2
      }
println(ch+" "+sign+" "+digit)
    }
  }
}

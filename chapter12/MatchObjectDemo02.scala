/**
  * Created by yml on 2019/8/13.
  */
object MatchObjectDemo02 {
  def main(args: Array[String]) {
    val nameString="Alice,Bob,Thomns"
    nameString match {
      case Names(first,second,third)=>{
        println(s"$first $second $third")
      }
      case _ =>println("nothing match")
    }
  }
}

//object
object Names{
  //当构造器是多个参数，就会出发这个对象提取器
  def unapplySeq(str:String): Option[Seq[String]] ={
    if(str.contains(","))Some(str.split(","))
    else None
  }

}

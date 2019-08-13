/**
  * Created by yml on 2019/8/13.
  */
object MatchList {
  def main(args: Array[String]) {

for (list<- Array(List(0),List(1,0),List(88),List(0,0,0),List(1,0,0))){
  val result= list match {
    case 0::Nil=>"0"
    case x::y::Nil=>x+""+y
    case 0::tail =>"0..."
    case x::Nil=>x
    case _ =>"something else"
  }
  println(result)
}

  }
}

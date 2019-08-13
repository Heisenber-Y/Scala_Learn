/**
  * Created by yml on 2019/8/13.
  */
object MatchTupleDemo01 {
  def main(args: Array[String]) {
    //元组匹配
for(pair<- Array((0,1),(1,0),(10,30),(1,1),(1,0,2))){
  val result=pair match {
    case (0,_)=>"0..."
    case(y,0)=>y
      case(x,y)=>(y,x)
    case _=>"other"
  }
println(result)

}

  }
}

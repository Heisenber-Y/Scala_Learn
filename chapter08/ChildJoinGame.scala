/**
  * Created by yml on 2019/8/5.
  */
object ChildJoinGame {
  def main(args: Array[String]) {
  val child1: Child = new Child("no1")
  val child2: Child = new Child("no2")
    val child3: Child = new Child("no3")
    Child.joinGame(child1)
    Child.joinGame(child2)
    Child.joinGame(child3)
    Child.showNum()
      
    
  }

  class Child(cName:String){
    var name=cName
  }
  object Child{
    var totalChildNum=0
    def joinGame(child:Child): Unit ={
println("小孩假如了游戏"+child.name)
      totalChildNum+=1
    }
    def showNum(): Unit ={
      println("共有"+totalChildNum)
    }
  }
}

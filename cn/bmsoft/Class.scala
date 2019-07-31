package cn.bmsoft

object Classs extends Enumeration {
  //20190505
    //简单类和无参方法：
  /*private var value=0
  def increment (){value +=1}
  def current()=value*/

//一个类如果没有显示定义主构造器，则自动拥有一个无参的构造器即可，
  //val p1= new Person();  主构造器
  //val p2=new Person("Fred") 第一个辅助构造器
  //val p3=new Person("Fred",22)  第二个辅助构造器


  //对象A1


 /* private var lastNumber=0
  def newUniqueNumber()={lastNumber+=1;lastNumber}

  //伴生对象


  val id= Class.newUniqueNumber()
  private var balance=0.0
  def deposit(amount:Double){balance+=amount}*/
//如果需要命令行参数，则可以通过args属性得到

 /* if (args.length>0) print("----")
  else print("---+++")*/
//scala的枚举值：
def main(args: Array[String]): Unit = {
  var Red,Yellow,Green=Value

  for (c<-Classs.values) print(c.id+"---"+c)
}




}

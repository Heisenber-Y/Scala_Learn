package innerclass

/**
  * Created by yml on 2019/8/6.
  */
object ScalaInnerClassDemo {
  def main(args: Array[String]) {
  val outer1: ScalaOuterClass = new ScalaOuterClass
    val outer2: ScalaOuterClass = new ScalaOuterClass
  val inner1= new outer1.ScalaInnerClass
    val inner2= new ScalaOuterClass
    inner1.info()
    
  }
}

//外部类
//内部类访问外部类的数据的方法 外部类名.this.属性
class ScalaOuterClass{
  var name="scoot"
  private var sal=20000.9
  class ScalaInnerClass{//成员内部类
    def info()={
    println("name="+ScalaOuterClass.this.name+"sal="+ScalaOuterClass.this.sal)
  }
  }
}
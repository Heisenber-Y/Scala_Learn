import scala.collection.mutable.ArrayBuffer

/**
  * Created by yml on 2019/8/7.
  */
object ArrayBufferDemo01 {
  def main(args: Array[String]) {

    val arr01= ArrayBuffer[Any](2,3,5)

  //删除
    arr01.remove(0)
    println("删除后的元素遍历")
    for (i<-arr01){
      println(i)
    }


//修改 使用append 追加数据 append 支持可变参数
/*    arr01.append(90.0,13)
    println(arr01.hashCode())
    println("=====")
arr01(1)=89
    println("------")
    for(i<-arr01){
      println(i)
    }*/




/*  //查询

    println("arr01(1)="+arr01(1))

  for(i<-arr01){
    println(i)
  }
println(arr01.length)
    println("arr01.hash="+arr01.hashCode())*/
  }
}

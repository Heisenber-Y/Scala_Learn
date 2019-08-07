/**
  * Created by yml on 2019/8/7.
  */
object MultiplyArray {
  def main(args: Array[String]) {
    //创建多为数组
    val arr: Array[Array[Int]] = Array.ofDim[Int](3,4)
    //遍历
    for(item<-arr){//取出二维数组的每个元素(一位数组)
      for (item2<-item){//元素(一位数组) 遍历
          println(item2+"\t")
      }
      println()
    }

//指定取出
    println(arr(1)(1))
  //修改值
    arr(1)(1)=100



  }
}

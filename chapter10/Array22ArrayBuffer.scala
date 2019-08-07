import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
  * Created by yml on 2019/8/7.
  */
object Array22ArrayBuffer {
  def main(args: Array[String]) {

    val arr2: ArrayBuffer[Int] = ArrayBuffer[Int]()
    arr2.append(1,2,3)
    println(arr2)
    //arr2.toArray 调用arr2的方法 toArray
    //将ArrayBuffer ---> Array
    //arr2本身没有任何变化
    val newArr: Array[Int] = arr2.toArray
    println(newArr)
    println("----")
    val toBuffer: mutable.Buffer[Int] = newArr.toBuffer
    toBuffer.append(123)
    println(toBuffer)

  }
}

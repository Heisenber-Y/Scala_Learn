import java.text.SimpleDateFormat
import java.util.Date

/**
  * Created by yml on 2019/8/14.
  */
object RecursiveDemo02 {
  def main(args: Array[String]) {

    // 递归的方式来解决
    //传统方法完成 1-50 的求和任务

  val now: Date = new Date()
    val dataFormat: SimpleDateFormat = new SimpleDateFormat()
    val date: String = dataFormat.format(now)
    println("date="+date)
    def mx(num:BigInt,sum:BigInt): BigInt ={
  if(num<=50){
    return mx(num+1,sum+num)
  }else{
    return sum
  }

    }
    //测试
    var  num=BigInt(1)
    var sum =BigInt(0)
    var res=mx(num,sum)
    println("res="+res)

    val now2: Date = new Date()
    val date2: String = dataFormat.format(now2)
    println("date2="+date2)

  }
}

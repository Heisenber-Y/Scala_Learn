/**
  * Created by yml on 2019/8/13.
  */
object MidCase {
  def main(args: Array[String]) {

    List(1,3,5,9) match {
      //1.两个元素间::叫中置表达式,至少first，second两个匹配才行.
      //2.first 匹配第一个 second 匹配第二个, rest 匹配剩余部分(5,9)
case first::second::rest=>println(first+"="+second+"="+rest+""+rest.length)
case _=>println("无")

    }
  }
}

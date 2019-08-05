package fun

object Demo1 {
  def main(args: Array[String]): Unit = {
    test(4)
  }
  def test(n:Int){
  if(n>2){
      test(n-1)
  }
  println("n="+n)

  }



}

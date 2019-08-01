package fun

/**
  * Created by yml on 2019/8/1.
  */
object FunDemo1 {



  def main(args: Array[String]) {
    val n1=10
    val n2=20
println("res="+getRes(n1,n2,'-'))

    def getRes(n1: Int, n2: Int, oper: Char) :Any= {
    if(oper=='+'){
      n1+n2
    }else if(oper=='-'){
      n1-n2
    }else{
      null
    }


    }

  }
}

package abstractdemo

/**
  * Created by yml on 2019/8/2.
  */
object BankDemo {
  def main(args: Array[String]) {
  val account: Account = new Account("abc",9999,"123456")
   // account.query("123456")
    account.withDraw("123456",999999)
    //account.query("111111")



  }


  class Account(inAccount:String,inBalance:Double,inPwd:String){

    var accountNo=inAccount
    var balance=inBalance
    var pwd=inPwd

def query(pwd:String): Unit = {
  if (!this.pwd.eq(pwd)) {
    println("密码错误")
    return
  }
  println("账号为%s 当前余额时%.2f\n", this.accountNo, this.balance)

}
//取款
  def withDraw(pwd:String,money:Double): Any ={
    if(!this.pwd.equals(pwd)){
      println("密码错误")
      return
    }
 if(this.balance<money){
   println("月不足")
   return
 }
  this.balance=money
  money
}


}




}

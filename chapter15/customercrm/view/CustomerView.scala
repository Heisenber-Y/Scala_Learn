package customercrm.view

import customercrm.bean.Customer
import customercrm.service.CustomerService

import scala.io.StdIn

/**
  * Created by yml on 2019/9/3.
  */
class CustomerView {


  //定义一个循环变量，控制是否退出while
  var loop =true
  //定义一个key 用于接受用户输入的选项
  var key =' '

    val customerService = new CustomerService()
  /*
  -----------------客户信息管理软件-----------------

                            1 添 加 客 户
                            2 修 改 客 户
                            3 删 除 客 户
                            4 客 户 列 表
                            5 退           出

                            请选择(1-5)：_

   */
  def mainMenu(): Unit ={
    do {
      println("-----------------客户信息管理软件-----------------")
      println("                 1 添 加 客 户")
      println("                 2 修 改 客 户")
      println("                 3 删 除 客 户")
      println("                 4 客 户 列 表")
      println("                 5 退       出")
      println("请选择(1-5)：")
      key= StdIn.readChar()
      key match {
        case '1'=>this.add()
        case '2'=>println("修改客户")
        case '3'=>this.delete()
        case '4'=>this.list()
        case '5'=>this.loop=false
      }
    }while(loop)
    println("退出系统")
  }
  /*
---------------------------客户列表---------------------------
编号  姓名       性别    年龄   电话            邮箱
1    张三       男      30     010-56253825   abc@email.com
2    李四       女      23     010-56253825    lisi@ibm.com
3    王芳       女      26     010-56253825   wang@163.com
-------------------------客户列表完成-------------------------

 */

  def list(): Unit = {
    println()
    println("---------------------------客户列表---------------------------")
    println("编号\t\t 姓名\t\t 性别\t\t 年龄\t\t 电话\t\t 邮箱")
    //for 遍历
    //1.获取到 CustomerSerivce 的 customers ArrayBuffer
    val customers = customerService.list()
    for (customer <- customers) {
      //重写 Customer 的 toString 方法，返回信息(并且格式化)
      println(customer)

    }
  }

def add(): Unit ={
  println()
  println("---------------------添加客户---------------------")
  println("姓名:")
  val name = StdIn.readLine()
  println("性别:")
  val gender = StdIn.readChar()
  println("年龄:")
  val age = StdIn.readShort()
  println("电话:")
  val tel = StdIn.readLine()
  println("邮箱:")
  val email = StdIn.readLine()

  val customer = new Customer(name,gender,age,tel,email)
  customerService.add(customer)


}


def  delete(): Unit ={
  println("---------------------删除客户---------------------")
  println("请选择待删除客户编号(-1 退出):")
  val id = StdIn.readInt()
  if (id == -1) {
    println("---------------------删除没有完成---------------------")
    return
  }
  println("确认是否删除(Y/N):")
  val choice = StdIn.readChar().toLower
  if (choice == 'y') {
    if(customerService.delete(id)){
    println("---------------------删除完成---------------------")
      return
    }
  }
  println("---------------------删除没有完成---------------------")

}


}

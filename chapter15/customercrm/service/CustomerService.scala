package customercrm.service
import customercrm.bean.Customer

import scala.collection.mutable.ArrayBuffer
import util.control.Breaks._
/**
  * Created by yml on 2019/9/3.
  */
class CustomerService {
var customerNum=1
  val customers= ArrayBuffer(new Customer(1, "tom", '男', 10, "110", "tom@sohu.com"))
  def list(): ArrayBuffer[Customer] ={
    this.customers
  }

  def add(customer:Customer): Boolean ={
    //设置ID
    customerNum +=1
    customer.id=customerNum
    customers.append(customer)
  true
  }


  def delete(id:Int): Boolean ={
   var index=findIndexById(id)
if (index!= -1 ){
  customers.remove(index)
  true
}else{
  false
}


  }
  def findIndexById(id: Int): Int ={

    var index = -1
    breakable {
      for (i <- 0 until customers.length) {
        if (customers(i).id == id) {
          index = i
        } else {
          break()
        }
      }

    }
    index

  }

}

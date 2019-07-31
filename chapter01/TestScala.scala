package com.atguigu.chapter01

//只要以后看到有 object TestScala ，你应该有这样一个认识
//1. object TestScala 对应的是一个  TestScala$的一个静态对象 MODULE$
//2. 在我们的程序中，是一个单例
//3.object
//4 def 表示一个方法，这是一个关键字， main 表示方法名字，程序入口 scala 的特点是参数名在前，类型在后面
 // unit 表示该函数的返回值为空 （void）
object TestScala {
  def main(args: Array[String]): Unit = {
    println("hello,scala, idea...")
    var num1: Int = 10
    var num2: Int = 20
    println(num1 + num2)

    println("名字\t年龄\t邮件\t性别")
  }
}

# Scala_Learn
项目描述

##2变量
###2.6数据类型
1. 变量声明时，需要初始化值
2. 在scala中数据类型都是对象
3. scala的数据类型分2大类，anyval(值类型)和AnyRef(引用类型)，不管Anyval还是AnyRef都是对象
4. 在 scala 中有一个根类型 Any ,他是所有类的父类
5. Null 类型是 scala 的特别类型，它只有一个值 null, 他是 bottom calss ,是 所有 AnyRef 类型的子
   类.
6. Nothing类型也是bottomclass,他是所有类的子类，在开发中通常可以将Nothing类型的值返回
   给任意变量或者函数， 这里抛出异常使用很多. 
  

##2.7整数类型
1. Byte Short Int Long
2. Scala各整数类型有固定的表数范围和字段长度，不受具体OS的影响，以保证Scala程序的可 移植性
3. Scala 的整型 常量/字面量 默认为 Int 型，声明 Long 型 常量/字面量 须后加‘l’’或‘L’
4. Scala程序中变量常声明为Int型，除非不足以表示大数，才使用Long


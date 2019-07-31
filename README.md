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

##2.8浮点类型
1. 与整数类型类似，Scala 浮点类型也有固定的表数范围和字段长度，不受具体 OS 的影响。
2. Scala的浮点型常量默认为Double型，声明Float型常量，须后加‘f’或‘F’

##2.9字符类型(Char)
1. 字符常量是用单引号(‘ ’)括起来的单个字符。例如:var c1 = 'a‘ var c2 = '中‘ var c3 =
   '9'
2. Scala 也允许使用转义字符‘\’来将其后的字符转变为特殊字符型常量。例如:var c3 = ‘\n’
   // '\n'表示换行符
3. 可以直接给 Char 赋一个整数，然后输出时，会按照对应的 unicode 字符输出 ['\u0061' 97]
4. Char 类型是可以进行运算的，相当于一个整数，因为它都对应有 Unicode 码.

##2.10布尔类型:Boolean
1. 布尔类型也叫 Boolean 类型，Booolean 类型数据只允许取值 true 和 false
2. boolean 类型占 1 个字节
3. boolean 类型适于逻辑运算，一般用于程序流程控制[后面详解]:

##2.11 Unit类型、Null类型和Nothing类型
1. Null类只有一个实例对象，null，类似于Java中的null引用。
    null可以赋值给任意引用类型 (AnyRef)，但是不能赋值给值类型(AnyVal: 
    比如 Int, Float, Char, Boolean, Long, Double, Byte, Short)
2. Unit类型用来标识过程，也就是没有明确返回值的函数。由此可见，Unit类似于Java里的void。 
    Unit 只有一个实例，()，这个实例也没有实质的意义
3. Nothing，可以作为没有正常返回值的方法的返回类型，非常直观的告诉你这个方法不会正常返 回，
    而且由于 Nothing 是其他任意类型的子类，他还能跟要求返回值的方法兼容。


##2.12.2 值类型隐式转换
1. 有多种类型的数据混合运算时，系统首先自动将所有数据转换成容量最大的那种数据类型，然
   后再进行计算。 5.6 + 10 = 》double
2. 当我们把精度(容量)大 的数据类型赋值给精度(容量)小 的数据类型时，就会报错，反之就会进
     行自动类型转换。
3. (byte, short) 和 char 之间不会相互自动转换。
4. byte，short，char 他们三者可以计算，在计算时首先转换为 int 类型
5. 自动提升原则: 表达式结果的类型自动提升为 操作数中最大的类型







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

##2.12.4 强制类型转换
1. 当进行数据的 从 大——>小，就需要使用到强制转换
2. 强转符号只针对于最近的操作数有效，往往会使用小括号提升优先级


##2.14 值类型和 String 类型的转换
1. 基本类型转 String 类型 将基本类型的值+"" 即可
2. String 类型转基本数据类型  通过基本类型的 String 的 toXxx 方法即可


##4程序的流程控制
###4.1 程序的流程控制说明
1. 顺序控制 
2. 分支控制
3. 循环控制

##5函数时编程
###5.4.1 基本语法
1. 函数声明关键字为 def (definition)
2. [参数名: 参数类型], ...:表示函数的输入(就是参数列表), 可以没有。 如果有，多个参数使用 逗号间隔
3. 函数中的语句:表示为了实现某一功能代码块
4. 函数可以有返回值,也可以没有
    返回值形式1: 返回值类型=
    返回值形式2:返回值类型不确定 使用类型推导完成
    返回值形式3:没有返回值， return 不生效
5.  如果没有return ，默认执行到最后一行的结果作为返回值


### 5.5.2 函数递归调用的重要的规则和小结
1. 程序执行一个函数时，就创建一个新的受保护的独立空间(新函数栈)
2. 函数的局部变量是独立的，不会相互影响
3. 递归必须向退出递归的条件逼近，否则就是无限递归，死龟了:)
4. 一个函数执行完毕，或者遇到 return，就会返回，遵守谁调用，就将结果返回给谁

###5.6 函数注意事项和细节讨论
1. 函数的形参列表可以是多个, 如果函数没有形参，调用时 可以不带()
2. 形参列表和返回值列表的数据类型可以是值类型和引用类型
3. Scala中的函数可以根据函数体最后一行代码自行推断函数返回值类型。那么在这种情况下， return 关键字可以省略
4. 因为 Scala 可以自行推断，所以在省略 return 关键字的场合，返回值类型也可以省略
5. 如果函数明确使用 return 关键字，那么函数返回就不能使用自行推断了,这时要明确写成
  : 返 回类型 = ，当然如果你什么都不写，即使有 return 返回值为() .
6. 如果函数明确声明无返回值(声明 Unit)，那么函数体中即使使用 return 关键字也不会有返回 值
7. 如果明确函数无返回值或不确定返回值类型，那么返回值类型可以省略(或声明为 Any
8. Scala语法中任何的语法结构都可以嵌套其他语法结构(灵活)，即:函数中可以再声明/定义函数， 
    类中可以再声明类 ，方法中可以再声明/定义方法
9. Scala函数的形参，在声明参数时，直接赋初始值(默认值)，这时调用函数时，如果没有指定实
   参，则会使用默认值。如果指定了实参，则实参会覆盖默认值。
10. 如果函数存在多个参数，每一个参数都可以设定默认值，那么这个时候，
    传递的参数到底是覆 盖默认值，还是赋值给没有默认值的参数，就不确定了(默认按照声明顺序[从左到右])。在这种情况下， 可以采用带名参数
11. 递归函数未执行之前是无法推断出来结果类型，在使用时必须有明确的返回值类型 
12. Scala函数支持可变参数

`注意：`
1. args 是集合, 通过 for 循环 可以访问到各个值。
2. 可变参数需要写在形参列表的最后



##6面向对象编程（初级）

##7面向对象变成（中级）
1. Scala中包名和源码所在的系统文件目录结构要可以不一致，但是编译后的字节码文件路径和包名 会保持一致(这个工作由编译器完成)
2. 包也可以像嵌套类那样嵌套使用(包中有包), 这个在前面的第三种打包方式已经讲过了，
    在 使用第三种方式时的好处是:程序员可以在同一个文件中，将类(class / object)、trait 创建在不同的包 中，这样就非常灵活了
3. 作用域原则:可以直接向上访问。即: Scala 中子包中直接访问父包中的内容, 大括号体现作用 域。(提示:Java 中子包使用父包的类，需要 import)。在子包和父包 类重名时，默认采用就近原则，
    如果希望指定使用某个类，则带上包名即可
###7.1.11 包对象
1. 包可以包含类、对象和特质 trait，但不能包含函数/方法或变量的定义。这是 Java 虚拟
    机的局限。为了弥补这一点不足，scala 提供了包对象的概念来解决这个问题。

###7.1.12 包对象的应用案例
1. 在包中直接写方法，或者定义变量，就错误==>使用包对象的技术来解决
2. package object scala 表示创建一个包对象 scala, 他是 com.atguigu.scala 这个包对应的包对象
3. 每一个包都可以有一个包对象
4. 包对象的名字需要和子包一样
5. 在包对象中可以定义变量，方法
6. 在包对象中定义的变量和方法，就可以在对应的包中使用
7. 在底层这个包对象会生成两个类 package.class 和 package$.class


##7.2 包的可见性问题
###7.2.1回顾-Java 访问修饰符基本介绍    
1.  公开级别:用 public 修饰,对外公开
2.  受保护级别:用 protected 修饰,对子类和同一个包中的类公开 
3.  默认级别:没有修饰符号,向同一个包的类公开.
4. 私有级别:用 private 修饰,只有类本身可以访问,不对外公开.


###7.2.5Scala 中包的可见性和访问修饰符的使用
1. 当属性访问权限为默认时，从底层看属性是 private 的，但是因为提供了 xxx_$eq()[类似
   setter]/xxx()[类似 getter] 方法，因此从使用效果看是任何地方都可以访问)
2. 当方法访问权限为默认时，默认为 public 访问权限
3.  private为私有权限，只在类的内部和伴生对象中可用
4. protected为受保护权限，scala中受保护权限比Java中更严格，只能子类访问，同包无法访问
5. 在 scala 中没有 public 关键字,即不能用 public 显式的修饰属性和方法。
6. 包访问权限(表示属性有了限制。同时包也有了限制)，这点和 Java 不一样，体现出 Scala 包 使用的灵活性

###7.3.2Scala 引入包的细节和注意事项
1. 在 Scala 中，import 语句可以出现在任何地方，并不仅限于文件顶部，import 语句的作用一直 
    延伸到包含该语句的块末尾。这种语法的好处是:在需要时在引入包，缩小 import 包的作用范围，提 高效率。
2. Java 中如果想要导入包中所有的类，可以通过通配符*，Scala 中采用下 _
3. 如果不想要某个包中全部的类，而是其中的几个类，可以采用选取器
4. 如果引入的多个包中含有相同的类，那么可以将不需要的类进行重命名进行区分，这个就是重 命名
5. 如果某个冲突的类根本就不会用到，那么这个类可以直接隐藏掉

###7.6.7 重写方法
1. scala 明确规定，重写一个非抽象方法需要用 override 修饰符，调用超类的方法使用 super 关 键字

###7.6.8Scala 中类型检查和转换
1. 要测试某个对象是否属于某个给定的类，可以用 isInstanceOf 方法。用 asInstanceOf 方法将引用
   转换为子类的引用。classOf 获取对象的类名。
2. classOf[String]就如同 Java 的 String.class
3. obj.isInstanceOf[T]就如同 Java 的 obj instanceof T 判断 obj 是不是 T 类型
4. obj.asInstanceOf[T]就如同 Java 的(T)obj 将 obj 强转成 T 类型。

###7.6.9Scala 中超类的构造 1
1. 
2. 
3. 
###7.6.11 覆写字段
####java 的动态绑定机制的小结
1. 如果调用的是方法，则 Jvm 机会将该方法和对象的内存地址绑定
2. 如果调用的是一个属性，则没有动态绑定机制，在哪里调用，就返回对应值
####Scala覆写字段
1. def只能重写另一个def(即:方法只能重写另一个方法)
2. val 只能重写另一个 val 属性 或 重写不带参数的 def

3. 抽象的字段(属性):就是没有初始化的字段(属性)
4. 当一个类含有抽象属性时，则该类需要标记为 abstract
5. 对于抽象的属性，在底层不会生成对应的属性声明，而是生成两个对应的抽象方法(name name_$eq)
6. 如果我们在子类中去重写父类的抽象属性，本质是实现了抽象方法
7. 抽象属性:声明未初始化的变量就是抽象的属性,抽象属性在抽象类

####var重写抽象的var属性小结
1. 一个属性没有初始化，那么这个属性就是抽象属性
2. 抽象属性在编译成字节码文件时，属性并不会声明，但是会自动生成抽象方法，所以类必 须声明为抽象类
3. 如果是覆写一个父类的抽象属性，那么 override 关键字可省略
    [原因:父类的抽象属性， 生成的是抽象方法，因此就不涉及到方法重写的概念，因此 override 可省略]


###7.6.12 抽象类
1. 在 Scala 中，通过 abstract 关键字标记不能被实例化的类。方法不用标记 abstract，只要省掉方法体
   即可。抽象类可以拥有抽象字段，抽象字段/属性就是没有初始值的字段

###7.6.13 Scala 抽象类使用的注意事项和细节讨论
1. 抽象类不能被实例 默认情况下，一个抽象类是不能实例化的，但是你实例化时，动态的实现了抽象类的所有
2. 抽象类不一定要包含 abstract 方法。也就是说,抽象类可以没有 abstract 方法
3. 一旦类包含了抽象方法或者抽象属性,则这个类必须声明为 abstract
4. 抽象方法不能有主体，不允许使用 abstract 修饰
5. 如果一个类继承了抽象类，则它必须实现抽象类的所有抽象方法和抽象属性，除非它自己也声
   明为 abstract 类
6. 抽象方法和抽象属性不能使用 private、final 来修饰，因为这些关键字都是和重写/实现相违背的
7. 抽象类中可以有实现的方法.
8. 子类重写抽象方法不需要 override，写上也不会错


###7.6.14 匿名子类
1. 和 Java 一样，可以通过包含带有定义或重写的代码块的方式创建一个匿名的子类.


###7.6.15 继承层级
1. 在scala中，所有其他类都是AnyRef的子类，类似Java的Object。
2. AnyVal 和 AnyRef 都扩展自 Any 类。Any 类是根节点
3. Any 中定义了 isInstanceOf、asInstanceOf 方法，以及哈希方法等。
4. Null 类型的唯一实例就是 null 对象。可以将 null 赋值给任何引用，但不能赋值给值类型的变量
5. Nothing 类型没有实例。它对于泛型结构是有用处的，举例:空列表 Nil 的类型是 List[Nothing]，
   它是 List[T]的子类型，T 可以是任何类。
6.    



##8 面向对象编程(高级特性)

###8.1.3 伴生对象
1. 在同一个文件夹中，有class ScalaPerson 和object ScalaPerson
2. class ScalaPerson 成为伴生类，将非静态的北荣写道该类中
3. object ScalaPerson 成为伴生对象，将静态的内容写入到该对象(类)中
4. 对于伴生对象的内容，可以直接通过ScalaPerson. 属性或者方法

###8.1.4 伴生对象的小结
1. Scala 中伴生对象采用 
    object 关键字声明，伴生对象中声明的全是 "静态"内容，可以通过伴生 对象名称直接调用。
2. 伴生对象对应的类称之为伴生类，伴生对象的名称应该和伴生类名一致
3. 伴生对象中的属性和方法都可以通过伴生对象名(类名)直接调用访问
4. 从语法角度来讲，所谓的伴生对象其实就是类的静态方法和成员的集合
5.  从技术角度来讲，scala 还是没有生成静态的内容，只不过是将伴生对象生成了一个新的类，实
   现属性和方法的调用
6. 从底层原理看，伴生对象实现静态特性是依赖于 public static final MODULE$ 实现的
7. 伴生对象的声明应该和伴生类的声明在同一个源码文件中(如果不在同一个文件中会运行错 误!)，
    但是如果没有伴生类，也就没有所谓的伴生对象了，所以放在哪里就无所谓了
8. 如果 class A 独立存在，那么 A 就是一个类， 如果 object A 独立存在，
    那么 A 就是一个"静态 "性质的对象[即类对象], 在 object A 中声明的属性和方法可以通过 A.属性 
    和 A.方法 来实现调用
9.  当一个文件中，存在伴生类和伴生对象时，文件的图标会发生变化  

### 8.1.6
1. 在伴生对象中定义apply 方法，可以实现 类名(参数) 方式来创建对象是类

##8.2 单例对象


##8.3.2Scala 接口的介绍
1. 从面向对象来看，接口并不属于面向对象的范畴，Scala 是纯面向对象的语言，在 Scala 中，没 有接口。
2. Scala语言中，采用特质trait(特征)来代替接口的概念，也就是说，多个类具有相同的特征(特 征)时，
    就可以将这个特质(特征)独立出来，采用关键字 trait 声明。
    理解 trait 等价于(interface + abstract class)

###8.3.4Scala 中 trait 的使用
1. 一个类具有某种特质(特征)，就意味着这个类满足了这个特质(特征)的所有要素，所以在使用时，
    也采用了 extends 关键字，如果有多个特质或存在父类，那么需要采用 with 关键字连接 

###8.4.3特质 trait 的再说明
1. Scala提供了特质(trait)，特质可以同时拥有抽象方法和具体方法，一个类可以实现/继承多个 特质

###8.4.4 带有特质的对象，动态混入
1. 除了可以在类声明时继承特质以外，还可以在构建对象时混入特质，扩展目标类的功能【反编 译看动态混入本质
2. 此种方式也可以应用于对抽象类功能进行扩展
3. 动态混入是 Scala 特有的方式(java 没有动态混入)，可在不修改类声明/定义的情况下，扩展
    类的功能，非常的灵活，耦合性低 。 
4. 动态混入可以在不影响原有的继承关系的基础上，给指定的类扩展功能
5.   同时要注意动态混入时，如果抽象类有抽象方法，如何混入

###8.4.5 叠加特质
1. 构建对象的同时如果混入多个特质，称之为叠加特质，那么特质声明顺序从左到右，方法执行顺序 从右到左

###8.4.6 当作富接口使用的特质
1. 富接口:即该特质中既有抽象方法，又有非抽象方法

###8.4.7 特质中的具体字段
1. 特质中可以定义具体字段，如果初始化了就是具体字段，如果不初始化就是抽象字段。混入该特质
    的类就具有了该字段，字段不是继承，而是直接加入类，成为自己的字段
###8.4.9 特质构造顺序
####第一种特质构造顺序(声明类的同时混入特质)
1. 调用当前类的超类构造器
2. 第一个特质的父特质构造器
3. 第一个特质构造器
4. 第二个特质构造器的父特质构造器, 如果已经执行过，
   就不再执行
5. 第二个特质构造器
6. .......重复 4,5 的步骤(如果有第 3 个，第 4 个特质)
7. 当前类构造器

####第 2 种特质构造顺序(在构建对象时，动态混入特质)
1. 调用当前类的超类构造器
2. 当前类构造器
3. 第一个特质构造器的父特质构造器
4. 第一个特质构造器.
5. 第二个特质构造器的父特质构造器, 如果已经执行过，就不再执行
6. 第二个特质构造器
7. .......重复 5,6 的步骤(如果有第 3 个，第 4 个特质)
8. 当前类构造器

####分析两种方式对构造顺序的影响
1. 第 1 种方式实际是构建类对象, 在混入特质时，该对象还没有创建。
2. 第 2 种方式实际是构造匿名子类，可以理解成在混入特质时，对象已经创建了

###8.4.10 扩展类的特质    
    


//216页

















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
1. 特质可以继承类，以用来拓展该特质的一些功能
2. 所有混入该特质的类，会自动成为那个特质所继承的超类的子类
3. 如果混入该特质的类，已经继承了另一个类(A 类)，则要求 A 类是特质超类的子类，否则就会出现 了多继承现象，发生错误

###8.4.11 自身类型
1. 自身类型:主要是为了解决特质的循环依赖问题，同时可以确保特质在不扩展某个类的情况下，依
   然可以做到限制混入该特质的类的类型。
     
##8.5 嵌套类
###8.5.2Scala 嵌套类的使用 2
1. 内部类如果想要访问外部类的属性，可以通过外部类对象访问  访问方式:外部类名.this.属性名
2. 内部类如果想要访问外部类的属性，也可以通过外部类别名访问(推荐)。即:访问方式:外部类名 别名.属性名     

###8.5.3 类型投影
1. 内部类访问外部类的属性的方法 2 使用别名的方式
2. ScalaOuterClass#ScalaInnerClass 类型投影的作用就是屏蔽 外部对象对内部类对 象的影响
3. 类型投影是指:在方法声明上，如果使用 外部类#内部类 的方式，表示忽略内部类的对象关系， 
    等同于 Java 中内部类的语法操作，我们将这种方式称之为 类型投影(即:忽略对象的创建方式， 只考虑类型)


##第 9 章 隐式转换和隐式值
###9.1 隐式转换
1. 隐式转换函数是以 implicit 关键字声明的带有单个参数的函数。这种函数将会自动应用，将值从一
   种类型转换为另一种类型
###9.1.4 隐式转换的注意事项和细节
1. 隐式转换函数的函数名可以是任意的，隐式转换与函数名称无关，只与函数签名(函数参数类 型和返回值类型)有关
2. 隐式函数可以有多个(即:隐式函数列表)，但是需要保证在当前环境下，只有一个隐式函数能 被识别

###9.2 隐式转换丰富类库功能
###9.3.3一个案例说明 隐式值 ，默认值，传值的优先级
1. 当在程序中，同时有 隐式值，默认值，传值
2. 编译器的优先级为 传值 > 隐式值 > 默认值
3.  在隐式值匹配时，不能有二义性
4. 如果三个 (隐式值，默认值，传值) 一个都没有，就会报错
5.  当一个隐式参数匹配不到隐式值，仍然会使用默认值
##9.4 隐式类
###9.4.1 基本介绍
1. 其所带的构造参数有且只能有一个
2. 隐式类必须被定义在“类”或“伴生对象”或“包对象”里，即隐式类不能是 顶级的(top-level
    objects)
3. 隐式类不能是 case class(case class 在后续介绍 样例类)
4. 作用域内不能有与之相同名称的标识符

##9.5 隐式的转换时机
1. 当方法中的参数的类型与目标类型不一致时, 或者是赋值时。
2. 当对象调用所在类中不存在的方法或成员时，编译器会自动将对象进行隐式转换(根据类型

##9.6 隐式解析机制
1. 首先会在当前代码作用域下查找隐式实体(隐式方法、隐式类、隐式对象)。(一般是这种情况
2. 如果第一条规则查找隐式实体失败，会继续在隐式参数的类型的作用域里查找。类型的作用域
   是指与该类型相关联的全部伴生模块，一个隐式实体的类型 T 
   它的查找范围如下(第二种情况范围广且 复杂在使用时，应当尽量避免出现): 
3. 如果 T 被定义为 T with A with B with C,那么 A,B,C 都是 T 的部分，
    在 T 的隐式解析过程中， 它们的伴生对象都会被搜索。
4. 如果 T 是参数化类型，那么类型参数和与类型参数相关联的部分都算作 T 的部分，
    比如 List[String]的隐式搜索会搜索 List 的伴生对象和 String 的伴生对象
5. 如果 T 是一个单例类型 p.T，即 T 是属于某个 p 对象内，那么这个 p 对象也会被搜索
6.   如果 T 是个类型注入 S#T，那么 S 和 T 都会被搜索

##9.7 在进行隐式转换时，需要遵守两个基本的前提:
1. 不能存在二义性
2. 隐式操作不能嵌套使用 

##第 10 章数据结构(上)-集合

###10.1数据结构特点
###10.1.1 scala 集合基本介绍
1. uml => 统一建模语言
2. Scala同时支持不可变集合和可变集合，不可变集合可以安全的并发访问
    不可变集合:scala.collection.immutable
    可变集合: scala.collection.mutable
3. Scala默认采用不可变集合，对于几乎所有的集合类，Scala都同时提供了可变(mutable)和不可
   变(immutable)的版本
4. Scala的集合有三大类:序列Seq(有序的,LinearSeq)、集Set、映射Map【key->value】，所有的
   集合都扩展自 Iterable 特质，在 Scala 中集合有可变(mutable)和不可变(immutable)两种类型
   
###10.1.2 可变集合和不可变集合举例
1. 不可变集合:scala 不可变集合，就是这个集合本身不能动态变化。(类似 java 的数组，是不可 以动态增长的)
2. 可变集合:可变集合，就是这个集合本身可以动态变化的。(比如:ArrayList , 是可以动态增长的)

##10.2.2 老师小结:
1. Set、Map是Java中也有的集合
2. Seq是Java没有的，我们发现List归属到Seq了,因此这里的List就和java不是同 一个概念了
3. 我们前面的 for 循环有一个 1 to 3 ,就是 IndexedSeq 下的 Vector
4. String 也是属于 IndexeSeq
5. 我们发现经典的数据结构比如 Queue 和 Stack 被归属到 LinearSeq
6. 大家注意 Scala 中的 Map 体系有一个 SortedMap,说明 Scala 的 Map 可以支持 排序
7. IndexSeq 和 LinearSeq 的区别
    [IndexSeq 是通过索引来查找和定位，因此速度快，比如 String 就 是一个索引集合，通过索引即可定位] 
    [LineaSeq 是线型的，即有头尾的概念，这种数据结构一般是通 过遍历来查找，它的价值在于应用到一些具体的应用场景


##10.4 数组-定长数组(声明泛型)
1. 这里的数组等同于 Java 中的数组,中括号的类型就是数组的类型
    val arr1 = new Array[Int](10)
    //赋值,集合元素采用小括号访问
    arr1(1) = 7
###10.4.2 第二种方式定义数组
1. 在定义数组时，直接赋值
    //使用 apply 方法创建数组对象
    val arr1 = Array(1, 2)
###10.5.1 变长数组分析小结    
1. ArrayBuffer是变长数组，类似java的ArrayList
2. val arr2 = ArrayBuffer[Int]() 也是使用的 apply 方法构建对象
3. def append(elems: A*) { appendAll(elems) } 接收的是可变参数.
4. 每 append 一次，arr 在底层会重新分配空间，进行扩容，arr2 的内存地址会发生变化，也就成 为新的 ArrayBuffer
  
###10.5.2 定长数组与变长数组的转换
1. 在开发中，我们可能使用对定长数组和变长数组，进行转换
    arr1.toBuffer //定长数组转可变数组       返回结果才是一个可变数组， arr1 本身没有变化
    arr2.toArray //可变数组转定长数组  返回结果才是一个定长数组， arr2 本身没有变化
      
###10.5.3 多维数组的定义和使用
1. val arr = Array.ofDim[Double](3,4)
    说明:二维数组中有三个一维数组，    
    每个一维数组中有四个元素
    赋值:arr(1)(1) = 11.11
        
##10.6 数组-Scala 数组与 Java 的 List 的互转

##10.7 元组 Tuple-元组的基本使用
###10.7.1 基本介绍
1. 元组也是可以理解为一个容器，可以存放各种相同或不同类型的数据。
2. 注意:元组中最大只能有 22 个元素

##10.8 元组 Tuple-元组数据的访问
###10.8.1 基本介绍
1. 访问元组中的数据,可以采用顺序号(_顺序号)，也可以通过索引(productElement)访问。

##10.10列表 List-创建 List
1. Scala 中的 List 和 Java List 不一样，在 Java 中 List 是一个接口，
    真正存放数据是 ArrayList，而 Scala 的 List 可以直接存放数据，就是一个 object，
    默认情况下 Scala 的 List 是不可变的，List 属于序列 Seq。
2. 在默认情况下 List 是 scala.collection.immutable.List,即不可变
3. 在 scala 中,List 就是不可变的，如需要使用可变的 List,则使用 ListBuffer
4. List 在 package object scala 做了 val List = scala.collection.immutable.List
5. val Nil = scala.collection.immutable.Nil // List()

###10.10.3 创建 List 的应用案例小结
1. List默认为不可变的集合
2. List 在 scala 包对象声明的,因此不需要引入其它包也可以使用
    val List = scala.collection.immutable.List
3. List 中可以放任何数据类型，比如 arr1 的类型为 List[Any]
4. 如果希望得到一个空列表，可以使用 Nil 对象, 在 scala 包对象声明的,因此不需要引入其它包也
   可以使用
   val Nil = scala.collection.immutable.Nil


###10.12.4 方式 3-在列表的最后增加数据
1. 符号::表示向集合中 新建集合添加元素。
2. 运算时，集合对象一定要放置在最右边，
3. 运算规则，从右向左。
4. ::: 运算符是将集合中的每一个元素加入到集合中去
5. 通过 :+ 和 +: 给 list 追加元素(本身的集合并没有变化)
6.  :+运算符表示在列表的最后增加数据
7. +:运算符表示在列表的最前增加数据



##10.13ListBuffer
###10.13.1 基本介绍
1. ListBuffer 是可变的 list 集合，可以添加，删除元素,ListBuffer 属于序列

##10.14队列 Queue-基本介绍
###10.14.2 队列的说明
1. 队列是一个有序列表，在底层可以用数组或是链表来实现。
2. 其输入和输出要遵循先入先出的原则。即:先存入队列的数据，要先取出。后存入的要后取
3. 在 Scala 中，由设计者直接给我们提供队列类型 Queue 使用。
4. 在 scala 中, 有 scala.collection.mutable.Queue 和 scala.collection.immutable.Queue , 
    一般来说，我们在开发中通常使用可变集合中的队列
    
###10.15队列 Queue-队列的创建    
1. val q1 = new mutable.Queue[Int]

##10.17队列 Queue-删除和加入队列元素
1. 在队列中，严格的遵守，入队列的数据，放在队位，出队列的数据是队列的头部取出.
2. dequeue 从队列的头部取出元素 q1 本身会变
3. enQueue 入队列，默认是从队列的尾部加入. Redis

##10.18队列 Queue-返回队列的元素
1. 获取队列的第一个元素 q1.head) // 4, 对 q1 没有任何影响
2. 获取队列的最后一个元素 q1.last) // 888, 对 q1 没有任何影响
3. 取出队尾的数据 ,即:返回除了第一个以外剩余的元素，可以级联使用 q1.tail.tail.tail.tail
4.     

##10.19映射 Map-基本介绍
 ###10.19.1 Java 中的 Map 回顾
1. HashMap 是一个散列表(数组+链表)，它存储的内容是键值对(key-value)映射，
    Java 中的 HashMap 是无序的，key 不能重复。
###10.19.3 Scala 中的 Map 介绍
1. Scala 中的 Map 和 Java 类似，也是一个散列表，它存储的内容也是键值对(key-value)映射，
    Scala 中不可变的 Map 是有序的，可变的 Map 是无序的
2. Scala 中 ， 有 可 变 Map (scala.collection.mutable.Map) 和
    不 可 变 Map(scala.collection.immutable.Map)

##10.20映射 Map-构建 Map
###10.20.1 方式 1-构造不可变映射
1. Scala 中的不可变 Map 是有序，构建 Map 中的元素底层是 Tuple2 类型。
2. 默认 Map 是 immutable.Map
3. key-value 类型支持 Any
4. 在 Map 的底层，每对 key-value 是 Tuple2
5. 从输出的结果看到，输出顺序和声明顺序一致

##10.21映射 Map-构建 Map
###10.21.3 方式 3-创建空的映射
1. val map3 = new scala.collection.mutable.HashMap[String, Int]

###10.21.4 方式 4-对偶元组
1. 即创建包含键值对的二元组， 和第一种方式等价，只是形式上不同而已
2. 对偶元组 就是只含有两个数据的元组。


##10.22映射 Map-取值 
###10.22.1 方式 1-使用 map(key)
1. 如果 key 存在，则返回对应的值
2. 如果 key 不存在，则抛出异常[java.util.NoSuchElementException]
3. 在 Java 中,如果 key 不存在则返回 null

###10.22.2 方式 2-使用 contains 方法检查是否存在 key
1. 返回 Boolean
2. 如果 key 存在，则返回 true
3. 如果 key 不存在，则返回 false
4. 使用 containts 先判断在取值，可以防止异常，并加入相应的处理逻辑

###10.22.3 方式 3-使用 map.get(key).get 取值
1. 通过 映射.get(键) 这样的调用返回一个 Option 对象，要么是 Some，要么是 None
2. map.get方法会将数据进行包装
3. 如果 map.get(key) key 存在返回 some,如果 key 不存在，则返回 None
4. 如果 map.get(key).get key 存在，返回 key 对应的值 , 否则，抛出异常
   java.util.NoSuchElementException: None.get
   

###10.22.4 方式 4-使用 map4.getOrElse()取值
1. getOrElse 方法 : def getOrElse[V1 >: V](key: K, default: => V1)
2. 如果 key 存在，返回 key 对应的值
3. 如果 key 不存在，返回默认值。在 java 中底层有很多类似的操作


###10.22.5 如何选择取值的方式
1. 如果我们确定 map 有这个 key ,则应当使用 map(key), 速度快
2. 如果我们不能确定 map 是否有 key ,而且有不同的业务逻辑，使用 map.contains() 先判断在加入逻辑
3. 如果只是简单的希望得到一个值，使用 map4.getOrElse("ip","127.0.0.1")

###10.23映射 Map-对 map 修改、添加和删除
### 10.23.1 更新 map 的元素
1. val map5 = mutable.Map( ("A", 1), ("B", "北京"), ("C", 3) )  map5("A") = 20 //增加
2. map 是可变的，才能修改，否则报错
3. 如果 key 存在:则修改对应的值,key 不存在,等价于添加一个 key-val


###10.23.3 删除 map 元素
1. map5 -= ("A","B","AAA")
2. "A","B" 就是要删除的 key, 可以写多个.
3. 如果 key 存在，就删除，如果 key 不存在，也不会报错.

##10.24映射 Map-对 map 遍历
```scala
//对 map 的元素(元组 Tuple2 对象 )进行遍历的方式很多，具体如下 val map1 = mutable.Map( ("A", 1), ("B", "北京"), ("C", 3) )
for ((k, v) <- map1) println(k + " is mapped to " + v)
for (v <- map1.keys) println(v)
for (v <- map1.values) println(v)
for(v <- map1) println(v) //v 是 Tuple?
```
1. 每遍历一次，返回的元素是 Tuple2
2. 取出的时候，可以按照元组的方式来取

##10.25集 Set-基本介绍
1. 集是不重复元素的结合。集不保留顺序，默认是以哈希集实现

###10.25.1 Java 中 Set 的回顾
1. java 中，HashSet 是实现 Set<E>接口的一个实体类，数据是以哈希表的形式存放的，里面的不能包
   含重复数据。Set 接口是一种不包含重复元素的 collection，HashSet 中的数据也是没有顺序的
2. 默认情况下，Scala 使用的是不可变集合，如果你想使用可变集合，需要引用 scala.collection.mutable.Set 包

##10.27集 Set-可变集合的元素添加和删除 
###10.27.1 可变集合的元素添加
```scala
mutableSet.add(4) //方式 1
mutableSet += 6 //方式 2 
 mutableSet.+=(5) //方式 3
```
1. 说明:如果添加的对象已经存在，则不会重复添加，也不会报错

###10.27.2 可变集合的元素删除
```scala
val set02 = mutable.Set(1,2,4,"abc")
set02 -= 2 // 操作符形式
set02.remove("abc") // 方法的形式，scala 的 Set 可以直接删除值
```
1. 说明:说明:如果删除的对象不存在，则不生效，也不会报错

#11.1 集合元素的映射-map 映射操作

##11.1.2 map 映射操作
```scala
def main(args: Array[String]): Unit = {
//使用高阶函数
val res = test(sum2 _, 3.5) println("res=" + res)
//在 scala 中，可以把一个函数直接赋给一个变量,但是不执行函数 val f1 = myPrint _
f1() //执行

}
def myPrint(): Unit = { println("hello,world!")
}
```
###
1. 说明
2. test 就是一个高阶函数
3. f: Double => Double 表示一个函数， 该函数可以接受一个 Double,返回 Double //3. n1: Double 普通参数
4. f(n1) 在 test 函数中，执行 你传入的函数
5. //在 scala 中，可以把一个函数直接赋给一个变量,但是不执行函数 val f1 = myPrint _
   f1() //执行



###11.1.6 使用 map 映射函数来解决
```scala
val list = List(3,5,7,9)
//说明 list.map(multiple) 做了什么
//1. 将 list 这个集合的元素 依次遍历
//2. 将各个元素传递给 multiple 函数 => 新 Int //3. 将得到新 Int ,放入到一个新的集合并返回 //4. 因此 multiple 函数调用 3
val list2 = list.map(multiple)
println("list2=" + list2) //List(6,10,14)
def multiple(n:Int): Int = { println("multiple 被调用~~") 2*n
}

```

    
 ###11.1.9 flatmap 映射:flat 即压扁，压平，扁平化映射

####扁平化说明
1. flatmap:flat 即压扁，压平，扁平化，效果就是将集合中的每个元素的子元素映射到某个函数并返
   回新的集合
###11.2 集合元素的过滤-filter
1. filter:将符合要求的数据(筛选)放置到新的集合中
```scala
def main(args: Array[String]): Unit = {
/*
选出首字母为 A 的元素
*/
val names = List("Alice", "Bob", "Nick") val names2 = names.filter(startA) println("names=" + names) println("names2=" + names2)
}
def startA(str:String): Boolean = { str.startsWith("A")
}
```   

##11.3 化简
1. 化简:将二元函数引用于集合中的函数,
###11.3.4 对 reduceLeft 的运行机制的说明
1) def reduceLeft[B >: A](@deprecatedName('f) op: (B, A) => B): B
2) reduceLeft(f) 接收的函数需要的形式为 op: (B, A) => B): B
3) reduceleft(f) 的运行规则是 从左边开始执行将得到的结果返回给第一个参数 4) 然后继续和下一个元素运行，将得到的结果继续返回给第一个参数，继续..
即://((((1+2) +3)+4)+5)=15

###11.4.1 基本介绍
1. fold函数将上一步返回的值作为函数的第一个参数继续传递参与运算，直到list中的所有元素被遍 历
2. 可以把 reduceLeft 看做简化版的 foldLeft。
3. 如何理解:
   def reduceLeft[B >: A](@deprecatedName('f) op: (B, A) => B): B =
   if (isEmpty) throw new UnsupportedOperationException("empty.reduceLeft") else tail.foldLeft[B](head)(op)
   大家可以看到. reduceLeft 就是调用的 foldLeft[B](head)，并且是默认从集合的 head 元素开始操作的
   
   
###11.5.1 基本介绍
1. 扫描，即对某个集合的所有元素做 fold 操作，但是会把产生的所有中间结果放置于一个集合中保 存
```scala
var i6 = (1 /: list4) (minus) // =等价=> list4.foldLeft(1)(minus) println("i6=" + i6)
i6 = (100 /: list4) (minus) //=等价=> list4.foldLeft(100)(minus) println(i6) // 输出?
i6 = (list4 :\ 10) (minus) // list4.foldRight(10)(minus) println(i6) // 输出? 2
```   
 
 
##11.7 扩展-拉链(合并)
###11.7.1 基本介绍
1. 拉链的本质就是两个集合的合并操作，合并后每个元素是一个 对偶元组。
2. 如果两个集合个数不对应，会造成数据丢失。
3. 集合不限于 List, 也可以是其它集合比如 Array
4. 如果要取出合并后的各个对偶元组的数据，可以遍历
5.    
   
   
##11.8 扩展-迭代器
###11.8.1 基本说明
1. 通过 iterator 方法从集合获得一个迭代器，
    通过 while 循环和 for 表达式对集合进行遍历.(学习使用 迭代器来遍历)   
 ###11.8.3 对代码小结
 ```scala
def iterator: Iterator[A] = new AbstractIterator[A] { var these = self
def hasNext: Boolean = !these.isEmpty
def next(): A =

```   
1.    iterator 的构建实际是 AbstractIterator 的一个匿名子类，该子类提供了 
2. 该 AbstractIterator 子类提供了 hasNext next 等方法.
3. 因此，我们可以使用 while 的方式，使用 hasNext next 方法变量


##11.9 扩展-流 Stream
###11.9.1 基本说明
1. stream 是一个集合。这个集合，可以用于存放无穷多个元素，但是这无穷个元素并不会一次性生 产出来，
    而是需要用到多大的区间，就会动态的生产，末尾元素遵循 lazy 规则(即:要使用结果才进行 计算的)     
###11.9.2 创建 Stream 对象
```scala
def numsForm(n: BigInt) : Stream[BigInt] = n #:: numsForm(n + 1) val stream1 = numsForm(1)
```
1. Stream 集合存放的数据类型是 BigInt
2. numsForm 是自定义的一个函数，函数名是程序员指定的。
3. 创建的集合的第一个元素是 n , 后续元素生成的规则是 n + 1
4. 后续元素生成的规则是可以程序员指定的 ，比如 numsForm( n * 4)...

##11.10扩展-视图 View
###11.10.1 基本介绍
1. Stream 的懒加载特性，也可以对其他集合应用 view 方法来得到类似的效果，具有如下特点:
2. view方法产出一个总是被懒执行的集合。
3 .view不会缓存数据，每次都要重新计算，比如遍历View时。


##11.11 扩展-并行集合
###11.11.1 基本介绍
1. Scala为了充分使用多核CPU，提供了并行集合(有别于前面的串行集合)，用于多核环境的 并行计算
2. Divide and conquer : 分治算法，Scala 通过 splitters(分解器)，combiners(组合器)等抽象层来实现，
   主要原理是将计算工作分解很多任务，分发给一些处理器去完成，并将它们处理结果合并返回
3. Work stealin 算法【学数学】，主要用于任务调度负载均衡(load-balancing)，通俗点完成自己的 所有任务之后，发现其他人还有活没干完，主动(或被安排)帮他人一起干，这样达到尽早干完的目
    的
    
 ##11.12扩展-操作符
###11.12.2 操作符扩展
1. 如果想在变量名、类名等定义中使用语法关键字(保留字)，可以配合反引号反引号 [案例演 示] val `val` = 42
2. 中置操作符:A 操作符 B 等同于 A.操作符(B)
3. 后置操作符:A 操作符 等同于 A.操作符，如果操作符定义的时候不带()则调用时不能加括号
4. 前置操作符，+、-、!、~等操作符 A 等同于 A.unary_操作符
5. 赋值操作符，A操作符=B等同于A=A操作符B ，比如A+=B等价A=A+B      

##第 12 章模式匹配

###12.1 match
1. Scala 中的模式匹配类似于 Java 中的 switch 语法，但是更加强大。
2. 模式匹配语法中，采用 match 关键字声明，每个分支采用 case 关键字进行声明，当需要匹配时，
    会从第一个 case 分支开始，如果匹配成功，那么执行对应的逻辑代码，如果匹配不成功，
    继续执行下 一个分支进行判断。如果所有 case 都不匹配，那么会执行 case _ 分支，
    类似于 Java 中 default 语句。

3.  match (类似 java switch) 和case 是关键字
4. 如果匹配成功， 则 执行 => 后面的代码块.
5. 匹配的顺序是从上到下，匹配到一个就执行对应的 代码
6. => 后面的代码块 不要写 break ,会自动的退出 match 
7.如果一个都没有匹配到，则执行 case _ 后面的代码块


###12.1.3 match 的细节和注意事项
1. 如果所有 case 都不匹配，那么会执行 case _ 分支，类似于 Java 中 default 语句
2. 如果所有 case 都不匹配，又没有写 case _ 分支，那么会抛出 MatchError
3. 每个 case 中，不用 break 语句，自动中断 case
4. 可以在 match 中使用其它类型，而不仅仅是字符
5. => 等价于 java swtich 的 :
6. => 后面的代码块到下一个 case， 是作为一个整体执行，可以使用{} 扩起来，也可以不扩。


##12.2 守卫
###12.2.1 基本介绍
1. 如果想要表达匹配某个范围的数据，就需要在模式匹配中增加条件守卫

##12.3.1 基本介绍
1。 如果在 case 关键字后跟变量名，那么 match 前表达式的值会赋给那个变量
2. match 是一个表达式，因此可以有返回值
3. 返回值就是匹配到的代码块的最后一句话的值

##12.4 类型匹配
###12.4.1 基本介绍
1. 可以匹配对象的任意类型，这样做避免了使用 isInstanceOf 和 asInstanceOf 方法
2. 在进行类型匹配时，编译器会预先检测是否有可能的匹配，如果没有则报错.

###12.4.3 类型匹配注意事项
1. Map[String, Int] 和 Map[Int, String]是两种不同的类型，其它类推。
2. 在进行类型匹配时，编译器会预先检测是否有可能的匹配，如果没有则报错.
3.如果 case _ 出现在 match 中间，则表示隐藏变量名，即不使用,而不是表示默认匹配
4. casei:Int=>i 表示将 i=obj(其它类推)，然后再判断类型



##12.5 匹配数组
###12.5.1 基本介绍
1. Array(0) 匹配只有一个元素且为 0 的数组。
2. Array(x,y) 匹配数组有两个元素，并将两个元素赋值为 x 和 y。
    当然可以依次类推 Array(x,y,z) 匹 配数组有 3 个元素的等等....
3. Array(0,_*) 匹配数组以 0 开始


##12.6 匹配列表
```scala
object MatchList {
def main(args: Array[String]): Unit = {
for (list <- Array(List(0), List(1, 0), List(88), List(0, 0, 0), List(1, 0, 0))) { val result = list match {
case 0 :: Nil => "0" //
case x :: y :: Nil => x + " " + y // case 0 :: tail => "0 ..." //
case x :: Nil => x
case _ => "something else" }
//1. 0
//2. 1 0
//3. 0 ...
//4. something else println(result)
}

```
##12.7 匹配元组
```scala
def main(args: Array[String]): Unit = {
//如果要匹配 (10, 30) 这样任意两个元素的对偶元组，应该如何写 for (pair <- Array((0, 1), (1, 0), (10, 30), (1, 1), (1, 0, 2))) {
val result = pair match { //
case (0, _) => "0 ..." //
case (y, 0) => y //
case (x, y) => (y, x) //"匹配到(x,y)" + x + " " + y
case _ => "other" //. }
//1. 0 ...
//2. 1
//3. other
//4. other println(result)
}

```


##12.8 对象匹配
###12.8.1 基本介绍
1. case中对象的unapply方法(对象提取器)返回Some集合则为匹配成功
2. 返回 None 集合则为匹配失败

```scala
val number: Double = Square(5.0)// 36.0 //
number match {
//说明 case Square(n) 的运行的机制
//1. 当匹配到 case Square(n)
//2. 调用 Square 的 unapply(z: Double),z 的值就是 number
//3. 如果对象提取器 unapply(z: Double) 返回的是 Some(6) ,则表示匹配成功，同时 // 将 6 赋给 Square(n) 的 n
//4. 果对象提取器 unapply(z: Double) 返回的是 None ,则表示匹配不成功
case Square(n) => println("匹配成功 n=" + n)
case _ => println("nothing matched")
}

``` 
``说明``
```scala
object Square { //说明
//1. unapply 方法是对象提取器
//2. 接收 z:Double 类型
//3. 返回类型是 Option[Double]
//4. 返回的值是 Some(math.sqrt(z)) 返回 z 的开平方的值，
// 并放入到 Some(x) def unapply(z: Double): Option[Double] = {
println("unapply 被调用 z 是=" + z) //Some(math.sqrt(z))
None
}
def apply(z: Double): Double = z * z }

```

##12.10for 表达式中的模式
###12.10.1 基本介绍
1. for 循环也可以进行模式匹配.
```scala
val map = Map("A" -> 1, "B" -> 0, "C" -> 3) for ((k, v) <- map) {
println(k + " -> " + v) // 出来三个 key-value ("A"->1), ("B"->0), ("C"->3) }
//说明 : 只遍历出 value =0 的 key-value ,其它的过滤掉 println("--------------(k, 0) <- map-------------------")
for ((k, 0) <- map) {
println(k + " --> " + 0) }
//说明, 这个就是上面代码的另外写法, 只是下面的用法灵活和强大 println("--------------(k, v) <- map if v == 0-------------------")
for ((k, v) <- map if v >= 1) {
println(k + " ---> " + v) }
```


##12.11样例(模板)类
###12.11.1 样例类快速入门
```scala
object CaseClassDemo01 {
def main(args: Array[String]): Unit = {
println("hello~~") }
}
abstract class Amount
case class Dollar(value: Double) extends Amount
case class Currency(value: Double, unit: String) extends Amount //样例类
case object NoAmount extends Amount //样例类
//类型(对象) =序列化(serializable)==>字符串(1.你可以保存到文件中【freeze】2.反序列化,2 网络传
输)
```

###12.11.2 基本介绍
1. 样例类仍然是类
2. 样例类用 case 关键字进行声明。
3. 样例类是为模式匹配而优化的类
4. 构造器中的每一个参数都成为 val——除非它被显式地声明为 var(不建议这样做)
5. 在样例类对应的伴生对象中提供 apply 方法让你不用 new 关键字就能构造出相应的对象
6. 提供 unapply 方法让模式匹配可以工作
7. 将自动生成 toString、equals、hashCode 和 copy 方法(有点类似模板类，直接给生成，供程序 员使用)
8. 除上述外，样例类和其他类完全一样。你可以添加方法和字段，扩展它们



##12.12case 语句的中置(缀)表达式
###12.12.1 基本介绍
1. 什么是中置表达式?1 + 2，这就是一个中置表达式。
    如果 unapply 方法产出一个元组，你可以在 case 语句中使用中置表示法。比如可以匹配一个 List 序列

```scala
List(1, 3, 5, 9) match { //修改并测试
//1.两个元素间::叫中置表达式,至少 first，second 两个匹配才行.
//2.first 匹配第一个 second 匹配第二个, rest 匹配剩余部分(5,9)
case first :: second :: rest => 
println(first + " " + second + " "+ rest.length + " " + rest) 
// case _ => println("匹配不到...")
```

##12.13匹配嵌套结构
###12.13.1 基本介绍
1. 操作原理类似于正则表达式

```scala
abstract class Item // 项
case class Book(description: String, price: Double) extends Item
 case class Food(description: String, price: Double) extends Item
 //Bundle 捆 ， discount: Double 折扣 ， item: Item* ,
 case class Bundle(description: String, discount: Double, item: Item*) extends Item
 
 
 valsale=Bundle("书籍",10, Book("漫画",40),Bundle("文学作品",20,Book("《阳关》",80),Book(" 《围城》", 30)))
 //知识点 1 - 使用 case 语句，得到 "漫画" val res = sale match {
 //如果我们进行对象匹配时，不想接受某些值，则使用_ 忽略即可，_* 表示所有
 case Bundle(_, _, Book(desc, _), _*) => desc }
 println("res=" + res) //
//知识点 2-通过@表示法将嵌套的值绑定到变量。_*绑定剩余 Item 到 rest
val res2 = sale match {
//如果我们进行对象匹配时，不想接受某些值，则使用_ 忽略即可，_* 表示所有 case Bundle(_, _, art @ Book(_, _), rest @ _*) => (art, rest)
}
println("res2=" + res2)

//知识点 3-不使用_*绑定剩余 Item 到 rest
val res3 = sale match {
//如果我们进行对象匹配时，不想接受某些值，则使用_ 忽略即可，_* 表示所有 case Bundle(_, _, art3 @ Book(_, _), rest3) => (art3, rest3)
}
println("res3=" + res3) 
 
```
```scala
def price(it:Item): Double = { it match {
case Book(_,p) => p
case Bundle(_,disc,its @ _*) => its.map(price).sum - disc }
}
println("price=" + price(sale)) // 120
```



#第 13 章函数式编程高级
##13.1 偏函数(partial function)

###13.1.4 偏函数快速入门
1. //1. PartialFunction[Any,Int] 表示偏函数接收的参数类型是 Any,返回类型是 Int
2. isDefinedAt(x: Any) 如果返回 true ,就会去调用 apply 构建对象实例,如果是 false,过滤
3. apply 构造器 ,对传入的值 + 1,并返回(新的集合)
```scala
val partialFun = new PartialFunction[Any,Int] {
override def isDefinedAt(x: Any) = { println("x=" + x)
x.isInstanceOf[Int] }
override def apply(v1: Any) = { println("v1=" + v1) v1.asInstanceOf[Int] + 1
}

```
``说明；``
1. 如果是使用偏函数，则不能使用 map,应该使用 collect
####//说明一下偏函数的执行流程
1. 遍历 list 所有元素
2. 然后调用 val element = if(partialFun-isDefinedAt(list 单个元素)) {partialFun-apply(list 单个元
   素) }
3. 每得到一个 element,放入到新的集合，最后返回


###13.1.5 偏函数的小结
1) 使用构建特质的实现类(使用的方式是 PartialFunction 的匿名子类)
2) PartialFunction 是个特质(看源码)
3) 构建偏函数时，参数形式 [Any, Int]是泛型，第一个表示参数类型，第二个表示返回参数
4) 当使用偏函数时，会遍历集合的所有元素，编译器执行流程时先执行 isDefinedAt()如果为 true ,
就会执行 apply, 构建一个新的 Int 对象返回
5) 执行 isDefinedAt() 为 false 就过滤掉这个元素，即不构建新的 Int 对象.
6) map函数不支持偏函数，因为map底层的机制就是所有循环遍历，无法过滤处理原来集合的元
 素
7) collect函数支持偏函数


###13.1.6 偏函数的简写形式
```scala
//可以将前面的案例的偏函数简写
def partialFun2: PartialFunction[Any,Int] = {
//简写成 case 语句
case i:Int => i + 1
case j:Double => (j * 2).toInt
}
val list = List(1, 2, 3, 4, 1.2, 2.4, 1.9f, "hello") 
val list2 = list.collect(partialFun2) 
println("list2=" + list2)


//第二种简写形式
val list3 = list.collect{
case i:Int => i + 1
case j:Double => (j * 2).toInt case k:Float => (k * 3).toInt
}
println("list3=" + list3) // (2,3,4,5)
}

```
##13.2 作为参数的函数
###13.2.1 基本介绍
1. 函数作为一个变量传入到了另一个函数中，那么该作为参数的函数的类型是:function1，即:(参 数类型) => 返回类型



##13.3 匿名函数
###13.3.1 基本介绍
1. 没有名字的函数就是匿名函数，可以通过函数表达式来设置匿名函数
```scala
//对匿名函数的说明
//1. 不需要写 def 函数名
//2. 不需要写返回类型，使用类型推导 
// 3. = 变成 =>
//4. 如果有多行，则使用{} 包括
def main(args: Array[String]): Unit = {
val triple = (x: Double) => {
println("x=" + x)
3*x 
}
println("triple" + triple(3))
 // 9.0
```



##13.4 高阶函数
###13.4.1 基本介绍
1. 能够接受函数作为参数的函数，叫做高阶函数 (higher-order function)。可使应用程序更加健壮。

###13.4.3 高阶函数可以返回函数类型
```scala
def main(args: Array[String]): Unit = {
//说明
//1. minusxy 是高阶函数,因为它返回匿名函数 //2. 返回的匿名函数 (y: Int) => x - y
//3. 返回的匿名函数可以使用变量接收
def minusxy(x: Int) = {
(y: Int) => x - y //匿名函数 }
//分步执行
//f1 就是 (y:Int)=>3-y 
// val f1 = minusxy(3) 
// println("f1 的类型=" + f1) 
// println(f1(1)) // 2 
// println(f1(9)) // -6
//也可以一步到位的调用 
// println(minusxy(4)(9)) // -5

}
```

##13.5 参数(类型)推断
###13.5.1 基本介绍
1. 参数推断省去类型信息(在某些情况下[需要有应用场景]，
    参数类型是可以推断出来的，如 list=(1,2,3) list.map() map 中函数参数类型是可以推断的)，
    同时也可以进行相应的简写。

###13.5.2 参数类型推断写法说明
1. 参数类型是可以推断时，可以省略参数类型
2. 当传入的函数，只有单个参数时，可以省去括号
3. 当传入的函数，只有单个参数时，可以省去括号

##13.6 闭包(closure)
###13.6.1 基本介绍
1. 基本介绍:闭包就是一个函数和与其相关的引用环境组合的一个整体(实体)。

```scala
def minusxy(x: Int) = (y: Int) => x - y
//f 函数就是闭包.
val f = minusxy(20) 
println("f(1)=" + f(1)) // 19
// println("f(2)=" + f(2)) // 18

```

对上面代码的小结和说明 1) 
第1点 (y:Int)=>x – y
    返回的是一个匿名函数 ，因为该函数引用到到函数外的 x,那么 该函数和 x 整体形成一个闭包 如:这里 val f = minusxy(20) 的 f 函数就是闭包
2) 你可以这样理解，返回函数是一个对象，而 x 就是该对象的一个字段，他们共同形成一个闭包 
3) 当多次调用 f 时(可以理解多次调用闭包)，发现使用的是同一个 x, 所以 x 不变。
4) 在使用闭包时，主要搞清楚返回函数引用了函数外的哪些变量，因为他们会组合成一个整体(实 体),形成一个闭包


##13.7 函数柯里化最佳实践
###13.7.1 基本介绍
1. 函数编程中，接受多个参数的函数都可以转化为接受单个参数的函数，这个转化过程就叫柯里 化
2. 柯里化就是证明了函数只需要一个参数而已。其实我们刚才的学习过程中，已经涉及到了柯里 化操作
3. 不用设立柯里化存在的意义这样的命题。柯里化就是以函数为主体这种思想发展的必然产生的 
    结果。(即:柯里化是面向函数思想的必然产生结果)

```scala
def mul(x: Int, y: Int) = x * y 
println(mul(10, 10))
def mulCurry(x: Int) = (y: Int) => x * y 
println(mulCurry(10)(9))
def mulCurry2(x: Int)(y:Int) = x * y 
println(mulCurry2(10)(8))
```

###13.8.2 控制抽象基本介绍
####控制抽象是这样的函数，满足如下条件
1. 参数是函数
2. 函数参数没有输入值也没有返回值




##第 14 章使用递归的方式去思考,去编程
###14.1 基本介绍
Scala 是运行在 Java 虚拟机(Java Virtual Machine)之上，因此具有如下特点:
1. 轻松实现和丰富的 Java 类库互联互通。
2. 它既支持面向对象的编程方式，又支持函数式编程
3. 它写出的程序像动态语言一样简洁，但事实上它确是严格意义上的静态语言
4. Scala 就像一位武林中的集大成者，将过去几十年计算机语言发展历史中的精萃集于一身，化
   繁为简，为程序员们提供了一种新的选择。设计者马丁·奥得斯基 
    希望程序员们将编程作为简洁，高 效，令人愉快的工作。同时也让程序员们进行关于编程思想的新的思考

###14.2 Scala 提倡函数式编程(递归思想)
先说下编程范式:
1. 在所有的编程范式中，面向对象编程(Object-Oriented Programming)无疑是最大的赢家。
2. 但其实面向对象编程并不是一种严格意义上的编程范式，严格意义上的编程范式分为:命令式
编程(Imperative Programming)、函数式编程(Functional Programming)
    和逻辑式编程(Logic Programming)。面向对象编程只是上述几种范式的一个交叉产物，更多的还是继承了命令式编程的基 因。
3. 在传统的语言设计中，只有命令式编程得到了强调，那就是程序员要告诉计算机应该怎么做。 
    而递归则通过灵巧的函数定义，告诉计算机做什么。因此在使用命令式编程思维的程序中，
    是现在多 数程序采用的编程方式，递归出镜的几率很少，而在函数式编程中，大家可以随处见到递归的方式。



##第 15 章 项目-scala 客户信息管理系统



##第 16 章并发编程模型 Akka
###16.1 Akka 介绍
1) Akka是JAVA虚拟机JVM平台上构建高并发、分布式和容错应用的工具包和运行时，你可以 理解成 Akka 是编写并发程序的框架。
2) Akka用Scala语言写成，同时提供了Scala和JAVA的开发接口。
3) Akka主要解决的问题是:可以轻松的写出高效稳定的并发程序，程序员不再过多的考虑线程、 锁和资源竞争等细节。

##16.2 Actor 模型用于解决什么问题
1) 处理并发问题关键是要保证共享数据的一致性和正确性，因为程序是多线程时，多个线程对同 一个数据进行修改，若不加同步条件，势必会造成数据污染。但是当我们对关键代码加入同步条件 synchronized 后，实际上大并发就会阻塞在这段代码，对程序效率有很大影响。
2) 若是用单线程处理，不会有数据一致性的问题，但是系统的性能又不能保证。
3) Actor 模型的出现解决了这个问题，简化并发编程，提升程序性能。你可以这里理解:Actor 模 型是一种处理并发问题的解决方案，很牛!

阿斯顿







package myfor

/**
  * Created by yml on 2019/8/1.
  */
object stepfor {

  def main(args: Array[String]) {
    for (i<- 1 to 10){
println("i="+i)
    }
//步长控制为2
   println("------------------")

    for (i<-Range(1,10,2)){
  println("i="+i)
    }

  //控制步长的第二种方式 for 循环守卫
    println("--------")
for(i<- 1 to 10 if i%2==1){
println("i="+i)

}







  }

}

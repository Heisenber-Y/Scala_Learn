object SimgleTonDog {
  def main(args: Array[String]): Unit = {

    val dog = Dog
    println(dog)
  }

  class Dog private {}
  object Dog{
    var singleDog:Dog=null

    def apply: Dog = {
      if(singleDog==null){
     singleDog=new Dog()
      }
singleDog
    }


  }
}

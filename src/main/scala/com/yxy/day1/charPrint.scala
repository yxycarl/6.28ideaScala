package com.yxy.day1

object charPrint {
  def main(args: Array[String]): Unit = {
    var name="banzhang"
    var age=18
    println(name+" "+age)
    printf("name=%s age=%d\n",name,age)
    println(s"name=$name age=$age")
    var a="125"
    println(a.toInt)
    println(a.toDouble)
//    println(a.toBoolean)
    println("true".toBoolean)

  }
}

package com.yxy.day1

object SystatDemo {
  def main(args: Array[String]): Unit = {
    var a=2
    var b=if(a==1) 10 else 20
    println(b)
    var c=a=3
    println(c)
  }
}

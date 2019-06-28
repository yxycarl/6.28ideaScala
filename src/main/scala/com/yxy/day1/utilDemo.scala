package com.yxy.day1

object utilDemo {
  def main(args: Array[String]): Unit = {
    val a=foo()
    println(a)
  }
  print("222222")
  def foo()={
    print(1)
  }
  var b=10


  def foo1():Nothing={
    throw new Exception()
  }

}

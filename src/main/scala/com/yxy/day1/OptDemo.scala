package com.yxy.day1

object OptDemo {
  def main(args: Array[String]): Unit = {
    var a=10
    var b=20
    var c=a+b
    var d=a.+(b)
    println(c)
    println(d)
    a+=1
    println(a)
    b+=1
    println(b)
  }
}

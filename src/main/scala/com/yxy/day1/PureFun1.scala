package com.yxy.day1

object PureFun1 {
  def main(args: Array[String]): Unit = {
//   输出到控制台
    println(add(10,20))


  }
//  引入外部值
  val c=200
  def add1(a:Int,b:Int)={
    a+b+c
  }
//  纯函数
  def add(a:Int,b:Int)={
    a+b
  }
}

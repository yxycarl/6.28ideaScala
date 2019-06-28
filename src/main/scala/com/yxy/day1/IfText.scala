package com.yxy.day1

object IfText {
  def main(args: Array[String]): Unit = {
    var a=10
    val b=if(a>10) a+1 else a-1
    println(b)
  }
}

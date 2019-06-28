package com.yxy.day1

object conversionDemo {
  def main(args: Array[String]): Unit = {
    var a=128
    var b:Long=a
    var c:Byte=b.toByte
    println(c)
  }
}

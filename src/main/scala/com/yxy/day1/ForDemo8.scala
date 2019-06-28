package com.yxy.day1

object ForDemo8 {
  def main(args: Array[String]): Unit = {
    var j=for(i<-1 to 9) i*i
    println(j)

    var k=for(i<-1 to 9) yield i*i
    println(k)
  }
}

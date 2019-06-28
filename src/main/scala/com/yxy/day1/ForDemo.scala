package com.yxy.day1

object ForDemo {
  def main(args: Array[String]): Unit = {
    val a=1 to (10,2)
    println(a)
    for(i<- a){
      print(i)
    }
    println()
    var b=1 until (10,3)
    for(i<-b){
      print(i)
    }
  }
}

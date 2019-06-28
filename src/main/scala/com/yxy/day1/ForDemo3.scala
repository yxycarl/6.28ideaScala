package com.yxy.day1

object ForDemo3 {
  def main(args: Array[String]): Unit = {
    val s="hello world"
    for(i<-s){
      print(i)
    }
    println()
    for(i<-0 until s.length){
      print(s(i))
    }



  }
}

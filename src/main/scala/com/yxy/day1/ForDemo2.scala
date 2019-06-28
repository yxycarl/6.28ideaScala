package com.yxy.day1

object ForDemo2 {
  def main(args: Array[String]): Unit = {
    for(i<-1 to 10){
      print(i)
    }
    println()
    for(i<-1 until (10,2)){
      print(i)
    }
    println()
    for(i<-1 until (10,2) reverse){
      print(i)
    }
  }
}

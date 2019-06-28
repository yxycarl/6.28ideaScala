package com.yxy.day1

object WhileDemo1 {
  def main(args: Array[String]): Unit = {
    var a=1
    while(a<10){
      print(a)
      a+=1
    }
    println()
    do{
      print(a)
      a+=1
    }while(a<20)
  }
}

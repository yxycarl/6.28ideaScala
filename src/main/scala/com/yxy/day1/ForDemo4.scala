package com.yxy.day1

object ForDemo4 {
  def main(args: Array[String]): Unit = {
    for(i<- 1 to 10 if(i%2==0)){
      print(i+" ")
    }
  }
}

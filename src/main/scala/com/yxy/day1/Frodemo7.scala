package com.yxy.day1

object ForDemo7 {
  def main(args: Array[String]): Unit = {
    for (i<-1 to 9){
      for(j<-1 to i) {
        print(j + "*" + i + "=" + i * j +"\t");
      }
      println()
    }
  }
}

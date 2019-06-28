package com.yxy.day1

import scala.util.control.Breaks

object ForDemo5 {
  def main(args: Array[String]): Unit = {
    var bound=true
    for(i<- 1 to 10 if bound){
      if(i>=5){
        bound=false
      }else{
        print(i+" ")
      }
    }
    println()
    Breaks.breakable(
    for(i<- 1 to 10){
      if(i>=5){
        Breaks.break()
      }else{
        print(i+" ")
      }
    })
  }
}

package com.yxy.day1

import scala.io.StdIn

object ReadData {
  def main(args: Array[String]): Unit = {
    val name=StdIn.readLine()
    val age=StdIn.readInt()
    println(name)
    println(age)
  }
}

package com.xuehai.utils

import java.sql.ResultSet
import java.text.SimpleDateFormat
import java.util.{Date, Locale}

import com.alibaba.fastjson.JSON
import com.xuehai.utils.MysqlUtils.{conn, getMysqlConnection}

import scala.collection.mutable

object test {
  def main(args: Array[String]): Unit = {
    val aa="2020-09-15 15:32:11"

   val aab=new SimpleDateFormat("yyyyMMdd HHmmss").format(new Date)
    val strings = aab.split(" ")(1).toInt
   // println(strings)




  }
}

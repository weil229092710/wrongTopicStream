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

   var date1= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date)
    println(date1)



    val time_local="04/Dec/2020:12:50:21 +0800"
    //val time=Utils.toLoclTime(time_local)
    val sdf1 = new SimpleDateFormat("dd/MMM/yyyy:hh:mm:ss Z", Locale.US)
    val date = sdf1.parse(time_local)
    val sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    var hour=time_local.split("/")(2).split(":")(1)

    val time=	sdf2.format(date)
    println(time)


  }
}

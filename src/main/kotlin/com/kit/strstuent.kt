package com.kit



fun main(){
    val stu1=Student("Jack",90,80)
    stu1.print()

}
class Student(var name:String,var math:Int,var english:Int){

    fun print(){
        println(name+"\t"+math+"\t"+english+"\t")
    }
}

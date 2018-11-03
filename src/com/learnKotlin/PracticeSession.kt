package com.learnKotlin

import com.learnKotlin.classFunction.EmployeeData

/**
 * Created by Amit PREMI on 21-Oct-18.
 */
fun main(args: Array<String>) {

    val employee: EmployeeData = EmployeeData(12, "Amit Premi", "Software Developer",
            200000.45.toFloat());
    employee.id = 12
    employee.name = "Amit EDIT"
    employee.profession = "Software Developer"

    println("Employee Name: " + employee.name)
}


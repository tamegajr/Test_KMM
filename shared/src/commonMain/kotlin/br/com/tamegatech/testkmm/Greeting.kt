package br.com.tamegatech.testkmm

import kotlinx.datetime.*

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!" +
         " Faltam ${daysUntilNewYear()} dias para o Ano Novo"
    }

    fun daysUntilNewYear (): Int{

        val today = Clock.System.todayAt(TimeZone.currentSystemDefault())
        val closestNewYear = LocalDate(today.year + 1,1,1)
        return today.daysUntil(closestNewYear)
    }
}
package br.com.tamegatech.testkmm

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}
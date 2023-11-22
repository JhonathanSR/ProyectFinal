package com.example.localizaapp

class User(val name: String, val email: String, val password: String, val  confirmarPassword: String) {
    class Database {
        companion object {
            val users: Any
                get() {
                    TODO()
                }
        }

    }
}
/*name: String,
email: String,
password: String,
confirmpassword: String,
val name: CharSequence,
val email: CharSequence
{
val email: CharSequence?
val name: CharSequence?

val passw: Any

object Database {
    var users = mutableListOf<User>()*/





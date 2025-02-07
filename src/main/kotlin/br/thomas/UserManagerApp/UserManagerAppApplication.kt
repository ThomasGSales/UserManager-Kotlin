package br.thomas.UserManagerApp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class UserManagerAppApplication

fun main(args: Array<String>) {
	runApplication<UserManagerAppApplication>(*args)
}

package br.thomas.UserManagerApp.repositories

import br.thomas.UserManagerApp.models.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User, Long> {

}
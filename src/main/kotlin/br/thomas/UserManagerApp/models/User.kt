package br.thomas.UserManagerApp.models

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size
import org.hibernate.validator.constraints.br.CPF

@Entity
data class User(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @field:NotBlank(message = "Este campo é obrigatório")
    val name: String = "",

    @field:NotBlank(message = "Este campo é obrigatório")
    @field:Email(message = "Email inválido")
    val email: String = "",

    @field:NotBlank(message = "Este campo é obrigatório")
    @field:Size(min = 6, max = 12, message = "A senha deve ter entre 6 a 12 caracteres")
    val password: String = "",

    @field:NotBlank(message = "Este campo é obrigatório")
    @field:CPF(message = "CPF inválido")
    val cpf: String = "",


    val role: String = ""
) {

}
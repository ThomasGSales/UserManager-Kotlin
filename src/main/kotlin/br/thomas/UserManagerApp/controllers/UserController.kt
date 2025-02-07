package br.thomas.UserManagerApp.controllers


import br.thomas.UserManagerApp.models.User
import br.thomas.UserManagerApp.repositories.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.BindingResult
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody

@Controller
class UserController {

    @Autowired
    lateinit var repository: UserRepository

    @GetMapping("/formulario/cadastro")
    fun openRegistrationForm(model: Model): String {

        val employee = User()

        model.addAttribute("user", employee)

        return "formulario-cadastro"
    }

    @PostMapping("/cadastrar")
    fun registerUser(@Validated user: User, result: BindingResult): String {

        if(result.hasErrors()){
            return "formulario-cadastro"
        }

        repository.save(user)

        println(user)

        return "redirect:/home"
    }

    @GetMapping("/home")
    fun openHomePage(model: Model): String{

        val users = repository.findAll()

        model.addAttribute("users", users)

        return "home"
    }

    @GetMapping("/formulario/editar/{id}")
    fun openEditForm(@PathVariable("id") id: Long, model: Model): String{

        val user = repository.findById(id).orElse(null)

        model.addAttribute("user", user)

        return "formulario-edicao"
    }

    @PostMapping("/editar/{id}")
    fun editUser(user: User, @PathVariable id: Long): String {

        user.id = id

        val user = repository.save(user)

        return "redirect:/home"
    }

    @GetMapping("/formulario/excluir/{id}")
    fun deleteUser(@PathVariable("id") id: Long): String {

        repository.deleteById(id)

        return "redirect:/home"
    }
}
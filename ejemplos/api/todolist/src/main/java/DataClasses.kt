import java.time.LocalDateTime
import java.util.*

// Modelo

data class Profile(val username: String, val password: String, val imageLink: String)
data class Todo(val id: String, val date: LocalDateTime, val description: String)
data class User(val id: String, val profile: Profile, val todos: MutableList<Todo>)

// Api

data class Login(val username: String, val password: String)
data class Register(val username: String, val password: String, val imageLink: String)

data class NewTodo(val description: String)
data class UpdateTodo(val description: String)

data class TodoJson(val id: String, val date: String, val description: String)
data class UserJson(val id: String, val username: String, val imageLink: String, val todos: List<TodoJson>)

class Bootstrap() {

    fun getUsers(): MutableList<User> {
        val user1 = User("e0f9ce62-2614-401c-996f-ec41632ce648", Profile("pepe", "pepe", "https://pbs.twimg.com/profile_images/1064465168179085313/YgDr84RZ_bigger.jpg"), mutableListOf(
                Todo("1", LocalDateTime.now(), "firstTodo"),
                Todo("2", LocalDateTime.now(), "secondTodo")
        ))
        val user2 = User("e0f9ce62-2614-401c-996f-ec41632ce648", Profile("lucas", "lucas", "https://community.cbr.com/image.php?u=38408&dateline=1424608642"), mutableListOf(
                Todo("3", LocalDateTime.now(), "firstTodo"),
                Todo("4", LocalDateTime.now(), "secondTodo")
        ))
        return mutableListOf(user1, user2)
    }
}
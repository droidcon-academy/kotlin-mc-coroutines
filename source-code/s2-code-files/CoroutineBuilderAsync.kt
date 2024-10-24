import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() = runBlocking{
    val pasta = GlobalScope.async {
        delay(1000)  // Simulate cooking pasta
        "Pasta is ready!"
    }
    println("Chef is chopping veggies.")
    println(pasta.await())  // Waiting for the pasta to be ready
}

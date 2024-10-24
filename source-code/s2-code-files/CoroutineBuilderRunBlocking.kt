import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        println("Chef is grilling a steak.")
        delay(1000)
        println("Steak is done!")
    }
}

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    GlobalScope.launch {
        // Cooking something in the background
        delay(2000)
        println("Pizza is ready!")
    }
    println("The chef is still chopping vegetables.")
}

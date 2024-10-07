import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async

fun main() {
    GlobalScope.async {
        println("Coroutine with async")
        42
    }
    Thread.sleep(1000L)
}

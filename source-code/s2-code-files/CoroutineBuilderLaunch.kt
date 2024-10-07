import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

fun main() {
    GlobalScope.launch {
        println("Coroutine with launch")
    }
    Thread.sleep(1000L)
}

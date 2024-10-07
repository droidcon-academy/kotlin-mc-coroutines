import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@OptIn(DelicateCoroutinesApi::class)
fun main() {
    println("Start")
    GlobalScope.launch {
        delay(1000L)
        println("Hello from Coroutine")
    }
    println("End")
    Thread.sleep(2000L)  // Wait for coroutine to finish
}

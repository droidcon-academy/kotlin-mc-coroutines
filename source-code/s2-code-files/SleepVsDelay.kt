import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@OptIn(DelicateCoroutinesApi::class)
fun main() {
    println("Using Thread.sleep:")
    Thread.sleep(1000L)
    println("After Thread.sleep")

    println("Using delay:")
    GlobalScope.launch {
        delay(1000L)
        println("After delay")
    }
    Thread.sleep(2000L)
}

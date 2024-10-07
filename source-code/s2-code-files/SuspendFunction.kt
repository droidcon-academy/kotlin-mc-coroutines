import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun mySuspendFunction() {
    delay(1000L)
    println("This is a suspend function")
}

@OptIn(DelicateCoroutinesApi::class)
fun main() {
    GlobalScope.launch {
        mySuspendFunction()
    }
    Thread.sleep(2000L)
}

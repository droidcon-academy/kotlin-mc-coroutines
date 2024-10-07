import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val job = launch {
        println("Starting launch")
        delay(1000L)
        println("Finished launch")
    }

    val deferred = async {
        println("Starting async")
        delay(1000L)
        println("Finished async")
        "Result from async"
    }

    job.join()  // Wait for launch coroutine to finish
    println(deferred.await())  // Wait for async coroutine and get result
}

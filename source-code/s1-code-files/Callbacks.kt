fun fetchData(callback: (String) -> Unit) {
    // Simulate a network request
    Thread {
        Thread.sleep(1000L) // Simulate delay
        callback("Data fetched")
    }.start()
}

fun main() {
    fetchData { data ->
        println(data)
    }
    println("Request sent")
}

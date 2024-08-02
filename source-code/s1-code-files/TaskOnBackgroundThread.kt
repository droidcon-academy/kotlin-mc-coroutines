fun main() {
    println("Start")

    Thread {
        // Simulate a long-running task
        Thread.sleep(2000L)
        println("Background task completed")
    }.start()

    println("End")
}

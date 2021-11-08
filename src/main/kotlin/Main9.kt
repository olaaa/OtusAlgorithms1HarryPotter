import kotlin.math.abs

fun main(args: Array<String>) {
    val range = 24
    for (x in 0..range) {
        for (y in 0..range) {
            if (abs(x - y) > 10)
                print("# ")
            else
                print(". ")
        }
        println()
    }
}
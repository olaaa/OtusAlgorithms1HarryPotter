import kotlin.math.sin

fun main(args: Array<String>) {
    val range = 24
    for (x in 0..range) {
        for (y in 0..range) {
            if (y > 8 * sin(2.6 * Math.PI / range * x) + range - 1 - 8)
                print("# ")
            else
                print(". ")
        }
        println()
    }
}
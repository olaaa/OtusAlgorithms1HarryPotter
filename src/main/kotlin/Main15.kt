import kotlin.math.abs

fun main(args: Array<String>) {
    val range = 24
    for (x in 0..range) {
        for (y in 0..range) {
            // для int приведение к нижней границе по умолчанию
            if (abs(x - y) in 10..15)
                print("# ")
            else
                print(". ")
        }
        println()
    }
}
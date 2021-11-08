fun main(args: Array<String>) {
    val range = 24
    for (x in 0..range) {
        for (y in 0..range) {
            if (Math.sin(x.toDouble() / 3) <= y / 8 - 2)
                print("# ")
            else
                print(". ")
        }
        println()
    }
}
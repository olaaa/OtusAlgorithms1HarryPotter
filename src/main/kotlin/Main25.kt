fun main(args: Array<String>) {
    val range = 24
    for (x in 0..range) {
        for (y in 0..range) {
            if (x % 6 == 0 || y % 6 == 0)
                print("# ")
            else
                print(". ")
        }
        println()
    }
}
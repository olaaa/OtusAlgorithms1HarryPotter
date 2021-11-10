fun main(args: Array<String>) {
    val range = 24
    for (x in 0..range) {
        for (y in 0..range) {
            if ((x % 2) + (y % 3) == 0)
                print("# ")
            else
                print(". ")
        }
        println()
    }
}
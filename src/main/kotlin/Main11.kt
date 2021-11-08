fun main(args: Array<String>) {
    val range = 24
    for (x in 0..range) {
        for (y in 0..range) {
            if (x == 1 || y == 1 || x == 23 || y == 23)
                print("# ")
            else
                print(". ")
        }
        println()
    }
}
fun main(args: Array<String>) {
    val range = 24
    for (x in 0..range) {
        for (y in 0..range) {
            if (x == y || x == 24 - y)
                print("# ")
            else
                print(". ")
        }
        println()
    }
}
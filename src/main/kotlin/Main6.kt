fun main(args: Array<String>) {
    val range = 24
    for (x in 0..range) {
        for (y in 0..range) {
            if ((x < 10) || (y < 10))
                print("# ")
            else
                print(". ")
        }
        println()
    }
}
fun main(args: Array<String>) {
    val range = 24
    for (x in 0..range) {
        for (y in 0..range) {
            if (x + y in 20..28)
                print("# ")
            else
                print(". ")
        }
        println()
    }
}
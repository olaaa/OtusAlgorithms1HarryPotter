fun main(args: Array<String>) {
    for (x in 0..25) {
        for (y in 0..25) {
            if (x + y <= 30)
                print("# ")
            else
                print(". ")
        }
        println()
    }
}
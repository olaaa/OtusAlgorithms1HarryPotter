fun main(args: Array<String>) {
    val range = 24
    for (x in 0..range) {
        for (y in 0..range) {
//            для int по умолчанию округление в меньшее сторону
            if (x == y / 2)
                print("# ")
            else
                print(". ")
        }
        println()
    }
}
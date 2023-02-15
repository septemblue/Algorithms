class Bubble {
    fun sort() {
        val madep = arrayListOf(9, 7, 2, 8, 4, 1)

        var temp = 0

        for (x in 0 until madep.size -1 ) {
            for (j in 0 until madep.size -x -1) {
                if (madep[j + 1] < madep[j]) {
                    temp = madep[j+1]
                    madep[j+1] = madep[j]
                    madep[j] = temp
                }
            }
        }


        madep.forEach {angka ->
            println(angka)
        }

    }
}
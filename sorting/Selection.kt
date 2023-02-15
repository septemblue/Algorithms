class Selection {
    fun sort() {
        val dArray = arrayListOf(9, 3, 8, 4, 5, 2, 1)

        var temp: Int
        for (x in 0 until dArray.size - 1) {
            var selected: Int? = x

            for (j in x+1 until dArray.size) {
                if (dArray[selected!!] < dArray[j]) {
                    selected = j
                }
            }

            if (selected!! != x) {
                temp = dArray[selected]
                dArray[selected] = dArray[x]
                dArray[x] = temp
            }
        }

        dArray.forEach{angka ->
            println("angkanya: $angka")
        }
    }
}
package Data

class Lingkaran: BangunDatar() {
    var r: Int = 0

    override fun luas(): Float {
        return (3.14 * r * r).toFloat()
    }

    override fun keliling(): Float {
        return (2 * 3.14 * r).toFloat()
    }
}
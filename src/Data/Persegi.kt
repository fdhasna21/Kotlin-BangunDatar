package Data

class Persegi: BangunDatar() {
    var sisi: Int = 0

    override fun luas(): Float {
        return (sisi * sisi).toFloat()
    }

    override fun keliling(): Float {
        return (4 * sisi).toFloat()
    }
}
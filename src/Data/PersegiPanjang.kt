package Data

class PersegiPanjang: BangunDatar() {
    var panjang: Int = 0
    var lebar: Int = 0

    override fun luas(): Float {
        return(panjang * lebar).toFloat()
    }

    override fun keliling(): Float {
        return(2 * (panjang + lebar)).toFloat()
    }
}
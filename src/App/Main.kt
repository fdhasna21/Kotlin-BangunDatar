package App

import Data.Lingkaran
import Data.Persegi
import Data.PersegiPanjang

fun main() {
    val persegi = Persegi()
    val persegiPanjang = PersegiPanjang()
    val lingkaran = Lingkaran()
    do {
        println("------------------------------Menghitung Luas dan Keliling Bangun Datar------------------------------")
        println("1. Menghitung luas")
        println("2. Menghitung keliling")
        println("3. Keluar")
        print("Pilihan yang anda inginkan : ")
        var pilih: String? = readLine()
        when (pilih) {
            "1" -> {
                println("\n------------------------------Menghitung Luas Bangun Datar------------------------------")
                println("1. Menghitung luas persergi")
                println("2. Menghitung luas persegi panjang")
                println("3. Menghitung luas lingkaran")
                print("Pilih fungsi luas yang anda inginkan : ")
                var pilih1: String? = readLine()
                when (pilih1) {
                    "1" -> {
                        println("\n-------------------------------Menghitung Luas Persegi-------------------------------")
                        print("Masukan nilai sisi dari persegi : ")
                        persegi.sisi = readLine()!!.toInt()
                        println("Luas persegi dengan sisi ${persegi.sisi} adalah ${persegi.luas()}")
                        readLine()
                    }
                    "2" -> {
                        println("\n-------------------------------Menghitung Luas Persegi Panjang-------------------------------")
                        print("Masukan nilai panjang dari persegi panjang : ")
                        persegiPanjang.panjang = readLine()!!.toInt()
                        print("Masukan nilai lebar dari persegi panjang : ")
                        persegiPanjang.lebar = readLine()!!.toInt()
                        println("Luas persegi panjang dengan panjang ${persegiPanjang.panjang} dan lebar ${persegiPanjang.lebar} adalah ${persegiPanjang.luas()}")
                        readLine()
                    }
                    "3" -> {
                        println("\n-------------------------------Menghitung Luas Lingkaran-------------------------------")
                        print("Masukan nilai jari-jari dari lingkaran : ")
                        lingkaran.r = readLine()!!.toInt()
                        println("Luas lingkaran dengan jari-jari ${lingkaran.r} adalah ${lingkaran.luas()}")
                        readLine()
                    }
                    else -> {
                        println("Pilihan yang anda pilih tidak ada")
                        readLine()
                    }
                }
            }
            "2" -> {
                println("\n------------------------------Menghitung Keliling Bangun Datar------------------------------")
                println("1. Menghitung keliling persergi")
                println("2. Menghitung keliling persegi panjang")
                println("3. Menghitung keliling lingkaran")
                print("Pilih fungsi keliling yang anda inginkan : ")
                var pilih2: String? = readLine()
                when (pilih2) {
                    "1" -> {

                        println("\n-------------------------------Menghitung Keliling Persegi-------------------------------")
                        print("Masukan nilai sisi dari persegi : ")
                        persegi.sisi = readLine()!!.toInt()
                        println("Keliling persegi dengan sisi ${persegi.sisi} adalah ${persegi.keliling()}")
                        readLine()
                    }
                    "2" -> {
                        println("\n-------------------------------Menghitung Keliling Persegi Panjang-------------------------------")
                        print("Masukan nilai panjang dari persegi panjang : ")
                        persegiPanjang.panjang = readLine()!!.toInt()
                        print("Masukan nilai lebar dari persegi panjang : ")
                        persegiPanjang.lebar = readLine()!!.toInt()
                        println("Keliling persegi panjang dengan panjang ${persegiPanjang.panjang} dan lebar ${persegiPanjang.lebar} adalah ${persegiPanjang.keliling()}")
                        readLine()
                    }
                    "3" -> {
                        println("\n-------------------------------Menghitung keliling Lingkaran-------------------------------")
                        print("Masukan nilai jari-jari dari lingkaran : ")
                        lingkaran.r = readLine()!!.toInt()
                        println("keliling lingkaran dengan jari-jari ${lingkaran.r} adalah ${lingkaran.keliling()}")
                        readLine()
                    }
                    else -> {
                        println("Pilihan yang anda pilih tidak ada")
                        readLine()
                    }
                }
            }
            "3" -> {
                println("Terima kasih telah menggunakan aplikasi ini")
                readLine()
                System.exit(0)
            }
            else -> {
                println("Pilihan yang anda pilih tidak ada")
                readLine()
            }
        }
    } while (true)
}
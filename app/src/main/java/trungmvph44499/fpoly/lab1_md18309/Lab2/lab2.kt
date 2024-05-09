package trungmvph44499.fpoly.lab1_md18309.Lab2

fun main () {

    // khai báo và sử dụng kĩ thuật null safety

    do {
        println("Nhap mssv: ")
        val mssv : String? = readLine()

        //var tenSV : String = null
        val tenSV = getTenSV(mssv!!)

        println("Ten SV voi ma $mssv la: $tenSV")

        print("Tiếp không?(c/k):")
        val s = readLine()
        if (s == "k")
            break;
    } while (true)

    println("Ket thuc chuong trinh!")
}

val danhsachSV : Map<String, String> = mutableMapOf("PH11341" to "Nguyen Van Long", "PH12536" to "Le The Anh", "PH14233" to "Tran Phuong Thao")

fun getTenSV (mssv: String) : String? {
    val tenSV = danhsachSV.get(mssv)

    if (tenSV == null)
        return "Khong tim thay ten SV!"

    return tenSV
}

class lab2 {
}
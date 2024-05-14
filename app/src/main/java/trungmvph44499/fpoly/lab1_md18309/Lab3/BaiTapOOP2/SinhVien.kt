package trungmvph44499.fpoly.lab1_md18309.Lab3.BaiTapOOP2

open class SinhVien {
    val hoTen: String
    val tuoi: Int?
    val lop: String?

    constructor(hoTen: String, tuoi: Int?, lop: String?) {
        this.hoTen = hoTen
        this.tuoi = tuoi
        this.lop = lop
    }
    open fun getThongTin () : String {
        return "$hoTen - $tuoi - $lop"
    }
}
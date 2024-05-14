package trungmvph44499.fpoly.lab1_md18309.Lab3.BaiTapOOP

open class PersonModel {
    var hoten: String
    var tuoi: Int?
    var quequan: String?

    constructor(hoten: String, tuoi: Int?, quequan: String?) {
        this.hoten = hoten
        this.tuoi = tuoi
        this.quequan = quequan
    }

    open fun getThongTin () : String {
        return "$hoten - $tuoi - $quequan"
    }
}
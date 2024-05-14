package trungmvph44499.fpoly.lab1_md18309.Lab3.BaiTapOOP

class CBGV : PersonModel {

    var msgv: String
    var luongcung: Float
    var lThuong: Float?
    var lPhat: Float?
    var lThuclinh: Float = 0f
        get() = luongcung + (lThuong?:0f) - (lPhat?:0f)

    constructor(
        hoten: String,
        tuoi: Int?,
        quequan: String?,
        msgv: String,
        luongcung: Float,
        lThuong: Float?,
        lPhat: Float?
    ) : super(hoten, tuoi, quequan) {
        this.msgv = msgv
        this.luongcung = luongcung
        this.lThuong = lThuong
        this.lPhat = lPhat

        //this.lThuclinh = luongcung + (lThuong?:0f) - (lPhat?:0f)
    }

    override fun getThongTin(): String {
        return "CBGV: " + super.getThongTin() + ", msgv: $msgv" + ", luong thuc linh: $lThuclinh"
    }

}
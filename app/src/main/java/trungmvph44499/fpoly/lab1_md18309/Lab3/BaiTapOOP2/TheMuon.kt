package trungmvph44499.fpoly.lab1_md18309.Lab3.BaiTapOOP2

class TheMuon : SinhVien {
    val maPhieuMuon: String
    val ngayMuon: Int
    val hanTra: Int
    val soHieuSach: String?

    constructor(
        hoTen: String,
        tuoi: Int?,
        lop: String?,
        maPhieuMuon: String,
        ngayMuon: Int,
        hanTra: Int,
        soHieuSach: String?
    ) : super(hoTen, tuoi, lop) {
        this.maPhieuMuon = maPhieuMuon
        this.ngayMuon = ngayMuon
        this.hanTra = hanTra
        this.soHieuSach = soHieuSach
    }
    override fun getThongTin(): String {
        return "Thông tin các thẻ mượn: " + super.getThongTin() + ", maPhieuMuon: $maPhieuMuon" + ", ngayMuon: $ngayMuon "
    }
}
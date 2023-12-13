public class Student {

    private String name;
    private String maSV;
    private String age;
    private String gTinh;
    private double diem;

//public Student(){
//    name = "Mạnh";
//    diem = 10;
//}

    public Student(String name, String maSV, String age, String gTinh, double diem) {
        this.name = name;
        this.maSV = maSV;
        this.age = age;
        this.gTinh = gTinh;
        this.diem = diem;
    }

    public void thongTin() {
        System.out.println("Điểm của cụ " + name + " là: " + diem);
    }

    public double DTB(double diemToan, double diemLy, double diemHoa) {
        return (diemToan + diemLy + diemHoa) / 3;
    }


}

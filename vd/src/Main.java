import javax.xml.namespace.QName;

public class Main {
    public static void main(String[] args) {
        Baby baby1 = new Baby("Nguyen Van A",0, 3.5f,20) ;//vừa khai báo vừa khởi tạo
        //Baby baby2; //khai báo trước
        //baby2 = new Baby();//khởi tạo sau

        //truy cập nội dung của đối tượng
        System.out.println("Baby 1: " + baby1.getName());
        System.out.println("Baby 1: " + baby1.getWeight());
        //System.out.println("Baby 1: " + baby1.age);
    }
}
import java.io.*;

public class ProductManagerTest {
    public static void main(String[] args) {
        ProductManagerTest productManagerTest = new ProductManagerTest();
        ProductManager pm = new ProductManager();
        pm.setProduc_code("tv01");
        pm.setProduct_name("Tivi");
        pm.setManufacetrue("Sony");
        pm.setPrice(500);
        pm.setOther_desception("watching");
        //ghi dữ liệu
        try {
            FileOutputStream fos= new FileOutputStream("product.txt");
            //DataOutputStream dos = new DataOutputStream(fos);
           ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeUTF(pm.getProduc_code());
//            oos.writeUTF(pm.getProduct_name());
//            oos.writeUTF(pm.getManufacetrue());
//            oos.writeDouble(pm.getPrice());
//            oos.writeUTF(pm.getOther_desception());
            oos.writeObject(pm);
            oos.close();
            fos.close();
            System.out.println("Write done !");
        }catch (Exception e){
            e.printStackTrace();
        }
        // đọc dữ liệu
        try{
            FileInputStream fis = new FileInputStream("product.txt");
            ObjectInputStream dis = new ObjectInputStream(fis);

            ProductManager pmm = (ProductManager) dis.readObject();
            fis.close();
            dis.close();

            //Hiển thị nội dung đọc từ file
           // System.out.println(resultFileWriter);
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}

package ProgremerZamanNow.Java;

public class v27Scope {
    public static void main(String[] args) {
/*
@@@@@@@@@@@@@@@@@@@@@@@      Scope    @@@@@@@@@@@@@@@@@@@@@@@@@

Di Java, variable hanya bisa diakses di dalam area dimana mereka dibuat.
Hal ini disebut scope
Contoh, jika sebuah variable dibuat di method, maka hanya bisa diakses di method tersebut, atau jika dibuat didalam block, maka hanya bisa diakses didalam block tersebut

 */
     // note : jadi variable di java siklus pemakaian nya hanya di scope nya {   }
        sayHello("andika");
        sayHello("");
    }
    static void sayHello(String name){
        String hello="Hello "+name;
        if(!name.isBlank()){
            String hi="Hi "+name;
            System.out.println(hi);
        }
        System.out.println(hello);
       // System.out.println(hi);// error karena dia tidak satu scope atau satu kurung buka dan tutup
    }
}

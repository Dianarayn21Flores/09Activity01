class A{
    public void test(){
        System.out.print("A");
    }
}

class B extends A{
    public void test(){
        System.out.print("B");
    }
}
     class C extends A{ //tinanggal ko ung public 
        public void test(){
            System.out.print("C");
        }
    } //Kulang siya netoh'}' kaya dinagdagan ko
    public class Main{ //need mag declare ng Main
        public static void main(String[]args){
            
            A b1 = new A();
            A b2 = new B();
            
            b1 = (A)b2;
            A b3 = (B)b2;//pinalitan ko ung (C) ginawa kong (B)
            
            b1.test();
            b2.test();
        }
    }



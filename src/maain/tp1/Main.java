package maain.tp1;

public class Main {

    public static void main(String [] args){

        Test t = new Test();

        t.test_exercice_1();
        if(!t.test_file("matrix.txt")){
	       System.out.println("\033[31m... FAIL !!!\033[0m");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        String my_string = "Hello world!, this is my first 1.8 java project test";
        System.out.println(my_string);

        int my_number = 33;
        System.out.println(my_number);
        System.out.println(my_number * my_number);
        System.out.println(my_number / my_number);
        System.out.println(my_number + my_number);

        boolean is_it_true = true;
        System.out.println(is_it_true);

        System.out.println(my_string + ' ' + my_number + " " + is_it_true);

        if(my_number >= 34){
            System.out.println("My number is larger than 34");
        }else if(my_number == 33){
            System.out.println("My number is 33");
        }else{
            System.out.println("My number is less than 33");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        String[] items = {"item1", "item2", "item3"};
        for (String item : items) {
            System.out.println(item);
        }
        
        int j = 0;
        while (j < 5) {
            j++;
            System.out.println(j);
        }
        
        j = 1000;
        do{
            j++;
            System.out.println(j);
        }while (j < 1005);
    }
}
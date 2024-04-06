import javax.swing.*;
import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Main {
            public static void main(String[] args) throws IOException { /*
                String name = JOptionPane.showInputDialog("Enter your name");
                JOptionPane.showMessageDialog(null,"Hello "+name);

                int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
                JOptionPane.showMessageDialog(null," You are "+age+ " years old");

                double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
                JOptionPane.showMessageDialog(null," You are "+height+ " cm tall");


                double x;
                double y;
                double z;

                Scanner scanner = new Scanner(System.in);

                System.out.println("Enter side x :");
                x= scanner.nextDouble();

                System.out.println("Enter side y :");
                y= scanner.nextDouble();

                z= Math.sqrt((x*x) + (y*y));

                System.out.println(" The hypotenuse is :" + z);

                scanner.close();



                String name = JOptionPane.showInputDialog(" Enter your name");
                JOptionPane.showMessageDialog(null," Hello " +name);

                int age = Integer.parseInt(JOptionPane.showInputDialog(" Enter your age"));
                JOptionPane.showMessageDialog(null," You are "+age+" years old");

                double height = Double.parseDouble(JOptionPane.showInputDialog(" Enter your height"));
                JOptionPane.showMessageDialog(null," You are "+height+" cm tall");



                Random random = new Random();

                int x = random.nextInt(6);
                double y  = random.nextDouble();
                boolean z = random.nextBoolean();
                System.out.println(z);



                int age = 4;

                if (age>=18) {
                    System.out.println(" You are an adult");
                }
                else if (age<5) {
                    System.out.println(" You are a child");
                }
                else if (age==0) {
                    System.out.println(" You are a new born baby");
                }
                else {
                    System.out.println(" You are a teenager");
                }



                String day="Friday";

                switch (day)
                {
                    case "Sunday":
                        System.out.println(" It is Sunday");
                    break;
                    case "Monday":
                        System.out.println(" It is Monday");
                        break;
                    case "Tuesday":
                        System.out.println(" It is Tuesday");
                        break;
                    case "Wednesday":
                        System.out.println(" It is Wednesday");
                        break;
                    case "Thursday":
                        System.out.println(" It isThursday");
                        break;
                    case "Friday":
                        System.out.println(" It is Friday");
                        break;
                    case "Saturday":
                        System.out.println(" It is Saturday");
                        break;
                    default:
                        System.out.println(" It is not a day");
                        break;


                }


                int temp = 15;
                if (temp>30){
                    System.out.println(" It is hot outside");
                }
                else if (temp>=20 && temp<=30){
                    System.out.println(" It is warm outside");
                }
                else {
                    System.out.println(" It is cold outside");
                }



                Scanner scanner = new Scanner(System.in);

                System.out.println(" You ar playing a game! Press q or Q to quit");

                String response = scanner.next();

                if (!response.equals("q") && !response.equals("Q")){
                    System.out.println(" You are still playing the game *pew pew*");
                }
                else{

                    System.out.println(" You quit the game");
                }



                Scanner scanner = new Scanner(System.in);

                String name = "";

                while (name.isBlank()){

                    System.out.print(" Enter your name : ");

                    name = scanner.nextLine();
                }

                System.out.println("Hello "+name);



                Scanner scanner = new Scanner(System.in);

                String name = "";

                do {

                    System.out.print(" Enter your name : ");

                    name = scanner.nextLine();
                }while (name.isBlank());

                System.out.println("Hello "+name);



                for(int i=0;i<=10;i++){
                    System.out.println(i);
                }

                for(int i=10;i>=0;i--){
                    System.out.println(i);
                }

                System.out.println(" Happy new year");



                Scanner scanner = new Scanner(System.in);

                int rows;
                int columns;
                String symbol;

                System.out.println(" Enter a number of rows :");
                rows = scanner.nextInt();

                System.out.println(" Enter a number of columns :");
                columns = scanner.nextInt();

                System.out.println(" Enter a symbol to use :");
                symbol = scanner.next();

                for (int i=1;i<=rows;i++){
                    System.out.println();

                    for (int j=1;j<=columns;j++){
                        System.out.print(symbol);
                    }
                }




               String cars[] = new String[3];

                cars[0] = "5";

                System.out.println(cars[0]);



               String cars[]= {"camery","tesla","bmw"};

               cars[0]="mustard";

               for (int i=0;i<cars.length;i++){
                   System.out.println(cars[i]);
               }



               String[][] cars = {
                       {"canaro","corvette","silverado"},
                       {"mustang","rangers","f-150"},
                       {"ferrari","larbo","tesla"}
               };

               for (int i=0;i< cars.length;i++){
                   System.out.println();

                   for (int j=0;j<cars.length;j++){
                       System.out.print(cars[i][j] + "   ");
                   }
               }



                 String name = "     Joshua";

              //  boolean result = name.equals("Joshua");

              //  boolean result = name.equalsIgnoreCase("joshua");

               // int result = name.length();

                // char result = name.charAt(5);

               // int result = name.indexOf("o");

               // boolean result = name.isEmpty();

               // boolean result = name.isBlank();

               // String result = name.toUpperCase();

                //String result = name.toLowerCase();

                //String result = name.trim();

                //String result = name.replace('a','b');

                System.out.println(result);


                Boolean a = true;
                Character b = '@';
                Integer c = 123;
                Double d = 3.14;
                String e = "Bro";

                //System.out.println(a.equals(false));
                //System.out.println(b.charValue());
                //System.out.println(c.toString());
               // System.out.println(d.equals(3.14));



                ArrayList<String> food = new ArrayList<String>();

                food.add("pizza");
                food.add("humburger");
                food.add("hotdog");

                food.set(0,"Sushi");

                food.remove(2);

                food.clear();

                for (int i=0;i< food.size();i++){
                    System.out.println(food.get(i));
                }



                ArrayList<ArrayList<String>> Shoplist = new ArrayList<ArrayList<String>>();

                ArrayList<String> Storelist = new ArrayList();
                Storelist.add("Biscuit");
                Storelist.add("Soap");
                Storelist.add("Toffee");
                
                ArrayList<String> Breadlist = new ArrayList();
                Breadlist.add("Floor");
                Breadlist.add("Oil");

                ArrayList<String> Bowllist = new ArrayList();
                Bowllist.add("Cup");
                Bowllist.add("Plate");
                
                Shoplist.add(Storelist);
                Shoplist.add(Breadlist);
                Shoplist.add(Bowllist);

                System.out.println(Shoplist.get(1).get(0));



                String[] animals = {"cat","dog","rat","bird"};

                for(String i : animals){
                    System.out.println(i);
                }



                ArrayList<String> animals = new ArrayList<String>();

                animals.add("cat");
                animals.add("dove");
                animals.add("rat");
                animals.add("bird");

                for (String i : animals){
                    System.out.println(i);
                }



                String a = "Joshua";

                int b = 21;

                double c = 26.17;


                hello();
                hi(a,b);
                add(c,b);

                double z = add(c,b);

                System.out.println(z);



                String a = "Joshua";

                int b=21;
                double c = 26.17;

                hello();
                hello(a,b);
                hello(c,b);
                System.out.println(hello(c,b));



               int num = 12, ans = 14;

               String name = "Bro";

               double a = 27.327;

                double b = 1325265;

               // System.out.printf("I am %d years old but will be %d in two years later",num,num);

               // System.out.printf(" My name is %-10s",name);

              //  System.out.printf("You have %.2f cedis",a);

               // System.out.printf("%+f",a);

               // System.out.printf("%,f",b);



                final double pi = 3.23242;

                System.out.println(pi);



                Car mycar = new Car();

                System.out.println(mycar.make);

                System.out.println(mycar.model);

               // mycar.drive();
                //mycar.brake();

                System.out.println();

                Car mycar2 = new Car();

                System.out.println(mycar2.make);

                System.out.println(mycar2.model);



              Human human = new Human("Bro",56,14.47);

             // System.out.println(human.name);

              //human.eat();

                Human a = new Human("Ama",34,2);

                //System.out.println(a.age);

               // a.drink();

               // human.eat();


                //int number=0;
                //Random random = new Random();

                Diceroller diceroller = new Diceroller();

                //diceroller.roll(random,number);



                //Pizza pizza = new Pizza("wheat bread","tomato","mozzarella","pepperoni");

                //System.out.println(" Here are the ingredients for pizza :");

                //System.out.println(pizza.bread);

                //System.out.println(pizza.sauce);

               // System.out.println(pizza.cheese);

                //System.out.println(pizza.topping);

                //Pizza pizza = new Pizza("wheat bread","tomato","mozzarella");

               // System.out.println(" Here are the ingredients for pizza :");

                //System.out.println(pizza.bread);

               // System.out.println(pizza.sauce);

                //System.out.println(pizza.cheese);

                //System.out.println(pizza.topping);

               // Pizza pizza = new Pizza("wheat bread","tomato");

                //System.out.println(" Here are the ingredients for pizza :");

               // System.out.println(pizza.bread);

               // System.out.println(pizza.sauce);

               // System.out.println(pizza.cheese);

               // System.out.println(pizza.topping);

                //Pizza pizza = new Pizza("wheat bread");

               // System.out.println(" Here are the ingredients for pizza :");

               // System.out.println(pizza.bread);

                //System.out.println(pizza.sauce);

                // System.out.println(pizza.cheese);

                // System.out.println(pizza.topping);

                //Pizza pizza = new Pizza();

                //System.out.println(" Here are the ingredients for pizza :");

                //System.out.println(pizza.bread);

                //System.out.println(pizza.sauce);

                // System.out.println(pizza.cheese);

                // System.out.println(pizza.topping);



                Car car = new Car();

                //System.out.println(car.toString());

                //System.out.println(car.toString());

                System.out.println(car);




                // Food[] refrigrator = new Food[3];

                 Food food1 = new Food("pizza",45);
                 Food food2 = new Food("hamburger",78);
                 Food food3 = new Food("hot dog",74);

                Food[] refrigrator = {food1,food2,food3};

                // refrigrator[0] = food1;
                // refrigrator[1] = food2;
               //  refrigrator[2] = food3;

                System.out.println(refrigrator[0].age);
                System.out.println(refrigrator[0].name);



                Garage garage = new Garage();

                Car car1 = new Car("BMW");

                garage.park(car1);

                Car car2 = new Car("Tesla");

                garage.park(car2);



                //System.out.println(Friend.numberoffriends);
                //Friend friend1 = new Friend("Ama");
                //Friend friend2 = new Friend("Kofi");
                //Friend friend3 = new Friend("Yaw");

               // System.out.println(Friend.numberoffriends);

                //Friend.displayfriends();



                 Car car = new Car();

                 //car.go();

                Bicycle bike = new Bicycle();

                //bike.stop();

               // System.out.println(car.speed);

               // System.out.println(bike.speed);

                System.out.println(car.doors);

                System.out.println(bike.paddles);




                Animal animal = new Animal();
                Dog dog = new Dog();

                //dog.speak();
                dog.speak();



               Hero hero1 = new Hero("Batman",42,"$$$");

               Hero hero2 = new Hero("Superman",43,"everything");

               //System.out.println(hero1.name);

               //System.out.println(hero1.age);

               //System.out.println(hero1.power);

                System.out.println(hero2.toString());



              Car car = new Car();

              car.go();


                ArrayList<ArrayList<String>> food = new ArrayList<>();
                Scanner scanner = new Scanner(System.in);
                JOptionPane.showMessageDialog(null,"Hi");
                Random random = new Random();



               Car car = new Car("Chevrolet","Camoro",2021);

               // System.out.println(car.make);

                System.out.println(car.getMake());
                System.out.println(car.getModel());
                System.out.println(car.getYear());

                car.setYear(2022);

                System.out.println(car.getMake());
                System.out.println(car.getModel());
                System.out.println(car.getYear());

                */

               // Car car1 = new Car("Chevrolet","Camaroo",2021);

              //  Car car2 = new Car("Ford","Mustang",2022);

              /*  System.out.println(car1);
                System.out.println(car2);
                System.out.println();
                System.out.println(car1.getMake());
                System.out.println(car1.getModel());
                System.out.println(car1.getYear());
                System.out.println();
                System.out.println(car2.getMake());
                System.out.println(car2.getModel());
                System.out.println(car2.getYear());



                //car2.copy(car1);

                Car car2 = new Car(car1);

                System.out.println(car1);
                System.out.println(car2);
                System.out.println();
                System.out.println(car1.getMake());
                System.out.println(car1.getModel());
                System.out.println(car1.getYear());
                System.out.println();
                System.out.println(car2.getMake());
                System.out.println(car2.getModel());
                System.out.println(car2.getYear());



                Rabbit rabbit = new Rabbit();
                rabbit.flee();

                Hawk hawk = new Hawk();
                hawk.hunt();

                Fish fish = new Fish();
                fish.flee();
                fish.hunt();



                Car car = new Car();
                Bicycle bicycle = new Bicycle();
                Boat boat = new Boat();

                //car.go();
                //bicycle.go();
                //boat.go();

                PolymorphismVehicle[] racers = {car,bicycle,boat};

                for(PolymorphismVehicle x : racers){
                    x.go();
                }



                Scanner scanner = new Scanner(System.in);

                DynamicPolymorphismAnimal animal;

                System.out.println(" What animal do you want? ");
                System.out.println(" (1=dog) or (2=cat) : ");
                int choice = scanner.nextInt();

                if (choice==1){

                    animal = new DynamicPolymorphismDog();
                    animal.speak();
                }
                else if (choice==2){

                    animal = new Cat();
                    animal.speak();
                }
                else{
                    animal = new DynamicPolymorphismAnimal();
                    System.out.println(" That choice was invalid ");
                    animal.speak();
                }



                Scanner scanner = new Scanner(System.in);
                try {

                    System.out.println(" Enter a whole number to divide : ");
                    int x = scanner.nextInt();

                    System.out.println(" Enter a whole number to divide by : ");
                    int y = scanner.nextInt();

                    int z = x/y;

                    System.out.println(" The result is " + z);

                }

                catch (ArithmeticException e){

                    System.out.println(" There is a mathematical error!!!");
                }

                catch (InputMismatchException e){

                    System.out.println(" You have entered a wrong input type!!!");
                }


                catch (Exception e){

                    System.out.println(" Oops! Something went wrong");
                }

                finally {

                    scanner.close();
                }




                //File file = new File("secret.txt");
                //File file = new File("C:\\Users\\iBen Systems Inc\\OneDrive\\Desktop\\secret.txt");
                //File file = new File("C:/Users/iBen Systems Inc/OneDrive/Desktop/secret.txt");

                if (file.exists()){

                    System.out.println(" The file exist");
                    System.out.println(file.getPath());
                    System.out.println(file.getAbsoluteFile());
                    System.out.println(file.isFile());
                    file.delete();
                }

                else {

                    System.out.println(" The file does not exist");
                }



                File file = new File("art.txt");
                try {

                    FileWriter writer = new FileWriter("art.txt");
                    writer.write(" Roses are red\n");
                    writer.write(" Violets are blue\nBooty booty booty booty\nRockin' everywhere!");
                    writer.append("\n( A poem by Bro )");
                    writer.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }



                try {
                    FileReader reader = new FileReader("art.txt");
                    int data = reader.read();
                    while (data != -1) {

                        //System.out.println(data);
                        //System.out.println((char) data);
                        //System.out.print((char) data);

                        data = reader.read();

                    }

                    reader.close();

                }
                catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }


               */


















                

            }

          static void hello(){
                System.out.println("Hi");
                System.out.println("How are you");
                System.out.println("Hope by the grace of God you are fine \n");
          }

          static void hi(String name, int age){
                System.out.println("Hi "+name);
                System.out.println("How are you");
                System.out.println("Hope by the grace of God you are "+age+" years fine");
          }

          static double add(double x, int y){
                double z = x + y;
              //System.out.println(z);
                return z;
          }

          static void hello(String name, int age){
                System.out.println("Hi "+name);
                System.out.println("How are you");
                System.out.println("Hope by the grace of God you are "+age+" years fine");
          }

          static double hello(double x, int y){
                double z = x + y;
                System.out.println("Amen");
                return z;

          }


        }




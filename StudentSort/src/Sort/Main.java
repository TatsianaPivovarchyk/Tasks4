package Sort;
import Sort.Students;
import Sort.Application;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        String string;
        File file = new File(new File("myObjects.txt").getAbsolutePath());
        System.out.println(file.getAbsolutePath());
        List<Students> peoples = new ArrayList<Students>();

        Students people1 = new Students(3, "Ivan", "Ivanov", 23);
        Students people2 = new Students(8, "Petr", "Petrov", 42);
        Students people3 = new Students(30, "Vova", "Vladimirov", 51);
        Students people4 = new Students(42, "Olga", "Olegovna", 15);
        Students people5 = new Students(18, "Sergey", "Smirnov", 33);
        Students people6 = new Students(10, "Evgeniy", "Sidorov", 20);
        Students people7 = new Students(22, "Denis", "Petrenko", 19);
        Students people8 = new Students(39, "Anna", "Sergeeva", 60);
        Students people9 = new Students(5, "Roman", "Romanov", 24);
        Students people10 = new Students(1, "Oleg", "Maximov", 39);

        peoples.add(people1);
        peoples.add(people2);
        peoples.add(people3);
        peoples.add(people4);
        peoples.add(people5);
        peoples.add(people6);
        peoples.add(people7);
        peoples.add(people8);
        peoples.add(people9);
        peoples.add(people10);


        try {

            FileOutputStream f = new FileOutputStream(new File( "myObjects.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);


            // Write objects to file
            o.writeObject(people1);
            o.writeObject(people2);
            o.writeObject(people3);
            o.writeObject(people4);
            o.writeObject(people5);
            o.writeObject(people6);
            o.writeObject(people7);
            o.writeObject(people8);
            o.writeObject(people9);
            o.writeObject(people10);


            o.close();
           // f.close();
        } catch ( FileNotFoundException e ) {
            System.out.println("File not found");
        } catch ( IOException e ) {
            System.out.println("Error initializing stream");
        }


        try{


            FileInputStream fi = new FileInputStream(new File("myObjects.txt"));
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            string = randomAccessFile.readLine();
            randomAccessFile.close();
            System.out.print(string);
            ObjectInputStream oi = new ObjectInputStream(fi);


            // Read objects
            people1 = (Students) oi.readObject();
            people2 = (Students) oi.readObject();
            people3 = (Students) oi.readObject();
            people4 = (Students) oi.readObject();
            people5 = (Students) oi.readObject();
            people6 = (Students) oi.readObject();
            people7 = (Students) oi.readObject();
            people8 = (Students) oi.readObject();
            people9 = (Students) oi.readObject();
            people10 = (Students) oi.readObject();

            System.out.println(people1.toString());
            System.out.println(people2.toString());
            System.out.println(people3.toString());
            System.out.println(people4.toString());
            System.out.println(people5.toString());
            System.out.println(people6.toString());
            System.out.println(people7.toString());
            System.out.println(people8.toString());
            System.out.println(people9.toString());
            System.out.println(people10.toString());

            oi.close();
            //fi.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        Application function = new Application();
        function.SortById(peoples);


        for(Students people : peoples){
            System.out.println(people);

        }

        System.out.println("Средний возраст студентов: " +  function.averageAge(peoples));


    }
}

package ru.lesson.BankAcount;

/**
 * Created by Администратор on 12.01.2017.
 */
public class ClassDataApp {
    public static void main(String[] args){
        int maxSize = 100;
        ClassDataPerson arr = new ClassDataPerson(maxSize);
        arr.insert("Gajiev","Gasan",27);
        arr.insert("David","Smit",31);
        arr.insert("Garri","Dail",29);
        arr.insert("Enrici","Keil",42);
        arr.insert("Francisk","Gerd",57);
        arr.insert("Florenco","Faboni",36);
        arr.insert("Maikl","Geri",23);
        arr.insert("Georgi","Lorenc",27);

        System.out.println(arr.find("David"));

      //  arr.delete("Francisk");
       // arr.displayPerson();

    }
}

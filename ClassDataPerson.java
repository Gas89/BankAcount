package ru.lesson.BankAcount;
/**
 * Created by Администратор on 11.01.2017.
 */
public class ClassDataPerson {
    private Person[] persons;
    private int nElements;

    public ClassDataPerson(int max){
        persons = new Person[max];
        nElements = 0;
    }
    public Person find(String serchName){
        int j;
        for(j = 0;j < nElements; j++)
            if(persons[j].getLastName()== serchName)
                break;
            if(j == nElements)
                return null;
            else
                return persons[j];
    }
    public void insert(String lastName,String firstName,int age){
        persons[nElements] = new Person(lastName,firstName,age);
        nElements++;
    }
    public boolean delete(String serchName){
        int j;
        for(j = 0;j < nElements;j++)
            if(persons[j].getLastName() == serchName)
                break;
            if(j == nElements)
                return false;
        else {
                for (int k = j; k < nElements; k++)
                    persons[k] = persons[k + 1];
                nElements--;
                return true;
            }
    }
    public void displayPerson(){
        for (int j = 0;j < nElements;j++) {
            persons[j].display();
            System.out.println("*****************");
        }
    }

}

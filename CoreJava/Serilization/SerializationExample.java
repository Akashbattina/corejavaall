\package Serilization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
    private String name;
    private int age;

        public Person(String name, int age) {            // Constructor
        this.name = name;
        this.age = age;
    }
   
    public String getName() {                             // Getters and Setters
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

	

public class SerializationExample {

	public static void main(String[] args) throws IOException {

		   Person ob = new Person("Akash", 10);
		  
		   

	        // Serialization: Writing the object to a file //converting object of data to stream of bytes.
		  
	            FileOutputStream filein = new FileOutputStream("File1.txt");
	            ObjectOutputStream os= new ObjectOutputStream(filein);
	            os.writeObject(ob);
	            os.close();
	            filein.close();
	           System.out.println("Serialization successful. Object saved as ob.serialization");
	        } 
	        
	}


//	        
//        //Deserialization reading the data from the file     //Converting Stream of bytes to object of data.
//	        try {
//            FileInputStream fileIn = new FileInputStream("File1.txt");
//	            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
//
//	            // Read the deserialized object from the stream
//	         Person person = (Person) objectIn.readObject();
//
//            objectIn.close();
//            fileIn.close();
//
//            // Display the deserialized object
//            System.out.println("Deserialization successful. Loaded Person details:");
//	            System.out.println("Name: " + person.getName());
//            System.out.println("Age: " + person.getAge());
//
//
//	           
//	        } catch (IOException | ClassNotFoundException e) {
//	            e.printStackTrace();	
//	        
//	        
//	    
//
//
//	
//

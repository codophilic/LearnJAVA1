import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*

 Serialization is a mechanism of converting the state of an object into a byte stream. 
 Deserialization is the reverse process where the byte stream is used to recreate the actual Java object in memory. 
 This mechanism is used to persist the object.

 The serialization and deserialization process is platform-independent, 
 it means you can serialize an object on one platform and deserialize it on a different platform.

 Whats is use?
- In a game application suppose a player has score some points and exits the game saving its state. 
  When the player resume the game, he/she get it previous state and begins playing.

  So in java , when we object of game class is created , the values of it is stored.

- It is mainly used to travel object's state on the network

 The state is store in byteStream in a file or log etc.

 When we run the code without using serialization , it shows exception because java is a secure language.
 When we are saving object its not allowed by default because any one can use it for malicous purpose.
 So to allow this we use Serialization interface. This is a marker interface.

 

 
 */

 public class Conversion{
    public static void main(String agrs[]) throws Exception{

        SaveState ss = new SaveState();
        ss.score=100; // Player played and score 100 point in the game.

        // Serialization

        File f = new File("State.txt"); // Creating a file to save the value state in byteStream
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos); // Storing the object byteStream in a file.
        oos.writeObject(ss); // Storing the state of the object in the file in byteStream.


        // Deserialization
        File f1 = new File("State.txt");
        FileInputStream fis = new FileInputStream(f1);
        ObjectInputStream ois = new ObjectInputStream(fis);
        SaveState obj1 = (SaveState)ois.readObject();  // This will return Object of type object so we need to type cast it into class Save.
        System.out.println(obj1.score);

    }
 }

class SaveState implements Serializable{
    int score;
}
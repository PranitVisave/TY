import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
public class q1
{
    private Map<String, String> phoneBookMap;
    public q1() 
    {
        phoneBookMap = new HashMap<>();
    }
    public void loadPhoneBook(String filePath) 
    {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) 
        {
            String line;
            while ((line = reader.readLine()) != null) 
            {
                String[] fields = line.split("\t");
                if (fields.length == 2) {
                    String name = fields[0];
                    String phoneNumber = fields[1];
                    phoneBookMap.put(name, phoneNumber);
                }
            }
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }

    public String search(String key) 
    {
        return phoneBookMap.get(key);
    }

    public static void main(String[] args) 
    {
        q1 phoneBook = new q1();
        phoneBook.loadPhoneBook("phonebook.txt");

        String nameToSearch = "aaa";
        String phoneNumber = phoneBook.search(nameToSearch);

        if (phoneNumber != null) 
            System.out.println("Phone number for " + nameToSearch + ": " + phoneNumber);
         else 
            System.out.println(nameToSearch + " not found in the phone book.");

        String phoneNumberToSearch = "7272727272";
        String name = phoneBook.search(phoneNumberToSearch);

        if (name != null) 
            System.out.println("Name for phone number " + phoneNumberToSearch + ": " + name);
        else 
            System.out.println("Phone number " + phoneNumberToSearch + " not found in the phone book.");
    }
}


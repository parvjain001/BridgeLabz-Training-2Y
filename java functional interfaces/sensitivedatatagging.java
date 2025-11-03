interface SensitiveData {}

class CustomerInfo implements SensitiveData {
    String name;
    String creditCardNumber;

    CustomerInfo(String name, String creditCardNumber) {
        this.name = name;
        this.creditCardNumber = creditCardNumber;
    }
}

class DataEncryptor {
    void encryptData(Object obj) {
        if (obj instanceof SensitiveData) {
            System.out.println("Encrypting data for: " + obj.getClass().getSimpleName());
        } else {
            System.out.println("No encryption needed for: " + obj.getClass().getSimpleName());
        }
    }
}

public class sensitivedatatagging {
    public static void main(String[] args) {
        CustomerInfo customer = new CustomerInfo("Parv Jain", "1234-5678-9012-3456");
        String logData = "User login info";

        DataEncryptor encryptor = new DataEncryptor();
        encryptor.encryptData(customer);
        encryptor.encryptData(logData);
    }
}

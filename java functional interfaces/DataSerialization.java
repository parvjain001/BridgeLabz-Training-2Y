interface BackupSerializable {}

class UserData implements BackupSerializable {
    String name;
    int age;

    UserData(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class BackupProcessor {
    void processBackup(Object obj) {
        if (obj instanceof BackupSerializable) {
            System.out.println("Backup created for: " + obj.getClass().getSimpleName());
        } else {
            System.out.println("Cannot backup: " + obj.getClass().getSimpleName() + " (Not Serializable)");
        }
    }
}

public class DataSerialization {
    public static void main(String[] args) {
        UserData user = new UserData("Parv", 20);
        String data = "Some temporary data";

        BackupProcessor processor = new BackupProcessor();
        processor.processBackup(user);
        processor.processBackup(data);
    }
}

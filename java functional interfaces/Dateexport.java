interface DataExporter {
    void exportData();

    default void exportToJSON() {
        System.out.println("Exporting data in JSON format (default implementation).");
    }
}

class CSVExporter implements DataExporter {
    public void exportData() {
        System.out.println("Exporting data in CSV format.");
    }
}

class PDFExporter implements DataExporter {
    public void exportData() {
        System.out.println("Exporting data in PDF format.");
    }
}

public class Dateexport {
    public static void main(String[] args) {
        DataExporter csv = new CSVExporter();
        DataExporter pdf = new PDFExporter();

        csv.exportData();
        csv.exportToJSON();

        pdf.exportData();
        pdf.exportToJSON();
    }
}

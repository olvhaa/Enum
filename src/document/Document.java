package document;

public class Document {
    private String name;
    private int id;
    private DocumentType docType;

    private static int counter = 0;

    public Document(String name, DocumentType docType) {
        counter++;
        this.name = name;
        this.docType = docType;
        this.id = counter;
    }

    @Override
    public String toString() {
        return "Document{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", docType=" + docType +
                '}';
    }
}
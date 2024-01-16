package document;

public enum DocumentType {
    INVOICE(1),
    CERTIFICATE(2),
    NOTARIAL_ACT(3, "akt notarialny"),
    AGREEMENT(4);

    private int id;
    private String name;

    DocumentType(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    DocumentType(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

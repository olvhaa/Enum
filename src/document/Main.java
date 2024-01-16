package document;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Document> documentList = new ArrayList<>();

        documentList.add(new Document("Umowa sprzedaży samochodu", DocumentType.AGREEMENT));
        documentList.add(new Document("Faktura za pralkę", DocumentType.INVOICE));
        documentList.add(new Document("Certyfikat ukończenia kursu Java", DocumentType.CERTIFICATE));
        System.out.println("----------------------------------------------------------------------------");
        for(Document document : documentList) {
            System.out.println(document);
        }
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Wybierz typ dokumentu.");
        for (DocumentType docType : DocumentType.values()) {
            System.out.println(docType.getId() + ") " + docType);
        }
        int choice = scanner.nextInt();
        getDocumentType(choice);

        System.out.println("-----------------------------------------");

        System.out.println("Podaj id dokumentu");
        choice = scanner.nextInt();
        System.out.println("Podaj typ dokumentu");
        String typ = scanner.nextLine();
        documentList.add(getDocument(choice, typ));


        for(Document document : documentList) {
            System.out.println(document);
        }
    }

    public static void getDocumentType(int choice) {
        boolean isId = false;
        for (DocumentType docType : DocumentType.values()) {
            if (docType.getId() == choice) {
                System.out.println("Wybrałeś tworzenie " + docType);
                isId = true;
            }
        }
        if (!isId) {
            System.out.println("Wybrałeś złą opcję");
        }
    }

    public static DocumentType getDocumentType(int choice, String name) {
        switch (choice) {
            case 1 -> {
                return DocumentType.INVOICE;
            }
            case 2 -> {
                return DocumentType.CERTIFICATE;
            }
            case 3 -> {
                return DocumentType.NOTARIAL_ACT;
            }
            case 4 -> {
                return DocumentType.AGREEMENT;
            }
            default -> {
                return null;
            }
        }
    }
    public static Document getDocument(int choice, String name) {
        DocumentType documentType = getDocumentType(choice, name);
        return new Document(name, documentType);
    }
}
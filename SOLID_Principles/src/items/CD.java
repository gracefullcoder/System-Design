package SOLID_Principles.src.items;

public class CD implements LibraryItem{

    private int uid;
    private String title;
    private String author;
    private double value;


    public CD(int uid, String title, String author,double value) {
        this.uid = uid;
        this.title = title;
        this.author = author;
        this.value = value;
    }

    @Override
    public String getTitle() {
        try {
            return this.title;
        } catch (Exception e) {
            throw new UnsupportedOperationException("Unimplemented method 'getTitle'");
        }
    }

    @Override
    public int getUid() {
        try {
            return this.uid;
        } catch (Exception e) {
            throw new UnsupportedOperationException("Unimplemented method 'getUid'");
        }
    }

    @Override
    public String getAuthor() {
        try {
            return this.author;
        } catch (Exception e) {
            throw new UnsupportedOperationException("Unimplemented method 'getAutor'");
        }
    }

    @Override
    public double calculateLateFee(int days) {
        try {
            return days * 20;            
        } catch (Exception e) {
            throw new UnsupportedOperationException("Unimplemented method 'calculateLateFee'");
        }
    }

    @Override
    public double getValue() {
        try {
            return this.value;
        } catch (Exception e) {
            throw new UnsupportedOperationException("Unimplemented method 'calculateLateFee'");
        }
    }
}

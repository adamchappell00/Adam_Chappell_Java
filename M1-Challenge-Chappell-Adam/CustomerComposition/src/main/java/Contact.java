import java.util.Objects;

public class Contact {

    private String type;
    private String information;


    public Contact(){}
    public Contact(String type, String information) {
        this.type = type;
        this.information = information;
    }

    public String getType() {return type;}
    public void setType(String type) {this.type = type;}

    public String getInformation() {return information;}
    public void setInformation(String information) {this.information = information;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(type, contact.type) && Objects.equals(information, contact.information);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, information);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "type='" + type + '\'' +
                ", information='" + information + '\'' +
                '}';
    }
}

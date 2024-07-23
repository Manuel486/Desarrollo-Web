import java.util.ArrayList;
import java.util.List;

public class Client {
    private Long id;
    private String name;
    private String lastname;
    private List<Address> addresses;

    public Client() {
        addresses = new ArrayList<>();
    }

    public Client(Long id, String name, String lastname) {
        this();
        this.id = id;
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", addresses=" + addresses +
                '}';
    }
}

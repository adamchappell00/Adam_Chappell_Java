import java.util.Objects;

public class Customer {

    private String firstName;
    private String lastName;
    private Contact email;
    private Contact phone;
    private Address billingAddress;
    private Address shippingAddress;
    private boolean rewardsMember;

    public Customer(){}

    public Customer(String firstName, String lastName, Contact email, Contact phone, Address billingAddress, Address shippingAddress, boolean rewardsMember) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.billingAddress = billingAddress;
        this.shippingAddress = shippingAddress;
        this.rewardsMember = rewardsMember;
    }

    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}

    public Contact getEmail() {return email;}
    public void setEmail(Contact email) {this.email = email;}

    public Contact getPhone() {return phone;}
    public void setPhone(Contact phone) {this.phone = phone;}

    public Address getBillingAddress() {return billingAddress;}
    public void setBillingAddress(Address billingAddress) {this.billingAddress = billingAddress;}

    public Address getShippingAddress() {return shippingAddress;}
    public void setShippingAddress(Address shippingAddress) {this.shippingAddress = shippingAddress;}

    public boolean isRewardsMember() {return rewardsMember;}
    public void setRewardsMember(boolean rewardsMember) {this.rewardsMember = rewardsMember;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return rewardsMember == customer.rewardsMember && Objects.equals(firstName, customer.firstName) && Objects.equals(lastName, customer.lastName) && Objects.equals(email, customer.email) && Objects.equals(phone, customer.phone) && Objects.equals(billingAddress, customer.billingAddress) && Objects.equals(shippingAddress, customer.shippingAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, phone, billingAddress, shippingAddress, rewardsMember);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email=" + email +
                ", phone=" + phone +
                ", billingAddress=" + billingAddress +
                ", shippingAddress=" + shippingAddress +
                ", rewardsMember=" + rewardsMember +
                '}';
    }
}

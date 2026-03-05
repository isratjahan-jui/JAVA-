package stu.model;

public class StudentUser {

    private int id;
    private String name;
    private String email;
    private String cell;
    private String address;

    public StudentUser() {
    }

    public StudentUser(String name, String email, String cell, String address) {
        this.name = name;
        this.email = email;
        this.cell = cell;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", email=" + email + ", cell=" + cell + ", address=" + address + '}';
    }
    
    
    
    
}

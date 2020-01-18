package com.gazel.kontak;

public class Contact {
    private  String name;
    private  String address;
    private  String phone;
    private  int avatar;

    public Contact(String name, String address, String phone, int avatar) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }
}

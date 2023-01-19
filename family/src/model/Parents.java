package model;

import java.util.ArrayList;

public class Parents {
    public String name;
    ArrayList<Parents> house_Address;

    public Parents(String name, ArrayList<Parents> house_Adddress){
        this.name = name;
        this.house_Address = house_Adddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Parents> getHouse_Address() {
        return house_Address;
    }

    public void setHouse_Address(ArrayList<Parents> house_Address) {
        this.house_Address = house_Address;
    }
}
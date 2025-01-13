package com.example.SpringBootWeb1;

public class Alien {
    private  int id;
    private String aName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "id=" + id +
                ", aName='" + aName + '\'' +
                '}';
    }
}

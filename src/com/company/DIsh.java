package com.company;

public class DIsh {
    Double waitingTime;
    String name;
    Double price;
    Double rating;
    Integer portions;

    public DIsh(Double waitingTime, String name, Double price, Double rating, Integer portions) {
        this.waitingTime = waitingTime;
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.portions = portions;
    }

    public Boolean isGood(){
        return rating > 3;
    }

    public Boolean isBest(){
        return rating > 4.5;
    }

    public Boolean ShareDish(){
        return portions>1;
    }

    public Boolean fast(){
        return waitingTime<25;
    }
    public DIsh() {
    }

    public Double getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(Double waitingTime) {
        this.waitingTime = waitingTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Integer getPortions() {
        return portions;
    }

    public void setPortions(Integer portions) {
        this.portions = portions;
    }


    public static DIsh sum(DIsh d1, DIsh d2){
        DIsh d=new DIsh();
        d=d2;
        d.setPrice(d1.price+d2.getPrice());
        return d;
    }
    @Override
    public String toString() {
        return "DIsh{" +
                "waitingTime=" + waitingTime +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                ", portions=" + portions +
                '}';
    }
}

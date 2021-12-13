package com.company;

import java.util.LinkedList;

public class Task11 {
    public static class Car {
        private String mark;

        public Car() { }
        public Car(final String str) { mark = str; }

        public String getMark() { return mark; }
        public void setMark(final String mark) { this.mark = mark; }
    }

    public static class Driver {
        private String firstName;
        private String lastName;
        private int age;

        public Driver() { }
        public Driver(final String s1,final String s2,final int age) {
            firstName = s1;
            lastName = s2;
            this.age = age;
        }

        public String getFirstName() { return firstName; }
        public void setFirstName(final String firstName) { this.firstName = firstName; }

        public String getLastName() { return lastName; }
        public void setLastName(final String lastName) { this.lastName = lastName; }

        public int getAge() { return age; }
        public void setAge(final int age) { this.age = age; }

        @Override
        public String toString() {
            return "Name: " + firstName + " " + lastName + ", age: " + age;
        }
    }

    public static class Taxi {
        private Car car;
        private boolean available = true;
        private LinkedList<Driver> drivers = new LinkedList<>();

        public Taxi() { }
        public Taxi(final Car car) {
            this.car = car;
        }
        public Taxi(final Car car,final LinkedList<Driver> driversList) {
            this.car = car;
            drivers = driversList;
        }
        public boolean isAvailable() {
            return available;
        }
        public void setAvailable(final boolean available) {
            this.available = available;
        }

        public Car getCar() {
            return car;
        }
        public void setCar(final Car car) {
            this.car = car;
        }

        public LinkedList<Driver> getDrivers() {
            return drivers;
        }
        public void setDrivers(final LinkedList<Driver> list) { drivers = list; }

        public void addDriver(final Driver driver) {
            drivers.add(driver);
        }
        public void removeDriver(final Driver driver) {
            drivers.remove(driver);
        }

        @Override
        public String toString() {
            final  StringBuilder result = new StringBuilder();
            result.append("Car: ");
            result.append(car.getMark());
            result.append(", Drivers: ");
            for (final Driver i : drivers) {
                result.append(i.toString());
                result.append(" | ");
            }
            return result.toString();
        }
    }

    public static class Order {
        Taxi taxi;
        public Order() {}
        public Order(final Taxi taxi) { this.taxi = taxi; }

        public void makeOrder(final Taxi taxi) { taxi.setAvailable(false); }
        public void freeOrder() { taxi.setAvailable(true); }
    }

    public static void main(final String[] args) {
        final Car car = new Car("Suzuki");
        final Driver driver1 = new Driver("Yura", "Some", 20);
        final Driver driver2 = new Driver("Olexandr", "Another", 45);
        final Driver driver3 = new Driver("Oleh", "Young", 35);
        final Taxi taxi = new Taxi(car);
        taxi.addDriver(driver1);
        taxi.addDriver(driver2);
        taxi.addDriver(driver3);
        System.out.println(taxi.toString());
        final Order order = new Order();
        order.makeOrder(taxi);
        System.out.println(taxi.isAvailable());
    }
}


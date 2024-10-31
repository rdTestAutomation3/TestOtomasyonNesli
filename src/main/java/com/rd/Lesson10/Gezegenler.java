package com.rd.Lesson10;

public enum Gezegenler {
    MERCURY(1, 57.9, 2439.7, 88),
    VENUS(2, 108.2, 6051.8, 225),
    EARTH(3, 149.6, 6371, 365),
    MARS(4, 227.9, 3389.5, 687),
    JUPITER(5, 778.3, 69911, 4333),
    SATURN(6, 1427, 58232, 10759),
    URANUS(7, 2871, 25362, 30687),
    NEPTUNE(8, 4495, 24622, 60190);

    private final int orderFromSun;
    private final double distanceFromSun; // milyon kilometre cinsinden
    private final double radius;          // kilometre cinsinden
    private final double orbitalPeriod;   // gün cinsinden

    // Constructor
    Gezegenler(int orderFromSun, double distanceFromSun, double radius, double orbitalPeriod) {
        this.orderFromSun = orderFromSun;
        this.distanceFromSun = distanceFromSun;
        this.radius = radius;
        this.orbitalPeriod = orbitalPeriod;
    }

    // Getter metotları
    public int getOrderFromSun() {
        return orderFromSun;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    public double getRadius() {
        return radius;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    // Gezegen bilgilerini formatlı olarak döndüren bir metot
    @Override
    public String toString() {
        return String.format("%s: Sıra = %d, Uzaklık = %.1f milyon km, Yarıçap = %.1f km, Dönme Süresi = %.1f gün",
                this.name(), orderFromSun, distanceFromSun, radius, orbitalPeriod);
    }
}

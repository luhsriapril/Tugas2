/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas2;

/**
 *
 * @author sriapril_2201010011
 */
public class MenghitungVolumeBalok{ 
    // Attributes
    private double Pj;
    private double Lb;
    private double Tg;

    // Default constructor
    public MenghitungVolumeBalok() {
        this.Pj = 0.0;
        this.Lb = 0.0;
        this.Tg = 0.0;
    }

    // Parameterized constructor
    public MenghitungVolumeBalok(double pj, double lb, double tg) {
        this.Pj = pj;
        this.Lb = lb;
        this.Tg = tg;
    }

    // Setter methods
    public void setPj(double npj) {
        this.Pj = npj;
    }

    public void setLb(double nlb) {
        this.Lb = nlb;
    }

    public void setTg(double ntg) {
        this.Tg = ntg;
    }

    // Method to calculate volume
    public double getVolume() {
        return this.Pj * this.Lb * this.Tg;
    }

    // Method to calculate surface area
    public double getSurfaceArea() {
        return 2 * (this.Pj * this.Lb + this.Pj * this.Tg + this.Lb * this.Tg);
    }

    // Method to print the results
    public void printHasil() {
        System.out.println("Panjang: " + this.Pj);
        System.out.println("Lebar: " + this.Lb);
        System.out.println("Tinggi: " + this.Tg);
        System.out.println("Volume Balok: " + getVolume());
        System.out.println("Luas Permukaan Balok: " + getSurfaceArea());
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating an object using the default constructor
        MenghitungVolumeBalok balok1 = new MenghitungVolumeBalok();
        balok1.setPj(5.0);
        balok1.setLb(3.0);
        balok1.setTg(4.0);
        balok1.printHasil();

        // Creating an object using the parameterized constructor
        MenghitungVolumeBalok balok2 = new MenghitungVolumeBalok(7.0, 4.0, 6.0);
        balok2.printHasil();
    }
}


    
    
    


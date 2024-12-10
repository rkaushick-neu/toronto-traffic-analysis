/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.toronto_traffic_project;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.apache.hadoop.io.WritableComparable;

/**
 * Creating a Composite Key (for secondary sorting)
 * @author rishabhkaushick
 */
public class CompositeKey implements WritableComparable<CompositeKey>{
    
    private String intersection;
    private int totalCars;
    private int totalTrucks;
    private int totalBuses;
    private int totalPedestrians;
    private int totalOthers;
    
    
    public CompositeKey(){
        super();
    }

    public CompositeKey(String intersection, int totalCards) {
        super();
        this.intersection = intersection;
        this.totalCars = totalCards;
    }

    public String getIntersection() {
        return intersection;
    }

    public void setIntersection(String intersection) {
        this.intersection = intersection;
    }

    public int getTotalCards() {
        return totalCars;
    }

    public void setTotalCards(int totalCards) {
        this.totalCars = totalCards;
    }

    public int getTotalCars() {
        return totalCars;
    }

    public void setTotalCars(int totalCars) {
        this.totalCars = totalCars;
    }

    public int getTotalTrucks() {
        return totalTrucks;
    }

    public void setTotalTrucks(int totalTrucks) {
        this.totalTrucks = totalTrucks;
    }

    public int getTotalBuses() {
        return totalBuses;
    }

    public void setTotalBuses(int totalBuses) {
        this.totalBuses = totalBuses;
    }

    public int getTotalPedestrians() {
        return totalPedestrians;
    }

    public void setTotalPedestrians(int totalPedestrians) {
        this.totalPedestrians = totalPedestrians;
    }

    public int getTotalOthers() {
        return totalOthers;
    }

    public void setTotalOthers(int totalOthers) {
        this.totalOthers = totalOthers;
    }
    
    

    @Override
    public void write(DataOutput dataOutput) throws IOException {
        // 
        dataOutput.writeUTF(intersection);
        dataOutput.writeInt(totalCars);
    }

    @Override
    public void readFields(DataInput dataInput) throws IOException {
        //
        intersection = dataInput.readUTF();
        totalCars = dataInput.readInt();
    }

    @Override
    public int compareTo(CompositeKey o) {
        // Composite Key - o
        
        //compareTo
            // -1: the key should be placed before the other key
            //  0: two keys are equal
            //  1: the key should be stored 
        
        // If the intersections are equal, we want to check how many cars were there in that intersection
        if(this.totalCars == o.totalCars){
            return this.intersection.compareTo(o.intersection);
        }
        // I want to compare between the total cars of each
        if(this.totalCars == o.totalCars){
            return 0;
        } else if(this.totalCars < o.totalCars){
            return -1;
        } else {
            return 1;
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mr;

import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

/**
 * Mapper that emits each IP Address & 1
 * @author rishabhkaushick
 */
public class IntersectionCountMapper extends Mapper<LongWritable, Text, Text, IntWritable>{
    private final static IntWritable one = new IntWritable(1);
    private static Text locationIntersection = new Text();

    @Override
    public void run(Context context) throws IOException, InterruptedException {
        
    }

    @Override
    protected void cleanup(Context context) throws IOException, InterruptedException {
        
    }


    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        String line = value.toString();
        String [] tokens = line.split(",");
        
        // based on the file, the loction column is in the 5th location
        locationIntersection.set(tokens[4]);
        
        // emit location, 1
        context.write(locationIntersection, one);
    }

    @Override
    protected void setup(Context context) throws IOException, InterruptedException {
        
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mr;

import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

/**
 *
 * @author rishabhkaushick
 */
public class IntersectionCountReducer extends Reducer<Text, IntWritable, Text, IntWritable>{
    private static IntWritable sumIntWritable = new IntWritable();

    @Override
    public void run(Context context) throws IOException, InterruptedException {
        
    }

    @Override
    protected void cleanup(Context context) throws IOException, InterruptedException {
        
    }

    @Override
    protected void reduce(Text key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException {
        int sum = 0;
        for (IntWritable val: values){
            sum += val.get();
        }
        sumIntWritable.set(sum);
        context.write(key, sumIntWritable);
    }

    @Override
    protected void setup(Context context) throws IOException, InterruptedException {
        
    }
    
    
    
}

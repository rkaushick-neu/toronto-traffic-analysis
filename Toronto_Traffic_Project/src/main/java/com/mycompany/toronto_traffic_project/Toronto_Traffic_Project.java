/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.toronto_traffic_project;

import java.io.IOException;
import org.apache.hadoop.mapreduce.Job;

/**
 *
 * @author rishabhkaushick
 */
public class Toronto_Traffic_Project {

    public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException {
        
        // Create a job
        Job job = Job.getInstance();
        
        job.setJarByClass(Toronto_Traffic_Project.class);
        
        // First Job:
        // Counting the number of unique Location Intersections
        
        
        // all the below arguments are the name of the class followed by .class
        // job.setGroupComparableClass()
        // job.setSortComparatorClass();
        // job.setPartitionerClass();
        
        
        // output of this job will be stored in the second args which is passed
        
        // Map Reduce Chaining
        // end of the job - wait for it to get completed first before starting the second job
        boolean result = job.waitForCompletion(true);
        
        if(result){
            Job job1 = Job.getInstance();
            job1.setJarByClass(Toronto_Traffic_Project.class);
            
            // add mapper class
            // reducer class
            
            // key class
            // output value class
            
            // input path
                // this will be the output of the first mr job
            
            // final output will be getting stored at the third argument (args) we provide
        }
    }
}

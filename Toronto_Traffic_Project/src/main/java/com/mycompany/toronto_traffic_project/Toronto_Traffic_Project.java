/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.toronto_traffic_project;

import com.mycompany.mr.IntersectionCountMapper;
import com.mycompany.mr.IntersectionCountReducer;
import java.io.IOException;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;

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
        
        //setting the job name
        job.setJobName("mapreducejob1");
        
        job.setInputFormatClass(TextInputFormat.class);
        job.setOutputFormatClass(TextOutputFormat.class);
        
        // setting the mappeer and reducer class
        job.setMapperClass(IntersectionCountMapper.class);
        job.setCombinerClass(IntersectionCountReducer.class);
        job.setReducerClass(IntersectionCountReducer.class);
        
        // setting output type for the reducer as it is not defined
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);
        
        // getting the input csv file from args[0]
        FileInputFormat.addInputPath(job, new Path(args[0]));
        // output will be written into args[1] location in Hadoop
        FileOutputFormat.setOutputPath(job, new Path(args[1]));
        
        job.waitForCompletion(true);
        
        // all the below arguments are the name of the class followed by .class
        // job.setGroupComparableClass()
        // job.setSortComparatorClass();
        // job.setPartitionerClass();
        
        
        // output of this job will be stored in the second args which is passed
        
        // Map Reduce Chaining
        // end of the job - wait for it to get completed first before starting the second job
//        boolean result = job.waitForCompletion(true);
//        
//        if(result){
//            Job job1 = Job.getInstance();
//            job1.setJarByClass(Toronto_Traffic_Project.class);
            
            // add mapper class
            // reducer class
            
            // key class
            // output value class
            
            // input path
                // this will be the output of the first mr job
            
            // final output will be getting stored at the third argument (args) we provide
//        }
    }
}

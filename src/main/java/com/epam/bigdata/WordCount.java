package com.epam.bigdata;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;


public class WordCount {
    public static void main(String[] args) throws Exception {
        Configuration conf = new Configuration();
        Job job = new Job(conf, "word count");
        job.setJarByClass(WordCount.class);
        job.setMapperClass(WordCountMapper.class);
        job.setReducerClass(WordCountReducer.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);
        FileInputFormat.addInputPath(job, new Path("resources/poem.txt"));
        FileOutputFormat.setOutputPath(job, new Path("resources/poem3.txt"));
        //int returnValue = job.waitForCompletion(true) ? 0:1;
//job.submit();
        if(job.isSuccessful()) {

            System.out.println("Job was successful");

        } else if(!job.isSuccessful()) {

            System.out.println("Job was not successful");

        }
    }

}
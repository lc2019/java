package day01_mr.mrdemo;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import java.io.IOException;

/**
 * 获取job对象
 * 关联jar
 * 关联map和redurce
 * 设置map输出的key和v
 * 设置最终出书的 key和v
 * 设置输入输出路径
 * 提交job
 */
public class driver  {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        //获取job对象
        Configuration conf  = new Configuration();
        Job job  = Job.getInstance(conf);

        //2.关联jar
        job.setJarByClass(driver.class);


        //关联mr
        job.setMapperClass(map.class);
        job.setReducerClass(redu.class);
        //设置mr的输入类型
        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(IntWritable.class);
        //设置最终的输出类型
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);
        //设置输入输出路径
        FileInputFormat.setInputPaths(job,new Path("/Users/mac/input/hello.txt"));
        FileOutputFormat.setOutputPath(job,new Path("/Users/mac/output"));
        //提交
        job.waitForCompletion(true);
        }
}

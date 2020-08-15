package day01_mr.mrdemo;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class map extends Mapper<LongWritable,Text,Text, IntWritable> {
    Text k = new Text();
    IntWritable v = new IntWritable(1);
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        //1.读取行
        String line = value.toString();
        //2.切割数据
        String[] ss = line.split(" ");
        //3.输出kv
        for (String s : ss) {
            k.set(s);
            //写出
            context.write(k,v);
        }
    }
}

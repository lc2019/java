package demo2_flow;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class flowMap extends Mapper<LongWritable, Text,Text,flowBean> {
    Text k =  new Text();
    IntWritable v = new IntWritable();
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        //获取第一行
        //1	13736230513	192.196.100.1	www.atguigu.com	2481	24681	200
        String line = value.toString();

        //2.切割
        String[] fields = line.split("\t");

        //3.封装对象
        k.set(fields[1]); //手机号
        long upFlow = Long.parseLong(fields[fields.length-3]);
        long downFlow = Long.parseLong(fields[fields.length-2]);


        //4.写出
    }
}

package day01_mr;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.junit.Test;

import java.io.IOException;

/**
 * map阶段-字符串转为string，按行切割，计数
 * 继承map类
 * 输入数据kv
 * 输出数据kv
 * maptask对每个map调用1次
 * Mapper<KEYIN, VALUEIN, KEYOUT, VALUEOUT>
 */
public class demodMap extends Mapper<LongWritable, Text,Text, IntWritable> {
    Text k = new Text();
    IntWritable v = new IntWritable();
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        //1.获取1行
        String line = value.toString();

        //2.切割单词
        String[] words = line.split(" ");

        //3.遍历
        for (String word : words) {
            k.set(word);
            v.set(1);
            context.write(k,v);
        }
    }
}

package day01_mr.mrdemo;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

public class redu extends Reducer<Text, IntWritable,Text, IntWritable> {
    IntWritable v  = new IntWritable();
    @Override
    protected void reduce(Text key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException {
        super.reduce(key, values, context);
        //一组 kv <hello,1>
        int sum = 0;
        for (IntWritable value : values) {
            //统计次数
            sum+=value.get();
        }
        //赋值
        v.set(sum);
        //写入文件
        context.write(key,v);
    }
}

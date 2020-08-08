package day01_mr;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

/**
 * 统计次数汇总key的总数
 * IntWritable
 *     public void set(int value) {
 *         this.value = value;
 *     }
 *
 *     public int get() {
 *         return this.value;
 *     }
 */
public class demoReduce extends Reducer<Text,IntWritable,Text, IntWritable> {
    IntWritable v = new IntWritable();
    @Override
    protected void reduce(Text key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException {
        //1.累加求和
        int sum = 0;
        for (IntWritable value : values) {
            sum+=value.get();
        }
        //封装成interWritable
        v.set(sum);

        //写数据
        context.write(key,v);
    }
}

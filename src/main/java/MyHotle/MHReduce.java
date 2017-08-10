package MyHotle;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

/**
 * Created by root on 17-8-9.
 */
public class MHReduce extends Reducer<IntWritable,Text,IntWritable,Text>{

    @Override
    protected void reduce(IntWritable key, Iterable<Text> values, Context context) throws IOException, InterruptedException {

        for (Text value : values) {
            context.write(key,value);
        }


    }
}
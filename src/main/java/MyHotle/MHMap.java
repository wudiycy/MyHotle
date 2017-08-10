package MyHotle;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

/**
 * Created by root on 17-8-9.
 */
public class MHMap extends Mapper<LongWritable,Text,IntWritable,Text> {

//    private Text v = new Text();
//    private Text k = new Text();
    private IntWritable num = new IntWritable();

    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {


            value.

            context.write(key,value);           



    }
}

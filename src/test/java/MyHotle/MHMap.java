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
       String name;          //0
       String id;                 //1
       String sex;              //2
       String address;     //4
       String birthday;
       String check_In;    //18
       String phone;       //14


    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {

           String[] info =   value.toString().split(",");



    }
}

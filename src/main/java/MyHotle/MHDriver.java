package MyHotle;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import java.io.IOException;


/**
 * Created by root on 17-8-9.
 *
 * 样本采集
 *
 *
 */
public class MHDriver {

    private static Path in = new Path("/root/桌面/8.8/8.8课件/part-r-00000");
    private static Path out = new Path("/root/桌面/out/MyHotle");

    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {

        Configuration conf = new Configuration();

        Job job = Job.getInstance(conf);
        job.setJarByClass(MHDriver.class);
        job.setMapperClass(MHMap.class);
        job.setReducerClass(MHReduce.class);

        job.setMapOutputKeyClass(IntWritable.class);
        job.setMapOutputValueClass(Text.class);

        job.setOutputKeyClass(IntWritable.class);
        job.setOutputValueClass(Text.class);

        FileInputFormat.addInputPath(job,in);

        out.getFileSystem(conf).delete(out,true);
        FileOutputFormat.setOutputPath(job,out);

        job.waitForCompletion(true);
        System.out.println(job.getJobState());

    }
}

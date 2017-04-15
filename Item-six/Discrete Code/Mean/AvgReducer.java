// cc averageTemperatureReducer Reducer for average temperature example
// vv averageTemperatureReducer
import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class AvgReducer
  extends Reducer<Text, IntWritable, Text, IntWritable> {
  
  @Override
  public void reduce(Text key, Iterable<IntWritable> values,
      Context context)
      throws IOException, InterruptedException {
    
       int maxTemp = 0; 
       int count = 0;
       for (IntWritable value : values)
       {
            maxTemp += value.get();     
            count+=1;
        }
        context.write(key, new IntWritable(maxTemp/count));
  }
}
// ^^ AverageTemperatureReducer

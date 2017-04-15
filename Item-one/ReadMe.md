# Item One

## Analysis



| Scenario    	| Time 	|
|-------------	|------	|
| 1990        	| 595  	|
| 1990and1992 	| 2700 	|
| '90-'93     	| 3103 	|

Runtime comparison in seconds for MaxTemperature without combiner.

![alt tag](https://github.com/SatishSivakumar/image/blob/master/w7i1.jpg)

| Scenario      | Cluster | PseudoDistributed mode  |
|---------------|---------|-------------------------|
| 1990          | 595     | 610                     |
| 1990 and 1992 | 2700    | 3514                    |
| 1990-1993     | 3103    | 3807                    |

Runtime comparison in seconds for MaxTemperature without combiner in cluster and PseudoDistributed mode

![alt tag](https://github.com/SatishSivakumar/image/blob/master/w7i1.1.jpg)

From this we can observe that the run time is significantly lesser in the cluster than in PseudoDistributed mode because of the processing power of the containers and the large number of data nodes available.

1. In the data set 1990,  the input was provided in .txt format, the input used 63 maps and 1 reducer. The average map time was 5 minutes and 36 seconds and the average reduce time was 45 seconds.

2. In 1990 and 1992 dataset, the input was provided in .txt format, the input used 132 maps and 1 reducer. The average map time was 7 minutes and 38 seconds and the average reduce time was 1 minutes 23 seconds.

3. In 1990-1993 dataset, the input was provided in .txt format, the input used 269 maps and 1 reducer. The average map time was 6 minutes and 42 seconds and the average reduce time is 2 minutes 51 seconds.

### I also observed that whenever a map job was killed or failed, the job made use of the distributed cluster and the map was allocated to the next immediately available cluster in a short span of time, thereby increasing the performce.

# Item-six

## Analysis

### Discrete jobs:

First, the MapReduce job was done by parsing 90-93 dataset with the key now being set to StationID instead of year with date and temperature as values, the maximum temperature for every stationID and date combination was found. This was then set as input for the second MapReduce job that extracts the year in the key and finds the maximum temperature per day and month.

First job execution time: 754 seconds
Second job execution time: 78 seconds

So, totally, the process was completed in 832 seconds.

### Chaining jobs:

Codes were written to chain the output generated in the first MapReduce job to the second MapReduce job. This process was completed in 907 seconds. Though, it took longer to complete, the disk usage was lesser as there was no intermiediate job thus the chaining can be classified as more efficient.


![alt tag](https://github.com/SatishSivakumar/image/blob/master/w7i6.jpg)

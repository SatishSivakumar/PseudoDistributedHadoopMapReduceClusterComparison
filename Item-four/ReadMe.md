# Item Four

## Analysis

#### 1990 Dataset

| Format | Without Combiner | With Combiner |
|--------|------------------|---------------|
| text   | 1758             | 285           |
| gz     | 356              | 634           |
| bz     | 394              | 357           |

Runtime comparison in seconds for dataset 1990 with combiner and without combiner for JAVA intermediate compression.

![alt tag](https://github.com/SatishSivakumar/image/blob/master/w7i4.jpg)

| Format | With Intermediate compression | Without Intermediate compression |
|--------|-------------------------------|----------------------------------|
| text   | 1758                          | 595                              |
| gz     | 356                           | 603                              |
| bz     | 394                           | 1128                             |

Runtime comparison in seconds for dataset 1990 without combiner with JAVA intermediate compression and without JAVA intermediate compression.

![alt tag](https://github.com/SatishSivakumar/image/blob/master/w7i4.1.jpg)

| Format | With Intermediate compression | Without Intermediate compression |
|--------|-------------------------------|----------------------------------|
| text   | 285                           | 341                              |
| gz     | 634                           | 4563                             |
| bz     | 357                           | 859                              |

Runtime comparison in seconds for dataset 1990 with combiner with JAVA intermediate compression and without JAVA intermediate compression.

![alt tag](https://github.com/SatishSivakumar/image/blob/master/w7i4.2.jpg)

#### 1990 and 1992 Dataset

| Format | Without Combiner | With Combiner |
|--------|------------------|---------------|
| text   | 581              | 582           |
| gz     | 734              | 986           |
| bz     | 721              | 1103          |

Runtime comparison in seconds for dataset 1990and1992 with combiner and without combiner for JAVA intermediate compression.

![alt tag](https://github.com/SatishSivakumar/image/blob/master/w7i4.3.jpg)

| Format | With Intermediate compression | Without Intermediate compression |
|--------|-------------------------------|----------------------------------|
| text   | 581                           | 2700                             |
| gz     | 734                           | 3106                             |
| bz     | 721                           | 678                              |

Runtime comparison in seconds for dataset 1990and1992 without combiner with JAVA intermediate compression and without JAVA intermediate compression.

![alt tag](https://github.com/SatishSivakumar/image/blob/master/w7i4.4.jpg)

| Format | With Intermediate compression | Without Intermediate compression |
|--------|-------------------------------|----------------------------------|
| text   | 582                           | 583                              |
| gz     | 986                           | 9516                             |
| bz     | 1103                          | 4758                             |

Runtime comparison in seconds for dataset 1990and1992 with combiner with JAVA intermediate compression and without JAVA intermediate compression.

![alt tag](https://github.com/SatishSivakumar/image/blob/master/w7i4.5.jpg)

#### '90-'93 Datasets

| Format | Without Combiner | With Combiner |
|--------|------------------|---------------|
| text   | 1307             | 1459          |
| gz     | 2389             | 1935          |
| bz     | 1345             | 585           |

Runtime comparison in seconds for dataset '90-'93 with combiner and without combiner for JAVA intermediate compression.

![alt tag](https://github.com/SatishSivakumar/image/blob/master/w7i4.6.jpg)

| Format | With Intermediate compression | Without Intermediate compression |
|--------|-------------------------------|----------------------------------|
| text   | 1307                          | 3103                             |
| gz     | 2389                          | 4291                             |
| bz     | 1345                          | 3147                             |


Runtime comparison in seconds for dataset '90-'93 without combiner with JAVA intermediate compression and without JAVA intermediate compression.

![alt tag](https://github.com/SatishSivakumar/image/blob/master/w7i4.7.jpg)

| Format | With Intermediate compression | Without Intermediate compression |
|--------|-------------------------------|----------------------------------|
| text   | 1459                          | 2063                             |
| gz     | 1935                          | 10447                            |
| bz     | 585                           | 1923                             |

Runtime comparison in seconds for dataset '90-'93 with combiner with JAVA intermediate compression and without JAVA intermediate compression.


![alt tag](https://github.com/SatishSivakumar/image/blob/master/w7i4.8.jpg)

### Thus, it can be observed that the mapper upon finishing its task stores the result in an intermediate memory and reports its completion status and destination of the output to the application master. The reducer then communicates with the application master and receives the information about the completed map jobs and their output destination and consumes the output by transferring the data from the specified location to its own location which impacts the running time of the job. Hence, the run time becomes less and the performance becomes enhanced.

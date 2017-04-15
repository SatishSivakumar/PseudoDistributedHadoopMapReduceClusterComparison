# Item-Five

## Analysis

#### 1990 Dataset

| Format | Without Combiner | With Combiner |
|--------|------------------|---------------|
| text   | 264              | 263           |
| gz     | 234              | 271           |
| bz     | 387              | 434           |

Runtime comparison in seconds for dataset 1990 with combiner and without combiner for Native intermediate compression.


| Format | Without Combiner | With Combiner |
|--------|------------------|---------------|
| text   | 595              | 341           |
| gz     | 603              | 4563          |
| bz     | 1128             | 859           |

Runtime comparison in seconds for dataset 1990 with combiner and without combiner without Native intermediate compression.


| Format | With JAVA Intermediate compression | With Native Intermediate compression |
|--------|------------------------------------|--------------------------------------|
| text   | 1758                               | 264                                  |
| gz     | 356                                | 234                                  |
| bz     | 394                                | 387                                  |

Runtime comparison in seconds for dataset 1990 without combiner with JAVA intermediate compression and with Native intermediate compression for without combiner.

![alt tag](https://github.com/SatishSivakumar/image/blob/master/w7i5.jpg)

| Format | With JAVA Intermediate compression | With Native Intermediate compression |
|--------|------------------------------------|--------------------------------------|
| text   | 285                                | 263                                  |
| gz     | 634                                | 271                                  |
| bz     | 357                                | 434                                  |

Runtime comparison in seconds for dataset 1990 without combiner with JAVA intermediate compression and with Native intermediate compression for with combiner.

![alt tag](https://github.com/SatishSivakumar/image/blob/master/w7i5.1.jpg)

#### 1990 and 1992 Dataset

| Format | Without Combiner | With Combiner |
|--------|------------------|---------------|
| text   | 631              | 342           |
| gz     | 559              | 999           |
| bz     | 481              | 69            |

Runtime comparison in seconds for dataset 1990and1992 with combiner and without combiner for Native intermediate compression.

| Format | Without Combiner | With Combiner |
|--------|------------------|---------------|
| text   | 2700             | 583           |
| gz     | 3106             | 9516          |
| bz     | 678              | 4758          |

Runtime comparison in seconds for dataset 1990and1992 with combiner and without combiner without Native intermediate compression.


| Format | With JAVA Intermediate compression | With Native Intermediate compression |
|--------|------------------------------------|--------------------------------------|
| text   | 581                                | 631                                  |
| gz     | 734                                | 559                                  |
| bz     | 721                                | 481                                  |

Runtime comparison in seconds for dataset 1990and1992 without combiner with JAVA intermediate compression and with Native intermediate compression for without combiner.

![alt tag](https://github.com/SatishSivakumar/image/blob/master/w7i5.2.jpg)

| Format | With JAVA Intermediate compression | With Native Intermediate compression |
|--------|------------------------------------|--------------------------------------|
| text   | 582                                | 342                                  |
| gz     | 986                                | 999                                  |
| bz     | 1103                               | 69                                   |

Runtime comparison in seconds for dataset 1990and1992 without combiner with JAVA intermediate compression and with Native intermediate compression for with combiner.

![alt tag](https://github.com/SatishSivakumar/image/blob/master/w7i5.3.jpg)

#### '90-'93 Datasets

| Format | Without Combiner | With Combiner |
|--------|------------------|---------------|
| text   | 1785             | 682           |
| gz     | 1398             | 871           |
| bz     | 934              | 199           |

Runtime comparison in seconds for dataset 90-93 with combiner and without combiner for Native intermediate compression.

| Format | Without Combiner | With Combiner |
|--------|------------------|---------------|
| text   | 3103             | 2063          |
| gz     | 4291             | 10447         |
| bz     | 3147             | 1923          |

Runtime comparison in seconds for dataset 90-93 with combiner and without combiner without Native intermediate compression.


| Format | With JAVA Intermediate compression | With Native Intermediate compression |
|--------|------------------------------------|--------------------------------------|
| text   | 1307                               | 1785                                 |
| gz     | 2389                               | 1398                                 |
| bz     | 1345                               | 934                                  |

Runtime comparison in seconds for dataset 90-93 without combiner with JAVA intermediate compression and with Native intermediate compression for without combiner.

![alt tag](https://github.com/SatishSivakumar/image/blob/master/w7i5.4.jpg)

| Format | With JAVA Intermediate compression | With Native Intermediate compression |
|--------|------------------------------------|--------------------------------------|
| text   | 1459                               | 2063                                 |
| gz     | 1935                               | 10447                                |
| bz     | 585                                | 1923                                 |

Runtime comparison in seconds for dataset 90-93 without combiner with JAVA intermediate compression and with Native intermediate compression for with combiner.

![alt tag](https://github.com/SatishSivakumar/image/blob/master/w7i5.5.jpg)

### It can observed that while using Native Intermediate compression the run time is significantly lesser because the output is compressed and the amount of data transferred for the reducer to consume intermediate data emitted by the map is also reduced. It is seen that in Native Hadoop intermediate compression, the decompression and compression of data is faster than in JAVA intermediate compression.

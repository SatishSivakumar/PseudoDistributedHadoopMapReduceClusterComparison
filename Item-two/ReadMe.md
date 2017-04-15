# Item Two

## Analysis

In Item-Two the combiner is used to perform the reducer operation before the original reducer consumes the emitted output.
I ran Maxtemperature on datasets 1990,1990 and 1992 and '90-'93 with combiner and without combiner.


| Scenario      | Cluster |
|---------------|---------|
| 1990          | 341     |
| 1990 and 1992 | 583     |
| 1990-1993     | 2063    |

Run time in seconds with combiner.

![alt tag](https://github.com/SatishSivakumar/image/blob/master/w7i2.jpg)

| Scenario      | With Combiner | Without Combiner |
|---------------|---------------|------------------|
| 1990          | 322           | 595              |
| 1990 and 1992 | 569           | 2700             |
| 1990-1993     | 1975          | 3103             |

Run time comparison in seconds for with combiner and without combiner.

![alt tag](https://github.com/SatishSivakumar/image/blob/master/W7I2.2.jpg)

### Thus, it can observed that the jobs have lesser run time when run with combiner. Combiner is in between the Map and Reduce, hence the time taken by reducer with combiner is lesser than the time taken without combiner.

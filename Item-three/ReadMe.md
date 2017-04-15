# Item-three

## Analysis

All the datasets were analyzed in .txt format and also compressed formats like gz and bz compressed files. Both MaxTemperature with combiner and without combiner was performed.

#### 1990 Dataset

| Format | Without Combiner | With Combiner |
|--------|------------------|---------------|
| text   | 595              | 341           |
| gz     | 603              | 4563          |
| bz     | 1128             | 859           |

Runtime in seconds for all three formats in 1990 dataset.

![alt tag](https://github.com/SatishSivakumar/image/blob/master/w7i3.jpg)

### 1990 and 1992 Datasets

| Format | Without Combiner | With Combiner |
|--------|------------------|---------------|
| text   | 2700             | 583           |
| gz     | 3106             | 9516          |
| bz     | 678              | 4758          |

Runtime in seconds for all three formats in 1990and1992 dataset.

![alt tag](https://github.com/SatishSivakumar/image/blob/master/w7i3.1.jpg)

### 1990-1993 Datasets

| Format | Without Combiner | With Combiner |
|--------|------------------|---------------|
| text   | 3103             | 2063          |
| gz     | 4291             | 10447         |
| bz     | 3147             | 1923          |

Runtime in seconds for all three formats in '90-'93 datasets.

![alt tag](https://github.com/SatishSivakumar/image/blob/master/w7i3.2.jpg)

### It can observed that the run time varies based on the input format given. Based on comparing the run times, it can seen that bz's run times are lesser than gz run times. Hence, bz is a better compressed input format than gz.

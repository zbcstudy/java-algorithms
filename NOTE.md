#排序算法
## 算法相关概念
### 内部排序和外部排序
    内部排序是数据记录在内存中进行排序，
    外部排序是因排序的数据很大，一次不能容纳全部的排序记录，在排序过程中需要访问外存   
### 性能指标
#### 1 时间复杂度
    O(1): hash算法
    O(n): for遍历
    O(n^2): 双层嵌套for循环
    O(lgN): 折半查找（二分法查找）
#### 2 空间复杂度
    一个算法在运行过程中临时占用存储空间大小的量度
#### 3 稳定性
    
### 常见排序算法
#### 1 冒泡排序

#### 2 选择排序
    什么数据进去都是 O(n²) 的时间复杂度
    适用于数据规模不是很大的情况
    不需要占用额外的存储空间
#### 3 插入排序
    通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。
#### 4 希尔排序
    递减增量排序算法
    非稳定排序算法
    先将整个待排序的记录序列分割成为若干子序列分别进行直接插入排序，待整个序列中的记录"基本有序"时，再对全体记录进行依次直接插入排序。
    
#### 5 归并排序
    归并排序（Merge sort）是建立在归并操作上的一种有效的排序算法。该算法是采用分治法（Divide and Conquer）的一个非常典型的应用。
    
    作为一种典型的分而治之思想的算法应用，归并排序的实现由两种方法：
    
    自上而下的递归（所有递归的方法都可以用迭代重写，所以就有了第 2 种方法）；
    自下而上的迭代；
    
####双轴快速排序
    Arrays.sort()->DualPivotQuicksort.sort
    
    
![图片(./image/双轴快速排序执行流程.webp)]
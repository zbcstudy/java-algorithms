#排序算法
## 算法相关概念
    所谓排序算法，即通过特定的算法因式将一组或多组数据按照既定模式进行重新排序。
    这种新序列遵循着一定的规则，体现出一定的规律，因此，经处理后的数据便于筛选和计算，大大提高了计算效率。
    对于排序，我们首先要求其具有一定的稳定性，即当两个相同的元素同时出现于某个序列之中，则经过一定的排序算法之后，两者在排序前后的相对位置不发生变化。
    换言之，即便是两个完全相同的元素，它们在排序过程中也是各有区别的，不允许混淆不清。

### 内部排序和外部排序
    内部排序是数据记录在内存中进行排序，
    外部排序是因排序的数据很大，一次不能容纳全部的排序记录，在排序过程中需要访问外存   
    外部排序最常用的算法是多路归并排序,即将原文件分解成多个能够一次性装入内存的部分分别把每一部分调入内存完成排序。然后，对已经排序的子文件进行归并排序。

### 性能指标
#### 1 时间复杂度
    时间复杂度不是算法的运行时间。
    时间复杂度可以说是一个模型，这个模型描述了算法的运行时间随问题规模 N 的变化情况。
    比较算法的效率可以看时间复杂的增长率。
    
    常见时间复杂度
        O(1): hash算法
        O(n): for遍历
        O(n^2): 双层嵌套for循环
        O(logN): 折半查找（二分法查找）
        O(NlogN): 排序算法很常见
#### 2 空间复杂度
    一个算法在运行过程中临时占用存储空间大小的量度
    额外定义的数据结构；临时变量；数据的copy都属于空间复杂度的度量
#### 3 稳定性
    一般情况下，称某个排序算法稳定，指的是当待排序序列中有相同的元素时，它们的相对位置在排序前后不会发生改变。
### 常见排序算法

#### 1 冒泡排序
    冒泡排序是一种简单的排序算法，它也是一种稳定排序算法。其实现原理是重复扫描待排序序列，并比较每一对相邻的元素，当该对元素顺序不正确时进行交换。
    一直重复这个过程，直到没有任何两个相邻元素可以交换，就表明完成了排序。

    该算法的最差时间复杂度为O(n2)，最优时间复杂度为O(n)，平均时间复杂度为 O(n2)。

#### 2 选择排序
    第一次从待排序的数据元素中选出最小（或最大）的一个元素，存放在序列的起始位置，然后再从剩余的未排序元素中寻找到最小（大）元素，然后放到已排序的序列的末尾。
    以此类推，直到全部待排序的数据元素的个数为零。

    选择排序是不稳定的排序方法   
    什么数据进去都是 O(n²) 的时间复杂度
    适用于数据规模不是很大的情况
    不需要占用额外的存储空间
    
#### 3 插入排序
    通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。

    在其实现过程使用双层循环，外层循环对除了第一个元素之外的所有元素，内层循环对当前元素前面有序表进行待插入位置查找，并进行移动
    该算法是稳定的

#### 4 希尔排序
    递减增量排序算法
    非稳定排序算法
    先将整个待排序的记录序列分割成为若干子序列分别进行直接插入排序，待整个序列中的记录"基本有序"时，再对全体记录进行依次直接插入排序。

    希尔排序是按照不同步长对元素进行插入排序，当刚开始元素很无序的时候，步长最大，所以插入排序的元素个数很少，速度很快；
    当元素基本有序了，步长很小，插入排序对于有序的序列效率很高。所以，希尔排序的时间复杂度会比o(n^2)好一些。    

#### 5 归并排序
    归并排序（Merge sort）是建立在归并操作上的一种有效的排序算法。该算法是采用分治法（Divide and Conquer）的一个非常典型的应用。
    
    作为一种典型的分而治之思想的算法应用，归并排序的实现由两种方法：
    
    自上而下的递归（所有递归的方法都可以用迭代重写）；
    自下而上的迭代；
    - 和选择排序一样，归并排序的性能不受输入数据的影响，但表现比选择排序好的多，因为始终都是 O(nlogn) 的时间复杂度。代价是需要额外的内存空间。

#### 6 快速排序
    在平均状况下，排序 n 个数据要 Ο(nlogn) 次比较。在最坏状况下则需要 Ο(n2) 次比较，但这种状况并不常见。
    事实上，快速排序通常明显比其他 Ο(nlogn) 算法更快，因为它的内部循环（inner loop）可以在大部分的架构上很有效率地被实现出来。
    
    快速排序使用分治法（Divide and conquer）策略来把一个串行（list）分为两个子串行（sub-lists）。
    快速排序是一种分而治之思想在排序算法上的典型应用。
    本质上来看，快速排序应该算是在冒泡排序基础上的递归分治法
    
    快速排序的最坏运行情况是 O(n²)，比如说顺序数列的快排。但它的平摊期望时间是 O(nlogn)，且 O(nlogn) 记号中隐含的常数因子很小，
    比复杂度稳定等于 O(nlogn) 的归并排序要小很多。所以，对绝大多数顺序性较弱的随机数列而言，快速排序总是优于归并排序。
#### 7 堆排序
    堆排序引入了额外的一种数据结构：堆积；用来存储需要排序的数据，
    堆积是一个近似完全二叉树的结构，是一个树形结构。特点：即子结点的键值或索引总是小于（或者大于）它的父节点
    - 大顶堆
        每个节点的值都大于或等于其子节点的值，在堆排序算法中用于升序排列
    - 小顶堆
        每个节点的值都小于或等于其子节点的值，在堆排序算法中用于降序排列；
    堆排序的平均时间复杂度为 Ο(nlogn)

#### 8 桶排序
    -- 计数排序
        计数排序的核心在于将输入的数据值转化为键存储在额外开辟的数组空间中。
        作为一种线性时间复杂度的排序，计数排序要求输入的数据必须是有确定范围的整数。
```
public class CountingSort {

    public int[] sort(int[] sourceArray) {
        // 对 arr 进行拷贝，不改变参数内容
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);

        int maxValue = getMaxValue(arr);

        return countingSort(arr, maxValue);
    }

    private int[] countingSort(int[] arr, int maxValue) {
        int bucketLen = maxValue + 1;
        int[] bucket = new int[bucketLen];

        for (int value : arr) {
            bucket[value]++;
        }

        int sortedIndex = 0;
        for (int j = 0; j < bucketLen; j++) {
            while (bucket[j] > 0) {
                arr[sortedIndex++] = j;
                bucket[j]--;
            }
        }
        return arr;
    }

    private int getMaxValue(int[] arr) {
        int maxValue = arr[0];
        for (int value : arr) {
            if (maxValue < value) {
                maxValue = value;
            }
        }
        return maxValue;
    }

}

```
    -- 桶排序
        桶排序是计数排序的升级版。它利用了函数的映射关系，高效与否的关键就在于这个映射函数的确定。为了使桶排序更加高效，我们需要做到这两点：

        在额外空间充足的情况下，尽量增大桶的数量
        使用的映射函数能够将输入的 N 个数据均匀的分配到 K 个桶中

```
    public class BucketSort {

    // 插入排序实现
    private static final InsertSort insertSort = new InsertSort();

    @Override
    public int[] sort(int[] sourceArray) throws Exception {
        // 对 arr 进行拷贝，不改变参数内容
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);

        return bucketSort(arr, 5);
    }

    private int[] bucketSort(int[] arr, int bucketSize) throws Exception {
        if (arr.length == 0) {
            return arr;
        }

        int minValue = arr[0];
        int maxValue = arr[0];
        for (int value : arr) {
            if (value < minValue) {
                minValue = value;
            } else if (value > maxValue) {
                maxValue = value;
            }
        }

        int bucketCount = (int) Math.floor((maxValue - minValue) / bucketSize) + 1;
        int[][] buckets = new int[bucketCount][0];

        // 利用映射函数将数据分配到各个桶中
        for (int i = 0; i < arr.length; i++) {
            int index = (int) Math.floor((arr[i] - minValue) / bucketSize);
            buckets[index] = arrAppend(buckets[index], arr[i]);
        }

        int arrIndex = 0;
        for (int[] bucket : buckets) {
            if (bucket.length <= 0) {
                continue;
            }
            // 对每个桶进行排序，这里使用了插入排序
            bucket = insertSort.sort(bucket);
            for (int value : bucket) {
                arr[arrIndex++] = value;
            }
        }

        return arr;
    }

    /**
     * 自动扩容，并保存数据
     *
     * @param arr
     * @param value
     */
    private int[] arrAppend(int[] arr, int value) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = value;
        return arr;
    }

}
```
    -- 基数排序
    基数排序是一种非比较型整数排序算法，其原理是将整数按位数切割成不同的数字，然后按每个位数分别比较。
    由于整数也可以表达字符串（比如名字或日期）和特定格式的浮点数，所以基数排序也不是只能使用于整数。
```
    public class RadixSort {

    @Override
    public int[] sort(int[] sourceArray) {
        // 对 arr 进行拷贝，不改变参数内容
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);

        int maxDigit = getMaxDigit(arr);
        return radixSort(arr, maxDigit);
    }

    /**
     * 获取最高位数
     */
    private int getMaxDigit(int[] arr) {
        int maxValue = getMaxValue(arr);
        return getNumLenght(maxValue);
    }

    private int getMaxValue(int[] arr) {
        int maxValue = arr[0];
        for (int value : arr) {
            if (maxValue < value) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    protected int getNumLenght(long num) {
        if (num == 0) {
            return 1;
        }
        int lenght = 0;
        for (long temp = num; temp != 0; temp /= 10) {
            lenght++;
        }
        return lenght;
    }

    private int[] radixSort(int[] arr, int maxDigit) {
        int mod = 10;
        int dev = 1;

        for (int i = 0; i < maxDigit; i++, dev *= 10, mod *= 10) {
            // 考虑负数的情况，这里扩展一倍队列数，其中 [0-9]对应负数，[10-19]对应正数 (bucket + 10)
            int[][] counter = new int[mod * 2][0];

            for (int j = 0; j < arr.length; j++) {
                int bucket = ((arr[j] % mod) / dev) + mod;
                counter[bucket] = arrayAppend(counter[bucket], arr[j]);
            }

            int pos = 0;
            for (int[] bucket : counter) {
                for (int value : bucket) {
                    arr[pos++] = value;
                }
            }
        }

        return arr;
    }

    /**
     * 自动扩容，并保存数据
     *
     * @param arr
     * @param value
     */
    private int[] arrayAppend(int[] arr, int value) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = value;
        return arr;
    }
}
```

## jdk中的排序算法
####双轴快速排序
    Arrays.sort()->DualPivotQuicksort.sort
    一般的快速排序采用一个枢轴来把一个数组划分成两半，然后递归之。
    DualPivotQuicksort选出两个枢轴P1和P2
    执行步骤：
    1、小于27的数组，使用插入排序(或47)。

    2、选择枢轴P1和P2。(假设使用数组头和尾)。
    
    3、P1需要小于P2，否者交换。
    
    现在数组被分成4份，left到L的小于P1的数，L到K的大于P1小于P2的数，G到rigth的大于P2的数，待处理的K到G的中间的数(逐步被处理到前3个区域中)。
    
    4、L从开始初始化直至不小于P1，K初始化为L-1，G从结尾初始化直至不大于P2。K是主移动的指针，来一步一步吞噬中间区域。
    --当大于P1小于P2，K++。
    --当小于P1，交换L和K的数，L++,K++。
    --当大于P2，如果G的数小于P1，把L上的数放在K上，把G的数放在L上，L++，再把K以前的数放在G上，G--，K++，完成一次L,K,G的互相交换。否则交换K和G，并G--，K++。
    5、递归4。
    6、交换P1到L-1上。交换P2到G+1上。
    7、递归之。
####   
    Arrays.parallelSort()
    并行排序-合并排序算法。它将数组分成子数组，这些子数组本身先进行排序然后合并。
    使用ForkJoinPool达到并行执行的目的 

    数组大小 大于8192 同时处理器有多个核心 采用并行计算
####   
    Arrays.parallelSort()
    并行排序-合并排序算法。它将数组分成子数组，这些子数组本身先进行排序然后合并。
    使用ForkJoinPool达到并行执行的目的 

    数组大小 大于8192 同时处理器有多个核心 采用并行计算

个人感觉对于这些写出来的查找算法中
还是需要一个完备的测试用例去测试一下这些执行效果

1：查找第一个值等于给定值的元素 的下标
    a: 所有元素都比这个目标元素大                            目标返回值    -1
    b: 所有元素都比这个目标元素小                            目标返回值    -1
    c: 存在等值目标元素但是为第一位                           目标返回值   0
    d: 存在等值目标元素但是为最后一位                          目标返回值  lastIndex
    e: 存在等值目标元素但是整个数组中前一大半都为等值目标元素  目标返回值   第一个目标元素下标
    f: 存在等值目标元素但是整个数组中后一大半都为等值目标元素  目标返回值   第一个目标元素下标
    g: 不存在等值目标元素（但是目标元素在最大最小值区间之间）  目标返回值   -1
    h: 存在等值目标元素但是整个数组中中间一半都为等值目标元素  目标返回值   第一个目标元素下标
    i:

2：查找最后一个值等于给定值的元素 的下标
    a: 所有元素都比这个目标元素大                            目标返回值    -1
    b: 所有元素都比这个目标元素小                            目标返回值    -1
    c: 存在等值目标元素但是为第一位                           目标返回值   0
    d: 存在等值目标元素但是为最后一位                         目标返回值   lastIndex
    e: 存在等值目标元素但是整个数组中前一大半都为等值目标元素  目标返回值 最后一个目标元素下标
    f: 存在等值目标元素但是整个数组中后一大半都为等值目标元素  目标返回值   最后一个目标元素下标
    g: 不存在等值目标元素（但是目标元素在最大最小值区间之间）  目标返回值   -1
    h: 存在等值目标元素但是整个数组中中间一半都为等值目标元素  目标返回值   最后一个目标元素下标
    i:

3：查找第一个大于等于给定值的元素 的下标
    a: 所有元素都比这个目标元素大                                目标返回值       0
    b: 所有元素都比这个目标元素小                                目标返回值       -1  没有比这个给定元素大的
    c: 存在等值目标元素但是为第一位                              目标返回值        0
    d: 存在不等值但符合要求的 目标元素 为第一位                   目标返回值        0
    e: 存在等值目标元素但是为最后一位                             目标返回值       lastIndex
    f: 存在不等值但符合要求的 目标元素 为最后一位                 目标返回值        lastIndex
    g: 存在等值目标元素但是整个数组中前一大半都为等值目标元素      目标返回值       0
    h: 存在等值目标元素但是整个数组中后一大半都为等值目标元素      目标返回值       第一个目标元素的下标
    i: 不存在等值目标元素（但是目标元素在最大最小值区间之间）      目标返回值       第一个目标元素的下标
    j: 存在等值目标元素但是整个数组中中间一半都为等值目标元素      目标返回值       第一个目标元素的下标
    k:


4：查找最后一个小于等于给定值的元素 的下标
    a: 所有元素都比这个目标元素大                                    目标返回值   -1  (没有小于等于目标元素的)
    b: 所有元素都比这个目标元素小                                    目标返回值   lastIndex
    c: 存在等值目标元素但是为第一位                                   目标返回值  0   (仅有一个小于等于目标元素的)
    d: 存在不等值但符合要求的 目标元素 为第一位                        目标返回值  0
    e: 存在等值目标元素但是为最后一位                                  目标返回值  lastIndex
    f: 存在不等值但符合要求的 目标元素 为最后一位                       目标返回值  lastIndex
    g: 存在等值目标元素但是整个数组中前一大半都为等值目标元素            目标返回值  最后一个目标元素下标
    h: 存在等值目标元素但是整个数组中后一大半都为等值目标元素            目标返回值  最后一个目标元素下标
    i: 不存在等值目标元素（但是目标元素在最大最小值区间之间）            目标返回值  最后一个目标元素的下标
    j: 存在等值目标元素但是整个数组中中间一半都为等值目标元素            目标返回值  最后一个目标元素下标
    k:

#!/bin/python

import math
import os
import random
import re
import sys



def even(start, n):
    # write your code here
    i=0;
    list=[];
    while(i<n):
        if(start%2==0):
            list.append(start);
            start+=2;
            i+=1
            continue;
        start+=1;
    return list;
if _name_ == '_main_':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')
    start, n = map(int, raw_input().split())
    res = even(start, n)
    assert type(res) == list
    fptr.write(" ".join(map(str, res)) + '\n')
    fptr.close()

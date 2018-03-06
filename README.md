# JSR

Java, Speech Recognition using sphinx4

Using sample at https://github.com/cmusphinx/sphinx4



Output:

````
10:40:23.386 INFO lexTreeLinguist      Unit table size 79507
10:40:23.388 INFO speedTracker         # ----------------------------- Timers----------------------------------------
10:40:23.388 INFO speedTracker         # Name               Count   CurTime   MinTime   MaxTime   AvgTime   TotTime   
10:40:23.389 INFO speedTracker         Load LM              1       0.3960s   0.3960s   0.3960s   0.3960s   0.3960s   
10:40:23.389 INFO speedTracker         Load AM              1       1.3360s   1.3360s   1.3360s   1.3360s   1.3360s   
10:40:23.389 INFO speedTracker         Load Dictionary      1       0.0690s   0.0690s   0.0690s   0.0690s   0.0690s   
10:40:23.389 INFO speedTracker         Compile              1       0.6290s   0.6290s   0.6290s   0.6290s   0.6290s   
10:40:27.050 INFO speedTracker            This  Time Audio: 1.85s  Proc: 3.63s  Speed: 1.96 X real time
10:40:27.051 INFO speedTracker            Total Time Audio: 1.85s  Proc: 3.63s 1.96 X real time
10:40:27.051 INFO memoryTracker           Mem  Total: 1175.50 Mb  Free: 517.43 Mb
10:40:27.051 INFO memoryTracker           Used: This: 658.07 Mb  Avg: 658.07 Mb  Max: 658.07 Mb
10:40:27.051 INFO trieNgramModel       LM Cache Size: 5498 Hits: 868188 Misses: 5498
Hypothesis: what zero zero zero one
List of recognized words and their times:
{what, 1.000, [820:1080]}
{zero, 1.000, [1090:1490]}
{zero, 1.000, [1500:1910]}
{zero, 1.000, [1920:2280]}
{one, 1.000, [2290:2530]}
Best 3 hypothesis:
<s> what zero zero zero one </s>
<s> what's zero zero zero one </s>
<s> one zero zero zero one </s>
10:40:27.090 INFO liveCMN              40.90 6.82 8.28 -6.56 -2.09 -3.37 -4.91 1.43 -6.18 0.45 -3.98 -4.05 1.06 
10:40:29.155 INFO liveCMN              40.63 6.73 8.21 -6.66 -2.18 -3.25 -4.83 1.40 -6.14 0.47 -3.98 -4.02 1.11 
10:40:29.618 INFO speedTracker            This  Time Audio: 1.00s  Proc: 2.53s  Speed: 2.53 X real time
10:40:29.618 INFO speedTracker            Total Time Audio: 2.85s  Proc: 6.16s 2.16 X real time
10:40:29.618 INFO memoryTracker           Mem  Total: 1326.00 Mb  Free: 914.50 Mb
10:40:29.618 INFO memoryTracker           Used: This: 411.50 Mb  Avg: 534.78 Mb  Max: 658.07 Mb
10:40:29.618 INFO trieNgramModel       LM Cache Size: 10677 Hits: 1752366 Misses: 10677
Hypothesis: yeah i know two one oh
List of recognized words and their times:
{<sil>, 0.999, [2830:3910]}
{bad, 0.617, [3920:4140]}
{oh, 0.617, [4150:4250]}
{two, 0.992, [4260:4490]}
{one, 1.000, [4500:4650]}
{oh, 1.000, [4660:4890]}
Best 3 hypothesis:
<s> bad oh two one oh </s>
<s> yeah i know to one oh </s>
<s> that oh two one oh </s>
10:40:30.520 INFO liveCMN              41.43 7.22 5.82 -5.14 -2.83 -2.71 -4.42 0.93 -6.28 2.10 -3.05 -3.25 0.49 
10:40:31.809 INFO wordPruningLookahea  Average Tokens/State: 8513
10:40:31.829 INFO liveCMN              41.70 5.03 4.72 -2.66 -2.95 -3.78 -2.93 -0.25 -4.89 1.32 -3.39 -1.65 0.20 
10:40:31.846 INFO speedTracker            This  Time Audio: 1.75s  Proc: 2.20s  Speed: 1.26 X real time
10:40:31.846 INFO speedTracker            Total Time Audio: 4.60s  Proc: 8.36s 1.82 X real time
10:40:31.847 INFO memoryTracker           Mem  Total: 1343.00 Mb  Free: 728.60 Mb
10:40:31.847 INFO memoryTracker           Used: This: 614.40 Mb  Avg: 561.32 Mb  Max: 658.07 Mb
10:40:31.847 INFO trieNgramModel       LM Cache Size: 15211 Hits: 2635661 Misses: 15211
Hypothesis: zero one eight zero three
List of recognized words and their times:
{<sil>, 0.557, [5030:6260]}
{zero, 0.557, [6270:6650]}
{one, 0.556, [6660:6860]}
{eight, 1.000, [6870:7090]}
{zero, 1.000, [7100:7460]}
{three, 1.000, [7470:7900]}
Best 3 hypothesis:
<s> zero one eight zero three </s>
<s> sera one eight zero three </s>
<s> cyril one eight zero three </s>
10:40:31.877 INFO trieNgramModel       LM Cache Size: 15211 Hits: 2635661 Misses: 15211
10:40:31.877 INFO speedTracker         # ----------------------------- Timers----------------------------------------
10:40:31.877 INFO speedTracker         # Name               Count   CurTime   MinTime   MaxTime   AvgTime   TotTime   
10:40:31.877 INFO speedTracker         Frontend             526     0.0000s   0.0000s   0.0280s   0.0001s   0.0570s   
10:40:31.877 INFO speedTracker         Score                1042    0.0000s   0.0000s   0.0290s   0.0015s   1.5390s   
10:40:31.878 INFO speedTracker         Prune                3639    0.0000s   0.0000s   0.0010s   0.0000s   0.1500s   
10:40:31.878 INFO speedTracker         Grow                 3647    0.0000s   0.0000s   0.6330s   0.0018s   6.6810s   
10:40:31.878 INFO speedTracker         Load LM              1       0.3960s   0.3960s   0.3960s   0.3960s   0.3960s   
10:40:31.878 INFO speedTracker         Load AM              1       1.3360s   1.3360s   1.3360s   1.3360s   1.3360s   
10:40:31.878 INFO speedTracker         Load Dictionary      1       0.0690s   0.0690s   0.0690s   0.0690s   0.0690s   
10:40:31.878 INFO speedTracker         Compile              1       0.6290s   0.6290s   0.6290s   0.6290s   0.6290s   
10:40:31.879 INFO speedTracker            Total Time Audio: 4.60s  Proc: 8.36s 1.82 X real time
10:40:31.879 INFO memoryTracker           Mem  Total: 1343.00 Mb  Free: 728.15 Mb
10:40:31.879 INFO memoryTracker           Used: This: 614.85 Mb  Avg: 574.70 Mb  Max: 658.07 Mb
Bye

````

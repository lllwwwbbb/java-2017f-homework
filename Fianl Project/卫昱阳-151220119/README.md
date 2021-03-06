# myhomework-for-java
## 使用说明
运行程序，空格`space`开始战斗；`r`重新开始战斗；`l`回放战斗过程<br>
需要注意的是：<br>
1.`回放战斗`的功能必须在战斗结束后才可使用，即战斗结束后，回放刚才的战斗过程，否则不能正确回放，需要重启程序<br>
2.回放战斗结束，程序运行结束，需要重启程序进行新的战斗<br>
3.`重新开始战斗`功能可以在战斗结束后使用，进行重新战斗
## 效果详细说明
仿照老师所给的样例，每一个生物体都是一个线程<br>
由于每个生物体移动一次（每次移动一格），线程等待时间是一个随机数，因此每次战斗过程都不一样<br>
死去的生物体会留下一个`墓碑`并显示在界面上<br>
当葫芦娃移动到最后站成一排的时候战斗结束（此时可以使用`r`重新开始战斗；`l`回放战斗过程）——正义必将战胜邪恶，葫芦娃是不死的！
## 代码详细说明
1.`Main`类包含`main`函数，程序从此加载`Field`开始执行<br>
2.程序中物体对象的类包括`Cloud`、`Grandfather`、`Grass`、`HU1`、`HU2`、`HU3`、`HU4`、`HU5`、`HU6`、`HU7`、`Snake`、`Toad`、`Xiezi`<br>
3.键盘监控等功能在`Field`中实现<br>
4.空格`space`开始战斗，每一个可移动生物体（除了`Cloud`、`Grandfather`、`Grass`、`Snake`都是可移动生物体）每走一步记录当前战斗画面<br>
5.`r`重新开始战斗，调用`restartLevel()`函数回到战斗前的画面<br>
6.在战斗结束后，`l`回放战斗过程，调用`PlayBack`类对象读取文件回放刚刚的战斗过程

# AdairProjAndroid with Kotlin

最近看了下Kotlin-->Android 界的swift。 虽然目前还不能用于项目当中，但是看网上的评论那么多，我也忍不住想试试！ 开始配置： （本人用Android Studio） 首先安装Kotlin插件 然后在module的gradle文件中配置： apply plugin: 'com.android.application' apply plugin: 'kotlin-android' 或者利用你的Tool-->Kotlin-->Config Kotlin in Project 好了，准备工作做完！后面可以运行看看效果！ 个人觉得，用Kotlin的确省了很多代码，看起来也更简洁了。但是刚开始，难免会走进坑（需要注意的地方，不是贬义词的坑哦~~）中，比如： 以前： new XXXX（....） 现在是直接： XXXX(....) 还有就是写惯了java的童鞋： String str = ""; XXXXXXXXX 而现在是： str:String (分号不是必须的) 以前继承： public class A extends B{} 现在： class A : B (真尼玛的。。。。) 其实本人之前接触过这样的语法，因此并不是很稀奇，只是觉得，写了这么久的java，现在突然改变，始终有点。。。

还有更多需要注意的地方我就不说了，反正要自己慢慢去发现 上面我写了一个demo ， 都是些简单的，大家可以随便看看，然后举一反三，早点找到出路，带我一起去新大陆啊！！！

对了，我给大家一个地址，你们就不用像我一样，到处搜资料了：https://wangjiegulu.gitbooks.io/kotlin-for-android-developers-zh/content/gou_zao_fang_fa_he_han_shu_can_shu.html 这里足够让你入门，对Kotlin有一个初步的认识与了解！！！！ 但是希望大家选择一种技术的时候一定要看看你们团队其他的人是用的什么语言咯，不然到时候吃亏的可是你啊！！！！ 就算你用最新的技术，就算你的技术很牛逼，但是在team work中不能与团队很好结合的coder，不是一个好农民！！！！

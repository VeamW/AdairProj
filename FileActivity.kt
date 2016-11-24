package com.adair.work.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ListView
import org.jetbrains.anko.find
import org.jetbrains.anko.longToast
import org.jetbrains.anko.onItemClick
import org.jetbrains.anko.toast

class FileActivity : AppCompatActivity() {
    var fileListView: ListView? = null
    private var data = listOf("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_file)
        fileListView = find<ListView>(R.id.list_view)
        fileListView!!.adapter = KotlinAdapter(this, data)
        fileListView!!.onItemClick { adapterView, view, i, l -> longToast(data?.get(i)) }

        //调用相加的方法1：
        var sum = add(10)
        toast("sum>>>>>" + sum)

        //调用相加的方法2：
        var sum2 = add(1, 5)
        toast("sum2>>>>>" + sum2)


        /**
         * 使用中：
         * val   var
         * 我们可以这样来使用val：
         * val  str = "This is Val"   //字符串
         * val num = 23               //数字
         * val cxt = context          //context
         * 这样是不是很方便呢？
         * 但是如果我们要使用var的时候，就要明确的指定变量的类型，比如
         * var str:String="This is var"
         * var num:Int 23
         *
         */

    }


    /**
     * 编写一个方法，两个数字相加
     * 第二个参数给了一个默认值
     * 调用的时候可以只传一个值，也可以传两个
     * 这样做的好处：
     * 熟悉java的应该对方法的重载有了解
     * 这样就替我们省了重载的方法，直接调用即可
     */
    fun add(i: Int, j: Int = 2): Int = i + j


    /**
     * 在Kotlin中和java不同的是：
     * 我们可以直接对一个字符串进行像数组那样的操作
     * 比如：
     * var str:String
     * print(str[index]
     *
     * 还可以直接循环一个字符串：
     * for(c in str)
     */
    fun itorator(str: String) {

        var strForIndex = str[0]  //一个字符串可以像数组一样

        for (c in str) {  //可以循环一个字符串
            print(c)

        }

    }


}

package com.example.admin.weatherapp
import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

//    private val items = ArrayList<String>();
//    val i: Int  = 7
//    val c : Char ='c'


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        message.text = "Hello Kotlin!"
//        toastTest("ce shi one")
//        toastTest("ce shi two" , Toast.LENGTH_LONG)

//        val recyclerView = findViewById(R.id.forecast_list) as RecyclerView
//        recyclerView.layoutManager = LinearLayoutManager(this)
//        items.getData()
//        recyclerView.adapter = ForecastListAdapter(items)
//    //基本类型转换
//        var d : Double = i.toDouble();
//        val f : Int = c.toInt();
//        Log.e("info","---->>"+d +" " + f);
//        val i = 12
//    val ihex = 0x0f
//    val j = 3L
//    val l = 3.5
//    val k = 3.5f
//
//    val s = "nihao"
//    val a = s[2]
////    print(a)
////    Log.e("info",""+ a )
//    var ss = "EXAMPLE"
//    for(c in 0 .. ss.length){
////        Log.e("info",""+ c)
////        println
//    }
//    val sss = "Example"
//    val s1 = 23
//
//    val s2 : Any = 23
//    val s3 :Context = this
//
//
//    val  person  = Person()
////    person.name = "li lei"
//
//    val p = person.name
//
//    Log.e("info", "--" + p )
//
//    val forecast = ForeCast(Date(),"good day",2.5f)
//    val copyFore= forecast.copy(detail = "bad day");
//    Log.e("info",copyFore.detail +" "+ copyFore.temperature +" "+ copyFore.data);
//
//    val f1 = ForeCast(Date(),"bad day",3.55f)
//    val(data,detail,temperature) = f1
    //创建数组
//    val x1 = myList[2]
//    myList[2] = 4
//    fun main(args :ArrayList<String>): Unit{
//        println("hello world !")
//    }
}
//    fun toastTest(message :String, length : Int = Toast.LENGTH_SHORT){
//        Toast.makeText(this,message,length).show();
//    }
//
//
//    fun  ArrayList<String>.getData(){
//        for(i in 0 ..20){
//            this.add("str"+i);
//        }
//    }


}

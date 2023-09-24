package com.example.recyclerview_template

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Natural_Images>
    private lateinit var imageId : Array<Int>
    private lateinit var heading :Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageId = arrayOf(
            R.drawable.a,
            R.drawable.aq,
            R.drawable.aed,
            R.drawable.awd,
            R.drawable.d,
            R.drawable.ewf,
            R.drawable.er,
            R.drawable.aq,
            R.drawable.e,
            R.drawable.aq,
            R.drawable.q,
            R.drawable.w,
            R.drawable.wada,
            R.drawable.ws,
            R.drawable.a,
            R.drawable.ewf,
            R.drawable.q,
            R.drawable.er,
        )
        heading = arrayOf(
            "loram is a company that specializes in provide equipment management",
            "loram is a company that specializes in provide equipment management",
            "loram is a company that specializes in provide equipment management",
            "loram is a company that specializes in provide equipment management",
            "loram is a company that specializes in provide equipment management",
            "loram is a company that specializes in provide equipment management",
            "loram is a company that specializes in provide equipment management",
            "loram is a company that specializes in provide equipment management",
            "loram is a company that specializes in provide equipment management",
            "loram is a company that specializes in provide equipment management",
            "loram is a company that specializes in provide equipment management",
            "loram is a company that specializes in provide equipment management",
            "loram is a company that specializes in provide equipment management",
            "loram is a company that specializes in provide equipment management",
            "loram is a company that specializes in provide equipment management",
            "loram is a company that specializes in provide equipment management",
            "loram is a company that specializes in provide equipment management",
            "loram is a company that specializes in provide equipment management",
            "loram is a company that specializes in provide equipment management",
            "loram is a company that specializes in provide equipment management",
        )

        newRecyclerView = findViewById(R.id.recycleView)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)


        newArrayList = arrayListOf()
        getDataFromDataClass()


    }

    private fun getDataFromDataClass() {
        for (i in imageId.indices){
            val image = Natural_Images(imageId[i],heading[i])
            newArrayList.add(image)
        }
        newRecyclerView.adapter = RecyclerViewAdapter(newArrayList)
    }
}
package com.example.mygempaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mygempaapp.data.InfoGempa
import com.example.mygempaapp.data.Result
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rvGempa = findViewById<RecyclerView>(R.id.rv_gempa)
        val adapter = GempaAdapter()
        rvGempa.layoutManager = LinearLayoutManager(this)
        rvGempa.setHasFixedSize(true)
        rvGempa.adapter = adapter

        NetworkConfig().getService().getAllData().enqueue(object: Callback<Result> {
            override fun onResponse(call: Call<Result>, response: Response<Result>) {
                val data = response.body()
                data?.let{
                    Log.d("hehehehe", data.toString())
                    adapter.setData(it.infoGempa.gempa)
                }
            }

            override fun onFailure(call: Call<Result>, t: Throwable) {
                Log.d("hehehehe", t.message.toString())
            }
        })
    }
}
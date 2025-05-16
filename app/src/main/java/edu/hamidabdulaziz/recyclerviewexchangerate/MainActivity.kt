package edu.hamidabdulaziz.recyclerviewexchangerate

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ExchangeRateAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val data = listOf(
            ExchangeRateItem("Vietnam", R.drawable.vietnam, "1.403", "1.746"),
            ExchangeRateItem("Nicaragua", R.drawable.nicaragua, "9.123", "12.09"),
            ExchangeRateItem("Korea", R.drawable.korea, "3.704", "5.151"),
            ExchangeRateItem("Russia", R.drawable.russia, "116.0", "144.4"),
            ExchangeRateItem("China", R.drawable.china, "1.725", "2.234"),
            ExchangeRateItem("Portuguese", R.drawable.portugal, "1.403", "1.746"),
            ExchangeRateItem("Korea", R.drawable.korea, "3.454", "4.312"),
            ExchangeRateItem("French", R.drawable.france, "23.45", "34.56"),
            ExchangeRateItem("Nicaragua", R.drawable.nicaragua, "263.1", "300.3"),
            ExchangeRateItem("China", R.drawable.china, "1.725", "2.234")
        )

        adapter = ExchangeRateAdapter(data)
        recyclerView.adapter = adapter
    }
}

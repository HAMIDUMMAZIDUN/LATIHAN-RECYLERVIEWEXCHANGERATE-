package edu.hamidabdulaziz.recyclerviewexchangerate

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ExchangeRateAdapter(private val exchangeRates: List<ExchangeRateItem>) :
    RecyclerView.Adapter<ExchangeRateAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val flagImage: ImageView = view.findViewById(R.id.flagImage)
        val countryName: TextView = view.findViewById(R.id.countryName)
        val buyRate: TextView = view.findViewById(R.id.buyRate)
        val sellRate: TextView = view.findViewById(R.id.sellRate)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_exchange_rate, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = exchangeRates[position]
        holder.flagImage.setImageResource(item.flagResId)
        holder.countryName.text = item.countryName
        holder.buyRate.text = item.buyRate
        holder.sellRate.text = item.sellRate
    }

    override fun getItemCount(): Int = exchangeRates.size
}

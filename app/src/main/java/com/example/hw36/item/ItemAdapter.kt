package com.example.hw36.item

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hw36.databinding.FragmentCakeBinding

class ItemAdapter(
    private val context: Context,
    private val items: List<Item>,
    private val listener: OnItemClickListener
) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    interface OnItemClickListener {
        fun onItemClick(item: Item?)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item, listener)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ItemViewHolder(private  val binding: FragmentCakeBinding) {


}
}
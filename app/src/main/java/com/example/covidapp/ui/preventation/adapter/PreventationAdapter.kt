package com.example.covidapp.ui.preventation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.covidapp.databinding.ItemPrevBinding
import com.example.covidapp.models.prev.PreventationData

class PreventationAdapter(private val list: List<PreventationData>) :
    RecyclerView.Adapter<PreventationAdapter.VH>() {

    inner class VH(private val itemPrevBinding: ItemPrevBinding) :
        RecyclerView.ViewHolder(itemPrevBinding.root) {
        fun onBind(preventationData: PreventationData) {
            itemPrevBinding.tvName.text = preventationData.name
            itemPrevBinding.tvTitle.text = preventationData.title
            itemPrevBinding.imageView8.setImageResource(preventationData.img)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(ItemPrevBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.onBind(list[position])
    }
}
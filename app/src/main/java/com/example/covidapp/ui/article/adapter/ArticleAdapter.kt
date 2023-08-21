package com.example.covidapp.ui.article.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.covidapp.databinding.ItemArticleBinding
import com.example.covidapp.models.article.ArticleData

class ArticleAdapter(private val list: List<ArticleData>) :
    RecyclerView.Adapter<ArticleAdapter.VH>() {
    inner class VH(private val itemArticleBinding: ItemArticleBinding) :
        RecyclerView.ViewHolder(itemArticleBinding.root) {
        fun onBind(articleData: ArticleData) {

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(ItemArticleBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.onBind(list[position])
    }
}
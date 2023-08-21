package com.example.covidapp.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.covidapp.R
import com.example.covidapp.databinding.FragmentHomeBinding
import com.example.covidapp.models.article.ArticleData
import com.example.covidapp.models.prev.PreventationData
import com.example.covidapp.ui.article.adapter.ArticleAdapter
import com.example.covidapp.ui.preventation.adapter.PreventationAdapter


class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = requireNotNull(_binding)


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(layoutInflater)

        val preventationAdapter = PreventationAdapter(prevList())
        binding.rv.adapter = preventationAdapter

        val articleAdapter = ArticleAdapter(articleList())
        binding.rvArticle.adapter = articleAdapter

        val newsAdapter = ArticleAdapter(newsList())
        binding.rvNews.adapter = newsAdapter




        return binding.root
    }


    private fun prevList(): ArrayList<PreventationData> {
        val list = ArrayList<PreventationData>()
        list.add(PreventationData("Use Mask", "Lorem ipsum dolor sit amet", R.drawable.img_2))
        list.add(PreventationData("Use Mask", "Lorem ipsum dolor sit amet", R.drawable.img_1))
        list.add(
            PreventationData(
                "Use Mask",
                "Lorem ipsum dolor sit amet",
                R.drawable.im_avoid_animals_contact
            )
        )
        list.add(PreventationData("Use Mask", "Lorem ipsum dolor sit amet", R.drawable.img_1))
        list.add(PreventationData("Use Mask", "Lorem ipsum dolor sit amet", R.drawable.img_1))
        list.add(PreventationData("Use Mask", "Lorem ipsum dolor sit amet", R.drawable.img_1))
        list.add(PreventationData("Use Mask", "Lorem ipsum dolor sit amet", R.drawable.img_1))
        return list
    }

    private fun newsList(): ArrayList<ArticleData> {
        val list = ArrayList<ArticleData>()
        list.add(
            ArticleData(
                "Covid-19 global case",
                "Lorem ipsum dolor sit amet",
                R.drawable.img_3
            )
        )
        list.add(
            ArticleData(
                "Covid-19 global case",
                "Lorem ipsum dolor sit amet",
                R.drawable.img_3
            )
        )
        list.add(
            ArticleData(
                "Covid-19 global case",
                "Lorem ipsum dolor sit amet",
                R.drawable.img_3
            )
        )
        list.add(
            ArticleData(
                "Covid-19 global case",
                "Lorem ipsum dolor sit amet",
                R.drawable.img_3
            )
        )
        list.add(
            ArticleData(
                "Covid-19 global case",
                "Lorem ipsum dolor sit amet",
                R.drawable.img_3
            )
        )
        list.add(
            ArticleData(
                "Covid-19 global case",
                "Lorem ipsum dolor sit amet",
                R.drawable.img_3
            )
        )
        list.add(
            ArticleData(
                "Covid-19 global case",
                "Lorem ipsum dolor sit amet",
                R.drawable.img_3
            )
        )
        return list

    }

    private fun articleList(): ArrayList<ArticleData> {
        val list = ArrayList<ArticleData>()
        list.add(
            ArticleData(
                "Covid-19 global case",
                "Lorem ipsum dolor sit amet",
                R.drawable.img_3
            )
        )
        list.add(
            ArticleData(
                "Covid-19 global case",
                "Lorem ipsum dolor sit amet",
                R.drawable.img_3
            )
        )
        list.add(
            ArticleData(
                "Covid-19 global case",
                "Lorem ipsum dolor sit amet",
                R.drawable.img_3
            )
        )
        list.add(
            ArticleData(
                "Covid-19 global case",
                "Lorem ipsum dolor sit amet",
                R.drawable.img_3
            )
        )
        list.add(
            ArticleData(
                "Covid-19 global case",
                "Lorem ipsum dolor sit amet",
                R.drawable.img_3
            )
        )
        list.add(
            ArticleData(
                "Covid-19 global case",
                "Lorem ipsum dolor sit amet",
                R.drawable.img_3
            )
        )
        list.add(
            ArticleData(
                "Covid-19 global case",
                "Lorem ipsum dolor sit amet",
                R.drawable.img_3
            )
        )
        return list
    }
}
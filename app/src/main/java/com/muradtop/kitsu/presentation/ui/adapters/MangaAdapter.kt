package com.muradtop.kitsu.presentation.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.RecyclerView
import com.muradtop.kitsu.databinding.ItemMangaBinding
import com.muradtop.kitsu.presentation.base.BaseDiffUtil
import com.muradtop.kitsu.presentation.extensions.loadImageWithGlide
import com.muradtop.kitsu.presentation.models.manga.MangaDataUI

class MangaAdapter(
    private val onItemClick: (id: String) -> Unit
) : PagingDataAdapter<MangaDataUI, MangaAdapter.MangaViewHolder>(BaseDiffUtil()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MangaViewHolder {
        return MangaViewHolder(
            ItemMangaBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MangaViewHolder, position: Int) {
        getItem(position)?.let { holder.onBind(it) }
    }

    inner class MangaViewHolder(private val binding: ItemMangaBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(mangaData: MangaDataUI) {
            binding.imManga.loadImageWithGlide(mangaData.mangaDto.posterImage.original)
            binding.root.setOnClickListener {
                onItemClick(mangaData.id)
            }
        }
    }
}


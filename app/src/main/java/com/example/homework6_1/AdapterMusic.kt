package com.example.homework6_1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework6_1.databinding.FragmentSecondBinding
import com.example.homework6_1.databinding.ItemMusicBinding


class MusicAdapter(private var musicList: ArrayList<Music>, private var onClick: (Music) -> Unit) :
    RecyclerView.Adapter<MusicAdapter.MusicViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        return MusicViewHolder(
            ItemMusicBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        holder.bind(musicList[position])
        holder.itemView.setOnClickListener {
            onClick(musicList[position])
        }
    }

    override fun getItemCount(): Int {
        return musicList.size
    }


    class MusicViewHolder(private var binding: ItemMusicBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(music: Music) {
            binding.tvNames.text = music.author
            binding.tvMusicName.text = music.name
        }
    }
}
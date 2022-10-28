package com.example.homework6_1

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.homework6_1.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding
    private var arrayList = arrayListOf<Music>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        val adapter = MusicAdapter(arrayList,this::onClick)
        binding.recycle.adapter = adapter
    }

    fun onClick(music: Music){
val intent=Intent(requireActivity(),SecondActivity::class.java)
        intent.putExtra("Key1", music.name)
        startActivity(intent)
    }


    private fun loadData() {
        arrayList.add(Music("Bermet", "Pesnya"))
        arrayList.add(Music("Meladze", "Noch"))
        arrayList.add(Music("Bilan", "Nebesa"))
        arrayList.add(Music("Pugacheva", "Oblaka"))
        arrayList.add(Music("Kirkorov", "Winter"))
        arrayList.add(Music("Rotaru", "Dojd"))
        arrayList.add(Music("Beyonce", "Angelina"))
        arrayList.add(Music("Iglesias", "Hero"))
        arrayList.add(Music("Satylganova", "Apama"))
        arrayList.add(Music("Anastasiya", "Malenkaya"))
    }

}

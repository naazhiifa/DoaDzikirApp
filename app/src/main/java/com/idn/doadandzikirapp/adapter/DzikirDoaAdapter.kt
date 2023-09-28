package com.idn.doadandzikirapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.idn.doadandzikirapp.R
import com.idn.doadandzikirapp.model.DzikirDoa

class DzikirDoaAdapter(private val listDzikirDoa: ArrayList<DzikirDoa>): RecyclerView.Adapter<DzikirDoaAdapter.MyViewHolder>(){
     inner class MyViewHolder(view: View): RecyclerView.ViewHolder(view){
         // initialization view dari layout row_item_dzikir.xml
         val tvDesc: TextView = view.findViewById(R.id.tv_desc)
         val tvlafaz: TextView = view.findViewById(R.id.tv_lafaz)
         val tvterjemah: TextView = view.findViewById(R.id.tv_terjemah)

     }
     // menampilkan data sesuai dengan posisi layout yang ditentukan
     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)= MyViewHolder (
         LayoutInflater.from(parent.context).inflate(R.layout.row_item_dzikir_doa, parent, false)
         )

     // menentukan jumlah data yang ditampilkan
     override fun getItemCount() = listDzikirDoa.size

     // mengatur data dengan tampilan
     override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
         holder.tvDesc.text = listDzikirDoa[position].desc
         holder.tvlafaz.text = listDzikirDoa[position].lafadz
         holder.tvterjemah.text = listDzikirDoa[position].terjemah
     }

 }
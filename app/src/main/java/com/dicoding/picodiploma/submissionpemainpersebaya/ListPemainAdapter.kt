package com.dicoding.picodiploma.submissionpemainpersebaya

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.picodiploma.submissionpemainpersebaya.R.layout.item_player

class ListPemainAdapter(private val listPemain: ArrayList<Pemain>) : RecyclerView.Adapter<ListPemainAdapter.ListViewHolder>() {


    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View= LayoutInflater.from(viewGroup.context).inflate(R.layout.item_player, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listPemain.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val pemain = listPemain[position]

        Glide.with(holder.itemView.context)
            .load(pemain.photo)
            .apply(RequestOptions().override(40,40))
            .into(holder.imgPhoto)

        holder.tvName.text = pemain.name
        holder.tvDetail.text = pemain.detail

        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener {
            val moveDetail = Intent(mContext, DetailPemain::class.java)
            moveDetail.putExtra(DetailPemain.EXTRA_NAME, pemain.name)
            moveDetail.putExtra(DetailPemain.EXTRA_IDENTITY, pemain.identity)
            moveDetail.putExtra(DetailPemain.EXTRA_OVERVIEW, pemain.detail)
            moveDetail.putExtra(DetailPemain.EXTRA_PHOTO, pemain.photo)
            mContext.startActivity(moveDetail)
        }
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)

    }

}


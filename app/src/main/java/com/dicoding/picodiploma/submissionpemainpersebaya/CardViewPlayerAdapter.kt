package com.dicoding.picodiploma.submissionpemainpersebaya

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.picodiploma.submissionpemainpersebaya.R.layout.item_cardview_player

class CardViewPlayerAdapter(private val listPemain: ArrayList<Pemain>) : RecyclerView.Adapter<CardViewPlayerAdapter.CardViewViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview_player, parent, false)
        return CardViewViewHolder(view)

    }


    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val pemain = listPemain[position]

        Glide.with(holder.itemView.context)
            .load(pemain.photo)
            .apply(RequestOptions())
            .into(holder.imgPhoto)

        holder.tvName.text = pemain.name
        holder.tvDetail.text = pemain.detail

        val mContext = holder.itemView.context


        holder.btnDetail.setOnClickListener {
            val moveDetail = Intent(mContext, DetailPemain::class.java)
            moveDetail.putExtra(DetailPemain.EXTRA_NAME, pemain.name)
            moveDetail.putExtra(DetailPemain.EXTRA_IDENTITY, pemain.identity)
            moveDetail.putExtra(DetailPemain.EXTRA_OVERVIEW, pemain.detail)
            moveDetail.putExtra(DetailPemain.EXTRA_PHOTO, pemain.photo)
            mContext.startActivity(moveDetail)
        }
    }

    override fun getItemCount(): Int {
        return listPemain.size
    }

    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var btnDetail: Button = itemView.findViewById(R.id.btn_set_detail)
    }
}


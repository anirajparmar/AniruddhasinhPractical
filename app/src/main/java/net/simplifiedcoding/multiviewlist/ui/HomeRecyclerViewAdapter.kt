package net.simplifiedcoding.multiviewlist.ui

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import net.simplifiedcoding.multiviewlist.R
import net.simplifiedcoding.multiviewlist.data.model.PhotoModel
import net.simplifiedcoding.multiviewlist.databinding.ItemPhotoBinding

class HomeRecyclerViewAdapter : RecyclerView.Adapter<MainViewHolder>() {

    lateinit var context: Context
    var items = listOf<PhotoModel>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        context = parent.context
        return when(viewType){
            R.layout.item_photo -> MainViewHolder.PhotoViewHolder(
                ItemPhotoBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
            else -> throw IllegalArgumentException("Invalid ViewType Provided")
        }
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        when(holder){
            is MainViewHolder.PhotoViewHolder -> holder.bind(items[position])
        }
        holder.itemView.setOnClickListener {
            context.startActivity(Intent(context, DetailActivity::class.java)
                .putExtra("Photo", items[position]
            ))
        }
    }

    override fun getItemCount() = items.size

    override fun getItemViewType(position: Int): Int = R.layout.item_photo

}

package net.simplifiedcoding.multiviewlist.ui

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import net.simplifiedcoding.multiviewlist.data.model.PhotoModel
import net.simplifiedcoding.multiviewlist.databinding.ItemPhotoBinding

sealed class MainViewHolder(binding: ViewBinding) : RecyclerView.ViewHolder(binding.root) {

    class PhotoViewHolder(private val binding: ItemPhotoBinding) : MainViewHolder(binding){
        fun bind(director: PhotoModel){
            binding.imageView.loadImage(director.thumbnailUrl)
            binding.textViewId.text =  director.id.toString()
            binding.textViewTitle.text = director.title.capitalize()
        }
    }
}
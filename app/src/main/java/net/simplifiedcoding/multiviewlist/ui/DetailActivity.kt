package net.simplifiedcoding.multiviewlist.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import net.simplifiedcoding.multiviewlist.data.model.PhotoModel
import net.simplifiedcoding.multiviewlist.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding
    private lateinit var photo : PhotoModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        photo = (intent.getSerializableExtra("Photo") as PhotoModel?)!!

        supportActionBar?.title = photo.title.capitalize()

        binding.imageViewPhoto.loadImage(photo.url)
        binding.textViewId.text = photo.id.toString()
        binding.textViewTitle.text = photo.title.capitalize()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
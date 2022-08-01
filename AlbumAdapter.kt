package sungil.myjyprecycler2

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import sungil.myjyprecycler2.databinding.RvItemAlbumBinding
import sungil.myjyprecycler2.databinding.RvItemSingerBinding

class AlbumAdapter(val albumList: List<Album>) :
RecyclerView.Adapter<AlbumAdapter.ViewHolder>() {
    inner class ViewHolder(
        val binding: RvItemAlbumBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(album: Album) {
            Glide.with(binding.ivCover.context)
                .load(album.imgUrl)
                .into(binding.ivCover)
            binding.tvTitle.text = album.title
            binding.tvInfo.text = album.info

            binding.ivCover.setOnClickListener {
                val albumIntent = Intent(binding.ivCover.context, AlbumActivity::class.java)
                albumIntent.putExtra("albumObj", album)
                binding.ivCover.context.startActivity(albumIntent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            RvItemAlbumBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val album = albumList[position]
        holder.bind(album)
    }

    override fun getItemCount(): Int {
        return albumList.size
    }
}
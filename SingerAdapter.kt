package sungil.myjyprecycler2

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import sungil.myjyprecycler2.databinding.RvItemSingerBinding

class SingerAdapter(val singerList: List<Singer>) :
    RecyclerView.Adapter<SingerAdapter.ViewHolder>() {
    inner class ViewHolder(
        val binding: RvItemSingerBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(singer: Singer) {
            Glide.with(binding.ivProfile.context)
                .load(singer.imgUrl)
                .into(binding.ivProfile)
            binding.tvName.text = singer.name
            binding.tvInfo.text = singer.info

            val albumAdapter = AlbumAdapter(singer.albumList)
            binding.rvAlbum.adapter = albumAdapter

            binding.ivProfile.setOnClickListener {
                val singerIntent = Intent(binding.ivProfile.context, SingerActivity::class.java)
                singerIntent.putExtra("singerObj", singer)
                binding.ivProfile.context.startActivity(singerIntent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            RvItemSingerBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val singer = singerList[position]
        holder.bind(singer)
    }

    override fun getItemCount(): Int {
        return singerList.size
    }
}

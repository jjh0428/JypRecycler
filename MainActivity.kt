package sungil.myjyprecycler2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import sungil.myjyprecycler2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val singerAdapter = SingerAdapter(singerList)
        binding.tvSinger.adapter = singerAdapter

    }
    companion object {
        val singerList = listOf<Singer>(
            Singer("박진영", "생일 : 1972.01.13", "https://jyptfstorage01.blob.core.windows.net/homepage/Artist-banner-350x270(38).jpg",
                listOf(
                    Album("Blue City", "1994-09-01", "https://lv2-cdn.azureedge.net/jypark/album_15012511617.JPG"),
                    Album("딴따라", "1995-09-01", "https://lv2-cdn.azureedge.net/jypark/album_150125121742.JPG"),
                    Album("IT`s The Time", "1996-07-01", "https://lv2-cdn.azureedge.net/jypark/album_150125122251.jpg"),
                    Album("썸머 징글벨", "1996-09-01", "https://lv2-cdn.azureedge.net/jypark/album_150125122510.JPG"),
                    Album("십년이 지나도", "1998-01-02", "https://lv2-cdn.azureedge.net/jypark/album_150125122731.JPG")
                )),
            Singer("버나드박", "생일 : 1993.01.29", "https://lv2-cdn.azureedge.net/bernardpark/28845601d9ec49989cf4245989533e5a-%ED%94%84%EB%A1%B6%E3%84%B9.png",
                listOf(
                    Album("난…", "2014-10-13", "https://lv2-cdn.azureedge.net/bernardpark/bf3399c1c1ff45658255aa709f522156-im.jpg"),
                    Album("니가 보인다", "2016-04-03", "https://lv2-cdn.azureedge.net/bernardpark/With_You.jpg"),
                    Album("탓", "2017-06-28", "https://lv2-cdn.azureedge.net/bernardpark/bernardpark_cover.jpg"),
                    Album("Still", "2018-10-10", "https://lv2-cdn.azureedge.net/bernardpark/Still.jpg"),
                    Album("Bad Influence", "2021-11-15", "https://lv2-cdn.azureedge.net/bernardpark/b927aa1f8b2d4cce88a89203e838de8f-%EB%B2%84%EB%82%98%EB%93%9C%20%EB%B0%95%20DS%20%EC%BB%A4%EB%B2%84%20%EC%9D%B4%EB%AF%B8%EC%A7%80.jpg")
                ))
        )
    }

}
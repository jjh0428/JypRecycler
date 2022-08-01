package sungil.myjyprecycler2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class AlbumActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_album)

        val album = intent.getParcelableExtra<Album>("albumObj")
        Toast.makeText(this, "${album?.title}\n" +
            "${album?.info}", Toast.LENGTH_SHORT).show()
    }
}
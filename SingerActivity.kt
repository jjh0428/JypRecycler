package sungil.myjyprecycler2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class SingerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_singer)

        val singer = intent.getParcelableExtra<Singer>("singerObj")
        Toast.makeText(this, "${singer?.name}\n" +
            "${singer?.info}", Toast.LENGTH_SHORT).show()
    }
}
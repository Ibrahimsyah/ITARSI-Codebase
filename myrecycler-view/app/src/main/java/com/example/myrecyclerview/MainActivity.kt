package com.example.myrecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "Halo Dunia!"

        val dataKita = listOf<Pengguna>(
            Pengguna(
                "Ibrahim 1",
                "Malang",
                "https://media-exp1.licdn.com/dms/image/C5603AQGS8kIf_PYI1A/profile-displayphoto-shrink_800_800/0/1630926184612?e=1643241600&v=beta&t=xPLzIjhnNobmzwxXMWS-fDNX3AlQ2_AtAgoDA2NFs1M"
            ),
            Pengguna(
                "Ibrahim 2",
                "Malang",
                "https://media-exp1.licdn.com/dms/image/C5603AQGS8kIf_PYI1A/profile-displayphoto-shrink_800_800/0/1630926184612?e=1643241600&v=beta&t=xPLzIjhnNobmzwxXMWS-fDNX3AlQ2_AtAgoDA2NFs1M"
            ),
            Pengguna(
                "Ibrahim 3",
                "Malang",
                "https://media-exp1.licdn.com/dms/image/C5603AQGS8kIf_PYI1A/profile-displayphoto-shrink_800_800/0/1630926184612?e=1643241600&v=beta&t=xPLzIjhnNobmzwxXMWS-fDNX3AlQ2_AtAgoDA2NFs1M"
            ),
            Pengguna(
                "Ibrahim 4",
                "Malang",
                "https://media-exp1.licdn.com/dms/image/C5603AQGS8kIf_PYI1A/profile-displayphoto-shrink_800_800/0/1630926184612?e=1643241600&v=beta&t=xPLzIjhnNobmzwxXMWS-fDNX3AlQ2_AtAgoDA2NFs1M"
            ),
            Pengguna(
                "Ibrahim 5",
                "Malang",
                "https://media-exp1.licdn.com/dms/image/C5603AQGS8kIf_PYI1A/profile-displayphoto-shrink_800_800/0/1630926184612?e=1643241600&v=beta&t=xPLzIjhnNobmzwxXMWS-fDNX3AlQ2_AtAgoDA2NFs1M"
            ),
        )

        val rv = findViewById<RecyclerView>(R.id.rv_pengguna)

        val adapter = PenggunaAdapter(dataKita) {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(DetailActivity.EXTRA_PENGGUNA, it)
            startActivity(intent)
        }
        rv.layoutManager = LinearLayoutManager(this)
        rv.setHasFixedSize(true)
        rv.adapter = adapter
    }
}

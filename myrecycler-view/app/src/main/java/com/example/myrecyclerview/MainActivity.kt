package com.example.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataKita = listOf<Pengguna>(
            Pengguna("Ibrahim", "Malang", "https://media-exp1.licdn.com/dms/image/C5603AQGS8kIf_PYI1A/profile-displayphoto-shrink_800_800/0/1630926184612?e=1643241600&v=beta&t=xPLzIjhnNobmzwxXMWS-fDNX3AlQ2_AtAgoDA2NFs1M"),
            Pengguna("Ibrahim", "Malang", "https://media-exp1.licdn.com/dms/image/C5603AQGS8kIf_PYI1A/profile-displayphoto-shrink_800_800/0/1630926184612?e=1643241600&v=beta&t=xPLzIjhnNobmzwxXMWS-fDNX3AlQ2_AtAgoDA2NFs1M"),
            Pengguna("Ibrahim", "Malang", "https://media-exp1.licdn.com/dms/image/C5603AQGS8kIf_PYI1A/profile-displayphoto-shrink_800_800/0/1630926184612?e=1643241600&v=beta&t=xPLzIjhnNobmzwxXMWS-fDNX3AlQ2_AtAgoDA2NFs1M"),
            Pengguna("Ibrahim", "Malang", "https://media-exp1.licdn.com/dms/image/C5603AQGS8kIf_PYI1A/profile-displayphoto-shrink_800_800/0/1630926184612?e=1643241600&v=beta&t=xPLzIjhnNobmzwxXMWS-fDNX3AlQ2_AtAgoDA2NFs1M"),
            Pengguna("Ibrahim", "Malang", "https://media-exp1.licdn.com/dms/image/C5603AQGS8kIf_PYI1A/profile-displayphoto-shrink_800_800/0/1630926184612?e=1643241600&v=beta&t=xPLzIjhnNobmzwxXMWS-fDNX3AlQ2_AtAgoDA2NFs1M"),
        )

        val rv = findViewById<RecyclerView>(R.id.rv_pengguna)

        val adapter = PenggunaAdapter(dataKita)
        rv.layoutManager = LinearLayoutManager(this)
        rv.setHasFixedSize(true)
        rv.adapter = adapter
    }
}

package com.example.mypokemon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import coil.load
import coil.transform.CircleCropTransformation

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        supportActionBar?.title = "Profil Saya"

        val profilePhoto = findViewById<ImageView>(R.id.iv_profile_photo)
        val profileName = findViewById<TextView>(R.id.tv_profile_name)
        val profileAddress = findViewById<TextView>(R.id.tv_profile_address)
        val profileDescription = findViewById<TextView>(R.id.tv_profile_description)

        profilePhoto.load("https://media-exp1.licdn.com/dms/image/C5603AQGS8kIf_PYI1A/profile-displayphoto-shrink_800_800/0/1630926184612?e=1643241600&v=beta&t=xPLzIjhnNobmzwxXMWS-fDNX3AlQ2_AtAgoDA2NFs1M"){
            transformations(CircleCropTransformation())
        }
        profileName.text = "Ibrahimsyah Zairussalam"
        profileAddress.text = "Malang"
        profileDescription.text = "Software engineer with 1 year of professional experience. Final year computer science student. Google Associate Android Developer Certified."
    }
}
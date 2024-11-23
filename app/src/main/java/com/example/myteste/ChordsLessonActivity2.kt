package com.example.myteste

import android.net.Uri
import android.os.Bundle
import android.widget.ImageButton
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class ChordsLessonActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chords_lesson_one)

        // Vincula o VideoView
        val videoView: VideoView = findViewById(R.id.lesson_video)

        // Configura o vídeo usando o diretório raw
        val videoUri = Uri.parse("android.resource://" + packageName + "/" + R.raw.acordes2)
        videoView.setVideoURI(videoUri)

        // Adiciona o MediaController para controle de reprodução
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView) // Vincula os controles ao VideoView
        videoView.setMediaController(mediaController)

        // Inicia o vídeo automaticamente
        videoView.start()

        val backButton: ImageButton = findViewById(R.id.back_Button)
        backButton.setOnClickListener {
            onBackPressed()
        }
    }
}

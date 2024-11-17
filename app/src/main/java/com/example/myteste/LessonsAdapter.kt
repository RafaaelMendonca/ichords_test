package com.example.myteste

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LessonsAdapter(private val lessons: List<Lesson>) :
    RecyclerView.Adapter<LessonsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val lesson = lessons[position]
        holder.bind(lesson)

        // Configura o clique no item
        holder.itemView.setOnClickListener {
            // Cria um Intent para abrir a Activity correspondente
            val context = holder.itemView.context
            val intent = Intent(context, lesson.targetActivity)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return lessons.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val iconViolao: ImageView = itemView.findViewById(R.id.icon_violao)
        private val textLesson: TextView = itemView.findViewById(R.id.textlesson)
        private val subtextLesson: TextView = itemView.findViewById(R.id.subtextlesson)
        private val chordCoin: ImageView = itemView.findViewById(R.id.chord_coin)
        private val subtextCoin: TextView = itemView.findViewById(R.id.subtextcoin)

        fun bind(lesson: Lesson) {
            iconViolao.setImageResource(lesson.iconResource)
            textLesson.text = lesson.title
            subtextLesson.text = lesson.subtitle
            chordCoin.setImageResource(lesson.coinResource)
            subtextCoin.text = lesson.coinText
        }
    }
}

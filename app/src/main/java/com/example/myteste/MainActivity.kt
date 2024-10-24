package com.example.myteste

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.example.myteste.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // Opção de usar View Binding, que é mais eficiente
    // private lateinit var binding: ActivityMainBinding

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Layout antigo: setContentView(R.layout.activity_main)
        setContentView(R.layout.activity_main)

        // Corrigindo IDs para os campos de email e senha
        val userEmail = findViewById<TextInputEditText>(R.id.editTextEmail)
        val userPassword = findViewById<TextInputEditText>(R.id.editTextPassword)
        val loginButton = findViewById<Button>(R.id.buttonLogin)

        // Ação ao clicar no botão de login
        loginButton.setOnClickListener {
            val email = userEmail.text.toString().trim()
            val password = userPassword.text.toString().trim()

            // Simulação de verificação de email e senha
            if (email == "123@gmail.com" && password == "123") {
                val intent = Intent(this, LicoesListActivity::class.java)
                startActivity(intent)
                finish() // Fecha a Activity atual para não voltar ao login
            } else {
                // Exibe um alerta caso as credenciais estejam incorretas
                Toast.makeText(this, "Email ou senha incorretos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

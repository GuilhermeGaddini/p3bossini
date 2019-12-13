package com.p3bossini;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String usuario;
    private String mensagem;

    private EditText editTextUsuario;
    private EditText editTextMensagem;
    private TextView textView;
    private Button botaoLogar;

    public void logar(){
        usuario = editTextUsuario.getText().toString();
    }

    public void enviarMensagem(){
        mensagem = editTextMensagem.getText().toString();
        textView.setText(usuario + ":" + mensagem);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public EditText getEditTextUsuario() {
        return editTextUsuario;
    }

    public void setEditTextUsuario(EditText editTextUsuario) {
        this.editTextUsuario = editTextUsuario;
    }

    public EditText getEditTextMensagem() {
        return editTextMensagem;
    }

    public void setEditTextMensagem(EditText editTextMensagem) {
        this.editTextMensagem = editTextMensagem;
    }

    public Button getBotaoLogar() {
        return botaoLogar;
    }

    public void setBotaoLogar(Button botaoLogar) {
        this.botaoLogar = botaoLogar;
    }
}

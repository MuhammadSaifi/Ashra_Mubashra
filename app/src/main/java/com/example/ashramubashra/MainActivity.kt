package com.example.ashramubashra

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
       val items=listOf<String>(
           "Introduction",
           "Ashra Mubashra",
           "Hazrat Abu Bakkar (R.A)",
           "Hazrat Umer (R.A)",
           "Hazrat Usman (R.A)",
           "Hazrat Ali (R.A)",
           "Hazrat Talha (R.A)",
           "Hazrat Zubair ibn-e-Awam (R.A)",
           "Hazrat Obaida (R.A)",
           "Hazrat Abdul Rehman bin Awuf (R.A)",
           "Hazrat Saad ibn-e-Waqaas (R.A)",
           "Hazrat Saeed Ibn-e-Zahid (R.A)",
           "About Me"
       )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items)
        listview.adapter = adapter
        listview.setOnItemClickListener { adapterView, view, position, id ->
            if(position==0){
                val intent = Intent(this,Introduction::class.java)
                startActivity(intent)
            }
            if(position==1){
                val intent =Intent(this,Ashra_Mubashra::class.java)
                startActivity(intent)
            }
            if(position==2){
                val intent =Intent(this,Abu_Bakkar::class.java)
                startActivity(intent)
            }
            if(position==3){
                val intent =Intent(this,Umer::class.java)
                startActivity(intent)
            }
            if(position==4){
                val intent =Intent(this,Usman::class.java)
                startActivity(intent)
            }
            if(position==5){
                val intent =Intent(this,Ali::class.java)
                startActivity(intent)
            }
            if(position==6){
                val intent =Intent(this,Talha::class.java)
                startActivity(intent)
            }
            if(position==7){
                val intent =Intent(this,Zubair::class.java)
                startActivity(intent)
            }
            if(position==8){
                val intent =Intent(this,Abu_Obaida::class.java)
                startActivity(intent)
            }
            if(position==9){
                val intent =Intent(this,Adul_Rehman::class.java)
                startActivity(intent)
            }
            if(position==10){
                val intent =Intent(this,Saad::class.java)
                startActivity(intent)
            }
            if(position==11){
                val intent =Intent(this,Saeed::class.java)
                startActivity(intent)
            }
            if(position==12){
                val intent =Intent(this,About::class.java)
                startActivity(intent)
            }
        }
    }
}

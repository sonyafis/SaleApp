package com.example.saleapp

import android.app.Dialog
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class ItemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item)

        val title: TextView = findViewById(R.id.item_list_title_one)
        val text: TextView = findViewById(R.id.item_list_text)
        val image: ImageView = findViewById(R.id.item_list_image_one)
        val imageId: Int = intent.getIntExtra("itemImageId", 0)

        title.text = intent.getStringExtra("itemTitle")
        text.text = intent.getStringExtra("itemText")
        image.setImageResource(imageId)

        val button: Button = findViewById(R.id.button_buy)
        button.setOnClickListener{
            val loadingDialog = Dialog(this)
            loadingDialog.setContentView(R.layout.progress_layout)
            loadingDialog.window!!.setLayout(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT)
            loadingDialog.show()
        }
    }
}
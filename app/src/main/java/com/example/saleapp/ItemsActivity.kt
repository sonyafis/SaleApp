package com.example.saleapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ItemsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items)

        val itemsList: RecyclerView = findViewById(R.id.itemsList)
        val items = arrayListOf<Item>()

        items.add(Item(1, "book", "Книга", "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s.", "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.Lorem Ipsum has been the industry's standard dummy text ever since the 1500s.", 435))
        items.add(Item(2, "zakl", "Закладки для книг", "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s.", "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.Lorem Ipsum has been the industry's standard dummy text ever since the 1500s.", 231))
        items.add(Item(3, "lamp", "Лампа для чтения", "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s.", "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.Lorem Ipsum has been the industry's standard dummy text ever since the 1500s.", 1540))

        itemsList.layoutManager = LinearLayoutManager(this) //в каком формате элементы будут располагаться
        itemsList.adapter = ItemsAdapter(items, this) //Обращаемся к собственному адаптеру
    }
}
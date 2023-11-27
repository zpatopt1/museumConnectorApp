package com.example.museumConnect

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.annotation.MenuRes
import androidx.appcompat.widget.PopupMenu

class ChoseMuseum : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chosemuseum)

        val button = findViewById<Button>(R.id.menu_button)
        button.setOnClickListener { v: View ->
            showMenu(v, R.menu.popup_categories_museum)
        }
    }

    private fun showMenu(v: View, @MenuRes menuRes: Int) {
        val popup = PopupMenu(this@ChoseMuseum, v)
        popup.menuInflater.inflate(menuRes, popup.menu)

        popup.setOnMenuItemClickListener { menuItem: MenuItem ->
            // Respond to menu item click.
            when (menuItem.itemId) {
                // Handle different menu item clicks
                // Example:
                R.id.categorie_museum_1 -> {
                    // Do something when menu item 1 is clicked
                    true
                }
                R.id.categorie_museum_2 -> {
                    // Do something when menu item 2 is clicked
                    true
                }
                // Handle other menu items as needed...
                else -> false
            }
        }

        popup.setOnDismissListener {
            // Respond to popup being dismissed.
        }

        // Show the popup menu.
        popup.show()
    }
}

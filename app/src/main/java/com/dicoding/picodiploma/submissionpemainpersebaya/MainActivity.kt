package com.dicoding.picodiploma.submissionpemainpersebaya

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*
import kotlin.collections.ArrayList


class MainActivity : AppCompatActivity() {
    private lateinit var rvPemain: RecyclerView
    private var list: ArrayList<Pemain> = arrayListOf()


    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvPemain = findViewById(R.id.player_persebaya)
        rvPemain.setHasFixedSize(true)

        list.addAll(playersdata.listData)
        showRecyclerCardView()
    }

    private fun showRecyclerList() {
        rvPemain.layoutManager = LinearLayoutManager(this)
        val listPemainAdapter =  ListPemainAdapter(list)
        rvPemain.adapter = listPemainAdapter
    }

    private fun showRecyclerCardView() {
        rvPemain.layoutManager = LinearLayoutManager(this)
        val cardViewPemainAdapter =  CardViewPlayerAdapter(list)
        rvPemain.adapter = cardViewPemainAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }


    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_about -> {
                val About = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(About)
            }

            R.id.action_list -> {
                val actionbar = supportActionBar
                actionbar!!.title = "Tampilan List"
                actionbar.setDisplayHomeAsUpEnabled(true)

                fun onSupportNavigateUp(): Boolean {
                    onBackPressed()
                    return true
                }
                showRecyclerList()
            }

            R.id.action_cardview -> {
                val actionbar = supportActionBar
                actionbar!!.title = "Tampilan Card"
                actionbar.setDisplayHomeAsUpEnabled(true)

                fun onSupportNavigateUp(): Boolean {
                    onBackPressed()
                    return true
                }
                showRecyclerCardView()
            }
        }
    }


}
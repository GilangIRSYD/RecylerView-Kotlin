/*
    Mentoring Udacoding Batch#2
    Submission Week 2
    Gilang Safera Putra
    Tangerang 2020

 */



package com.catatancodingku.kotlinrv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Explode
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animExplode = Explode()
        window.exitTransition = animExplode

        // data RvHeadline
        val titleHeadline = arrayOf(
            "Android Native",
            "Cross Platform",
            "Android Hybrid"
        )

        val imageHeadline : IntArray   = intArrayOf(
            R.drawable.nativedev,
            R.drawable.crossplatform,
            R.drawable.hybrid
        )

        val adapter     = HeadlineAdapter(this,imageHeadline,titleHeadline)

        rv_top.adapter  = adapter
        rv_top.setHasFixedSize(true)
        rv_top.layoutManager    = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)

        // data RvLanguageProgramming

        val languageProgram     = arrayOf(
            "Rust",
            "TypeScript",
            "Python",
            "Kotlin",
            "Go",
            "Julia",
            "Dart"
        )

        val rateLanguage        = arrayOf(
            "86.1 % most wanted, \nsurvey by StackOverFlow",
            "67.1 % most wanted, \nsurvey by StackOverFlow",
            "66.7 % most wanted, \nsurvey by StackOverFlow",
            "62.9 % most wanted, \nsurvey by StackOverFlow",
            "62.3 % most wanted, \nsurvey by StackOverFlow",
            "62.2 % most wanted, \nsurvey by StackOverFlow",
            "62.1 % most wanted, \nsurvey by StackOverFlow"
        )

        val imageLanguage       = intArrayOf(
            R.drawable.rusty,
            R.drawable.ts,
            R.drawable.python,
            R.drawable.kotlin,
            R.drawable.go,
            R.drawable.julia,
            R.drawable.dart
        )

        val adapterLanguageProgramming  = LangProgramAdapter(this,languageProgram,rateLanguage,imageLanguage)

        rv_bottom.adapter   = adapterLanguageProgramming
        rv_bottom.setHasFixedSize(true)
        rv_bottom.layoutManager = LinearLayoutManager(this)
    }
}
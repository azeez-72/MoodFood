package com.project.moodfood.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.project.moodfood.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}











//@Composable
//fun Greeting(name: String) {
//    Text(text = "Hello $name!")
//}
//
//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    MoodFoodTheme {
//        Greeting("Android")
//    }
//}



//MoodFoodTheme {
////                isSystemInDarkTheme()
//    // A surface container using the 'background' color from the theme
//    Surface(color = MaterialTheme.colors.background) {
//        Greeting("Android")
//    }
//}
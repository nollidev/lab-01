package com.example.petshop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.petshop.ui.theme.PetShopTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /* Start of demo */

        val cat = Cat("Coco", 6)
        val dog = Dog("Mochi", 7)

        val pets = mutableListOf<Pet>() // recommended (by me)
        pets.add(cat)
        pets.add(dog)

        val pets2 = mutableListOf(cat, dog)

        val scorpion = Scorpion("Stinger", 32)
        pets.add(scorpion)
        val pets3 = mutableListOf(cat, dog, scorpion)

        val pettablePets = mutableListOf<Pettable>()
        pettablePets.add(cat)
        pettablePets.add(dog)

        /* End of demo */
        /* Start of exercise*/

        val moods = mutableListOf<Mood>()
        val happy = Happy("September 4, 2026")
        val sad = Sad("September 4, 2026")
        moods.add(happy)
        moods.add(sad)

        println(moods[0].expression())   // should be happy emote
        println(moods[1].expression())   // should be sad emote

        /* End of exercise */
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PetShopTheme {
        Greeting("Android")
    }
}
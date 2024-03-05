package com.example.calgorythm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calgorythm.ui.theme.CalgorythmTheme
import java.time.format.TextStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalgorythmTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    maintext()
                }
            }
        }
    }
}

@Composable
fun maintext(){
    var djikstra = algorythm(
        "Djikstra",
        "Algorythm used for finding the shortest path",
        1.5,
        "Graphs")
    var kruksall = algorythm(
        "Kruksall",
        "Algorythm used for finding the minimum spanning tree",
        2.0,
        "Graphs")
    var dfs = algorythm(
        "DFS",
        "Algorythm used for depth-first search",
        1.0,
        "Graphs")
    var bfs = algorythm(
        "BFS",
        "Algorythm used for breadth-first search",
        1.0,
        "Graphs")
    var astar = algorythm(
        "A-Star",
        "Algorythm used for finding the shortest path through heura",
        4.0,
        "Graphs"
    )
    Column(modifier= Modifier
        .fillMaxWidth()
        .padding(10.dp)
    )
    {
        Row{
            Text("Calgorythm")
        }
        addalgo(djikstra)
        addalgo(kruksall)
        addalgo(dfs)
        addalgo(bfs)
        addalgo(astar)
    }

}
var imie = androidx.compose.ui.text.TextStyle(fontFamily = FontFamily.Default, fontSize = 32.sp,color= Color(179,213,164))
var kat = androidx.compose.ui.text.TextStyle(fontFamily = FontFamily.Default, fontSize = 20.sp,color=Color(125,149,114))
var opis = androidx.compose.ui.text.TextStyle(fontFamily = FontFamily.Default, fontSize = 20.sp,color=Color(161,191,147))

@Composable
fun addalgo(alg : algorythm) {
    Button(
        modifier = Modifier
            .background(color = Color(221, 236, 216)) // Set background color to RGB (221,236,216)
            .fillMaxWidth(),
        onClick = { /*TODO*/ }
    ) {
        Column(verticalArrangement = Arrangement.Center) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(2.dp)
            ) {
                Row {
                    Box(modifier = Modifier) {
                        Column {
                            Row {
                                Text(
                                    "${alg.name}",
                                    Modifier,
                                    style = imie
                                )
                            }
                            Text(
                                "${alg.categ}",
                                Modifier,
                                style = kat
                            )
                            Text(
                                "${alg.desc}",
                                Modifier,
                                style = opis
                            )
                        }
                    }
                }
            }
        }
    }
    Spacer(modifier = Modifier.height(5.dp))
}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CalgorythmTheme {
        maintext()
    }
}

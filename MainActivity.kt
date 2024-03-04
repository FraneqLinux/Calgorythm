package com.example.calgorythm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.calgorythm.ui.theme.CalgorythmTheme

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
        "Djikstra's Algorythm",
        "Algorythm used for finding the shortest path",
        1.5,
        "Graphs")
    var kruksall = algorythm(
        "Kruksall's Algorythm",
        "Algorythm used for finding the minimum spanning tree",
        2.0,
        "Graph")
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
@Composable
fun addalgo(alg : algorythm)
{
    Column {
        Box(modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)){
            Column {
                Text("${alg.name}")
                Text("${alg.desc}")
                Text("Time to learn : ${alg.ttl} hours")
                Text("Category : ${alg.categ}")
            }
        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Learn")
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CalgorythmTheme {
        maintext()
    }
}

import 'package:flutter/material.dart';
import 'snack_bar.dart';

class HomeScreen extends StatelessWidget{
  
  const HomeScreen({super.key});

  @override
  Widget build(BuildContext context) {
    return DefaultTabController(
      length: 3, 
      child: Scaffold(
        appBar: AppBar(
          title: const Text("Travel Modes"),
      bottom: const TabBar(tabs: [
        Tab(
          text: "train",
          icon: Icon(Icons.directions_transit),
        ),
        Tab(
          text: "car",
          icon: Icon(Icons.directions_car),
        ),
        Tab(
          text: "bike",
          icon: Icon(Icons.directions_bike),
        )
      ]),
        ),
      body: const TabBarView(
        children: [
          Center(
            child: SnackBarDemo(),
          ),

          Center(
            child: SnackBarDemo()
          ),
          Center(
            child: SnackBarDemo(),
          )
        ])
      ));
  }
}

const textStyle = TextStyle(fontSize: 35);
import 'package:flutter/material.dart';
import 'home_screen.dart';

void main(){
  runApp(BarApp());
}

class BarApp extends StatelessWidget{
  
  const BarApp({super.key});
  
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Tab bar and snack bar app',
      theme: ThemeData(primarySwatch: Colors.blueGrey),
      home: const HomeScreen(),
    );
  }

}
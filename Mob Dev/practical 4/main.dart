import 'package:flutter/material.dart';

void main() {
  runApp(const MaterialApp(
    title: 'moving between pages',
    home: ScreenSwitchApp()));
}

class ScreenSwitchApp extends StatelessWidget{
  
  const ScreenSwitchApp({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Nav Demo'),
      ),
      body: Center(
        child:ElevatedButton(onPressed: () {
          Navigator.push(
            context, 
            MaterialPageRoute(
              builder: (context)=> const MySecondPage()
            ));
        }, 
            child: const Text('Go to next page')
      )
    ));
  }
  
}

class MySecondPage extends StatelessWidget{
  
  const MySecondPage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Second Page'),
      ),
      body: Center(
        child:ElevatedButton(onPressed: () {
          Navigator.pop(context);
        }, 
            child: const Text('Go to prev page')
      )
    ));
  }

}
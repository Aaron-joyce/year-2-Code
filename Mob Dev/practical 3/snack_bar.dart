import 'package:flutter/material.dart';

class SnackBarDemo extends StatelessWidget{

    const SnackBarDemo({super.key});

    @override
    Widget build(BuildContext context) {
        return Center(
            child: ElevatedButton(onPressed: (){
                    final snackbar = SnackBar(
                        content: const Text("Book a ride"),
                        action: SnackBarAction(
                            label: 'undo', onPressed: (){
                                print('undo was clicked');
                            }),);
                
                ScaffoldMessenger.of(context). showSnackBar(snackbar);
                }, 
                child: const Text('Book a ride')),
        );
    }
    
}
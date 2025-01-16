import 'package:curved_navigation_bar/curved_navigation_bar.dart';
import 'package:flutter/material.dart';

void main() {
  runApp(const MaterialApp(home: CurvedNavbar(),));
}

class  CurvedNavbar extends StatefulWidget{

  const CurvedNavbar({super.key});

  @override
  _CurvedNavbarState createState() => _CurvedNavbarState();

}

class _CurvedNavbarState extends State<CurvedNavbar>{
  int _page = 0;
  GlobalKey<CurvedNavigationBarState> _bottomNavigationKey = GlobalKey();

  @override
  Widget build(BuildContext context) {
    return(Scaffold(
      bottomNavigationBar: CurvedNavigationBar(
        key: _bottomNavigationKey,
        index: 0,
        items: const <Widget>[
          Icon(Icons.directions_run, size: 25,),
          Icon(Icons.directions_car, size: 25,),
          Icon(Icons.directions_bus, size: 25,),
          Icon(Icons.directions_train, size: 25,),
        ],
        color: Colors.white,
        buttonBackgroundColor: Colors.white,
        backgroundColor: Colors.blueAccent,
        animationCurve: Curves.easeInOut,
        animationDuration: const Duration(milliseconds: 200),
        onTap: (index){
          setState(() {
            _page = index;
          });
        },
        letIndexChange: (index) => true,
      ),
      body: Container(
        color: Colors.blueAccent,
        child:Center(
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: <Widget>[
              Text(_page.toString(), style:const TextStyle(fontSize: 60)),
            ],
          )
        ),
      ),
    ));
  } 
}

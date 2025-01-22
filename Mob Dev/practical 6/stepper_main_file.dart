import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        // This is the theme of your application.
        //
        // TRY THIS: Try running your application with "flutter run". You'll see
        // the application has a purple toolbar. Then, without quitting the app,
        // try changing the seedColor in the colorScheme below to Colors.green
        // and then invoke "hot reload" (save your changes or press the "hot
        // reload" button in a Flutter-supported IDE, or press "r" if you used
        // the command line to start the app).
        //
        // Notice that the counter didn't reset back to zero; the application
        // state is not lost during the reload. To reset the state, use hot
        // restart instead.
        //
        // This works for code too, not just values: Most code changes can be
        // tested with just a hot reload.
        colorScheme: ColorScheme.fromSeed(seedColor: Colors.deepPurple),
        useMaterial3: true,
      ),
      home: Scaffold(
        appBar: AppBar(
          title: const Text("Stpper Widget Example"),
        ),
        body: StepperWidget(),
      )
    );
  }
}

class StepperWidget extends StatefulWidget{
  
  @override
  State<StatefulWidget> createState() => _MyHomePageState();
}

class _MyHomePageState extends State<StepperWidget>{
  List<String> roles =["manager", "employee"];
  int _index=0;
  List<Widget> memberList = [];
  int membercount = 0;

  Widget projectDetailsTab(){
    return Container(
            alignment: Alignment.center,
            child: const Column(
              children:
              [
              SizedBox(
                width: 400,
                child: TextField(
                  decoration: InputDecoration(label: Text("Enter Project Name",)
                ),
              )),
              SizedBox(
                width: 400,
                child: TextField(
                  decoration: InputDecoration(label: Text("Enter Project description",)),
                ),
            ),
            ]),
          );
  }

  Widget timelineTab(){
    throw UnimplementedError;
  }

  Widget member = const Row(
    children: [
      SizedBox(
        width: 400,
        child: TextField(),
      ),
      DropdownMenu<String>(dropdownMenuEntries: roles)
    ],
  );


  @override 
  Widget build(BuildContext context) {
  
    return Stepper(
      currentStep: _index,
      onStepCancel: (){
        if(_index>0){
          setState(() {
            _index -= 1;
          });
        }
      },
      onStepContinue: (){
        if(_index<=0){
          setState(() {
          _index +=1;
          });
        }
      },
      onStepTapped: (int index){
        setState(() {
          _index = index;
        });
      },
      steps: <Step>[
        Step(
          title: const Text("Project Details"), 
          content: projectDetailsTab()),
        Step(
          title: const Text("Team Members"), 
          content: Row(
            children: [
              Column(
                children: memberList,
              ),
              FloatingActionButton(
                onPressed:() {
                  setState(() {
                  memberList.add(member);
                  });
                },
                child: const Icon(Icons.add))
            ],
          )
        ),
        const Step(
          title:  Text("Timeline"), 
          content:  Text("")
          // Start date

          // End Date

          ),
        const Step(
          title: Text("Budget"), 
          content:  Text("") 
            
            // Estimated Budget

          ),
        const Step(
          title: Text("Review and Submit"), 
          content: Text("")
            // Review of all data

            // submit buttion
            
          ),
      ],
    );
  }
}

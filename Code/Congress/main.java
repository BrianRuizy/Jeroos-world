     
     method main()
     {
     
     Jeroo Obama = new Jeroo(2,0,EAST);
     Jeroo Bush = new Jeroo(0,19,SOUTH);
     Jeroo Clinton = new Jeroo(23,4,NORTH);
     Jeroo Reagan = new Jeroo(21,23,WEST);   
     
     Obama.findDoor();  // blue
     Bush.findDoor();  // orange
     Clinton.findDoor();  // pink
     Reagan.findDoor();  // green
     
     Obama.findFlower();
     Bush.findFlower();
     Clinton.findFlower();
     Reagan.findFlower();
     
     Obama.turn(LEFT);
     Bush.turn(LEFT);
     Clinton.turn(LEFT);
     Reagan.turn(LEFT);
     
     Obama.findNet();
     Bush.findNet();
     Clinton.findNet();
     Reagan.findNet();
     
     }
     

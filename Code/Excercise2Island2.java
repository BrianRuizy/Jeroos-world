method main()
{
    Jeroo bob = new Jeroo();
  
  
    while(! bob.isWater(AHEAD)){
   
        if (bob.isFlower(HERE))
             bob.pick();
        
        if (bob.isNet(AHEAD))
             bob.toss();        
        
        bob.hop();
        
        if (bob.isWater(AHEAD))
             bob.turn(RIGHT);        
        
        //if (bob.isWater(AHEAD) && bob.isFacing(NORTH)){
          //   bob.stop();
            // loop = false; 
       // }   
        
   } // end of while     
}

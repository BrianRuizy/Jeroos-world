method main()
{
    Jeroo bob = new Jeroo();
  
   while(! bob.isWater(AHEAD)){
   
        if (bob.isFlower(HERE)){
             bob.pick();
        }
        
        if (bob.isNet(AHEAD)){
             bob.toss();        
        }
        
        bob.hop();
           
   } // end of while
         
}

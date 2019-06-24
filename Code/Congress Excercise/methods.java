  
     method findDoor() 
     {
       //-Follow the water on your 
       //right until to get to an
       // opening.
       while( isWater( RIGHT ) )
       {
         hop();
       }
     
       //-Turn _____.
       turn( RIGHT );
     }
    // ------------------------------------------------- 
     
     method findFlower()
     {
        while (! isFlower(HERE))
        {
             hop();
        }
     
        if (isFlower(HERE))
             pick();    
    } 
     // ------------------------------------------------- 
    
     method findNet()
     {
        while (! isNet(AHEAD))
        {
             hop();
        }
    } 
     // ------------------------------------------------- 


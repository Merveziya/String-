
import org.junit.Test; 
import static org.junit.Assert.assertEquals;

 // Create a class that name Testlogic
 public class TestLogic {  
  
   
    @Test
    
    // This test helps find out if they same prefix or not.
    public void testSamePrefix(){  
        // zero value test
        assertEquals(true,HW2.samePrefix("", "", 0));
        // one value test 
        assertEquals(true,HW2.samePrefix(" ", " ", 1));
        // test first
        assertEquals(false,HW2.samePrefix(" is this a test", "is this test", 15));
        assertEquals(true,HW2.samePrefix("  is this a test", "  is this a test", 15));
        // test middle
        assertEquals(false,HW2.samePrefix("is this   test", "is this test", 12)); 
        // test last
        assertEquals(false,HW2.samePrefix("is this test", "is this test  ", 13)); 
        // test last and middle
        assertEquals(true,HW2.samePrefix("is  this  test ", "is  this  test ", 13)); 
        // test many
        assertEquals(true,HW2.samePrefix("this is a test", "this is a trial", 11) );  
        assertEquals(false,HW2.samePrefix("this is a test", "this is a trial", 12));  
        assertEquals(true,HW2.samePrefix("this is a test", "this is a trial", 4) ); 
        assertEquals(false,HW2.samePrefix("this is a test", "this is a test", 100)); 
        
        
        
        
    }  
    
    
    
    @Test  
    
    // This test checks if leading spaces have been deleted
    public void testTrimSpaces(){  
        // zero value test
        assertEquals("",HW2.trimSpacesFromFront("")); 
        // one value test
        assertEquals("",HW2.trimSpacesFromFront("  ")); 
        // test first space
        assertEquals("How are you  ",HW2.trimSpacesFromFront("       How are you  "));
        // test first and middle space
        assertEquals("What are   you doing ??  ",HW2.trimSpacesFromFront("   What are   you doing ??  ")); 
        // test first and last space
        assertEquals("How are you   ???  ",HW2.trimSpacesFromFront(" How are you   ???  ")); 
        // test first and middle and last space
        assertEquals("How   are   you   ???   ",HW2.trimSpacesFromFront("  How   are   you   ???   "));
        // test many
        assertEquals("Go od day! ",HW2.trimSpacesFromFront("   Go od day! "));  
         
      
        
        
         
        
    }  
    
    
    
    @Test  
    
    // This test checks whether the character is repeated as many times as requested.
    public void testRepeatChars(){  
        // test zero char
        assertEquals("",HW2.repeatChars("", 9));
        // test one char
        assertEquals("aaaaaaa",HW2.repeatChars("a",7)); 
        assertEquals("     ",HW2.repeatChars(" ", 5));
        // test many characters
        assertEquals("NNiiccee  ttrryy  !!!!",HW2.repeatChars("Nice try !!", 2)); 
        assertEquals("NNiiccee  ttrryy  !!!!",HW2.repeatChars("Nice try !!", 2));  
        assertEquals("GGGooooooddd   dddaaayyy   !!!   ",HW2.repeatChars("Good day ! ", 3));  
        // test many spaces and characters
        assertEquals("HHHHiiii    tttthhhheeeerrrreeee    ????",HW2.repeatChars("Hi there ?", 4)); 
        assertEquals("          WWWWWhhhhhaaaaatttttsssss     uuuuuppppp?????",HW2.repeatChars("  Whats up?", 5));
        assertEquals("WWWWWhhhhhaaaaatttttsssss               uuuuuppppp?????",HW2.repeatChars("Whats   up?", 5)); 
        assertEquals("WWWWWhhhhhaaaaatttttsssssuuuuuppppp     ?????",HW2.repeatChars("Whatsup ?", 5));
        assertEquals("      HHHeeellllllooo      ttthhheeerrreee      !!!",HW2.repeatChars("  Hello  there  !", 3));
    }  
    
    
    
    @Test  
    
    // This test checks if the word count is correct.
    public void testCountWords(){  
        // test zero 
        assertEquals(0,HW2.countWords("")); 
        // test one
        assertEquals(1,HW2.countWords(" "));
        // test many
        assertEquals(10,HW2.countWords("One fish, two fish, red fish , blue fish !"));  
        assertEquals(5,HW2.countWords(" Hi hello ? ? ,!? "));  
        assertEquals(6,HW2.countWords("Actions speak louder than words !")); 
        assertEquals(5,HW2.countWords("X y z ! ?"));
        // test first character
        assertEquals(10,HW2.countWords("   hello, how  / are youu  .")); 
        // test last character
        assertEquals(16,HW2.countWords("X   xdfy  578z ! * *  * ?     ")); 
        // test middle character
        assertEquals(27,HW2.countWords("   3446   kdfnk f g          h  j k ... ð p h   ")); 
           
        
    }
    
    
    
    @Test  
    
    // This checks if the sequence character is written or not.
    public void testSubSequence(){  
        // test zero character
        assertEquals(true,HW2.subSequence("", ""));
        // test one character
        assertEquals(true,HW2.subSequence(" ", "  kj  1"));
        // test two character
        assertEquals(true,HW2.subSequence(" j", "  kj  1"));
        // test many character (first-middle-last character)
        assertEquals(true,HW2.subSequence("abc", "about chocolate"));  
        assertEquals(false,HW2.subSequence("abc", "acorn bud"));  
        assertEquals(true,HW2.subSequence("abc", "and hbzcd")); 
        assertEquals(false,HW2.subSequence("abc", "   acorn bud"));
        assertEquals(true,HW2.subSequence("abcdef", " ahborn  ckl budtejklf  uyj ")); 
        assertEquals(false,HW2.subSequence("adf", "acorn bfud")); 
       
    }  
    
}  
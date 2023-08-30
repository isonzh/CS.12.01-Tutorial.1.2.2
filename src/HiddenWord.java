public class HiddenWord {
    public String HiddenWord;
    public HiddenWord(String s){
        HiddenWord=s;
        this.HiddenWord = HiddenWord.toUpperCase();
    }
    public String getHiddenWord() {
        return HiddenWord;
    }
    public String getHint(String guess) {
        String hint = "";
        for(int i = 0; i<guess.length();i++){
            if(Character.isLowerCase(guess.charAt(i))){
                throw new IllegalArgumentException("Your guess ( " +guess+ " ) does not contain all uppercase letters. Your guess must contain all uppercase letters!");
            }
            if(guess.length()>HiddenWord.length() || guess.length()<HiddenWord.length()){
                throw new IllegalArgumentException("Your guess ( "+ guess +" ) has "+guess.length()+ " characters. The hidden word has 9 characters. Your guess must be a word with 9 characters!");
            }

        }
        for (int i = 0; i < HiddenWord.length(); i++) {
            String letter =""+ guess.charAt(i);
            if (HiddenWord.charAt(i) == guess.charAt(i)) {
                hint=hint+HiddenWord.charAt(i);
            }
            else if(HiddenWord.contains(letter)) {
                hint=hint+"+";
            }

            else {
                hint=hint+"*";}
        }
        return hint;
            }

        }





# Rapport

I denna uppgift skulle vi skapa två activities. I den första skulle det finnas en textview och en knapp som skulle starta den andra activityn.
I den andra activityn skulle det finnas ett input field och en knapp för att spara det man skrivit in. Det man skrivit in i den andra actvityn skulle sen visas upp i den första när man gick tillbaka ett steg.
För att lösa det användes shared preferences. I main activity lästes texten in i texviewen på varje onresume. Det innebar att varje gång aktiviteten sattes på paus (antingen för att en annan aktivitet var aktiv eller för att användaren bytt app) skulle texten uppdateras.

```
protected void onResume() {
    super.onResume();
    
    // read data from shared preferences and update text
    prefs = getSharedPreferences("preferences", MODE_PRIVATE);
    String name = prefs.getString("name", "No name found.");
    
    viewName.setText(name);
}
```
Figur 1     Koden som hämtar namnet från shared preferences.

För att förändra den texten behövde alltså den andra aktiviteten öppnas med hjälp av knappen. I den andra aktiviteten fick användaren sen fylla i edittext-en. 
Detta sparades sen till shared preferences när användaren klickade på knappen.

```
saveButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        edit.putString("name", nameInput.getText().toString());
        edit.apply();
    }
});
```
Figur 2     Koden för att spara (uppdatera) namnet i shared preferences.

![](screenshot_activity2.png)
Figur 3     Bild på main activity, där användaren får se sitt namn och får alternativet att byta.

![](screenshot_activity1.png)
Figur 4     Bild på second activity, där användaren kan byta och spara sitt uppdaterade namn. 


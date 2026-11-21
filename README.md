# Last Zone

A 3D battle royale for Android. You and 24 AI soldiers drop onto an island. Loot weapons, armor and medkits, stay inside the shrinking storm, and be the last one standing.

## Install on your phone

Open this link on your phone: **https://github.com/asjathahamadd-ship-it/lastzone/releases/latest/download/LastZone.apk**
Then open the file, allow "Install unknown apps" if asked, and tap Install.

## How to play

- **Left thumb:** move. Push far to sprint.
- **Right side of the screen:** look around.
- **FIRE:** hold to shoot, and drag while holding to aim.
- **AIM:** zoom in. The sniper gets a scope.
- **R** reload · **SWAP** weapon · **PICK** swap for the gun on the floor · **HEAL** use a bandage or medkit.
- Ammo and medkits are picked up automatically when you walk over them.

Weapons: Pistol, SMG, Shotgun, Rifle, Sniper. Headshots do double damage.
Low walls and crates block bullets but you can see over them. Crates can be shot open for loot.

## Project layout

- `app/src/main/assets/game/index.html`: the whole game (three.js)
- `app/src/main/java/.../MainActivity.kt`: full-screen landscape app shell
- `.github/workflows/build.yml`: builds the APK and publishes a release on every change

## Credits

Soldier character and animations: the "Soldier" model from the three.js examples (a Mixamo character).

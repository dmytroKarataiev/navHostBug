# navHostBug
An example of a bug when using androidx.fragment.app.FragmentContainerView as a navHost instead of a regular fragment

## SO Question
https://stackoverflow.com/questions/58737769/androidx-fragment-app-fragmentcontainerview-vs-fragment-as-a-view-for-a-navh

## Steps to reprioduce a bug:
1. Install the app.
2. Click FRAGMENTCONTAINERVIEW NAVIGATION button.
3. Click NEXT FRAGMENT.
4. Back.
5. Rotate the phone.
6. Click NEXT FRAGMENT and the app would crash.

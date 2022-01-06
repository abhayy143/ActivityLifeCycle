# ActivityLifeCycle

A project made using Java to demonstrate the Activity lifecycle in an Android Application

An activity in Android is basically every screen in which users can interact with and perform actions. Most of the time, an app will contain multiple screens (activities) that users can use to navigate an app as they listen to music, play games, watch videos, check out pics, etc.

Each stage is responsible for a certain task. When you open an app or click on a button that takes you to another screen, then onCreate() will be the first activity cycle that gets executed. It is followed by onStart() and onResume(). And voila! We can see the interface of the app we’re creating.
When another activity is called, onPause() and onStop() will be also called on the first activity.
The onDestroy() removes the app altogether. It is invoked when

1.You call finish() on the current activity<br/> 
2.Your phone is short in resources (e.g., battery, memory).

***onCreate(Bundle)***<br/>
This method is the first to be called when an activity is first created. This is the place where we can create and setup views and accumulate the app's state.
 

If onCreate() includes a bundle, we can restore the app's state from the data in the bundle.

***onStart()***<br/>
This is called immediately after onCreate(Bundle). It will make the app visible to the user.
 

onStart() can be called as often as needed during an activity lifecycle

***onResume()***<br/>
This is the stage where your users can finally interact with your application.
 

Yay! Our activity finally running.

***onPause()***<br/>
This is called when another activity comes into the foreground.
 

Our other activity may still be visible in the background, however we won’t be able to interact with it. An example could be when we open a dialog.

***onStop()***<br/>
When this gets executed you won't be able to see your activity or interact with it.
 

It’s important to note if an activity is completely obscured by another activity, it is stopped. It still retains all state and member information. But it is no longer visible to the user so its window is hidden.

***onDestroy()***<br/>
This is called where we reach the final stage of an activity. There's no going back.
 

At this point the system is free to garbage collect the activity data to free up space.
![activity lifecycle](https://user-images.githubusercontent.com/53009878/134226573-b2cfdd3b-d375-43eb-9103-e950ad200c09.jpg)


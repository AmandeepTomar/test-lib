# test-lib
I have create this library for testing or publishing the library. Its just a simple show toast message in different way like for success toast we use green color or for error we used red color.

This is just for the example of creating a library. 



# You jut need to add the library in your project 

# Step 1 : Add in build.gradle in project level 
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
 # Step 2 : Add in build.gradle in app level 
dependencies {
	        implementation 'com.github.AmandeepTomar:test-lib:1.0-alpha1.0'
	}
  
# Step 3 : now you just need to write the class name and method like 
  ToastMessage.showSuccessToast(view.context,"Show Message simple in the toast live ")

  
  

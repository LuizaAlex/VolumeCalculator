# 3D Shape Volume Calculator

This is an Android application that allows users to calculate the volume of various 3D shapes. The application displays four different shapes in a grid view, and when a user clicks on a shape, they are taken to a new activity where they can input dimensions and calculate the volume of the selected shape.



## Features

- Displays a grid of 3D shapes: Sphere, Cylinder, Cube, and Prism.
- Navigates to respective activity for volume calculation upon clicking a shape.
- User can input dimensions required for volume calculation.
- Calculates and displays the volume of the selected shape.

## Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/yourusername/3d-shape-volume-calculator.git
    ```
2. Open the project in Android Studio.
3. Build and run the application on an Android device or emulator.

## Usage

1. Launch the application.
2. Click on one of the 3D shape images.
3. Enter the required dimensions.
4. Click the calculate button to get the volume of the shape.

## Code Structure

- `MainActivity.java`: Contains the main activity displaying the grid of shapes.
- `MyCustomAdapter.java`: Custom adapter for populating the grid view with shape images and names.
- `Shape.java`: Model class representing a shape with an image and a name.
- `Sphere.java`, `Cylinder.java`, `Cube.java`, `Prism.java`: Activities for calculating the volume of the respective shapes.
- `res/layout/activity_main.xml`: Layout file for the main activity.
- `res/layout/activity_sphere.xml`, `activity_cylinder.xml`, `activity_cube.xml`, `activity_prism.xml`: Layout files for the shape activities.
- `res/drawable/`: Contains the images for the shapes.




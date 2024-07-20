import turtle

# Set up the screen
screen = turtle.Screen()
screen.setup(width=600, height=600)

# Set up the turtle
t = turtle.Turtle()
t.speed(1)

# Define function to draw a letter
def draw_letter(x, y, size, letter):
    t.penup()
    t.goto(x, y)
    t.pendown()
    t.write(letter, font=("Arial", size, "normal"))

# Draw the name "PKNL"
draw_letter(-200, 0, 50, "P")
draw_letter(-150, 0, 50, "K")
draw_letter(-100, 0, 50, "N")
draw_letter(-50, 0, 50, "L")

# Hide the turtle
t.hideturtle()

# Keep the window open
screen.mainloop()

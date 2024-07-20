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

# Draw the name "Likhitha"
draw_letter(-250, 0, 50, "L")
draw_letter(-200, 0, 50, "i")
draw_letter(-150, 0, 50, "k")
draw_letter(-100, 0, 50, "h")
draw_letter(-50, 0, 50, "i")
draw_letter(0, 0, 50, "t")
draw_letter(50, 0, 50, "h")
draw_letter(100, 0, 50, "a")

# Hide the turtle
t.hideturtle()

# Keep the window open
screen.mainloop()

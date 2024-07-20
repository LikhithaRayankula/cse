import turtle
screen=turtle.Screen()
screen.setup(width=600,heigth=600)
t=turtle.Turtle()
t.speed(1)
side_length=100
t.penup()
t.setpos(-side_length/2,side_length/2)
t.pendown()
for _ in range(4):
    t.forward(side_length)
    t.right(90)
turtle.done()

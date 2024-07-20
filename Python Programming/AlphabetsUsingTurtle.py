import turtle
turtle.setup(800,600)
window = turtle.Screen()

window.title('Drawing Alphabets')
the_turtle=turtle.getturtle()
the_turtle.hideturtle()

#A
the_turtle.penup()
the_turtle.setposition(-100,0)
the_turtle.pendown()
the_turtle.setposition(0,250)
the_turtle.setposition(100,0)
the_turtle.penup()
the_turtle.setposition(-64,90)
the_turtle.pendown()
the_turtle.setposition(64,90)

#B
the_turtle.penup()
the_turtle.setpos(-200,-200)
the_turtle.pendown()
the_turtle.circle(80,180)
the_turtle.left(90)
the_turtle.forward(145*2)
the_turtle.left(90)
the_turtle.circle(80,180)


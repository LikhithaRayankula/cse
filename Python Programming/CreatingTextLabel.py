import tkinter as tk
root=tk.Tk()
root.title("Text Label Example")
label_text="Hello,World!"
text_label=tk.Label(root,text=label_text,font=('Arial',16))
text_label.pack(pady=20)
root.mainloop()

from kivy.app import App 
from kivy.uix.lable import Lable

class Demo(App):
    def build(self):
        return Lable( text = "prakash")
demo = Demo()
demo.run()
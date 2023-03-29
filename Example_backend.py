import kivy
kivy.require('1.11.1')

from kivy.app import App
from kivy.uix.boxlayout import BoxLayout
from kivy.uix.label import Label
from kivy.clock import Clock
from plyer import notification


class VerticalSliderApp(App):
    def build(self):
        layout = BoxLayout(orientation='vertical')

        # add labels for the dashboard items and their values
        layout.add_widget(Label(text='Item 1'))
        layout.add_widget(Label(text='100'))
        layout.add_widget(Label(text='Item 2'))
        layout.add_widget(Label(text='200'))
        layout.add_widget(Label(text='Item 3'))
        layout.add_widget(Label(text='300'))

        # schedule the vertical sliding animation every 5 seconds
        Clock.schedule_interval(self.slide_labels, 5)

        return layout

    def slide_labels(self, dt):
        # get the current labels and remove the topmost one
        layout = self.root
        labels = layout.children
        top_label = labels[0]
        layout.remove_widget(top_label)

        # add the topmost label to the bottom of the layout
        layout.add_widget(top_label)

        # show a push notification with the label text
        notification.notify(
            title='Vertical Slider App',
            message=top_label.text
        )


if __name__ == '__main__':
    VerticalSliderApp().run()
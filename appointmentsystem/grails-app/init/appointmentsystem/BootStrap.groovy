package com.thandley

class BootStrap {

    def init = { servletContext ->

def Tom = new Doctor (

doctorName: 'Tom Handley',
qualifications: 'PHD',
position: 'GP',
doctorEmail: 'thomas.handley@hotmail.com',
password: 'yeet',
doctorOffice: '9151',
doctorPhone: '07530599239',
bio: 'yeet'
).save()
    }
    def destroy = {
    }
}

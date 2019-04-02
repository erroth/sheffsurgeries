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

def Ben = new Doctor (

doctorName: 'Ben Kata',
qualifications: 'PHD',
position: 'GP',
doctorEmail: 'benben3@hotmail.com',
password: 'abc123',
doctorOffice: '9152',
doctorPhone: '07530599238',
bio: 'Doctor who likes helping people'
).save()

def Appointment1 = new Appointment (

appDate: new Date('03/03/2019'),
appTime: '2:30pm',
appDuration: '30 Minutes',
roomNumber: '9151'
).save()

def Appointment2 = new Appointment (

appDate: new Date('28/03/2019'),
appTime: '3:30pm',
appDuration: '30 Minutes',
roomNumber: '9152'
).save()

def Karen = new Nurse (

nurseName: 'Karen',
qualifications: 'BAHons',
nurseEmail: 'karen123@gmail.com',
nurseOffice: '9140',
nursePhone: '07445978512'
).save()

def Janet = new Nurse (

nurseName: 'Janet',
qualifications: 'BAHons',
nurseEmail: 'janet123@gmail.com',
nurseOffice: '9141',
nursePhone: '07642579854'
).save()

def Leah = new Patient (

patientName: 'Leah Hale',
patientAddress: '3 Forest Ridge',
patientResidence: 'Room 2',
patientDob: new Date('10/09/1998'),
patientID: '78LH87',
dateRegistered: new Date('27/02/2019'),
patientPhone: '07585898656'
).save()

def Gemma = new Patient (

patientName: 'Gemma Buckland',
patientAddress: '3 Forest Ridge',
patientResidence: 'Room 3',
patientDob: new Date('25/11/1998'),
patientID: '78GB87',
dateRegistered: new Date('27/02/2019'),
patientPhone: '07587898656'
).save()

def East = new Surgery (

name: 'East Ardsley Surgery',
address: '27 Main Street, East Ardsley',
postcode: 'WF3 2SD',
telephone: '01924963392',
numberOfPatients: 40,
description: 'Wagwarn',
openingTime: '8:00-18:00hrs'
).save()

def City = new Surgery (

name: 'City Health Centre',
address: '21 Marble Street, Sheffield',
postcode: 'S11 5TY',
telephone: '0114555555',
numberOfPatients: 50,
description: 'use placeholder text',
openingTime: '9:00-17:00hrs'
).save()

def Rob = new Receptionist (

recepName: 'Rob Kingston',
recepEmail: 'r.kingston@email.com',
recepUsername: 'rking',
recepPassword: 'secret2019',
recepPhone: '0114 555 555'
).save()

def Alice = new Receptionist (

recepName: 'Alice Sunderland',
recepEmail: 'a.sunderland@email.com',
recepUsername: 'asund',
recepPassword: 'secret2018',
recepPhone: '01924 963 392'
).save()

def Prescription1 = new Prescription (

pharmacyName: 'City Centre Pharmacy',
prescriptionNumber: '56788',
medicine: 'paracetamol',
totalCost: '£5.90',
dateIssued: new Date ('25/05/2019'),
patientPaying: 'Yes'
).save()

def Prescription2 = new Prescription (

pharmacyName: 'City Centre Pharmacy',
prescriptionNumber: '56789',
medicine: 'Dank',
totalCost: '£4.20',
dateIssued: new Date ('20/04/2019'),
patientPaying: 'Yes'
).save()

    }
    def destroy = {
    }
}

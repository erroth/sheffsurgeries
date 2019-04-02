package com.thandley

class BootStrap {

    def init = { servletContext ->

def Tom = new Doctor (

doctorName: 'Dr Tom Handley',
qualifications: 'PHD',
position: 'GP',
doctorEmail: 'thomas.handley@hotmail.com',
password: 'yeet',
doctorOffice: '9151',
doctorPhone: '07530599239',
bio: 'yeet'
).save()

def Sarah = new Doctor (

doctorName: 'Dr Sarah Macdonald',
qualifications: 'MBChB(Sheffield)',
position: 'GP, Surgeon',
doctorEmail: 's.macdonald@myemail.com',
password: 'secret222',
doctorOffice: 'D-9888',
doctorPhone: '01111777',
bio: 'Placehold text'
).save()

def Appointment1 = new Appointment (

appDate: new Date('03/03/2019'),
appTime: '2:30pm',
appDuration: '30 Minutes',
roomNumber: '9151'
).save()

def Appointment2 = new Appointment (

appDate: new Date('11/04/2019'),
appTime: '3:00pm',
appDuration: '30 Minutes',
roomNumber: 'D-9888'
).save()

def Susan = new Nurse (

nurseName: 'Susan Peters',
qualifications: 'Registered General Nurse',
nurseEmail: 's.peters@myemail.com',
nurseOffice: 'B-455',
nursePhone: '0114 222 4433'
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

def Tom2 = new Patient (

patientName: 'Tom Rivers',
patientAddress: '2 One Way Street, Eckington',
patientResidence: 'Sheffield, Barnsley, Doncaster',
patientDob: new Date('20/09/1988'),
patientID: 'E25555',
dateRegistered: new Date('26/02/2018'),
patientPhone: '0114 222 4444'
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

########################
## John's Text Bomber ##
########################
import time
import smtplib

#CONFIG. You can change any of the values on the right.
email_provider = 'smtp.gmail.com' #server for your email- see ReadMe on github
email_address = "YourEmail@gmail.com" #your email
email_port = 587 #port for email server- see ReadMe on github
password = "password123" #your email password
msg = "Your message that you want sent to target" #your txt message
text_amount = 20 #amount sent
target_email = "5551234567@mms.att.net" #target number. must be in email form- see ReadMe on github
wait = 1 #seconds in between messages

i = 0 #dont change
server = smtplib.SMTP(email_provider, email_port)
server.starttls()
server.login(email_address, password)
def sendEmail():
    server.sendmail(email_address,target_email,msg)
while i < text_amount:
    sendEmail()
    i = i + 1
    print(str(i) + " texts sent")
    time.sleep(wait)
print(str(i) + " texts were sent. Hope you had a good time ;)")
server.quit()

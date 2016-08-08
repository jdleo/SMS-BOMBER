########################
##                    ##
## John's Text Bomber ##
##   github @jdleo    ##
########################

## FOR ATT ONLY.
## If the recepient has another carrier,
## look for the carrier's email domain online
## and swap it for mms.att.net on line 28

##importing time framework for intervals and smtplib for sending emails
import time
import smtplib

##counter variable for loop
i=0

##declaring server variable , starting email service, and logging in
## be sure to change out gmail and password in server.login
server = smtplib.SMTP('smtp.gmail.com', 587)
server.starttls()
server.login("USERNAME@GMAIL.COM", "PASSWORD")

msg = "ENTER YOUR MESSAGE IN THESE QUOTES"

##send email function
def sendEmail():
    server.sendmail("YOUR EMAIL", "<THEIR NUMBER>@mms.att.net", msg)

##loop. change the "20" to any number you want. this is # of texts sent
while i < 20:
    sendEmail()
    i = i+1
    print("Text #" + str(i) + " sent!")
    ## 2 seconds between each text. delete line below if you want them rapid
    time.sleep(2)

print(str(i) + " texts were sent! Hope you had fun!")
server.quit()

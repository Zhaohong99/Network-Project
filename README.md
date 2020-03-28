# Network-Project

The ticket lifecycle typically starts with the smart card manufacturer printing a logo on the smart card, formatting the smart card memory with the necessary data structures, and setting the authentication keys. The card is then shipped to the ticket issuer, which sells tickets to users. The ticket issuer at the sales point sets the expiry date, number or rides, or other data related to individual tickets. The ticket is then validated one or more times by a reader device. However, in this exercise, you design a smart card ticket application for a small operator that uses cheap blank smartcards as the ticket medium, formats them when the first tickets are issued, and uses NFC-enabled mobile phones or similar Android devices for the ticket validation.
When a ticket is validated (i.e. used), it is authenticated with a cryptographic challenge-response protocol, its validity is checked, and the rides count is incremented or decremented, depending on your design. After the validity period is over or the maximum number of uses has been reached, it should no longer be possible to use the ticket. The exact functionality depends on the customer, and there may be more than one correct way to design the ticket system.
Here
When a ticket is validated (i.e. used), it is authenticated with a cryptographic challenge-response protocol, its validity is checked, and the rides count is incremented or decremented, depending on your design. After the validity period is over or the maximum number of uses has been reached, it should no longer be possible to use the ticket. The exact functionality depends on the customer, and there may be more than one correct way to design the ticket system.
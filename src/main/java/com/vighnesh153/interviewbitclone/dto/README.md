## DTO
DTO stands for data transfer object.

Let us say we have an endpoint that returns a user from the 
given ID. 

What I have done in past for a similar requirement is that
I return the user if found, else I return an error message.

There is a better way to do this. Instead of optionally 
passing user object or error object, why not pass both.

So, the response will look like:
```json
{
  "user": {
    "name": "some name", 
    "age": "some age"
  },
  "error": {
    "error-object": "error object"
  }
}
```

If the user is found, set `error` to null and 
vice versa.

Response DTO should have more than this. Check 
the sample DTO object in the same directory.

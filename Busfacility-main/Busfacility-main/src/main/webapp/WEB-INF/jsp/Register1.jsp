<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html lang="en" dir="ltr">
  <head>
    <meta charset="UTF-8">
    
    <style>
      @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@200;300;400;500;600;700&display=swap');
*{
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  font-family: 'Poppins',sans-serif;
}
body{
  /* height: 100vh; */
  display: flex;
  justify-content: center;
  align-items: center;
  padding: 20px;
  background: linear-gradient(rgba(0, 0, 0, 0.4), rgba(0, 0, 0, 0.4)), url("https://picjumbo.com/wp-content/uploads/morning-bus-ride-to-the-work-1570x1048.jpg");
}
.container{
  max-width: 700px;
  width: 100%;
  background: linear-gradient(rgba(112, 111, 111, 0.651), rgba(114, 114, 114, 0.651));
  padding: 25px 30px;
  border-radius: 5px;
  box-shadow: 0 5px 10px rgba(0,0,0,0.15);
}
.container .title{
  font-size: 25px;
  font-weight: 600;
  position: relative;
  color: White;
}

.container .secquest{
  font-size: 20px;
  font-weight: 500;
  padding-top: 15px;
  padding-bottom: 15px;
  color: #fff;
}

.container .title::before{
  content: "";
  position: absolute;
  left: 0;
  bottom: 0;
  height: 3px;
  width: 30px;
  border-radius: 5px;
  background: #ff851b;;
}
.content form .user-details{
  display: flex;
  flex-wrap: wrap;
  justify-content: space-between;
  margin: 20px 0 12px 0;
}

form .user-details .input-box{
  margin-bottom: 15px;
  width: calc(100% / 2 - 20px);
}
form .input-box span.details{
  display: block;
  font-weight: 600;
  margin-bottom: 5px;
  color: white;
}
.user-details .input-box input{
  height: 45px;
  width: 100%;
  outline: none;
  font-size: 15px;
  border-radius: 5px;
  padding-left: 14px;
  border: 1px solid #ccc;
  border-bottom-width: 2px;
  background-color: rgba(255, 255, 255, 0.925);
  transition: all 0.3s ease;
}

.secquest1 .input-box input{
  height: 40px;
  width: 48%;
  /* color:#757575; */
  color: black;
  outline: none;
  font-size: 14px;
  border-radius: 5px;
  padding-left: 15px;
  border: 1px solid #ccc;
  background-color: rgba(255, 255, 255, 0.925);
  border-bottom-width: 2px;
  transition: all 0.3s ease;
}

.secquest1 .input-box .details{
  padding-top: 10px;
  padding-bottom: 10px;
}

#dob{
  /* color:#757575; */
  color: black;
}

#role{
  height: 45px;
  width: 100%;
  /* color:#757575; */
  color: black;
  outline: none;
  font-size: 15px;
  border-radius: 5px;
  padding-left: 15px;
  border: 1px solid #ccc;
  background-color: rgba(255, 255, 255, 0.925);
  border-bottom-width: 2px;
  transition: all 0.3s ease;
}

::placeholder{
  color: black;
  
}

#department{
  height: 45px;
  width: 100%;
  /* color:#757575; */
  color: black;
  outline: none;
  font-size: 15px;
  border-radius: 5px;
  padding-left: 15px;
  border: 1px solid #ccc;
  background-color: rgba(255, 255, 255, 0.925);
  border-bottom-width: 2px;
  transition: all 0.3s ease;
}

#address{
  height: 45px;
  width: 100%;
  outline: none;
  font-size: 15px;
  border-radius: 5px;
  padding-top: 9px;
  padding-left: 15px;
  border: 1px solid #ccc;
  background-color: rgba(255, 255, 255, 0.925);
  border-bottom-width: 2px;
  transition: all 0.3s ease;
}

.user-details .input-box input:focus,
.user-details .input-box input:valid{
  border-color: #ff851b;
}
 form .gender-details .gender-title{
  font-size: 20px;
  font-weight: 500;
 }
 form .category{
   display: flex;
   width: 80%;
   margin: 14px 0 ;
   justify-content: space-between;
 }
 form .category label{
   display: flex;
   align-items: center;
   cursor: pointer;
 }
 form .category label .dot{
  height: 18px;
  width: 18px;
  border-radius: 50%;
  margin-right: 10px;
  background: #d9d9d9;
  border: 5px solid transparent;
  transition: all 0.3s ease;
}
 
 form input[type="radio"]{
   display: none;
 }
 form .button{
   height: 45px;
   margin: 35px 0
 }
 form .button input{
   height: 100%;
   width: 100%;
   border-radius: 5px;
   border: none;
   color: #fff;
   font-size: 18px;
   font-weight: 500;
   letter-spacing: 1px;
   cursor: pointer;
   transition: all 0.3s ease;
   background: #ff851b;
 }
 form .button input:hover{
  
  color: black;
  } 
 @media(max-width: 584px){
 .container{
  max-width: 100%;
}
form .user-details .input-box{
    margin-bottom: 15px;
    width: 100%;
  }
  form .category{
    width: 100%;
  }
  .content form .user-details{
    max-height: 300px;
    overflow-y: scroll;
  }
  .user-details::-webkit-scrollbar{
    width: 5px;
  }
  }
  @media(max-width: 459px){
  .container .content .category{
    flex-direction: column;
  }
}

    </style>
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
   </head>
<body>
  <div class="container">
    <div class="title">Registration</div>
    <div class="content">
      
      <form id="Register" method="post">
        <div class="user-details">
          <div class="input-box">
            <span class="details">User ID</span>
            <input type="number" name="id" id="id" placeholder="Enter Student/Faculty ID" required>
          </div>
          <div class="input-box">
            <span class="details">Name</span>
            <input type="text" name="name" id="name" placeholder="Enter Student/Faculty Name" required>
          </div>
          <div class="input-box">
            <span class="details">DOB</span>
            <input type="Date" id="dob" name="dob" required>
          </div>

          <div class="input-box">
            <span class="details">Department</span>
            <select name="department" name="department" id="department" required>
              <option value=" ">Select Department</option>
              <option value="CSE">CSE</option>
              <option value="Mech">MECH</option>
              <option value="EEE">EEE</option>
              <option value="ECE">ECE</option>
              <option value="IT">IT</option>
          </select>
          </div>

          <div class="input-box">
            <span class="details">Phone Number</span>
            <input type="text" placeholder="Enter your Phone number"  name="phonenum" id="phonenum" required>
          </div>

          <div class="input-box">
            <span class="details">Password</span>
            <input type="password" placeholder="Enter your password" id="password" name="password"required>
          </div>

          <div class="input-box">
            <span class="details">User Role</span>
            <select id="role" name="role"" name="role">
              <option value="">Select Role</option>
              <option value="Student">Student</option>
              <option value="Faculty">Faculty</option>
            </select>
          </div>

          <div class="input-box">
            <span class="details">Address</span>
            <textarea name="address" id="address" placeholder="Enter Student/faculty Address" required></textarea>
          </div>
  

        </div>

        <hr>

        <div class="secquest">Security Questions :</div>
        <div class="secquest1">
          <div class="input-box">
            <span class="details">What is your favourite color?</span>
            <input type="text"  id="qtn1" name="qtn1"  placeholder="Enter Security Answer 1" required>
          </div>

          <div class="input-box">
            <span class="details">What is your favourite food?</span>
            <input type="text" id="qtn2" name="qtn2" placeholder="Enter Security Answer 2" required>
          </div>

          <div class="input-box">
            <span class="details">What is your favourite pet?</span>
            <input type="text" id="qtn3" name="qtn3"   placeholder="Enter Security Answer 3" required>
          </div>

        </div>
        
        
        <div class="button">
          <input type="submit" value="Register" name="submit" id="submit">
        </div>

        <h color="#ff851b">${msg}</h><br>
        <h color="#ff851b">${res}</h>



      </form>
    </div>
  </div>

</body>
</html>

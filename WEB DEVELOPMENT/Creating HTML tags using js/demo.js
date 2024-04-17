function creating_html_tags() {

    //useful for doing CHAT APPLICATION

    content = document.getElementById("input1").value; //taking input and put it in 'content'
    para_element = document.createElement("p"); // it creates 'p' element

    our_data = document.createTextNode(content);  //passing content to the DOM using 'text node'
    para_element.appendChild(our_data);  //adding content to our paragraph

    my_div = document.getElementById("div1")
    my_div.appendChild(para_element) //adding para element inside div

}
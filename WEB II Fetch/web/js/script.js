//function submitData(){
//    fetch("FetchController")
//                .then(res=>res.json())
//                .then(data=>console.log(data))
//                .catch(error=>console.log(error));
//    
//}

async function submitData() {
    const data = {
        name: "Sahan",
        email: "sahan@gmail.com"
    };
    const response = await fetch("FetchController", {
        method: "POST", headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(data)
    });
    if (response.ok) {
        let text = await response.text();
        console.log(text);
    } else {
        throw new error("this is custom error");
    }

}
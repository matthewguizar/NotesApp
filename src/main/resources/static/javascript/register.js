const registerForm = document.getElementById('register-form');
const registerUsername = document.getElementById('register-username');
const registerPassword = document.getElementById("register-password");

const baseUrl = `http://localhost:8080/api/v1/users/`

const headers = {
    "Content-Type" : "application/json"
};

const handleRegister = async (e) => {
    e.preventDefault();
    let bodyObj = {
        username: registerUsername.value,
        password: registerPassword.value
    };
    const response = await fetch(`http://localhost:8080/api/v1/users/register/`, {
        method: "POST",
        body: JSON.stringify(bodyObj),
        headers: headers
    })
        .catch(err => console.error(err.message));

    const responseArr = await response.json();

    if (response.status === 200){
        window.location.replace(responseArr[0]);
    };

};

registerForm.addEventListener("submit", handleRegister);

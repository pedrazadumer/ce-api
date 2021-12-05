export function callApi(data){
    var statusCode = 0;
    const baseUrl = process.env.REACT_APP_CE_API_URL || 'http://localhost:5000';
    const url = baseUrl + "/loan-recovery/predict";
    const params = {
        method: "POST",
        body: JSON.stringify(data),
        headers: {
            "Access-Control-Allow-Origin": "*",
            "Access-Control-Allow-Headers": "X-Requested-With",
            "Content-type": "application/json"
        }
    };
    return fetch(url, params)
        .then(response => {
            statusCode = response.status;
            return response.json();
        })
        .then(result => {
            result.status = statusCode;
            return result;
        })
        .catch(err => {
            console.error(err);
        });
}

export function callBorrowersApi(typeId, numId){
    var statusCode = 0;
    const baseUrl = process.env.REACT_APP_BORROWERS_API_URL || 'http://localhost:8080';
    const url = baseUrl + `/borrowers-api/borrowers?tipoId=${typeId}&identificacion=${numId}`;
    const params = {
        method: "GET",
        headers: {
            "Access-Control-Allow-Origin": "*",
            "Access-Control-Allow-Headers": "X-Requested-With",
            "Content-type": "application/json"
        }
    };
    return fetch(url, params)
        .then(response => {
            statusCode = response.status;
            return response.json();
        })
        .then(result => {
            result.status = statusCode;
            return result;
        })
        .catch(err => {
            console.error(err);
        });
}
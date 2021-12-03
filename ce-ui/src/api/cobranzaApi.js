export function callApi(data){
    var statusCode = 0;
    const url = process.env.REACT_APP_CE_API_URL + "/loan-recovery/predict";
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
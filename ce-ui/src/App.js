import React, { useState, useEffect } from 'react';
import { Layout, Form, Row, Col, Input, Button } from 'antd';
import './App.css';
import { inputData, labelResponse } from './data';
import { callApi } from './api/cobranzaApi';

function App() {

  const user = 123456;
  const { Header, Footer, Content } = Layout;

  const [inputs, setInputs] = useState([]);
  const [result, setResult] = useState({});
  const [loader, setLoader] = useState(false);

  useEffect(() => {
    return;
  },[inputs]);

  const changeForm = e => {
    const id = e.target.id;
    const inputDataCopy = Object.assign([], inputData);
    inputDataCopy.map((input) => {
      if(id === input.id){
        input.value = e.target.value;
      }
    });
    setInputs(inputDataCopy);
  }

  const buildRequest = (data) =>{
    const requestData = {};
    requestData.agentId = user;
    const arrayData = [];
    data.map((value) => {
      arrayData.push(value.value);
    });
    requestData.data = arrayData;
    return requestData;
  }

  const sendData = async e => {
    e.preventDefault();
    if(inputs.length > 0){
      setLoader(true);
      const apiResult = await callApi(buildRequest(inputs));
      setResult(apiResult);
    }
    setLoader(false);
  }

  const cleanForm = () => {
    setResult({});
    setInputs(inputData);
  }

  return (
    <div>
      <Layout>
        <Header> <p className="user-text"><strong>Usuario:</strong> {user}</p> </Header>
        <Content>
          <Row className="container">
            <Col span={4} />
            { result.status !== 200? 
              <Col span={16}>
                <Form className="ant-advanced-search-form" onChange={changeForm} onSubmit={sendData}>
                  <Row gutter={44}>
                    <RenderFields />
                  </Row>
                  <Row>
                    <Button htmlType="submit" loading={loader}>Enviar</Button>
                  </Row>
                  {
                    result.status ? 
                    <Row className="container error">
                      <span>{result.message}</span>
                    </Row>
                    :
                    null
                  }
                  
                </Form>
              </Col>
              : 
              <Col span={16} className="results">
                <Row>
                  <RenderResults result = {result}/>
                </Row>
                <Row className="container">
                  <Button htmlType="submit" onClick={cleanForm}>Nueva Consulta</Button>
                </Row>
              </Col> 
            }
            <Col span={4} />
          </Row>             
        </Content>
        <Footer></Footer>
      </Layout>
    </div>
  );
}

function RenderFields(){
  const fields = [];
  inputData.map((input, index) => {
    fields.push(
      <Col span={12} key={index}>
        <Form.Item label={input.label}>
          <Input 
              id={input.id}
              type="text"
              name={input.id}
          />
        </Form.Item>
      </Col>
    )
  });
  return fields;
}

function RenderResults({result}){
  const response = [];
  Object.keys(result).map((key, index) => {
    var labelForField = labelResponse.filter(label => label.key === key);
    if(labelForField && labelForField.length > 0){
    response.push(
      <Col span={12} key={index}>
        <span><strong>{labelForField[0].value}:</strong> {result[key]}</span>
      </Col>
      )
    }
  });
  return response;
}

export default App;

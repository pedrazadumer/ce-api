import React, { useState, useEffect } from 'react';
import { Layout, Form, Row, Col, Input, Button } from 'antd';
import './App.css';
import {labelResponse, SCREEN_STATE } from './data';
import { callApi, callBorrowersApi } from './api/cobranzaApi';

function App() {

  const user = 123456;
  const { Header, Footer, Content } = Layout;

  const [inputs, setInputs] = useState([]);
  const [result, setResult] = useState({});
  const [loader, setLoader] = useState(false);
  const [screen, setScreen] = useState(SCREEN_STATE.CLIENT_ID);
  const [idClient, setIdClient] = useState({});


  useEffect(() => {
    return;
  },[inputs, screen, idClient]);

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
    cleanForm();
    if(inputs.length > 0){
      setLoader(true);
      var apiResult = await callApi(buildRequest(inputs));
      if(apiResult && apiResult.status === 200) setScreen(SCREEN_STATE.CLIENT_RESULT);
      else{
        setScreen(SCREEN_STATE.CLIENT_FIELDS);
        if(!apiResult){
          apiResult = {};
          apiResult.status = 404;
          apiResult.message = "Hubo un problema al comunicarse con el API CE."
        }
      }
      setResult(apiResult);
    }
    setLoader(false);
  }

  const cleanForm = () => {
    setResult({});
    setInputs({});
    setScreen(SCREEN_STATE.CLIENT_ID);
  }

  const sendBorrowersData = async e => {
    e.preventDefault();
    setLoader(true);
    if(idClient && idClient.typeId && idClient.numId){
      var apiResult = await callBorrowersApi(idClient.typeId, idClient.numId);
      if(apiResult && apiResult.status === 200){
        setScreen(SCREEN_STATE.CLIENT_FIELDS);
        setInputs(apiResult.data)
      }else{
        setScreen(SCREEN_STATE.CLIENT_ID);
        if(!apiResult){
          apiResult = {};
          apiResult.status = 404;
          apiResult.message = "Hubo un problema al comunicarse con el API Borrowers."
        }
      }
      //setResult(apiResult);
    }
    setLoader(false);

  }

  return (
    <div>
      <Layout>
        <Header> <p className="user-text"><strong>Usuario:</strong> {user}</p> </Header>
        <Content>
          <Row className="container">
            <Col span={4} />
            <RenderScreen
              param={screen} inputs={inputs}
              sendData={sendData} loader={loader}
              result={result} cleanForm={cleanForm}
              sendBorrowersData = {sendBorrowersData}
              idClient = {idClient} setIdClient = {setIdClient}
              setInputs = {setInputs}
            />
            <Col span={4} />
          </Row>
        </Content>
        <Footer></Footer>
      </Layout>
    </div>
  );
}

function buildChangeIdClient(idClient, key, value){
  idClient[key] = value;
  return idClient;
}

function RenderScreen({param, sendData, loader, result,
  cleanForm, sendBorrowersData, idClient, setIdClient, inputs,
  setInputs}){
  switch(param){
    case SCREEN_STATE.CLIENT_ID:
      return(
        <Col span={16}>
          <Form className="ant-advanced-search-form" onSubmit={sendBorrowersData} >
            <Row gutter={44}>
              <Col span={12} name="something">
                <Form.Item label="Tipo de Identificación">
                  <Input
                      id="type_id"
                      type="text"
                      name="type_id"
                      //value={idClient.typeId}
                      onChange={(idChanged) => setIdClient(buildChangeIdClient(idClient, "typeId", idChanged.target.value))}
                  />
                </Form.Item>
              </Col>
              <Col span={12}>
                <Form.Item label="Número de Identificación">
                  <Input
                      id="num_id"
                      type="text"
                      name="num_id"
                      //value={idClient.numId}
                      onChange={(numChanged) => setIdClient(buildChangeIdClient(idClient, "numId", numChanged.target.value))}
                  />
                </Form.Item>
              </Col>
            </Row>
            <Row>
              <Button htmlType="submit" loading={loader}>Consultar</Button>
            </Row>
            {
              result.status !== 200 ?
              <Row className="container error">
                <span>{result.message}</span>
              </Row>
              :
              null
            }

          </Form>
        </Col>
      );
    case SCREEN_STATE.CLIENT_FIELDS:
      return(
        <Col span={16}>
          <Form className="ant-advanced-search-form" onSubmit={sendData} onChange={(e) => changeFieldData(e, setInputs, inputs)}>
            <Row gutter={44}>
              <RenderFields inputs={inputs}  />
            </Row>
            <Row>
              <Button htmlType="submit" loading={loader}>Enviar</Button>
            </Row>
            {
              result.status !== 200 ?
              <Row className="container error">
                <span>{result.message}</span>
              </Row>
              :
              null
            }

          </Form>
        </Col>
      );
    case SCREEN_STATE.CLIENT_RESULT:
      return(
        <Col span={16} className="results">
          <Row>
            <RenderResults result = {result}/>
          </Row>
          <Row className="container">
            <Button htmlType="submit" onClick={cleanForm}>Nueva Consulta</Button>
          </Row>
        </Col>
      );
    default:
      return null;
  }
}

function changeFieldData(e, setInputs, inputs){
  var newInputs = [...inputs];
  newInputs.map(input => {
    if(input.label === e.target.name){
      input.value = e.target.value;
    }
  });
  setInputs(newInputs);
}

function RenderFields({inputs}){
  const fields = [];
  if(inputs instanceof Array)
    inputs.map((input, index) => {
      if(input.value && input.value != "0" && input.value != 0 && input.value != "")
        fields.push(
          <Col span={12} key={index}>
            <Form.Item label={input.label}>
              <Input
                  id={input.label}
                  type="text"
                  name={input.label}
                  value={input.value}
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

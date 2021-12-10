import os
from flask import Flask
from flask_restful import Resource, Api, reqparse
import pandas as pd
import ast
import logging
from joblib import dump, load
from sklearn import svm
import numpy as np
import tensorflow as tf
from tensorflow import keras
from flask_cors import CORS


app = Flask(__name__)
api = Api(app)
cors = CORS(app, resources={r"/loan-recovery/predict": {"origins": "*"}})

class LoanRecoveryResource(Resource):

    def post(self):
        contactChannels = {
          0: 'Telefono',
          1: 'Email'
        }
    
        parser = reqparse.RequestParser()
        parser.add_argument('agentId', required=True, type=int)
        parser.add_argument('data', required=True, action='append')
        
        args = parser.parse_args()
        
        # model = load('models/svc_sigmoid_cvd.joblib')
        # prediction = model.predict(args['data'])
        # ================================================================================================================
        # Dados los problemas con el modelo actual, a continuacion se plantean datos Mock hasta que se ajusten los modelos.
        # ================================================================================================================
        
        response = {'idNumber': 1234567, 'contactability': 'CONTACTO TERCEROS'}
        
        return response, 200


api.add_resource(LoanRecoveryResource, '/loan-recovery/predict')


if __name__ == '__main__':
    app.run()

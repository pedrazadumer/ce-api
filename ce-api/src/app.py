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
        
        #model = load('models/svc_sigmoid_cvd.joblib')
        #data = np.array([63.0,1.0,1.0,145.0,233.0,1.0,2.0,150.0,0.0,2.3,3.0,0.0,6.0])
        #data = data.reshape(1, -1)
        #prediction = model.predict(data)
        
        response = {'recoveryRate': 0.8456, 'bestContactChannel': contactChannels[1]}
        
        return response, 200


api.add_resource(LoanRecoveryResource, '/loan-recovery/predict')


if __name__ == '__main__':
    app.run()
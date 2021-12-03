FROM node:13.12.0-alpine
WORKDIR /app
ENV PATH /app/node_modules/.bin:$PATH

# Install required packages
RUN apk add --no-cache python2
RUN apk add --no-cache make
RUN apk add --no-cache g++

# Not required so far
# RUN npm install react-scripts@3.4.1 -g --silent

# install app dependencies
COPY package.json ./
COPY package-lock.json ./
RUN npm install --silent

# add app
COPY public/ /app/public/
COPY src/ /app/src/

CMD ["yarn", "start"]
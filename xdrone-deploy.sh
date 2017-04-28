#!/bin/bash

echo "var arDrone = require('ar-drone');
var client  = arDrone.createClient();

client.takeoff();

client
  .after(500, function() {
    this.stop();
    this.land();
  });" > /tmp/result.js

/usr/local/bin/node /tmp/result.js

/usr/bin/killall node

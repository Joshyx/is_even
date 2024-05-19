#!/bin/bash

python3 src/is_even.py

cargo test

go test ./...

zig test src/is_even.zig

gleam test

npm install
npm test

mvn clean install

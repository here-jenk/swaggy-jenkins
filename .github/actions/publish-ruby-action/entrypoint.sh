#!/bin/bash
make deps generate-langs
mkdir -p ~/.gem/
touch ~/.gem/credentials
echo "---" >> ~/.gem/credentials
echo ":rubygems_api_key: ${RUBYGEMS_TOKEN}" >> ~/.gem/credentials
chmod 0600 ~/.gem/credentials
make publish-ruby
#!/bin/bash
pip3 install scikit-learn
pip3 install pandas

echo "----Create Dataset (begin)-----"
python3 data_creation.py
echo "----Create Dataset (end)-----"
echo "----Processing Dataset (begin)-----"
python3 data_preprocessing.py
echo "----Processing Dataset (end)-----"
echo "----Use the Model for Preparation-----"
python3 model_preparation.py
echo "----Use the Model for Testing-----"
python3 model_testing.py

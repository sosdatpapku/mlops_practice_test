FROM python:3.8.16-slim-buster

EXPOSE 8501 

WORKDIR /app

COPY requirements.txt ./

RUN pip install -r requirements.txt

COPY  . ./

CMD streamlit run main_application_1.py
import pandas as pd
from sklearn import preprocessing
import numpy as np
import scipy.stats as s
df=pd.read_csv("winequality-red.csv")
print("Original Dataset :\n")
print(df)
data_scalar=preprocessing.MinMaxScaler(feature_range=(0,1))
data_scaled=data_scalar.fit_transform(df)
print("Rescaling : 0-1 \n")
print(df)

x_train=np.array(df)
print("Original Data :",x_train)
print("Initial Mean : ",s.tmean(x_train).round(2))
print("Initial Standard Deviation : ",round(x_train.std(),2))
x_scaled=preprocessing.scale(x_train)
x_scaled.mean(axis=0)
x_scaled.std(axis=0)
print("Standardized Data :\n",x_scaled.round(2))
print("Scaled Mean : \n",s.tmean(x_scaled).round(2))
print("Scaled Standard Deviation : \n",round(x_scaled.std(),2))

dn=preprocessing.normalize(df,norm='l1')
print("\n L1 Normalized Data : \n--------------------\n");
print(dn)

data_bin=preprocessing.Binarizer(threshold=1).transform(df)
print("\nBinarized Data :\n---------------------\n",data_bin)

import pandas as pd
from sklearn.preprocessing import OneHotEncoder
from sklearn.preprocessing import LabelEncoder
df=pd.read_csv("Data.csv")
print(df.describe())
print("Shape Of  Dataset : ",df.shape)
print("First 3 Rows : \n")
print(df.head(3))
valueMean=df['Age'].mean()
df['Age'].fillna(valueMean,inplace=True)
meanSal=df['Salary'].mean()
df['Salary'].fillna(meanSal,inplace=True)
print("\n\n",df)

labelencoder=LabelEncoder()
df['Purchased']=labelencoder.fit_transform(df['Purchased'])

enc=OneHotEncoder(handle_unknown='ignore')
enc_df=pd.DataFrame(enc.fit_transform(df[['Country']]).toarray())

print("\n\n",df)
print(enc_df)	

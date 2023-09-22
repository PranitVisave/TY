import pandas as pd
import matplotlib.pyplot as plt
df=pd.DataFrame(columns=['Name','Age','Percentage'])
df.loc[0]=['Amar',20,80]
df.loc[1]=['Ajay',21,85]
df.loc[2]=['Tejas',22,90]
df.loc[3]=['Omkar',23,70]
df.loc[4]=['Priya',24,65]
df.loc[5]=['Siddhi',25,78]
df.loc[6]=['YD',26,75]
df.loc[7]=['Varad',27,90]
df.loc[8]=['Rohit',21,65]
df.loc[9]=['Sweety',28,89]
print(df)
print("Number Of Rows and Columns : ",df.shape)
print("Data Types :\n ",df.dtypes)
print("Features :\n ",df.info())
print("Description :\n ",df.describe())
df.loc[10]=['Amar',20,80]
df.loc[11]=['XYZ',25,88]
df.loc[12]=['ABC',20,None]
df.loc[13]=['PQR',20,80]
df.loc[14]=['XYZ',None,80]
df['Remarks']=None
print("Duplicate Values : \n",df.duplicated())
print("Missing Values : \n",df.isnull())
print(df)
df.drop(columns=['Remarks'],axis=1,inplace=True)
print(df)
#plt.plot(df.Name,df.Percentage)
plt.scatter(df.Name,df.Percentage)
plt.show()

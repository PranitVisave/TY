import pandas as pd
import matplotlib.pyplot as plt
df=pd.read_csv("SOCR-HeightWeight.csv")
print("First 10 Rows :\n",df.head(10))
print("Last 10 Rows : \n",df.tail(10))
print("Shape :\n",df.shape,"\nSize :\n",df.size,"\nDataTypes :\n",df.dtypes)
df['BMI']=(df['Weight(Pounds)']/(df['Height(Inches)']**2))
print("Basic Statistical Data :\n",df.describe())
print("No. Of Missing Values :\n",df.isnull())
print(df)
print("Max : ",df.max(),"\nMin : \n",df.min())
#plt.scatter(df['Height(Inches)'],df['Weight(Pounds)'])
#plt.show()

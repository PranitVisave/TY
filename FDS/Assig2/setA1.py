#q1
'''
import pandas as pd
import numpy as nm
data=nm.array([[0,1],[2,3]])
print("Original Array : \n",data)
print("Max Element : ",nm.max(data))
print("Min Element : ",nm.min(data))
'''

#q2
'''
import pandas as pd
import numpy as nm
a1=nm.array([10,20,30])
a2=nm.array([23,1,3])
d=nm.linalg.norm(a1-a2)
print("Euclidian Distance : ",d)
'''

#Q3
'''
import pandas as pd
import numpy as nm
d={'Age':[10,20,23,32,45,25],'Name':['A','B','C','D','E','F']}
df=pd.DataFrame(d)
print(df)
r=max(df['Age']-min(df['Age']))
print("Range : ",r)
print("Mean of Ages : ",df['Age'].mean())
q3,q1=nm.percentile(df['Age'],[45,10])
iqr=(q3-q1)
print(iqr)
'''

#Q4
'''
import pandas as pd
import numpy as nm
import matplotlib.pyplot as plt
def sum(x,y,n):
	s=0
	for i in range (n):
		for j in range (i+1,n):
			s=s+(abs(x[i]-x[j])+abs(y[i]-y[j]))
	return s
x=[1,2,3,4]
y=[3,1,6,5]
n=len(x)
print("Manhattan Distance : ",sum(x,y,n))
'''

#Q5
'''
import pandas as pd
import numpy as nm
import matplotlib.pyplot as plt
nums=nm.array([0.5,0.7,1,1.2,1.3,2.1])
bins=nm.array([0,1,2,3])
print("NUMS : \n",nums)
print("BINS : \n",bins)
plt.hist(nums,bins)
plt.show()
'''

#Q6
'''
import pandas as pd
import numpy as nm
import scipy.stats as sc
d={'Name':['AAA','BBB','CCC','DDD','EEE','FFF'],'percentage':[78,67,89,56,90,89],'Age':[20,20,23,19,21,22]}
df=pd.DataFrame(d)
print(df)
print("\nAverage Score : ",sc.tmean(df['percentage']))
print("\nAverage Age : ",sc.tmean(df['Age']))
print("Basic Statistical Details :\n",df.describe())
'''


#SET B
import pandas as pd
import numpy as nm
import scipy.stats as sc
df=pd.read_csv("Iris.csv")
print(df)
print("Max Sepal Length : ",max(df['SepalLengthCm']))
print("Min Sepal Length : ",min(df['SepalLengthCm']))
print("Min Petal Length : ",min(df['PetalLengthCm']))
print("Max Petal Length : ",max(df['PetalLengthCm']))
print("Max Sepal Width : ",max(df['SepalWidthCm']))
print("Max Petal Width : ",max(df['PetalWidthCm']))
print("Min Petal Width : ",min(df['PetalWidthCm']))
print("Min Petal Width : ",min(df['PetalWidthCm']))
print("Number of records for each distinct values class attributes\n")
print(df['Species'].value_counts())
print("\nMean SepalLengthCm : ",sc.tmean(df['SepalLengthCm']))
print("Mean PetalLengthCm : ",sc.tmean(df['PetalLengthCm']))
print("Mean PetalWidthCm : ",sc.tmean(df['PetalWidthCm']))
print("Mean PetalWidthCm : ",sc.tmean(df['PetalWidthCm']))
print("Median SepalLengthCm : ",nm.median(df['SepalLengthCm']))
print("Median PetalLengthCm : ",nm.median(df['PetalLengthCm']))
print("Median SepalWidthCm : ",nm.median(df['SepalWidthCm']))
print("Median SepalWidthCm : ",nm.median(df['SepalWidthCm']))

import pandas as pd

df = pd.read_csv("ca-covid.csv")

df.drop('state', axis=1, inplace=True)
df['date'] = pd.to_datetime(df['date'], format="%d.%m.%y")
df['month'] = df['date'].dt.month_name()
df.set_index('date', inplace=True)

#use the function to_string() to display the entire data
#print(df.to_string())

#use to display the first and last rows of the data. 
#print(df)

#check the maximum row of the data 
#print(pd.options.display.max_rows)

#print(df.groupby('date')['deaths'].sum())
x = [i for i in df['deaths']/ df['cases']]
df['ratio'] = x

y = df['ratio'].max()

print((df[df.values == y]).to_string())
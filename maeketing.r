#Read CSV File
df <- read.csv("R/marketing.csv")

#Additive Model
model1 <- lm(sales ~ youtube + facebook, data = df)
summary(model1)

#Multiplicative Model
model2 <- lm(sales ~ youtube + facebook + youtube:facebook, data = df)
summary(model2)
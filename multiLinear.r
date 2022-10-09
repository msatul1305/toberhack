input <- mtcars[,c("mpg", "disp", "hp", "wt")]
View(input)
model <- lm(mpg~disp+hp+wt, data = input)
summary(model)

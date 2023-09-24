split :: String -> [String]
split = words. map (\x -> if x == ';' then ' ' else x)

getMonthValues :: String -> [String] -> [Double]
getMonthValues month [] = []
getMonthValues month (_:list_month:_:x:xs) 
  | list_month == month = (read x :: Double) : getMonthValues month xs
  | otherwise = getMonthValues month xs

sumValues :: [Double] -> Double
sumValues [] = 0.0
sumValues (x:xs) = foldl (+) x xs


logMes :: String -> String -> Double
logMes str b = sumValues (getMonthValues str (split b))

main = do
    a <- getLine
    b <- getLine
    let result = logMes a b
    print result
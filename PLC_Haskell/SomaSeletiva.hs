
digits :: String -> String 
digits [] = []
digits (x:xs)
       | x >= '0' && x <= '9' = x : digits xs
       | otherwise = digits xs


sumNumbers :: [Int] -> Int
sumNumbers [] = 0
sumNumbers (x:xs) = x + sumNumbers xs


main = do
  a <- getLine
  
  let numberString = digits a
      numbers = map (\x -> read [x] :: Int) numberString
      result = sumNumbers numbers
     
  -- let result = sumNumbers a
  print result


  -- outra opçãoss
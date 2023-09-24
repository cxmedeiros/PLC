concatenarNumeros :: [Int] -> Int
concatenarNumeros nums = read (concat (map show nums)) :: Int


somarListas :: [Int] -> [Int] -> [Int]
somarListas lista1 lista2 = map (\x -> read [x] :: Int) (show (concatenarNumeros lista1 + concatenarNumeros lista2))


main :: IO ()
main = do
input1 <- getLine
input2 <- getLine
let result = somarListas (read input1 :: [Int])  (read input2 :: [Int])
print result

{-toInt :: [Int] -> Int
toInt [] = 0
toInt (x : xs)
  | length (x : xs) == 1 = x
  | otherwise = x * (10 ^ (length (x : xs) - 1)) + toInt xs

toString :: Int -> [Int]
toString 0 = []
toString x = (mod x 10) : toString (div x 10)

reverseList [] = []
reverseList (x:xs) = reverseList xs ++ [x]

somarListas :: [Int] -> [Int] -> [Int]
somarListas [] [] = []
somarListas (x : xs) [] = (x : xs)
somarListas [] (y : ys) = (y : ys)
somarListas (x : xs) (y : ys) = reverseList (toString (toInt (x : xs) + toInt (y : ys)))-}
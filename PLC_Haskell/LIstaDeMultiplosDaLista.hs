somarMultiplos :: [Int] -> Int -> [Int]
somarMultiplos [] _ = []  
somarMultiplos (x:xs) m
    | m <= 0 = 0 : somarMultiplos xs m  
    | m > x = 0 : somarMultiplos xs m  
    | otherwise = somaMultiplos m x : somarMultiplos xs m
    where
        somaMultiplos m x = sum [n | n <- [m, 2*m .. x]]

main :: IO ()
main = do
    lista <- getLine
    let readList = read lista :: [Int]
    num <- getLine
    let readNum = read num :: Int
    let result = somarMultiplos readList readNum
    print result
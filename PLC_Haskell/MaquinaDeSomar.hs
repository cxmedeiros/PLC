￼
￼{-maquinaSomar :: [Int] -> [Int]
maquinaSomar (0:0:_) = [] -- inicializa já com dois zeros
maquinaSomar [] = []  -- Caso base: lista vazia resulta em lista vazia
maquinaSomar xs = go xs 0  -- Inicia o processo de acumulação

  where
    go :: [Int] -> Int -> [Int]
    go [] _ = []  
    go [0] sumAcc = [sumAcc] 
    go (0:0:_) sumAcc = [sumAcc] 
    go (0:rest) sumAcc = go rest 0  -- Encontrou um zero, reseta a soma
    go (x:rest) sumAcc = go rest (sumAcc + x)  -- Continua somando elementos ao acumulador-}

untilZero :: [Int] -> [Int]
untilZero [] = []
untilZero [x] = [x]
untilZero (x:xs)
    | x == 0 = [] 
    | otherwise = x : untilZero xs

maquinaSomar :: [Int] -> [Int]
maquinaSomar [] = []
maquinaSomar [x] = if x == 0 then [] else [x]
maquinaSomar (x:y:xs)
    | x == 0 && y /= 0 = (sum (untilZero (y:xs))) : maquinaSomar (drop (length (untilZero (y:xs))-1)(xs))
    | x == 0 && y == 0 = []
    | x == 0 && length (y:xs) == 0 = []
    | x /= 0 = (sum (untilZero (x:y:xs))) : maquinaSomar (drop (length (untilZero (x:y:xs))) (x:y:xs))
    | otherwise = maquinaSomar (y:xs)

main :: IO ()
main = do
    lista <- getLine
    print $ maquinaSomar (read lista :: [Int])

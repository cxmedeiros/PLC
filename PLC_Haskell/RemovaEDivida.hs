remDiv:: Int -> [a] -> ([a],[a])
remDiv n x = (take (n-1) x, drop n x)

main = do
  n <- readLn
  x <- getLine
  print $ remDiv (n :: Int) (words x)

{-remDiv :: Int -> [String] -> ([String], [String]) -- aqui eu só coloco as novas listas em uma tupla final
remDiv n xs = (criarX1 n xs, criarX2 n xs)

criarX1 :: Int -> [String] -> [String] -- aqui eu to criando uma nova lista até a posição que eu iria "remover"
criarX1 _ [] = []
criarX1 n (x:xs) | n <= 1 = []
                 | otherwise = x : criarX1 (n - 1) xs

criarX2 :: Int -> [String] -> [String] -- aqui a minha nova lista começa uma posição depois do numero enviado
criarX2 _ [] = []
criarX2 n (x:xs) | n <= 0 = (x:xs)
                 | otherwise = criarX2 (n - 1) xs
                 
main = do
  n <- readLn
  x <- getLine
  print $ remDiv (n :: Int) (words x)-}
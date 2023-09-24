-- inverso de uma lista
inverse :: [t] -> [t]
inverse [] = []
inverse (x:xs) = inverse xs ++ [x] 

-- pegar os n primeiros termos de uma lista
get :: Int -> [t] -> [t]
get _ [] = []
get 0 _ = []
get n (x:xs) = x : get (n-1) xs

-- remover os n primeiros termos de uma lista
remove :: Int -> [t] -> [t]
remove _ [] = []
remove 0 xs = xs
remove n (x:xs) = remove (n-1) xs

-- remover o último elemento da lista
delete :: [Int] -> [Int]
delete [] = []
delete [x] = []
delete (x:xs) = x : delete xs

-- remover o último elemento da lista
delete' :: [Int] -> [Int]
delete' [] = []
delete' xs = reverse (tail (reverse xs))
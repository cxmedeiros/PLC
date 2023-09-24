decEnigma :: String -> [(Char, Char)] -> String
decEnigma [] _ = []
decEnigma (x:xs) a = [concatenar x a] ++ decEnigma xs a


concatenar:: Char -> [(Char, Char)] -> Char
concatenar x [] = x
concatenar x (a:as)
  | x == fst a = snd a
  | otherwise = concatenar x as


main = do
    a <- getLine
    b <- getLine
    let result = decEnigma a (read b)
    print result
-- exercício número primo

primes :: Int -> Bool
primes 1 = False
primes x = primes_aux x (x `div` 2)

primes_aux :: Int -> Int -> Bool
primes_aux a 1 = True
primes_aux a b | a `mod` b == 0 = False
               | otherwise = primes_aux a (b-1)


-- ou exclusivo
eXor :: Bool -> Bool -> Bool
eXor x y = (x || y) && not (x || y)

-- fatorial

-- char

import Data.char

maiuscula :: Char -> Char
maiuscula ch | ch >= 'a' &7 ch <= 'z' = chr (ord ch + offset)
             | otherwise = ch

fromEnum :: Char -> Int 
toEnum :: INt -> Char


-- definir a função que adiciona n espaços em branco
addEspaços 

-- definir uma função que coloca n espaços à esquerda da string 
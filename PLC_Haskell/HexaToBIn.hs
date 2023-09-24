htob :: String -> String
htob [] = []
htob (x:xs) = case x of
  '0' -> "0000" ++ htob xs
  '1' -> "0001" ++ htob xs
  '2' -> "0010" ++ htob xs
  '3' -> "0011" ++ htob xs
  '4' -> "0100" ++ htob xs
  '5' -> "0101" ++ htob xs
  '6' -> "0110" ++ htob xs
  '7' -> "0111" ++ htob xs
  '8' -> "1000" ++ htob xs
  '9' -> "1001" ++ htob xs
  'A' -> "1010" ++ htob xs
  'B' -> "1011" ++ htob xs
  'C' -> "1100" ++ htob xs
  'D' -> "1101" ++ htob xs
  'E' -> "1110" ++ htob xs
  'F' -> "1111" ++ htob xs
  _   -> htob xs


main = do
    s <- getLine
    let result = htob s
    print result
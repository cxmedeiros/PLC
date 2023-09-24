type Comando = String
type Valor = Int

executa :: [(Comando, Valor)] -> Int
executa comandos = foldl calcular 0 comandos
  where
    calcular :: Int -> (Comando, Valor) -> Int
    calcular acc (cmd, val)
      | cmd == "Multiplica" = acc * val
      | cmd == "Soma" = acc + val
      | cmd == "Subtrai" = acc - val
      | cmd == "Divide" = if val == 0 then -666 else acc `div` val
      | otherwise = acc

main = do
    a <- getLine
    let result = executa (read a)
    print result

split :: String -> [String]
split = words. map (\x -> if x == ';' then ' ' else x)

getValues :: [String] -> [Double]
getValues [] = []
getValues (_:_:_:x:xs) = [(read x :: Double)] ++ getValues xs

getMaxMinValues :: [Double] -> (Double, Double)
getMaxMinValues list = (minimum list, maximum list)

minMaxCartao :: String -> (Double, Double)
minMaxCartao str = getMaxMinValues $ getValues $ split str

main :: IO ()
main = do
    fatura <- getLine
    let result = minMaxCartao fatura
    print result
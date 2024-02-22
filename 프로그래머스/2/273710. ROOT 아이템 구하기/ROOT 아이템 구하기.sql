-- 코드를 작성해주세요
SELECT I.ITEM_ID, I.ITEM_NAME
    FROM ITEM_INFO I JOIN (SELECT ITEM_ID, PARENT_ITEM_ID
                            FROM ITEM_TREE 
                            WHERE PARENT_ITEM_ID IS NULL) T
    ON I.ITEM_ID = T.ITEM_ID
    ORDER BY I.ITEM_ID
    

SELECT user_id, name, mail
FROM users
WHERE lower(mail) REGEXP '^[a-z][a-z0-9_.-]*@leetcode[.]com' and mail like '%@leetcode.com';
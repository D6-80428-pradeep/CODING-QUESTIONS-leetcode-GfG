SELECT a1.player_id, a1.event_date AS first_login
FROM Activity AS a1
JOIN (
    SELECT player_id, MIN(event_date) AS min_event_date
    FROM Activity
    GROUP BY player_id
) AS a2 ON a1.player_id = a2.player_id AND a1.event_date = a2.min_event_date;
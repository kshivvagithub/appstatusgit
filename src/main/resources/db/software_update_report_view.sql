CREATE OR REPLACE VIEW `demo.software_update_report` AS
SELECT
	u.id,
    g.application_group_name,
    g.application_group_email,
    s.software_name,
    s.software_desc,
    s.software_ver,
    s.due_date,
    u.applicable,
    u.status,
    u.completed_date
FROM
	demo.software_update_status u
LEFT JOIN demo.application_group g ON
	u.application_group_id = g.id
LEFT JOIN demo.software s ON
	u.software_id = s.id;

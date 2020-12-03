
DELETE FROM users;
DELETE FROM authorities;

insert into authorities (authority) values ('ROLE_USER');
insert into authorities (authority) values ('ROLE_ADMIN');

insert into users (username, password, enabled, authority_id)
values ('root', '$2a$10$4Ucq.Qc9AwHdOsLjnwI7ZeLyifBTnCsrK3YETVtgYLPXR1Q0weglO', true,
        (select id from authorities where authority = 'ROLE_ADMIN'));

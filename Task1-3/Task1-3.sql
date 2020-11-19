-- USE  sakila;
-- SELECT * FROM actor;
-- SELECT * FROM actor WHERE last_name = "CAGE";
-- SELECT * FROM actor WHERE NOT first_name IN ("ZERO","NICK");
-- SELECT * FROM actor WHERE first_name IN ("NICK", "JOHNNY", "JAMES", "MORGAN", "WHOOPI");
-- SELECT * FROM actor WHERE actor_id BETWEEN 50 AND 150;
-- SELECT * FROM actor WHERE first_name LIKE "C%";
-- SELECT * FROM actor ORDER BY first_name;
-- SELECT * FROM actor ORDER BY last_name DESC;
-- SELECT COUNT(*) FROM actor;
-- SELECT COUNT(DISTINCT first_name) FROM actor;
-- SELECT * FROM film WHERE film_id IN(SELECT film_id FROM film_category WHERE category_id IN(SELECT category_id FROM category WHERE name = "HORROR"));
-- SELECT film_id AS ID, title AS Name FROM film WHERE film_id IN(SELECT film_id FROM film_category WHERE category_id IN(SELECT category_id FROM category WHERE name = "HORROR"));

-- INSERT INTO actor(first_name, last_name) VALUES ("Kasper", "Dahl");
-- SELECT actor_id FROM actor WHERE first_name = "Kasper" AND last_name = "Dahl";
-- Can also be substituted into the INSERT line instead of the actual value in actor_id
-- INSERT INTO film_actor (actor_id, film_id) VALUES (201, 3);
-- INSERT INTO film_actor (actor_id, film_id) VALUES (201, 385);
-- INSERT INTO film_actor (actor_id, film_id) VALUES (201, 703);
-- INSERT INTO film_actor (actor_id, film_id) VALUES (201, 707);
-- INSERT INTO film_actor (actor_id, film_id) VALUES (201, 843);
-- SELECT title FROM film AS f JOIN film_actor AS fa ON f.film_id = fa.film_id WHERE fa.actor_id = 201;
-- comedy gold. close call between "Steel Santa" and "Vietnam Smoochy."
-- UPDATE actor SET first_name = "Maurice", last_name = "Bundermeier" WHERE actor_id = 201;
-- DELETE FROM film_actor WHERE actor_id = 201;
-- DELETE FROM actor WHERE actor_id = 201;

-- SELECT * FROM category WHERE name = "HORROR"; -- 11
/*SELECT * from film as f
JOIN film_category as fc ON f.film_id = fc.film_id
JOIN category as c ON fc.category_id = c.category_id
WHERE c.name = "HORROR";*/
/*SELECT * from film as f
JOIN film_category as fc ON f.film_id = fc.film_id
JOIN category as c ON fc.category_id = c.category_id
WHERE c.name IN ("HORROR");*/
-- uses IN because it allows for more genres and I think the exercises might have been mixed up a bit.

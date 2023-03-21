INSERT INTO "cinema" ("cinema_id", "cinema_name", "start_time", "close_time") VALUES (1, 'Cineplex', 9.00, 23.59);
INSERT INTO "cinema" ("cinema_id", "cinema_name", "start_time", "close_time") VALUES (2, 'Mukta Arts', 9.00, 23.59);
INSERT INTO "cinema" ("cinema_id", "cinema_name", "start_time", "close_time") VALUES (3, 'Inox', 9.00, 23.59);

INSERT INTO "movie" ("movie_id", "movie_name", "movie_type", "show_release_date", "show_end_date", "total_duration", "cinema_id", "price") VALUES (1, 'Golmaal', 'HINDI', '2023-02-31 23.59.59+07:30','2023-12-31 23.59.59+07:30', 90, 1, 50);
INSERT INTO "movie" ("movie_id", "movie_name", "movie_type", "show_release_date", "show_end_date", "total_duration", "cinema_id", "price") VALUES (2, 'Avatar', 'ENGLISH', '2023-02-31 23.59.59+07:30','2023-12-31 23.59.59+07:30', 90, 1, 50);
INSERT INTO "movie" ("movie_id", "movie_name", "movie_type", "show_release_date", "show_end_date", "total_duration", "cinema_id", "price") VALUES (3, 'Inception', 'ENGLISH', '2023-02-31 23.59.59+07:30','2023-12-31 23.59.59+07:30', 90, 1, 50);
INSERT INTO "movie" ("movie_id", "movie_name", "movie_type", "show_release_date", "show_end_date", "total_duration", "cinema_id", "price") VALUES (4, 'Avatar', 'ENGLISH', '2023-02-31 23.59.59+07:30','2023-12-31 23.59.59+07:30', 90, 2, 50);
INSERT INTO "movie" ("movie_id", "movie_name", "movie_type", "show_release_date", "show_end_date", "total_duration", "cinema_id", "price") VALUES (5, 'Golmaal', 'HINDI', '2023-02-31 23.59.59+07:30','2023-12-31 23.59.59+07:30', 90, 3, 50);

INSERT INTO "screen" ("screen_id", "cinema_id", "movie_id", "show_time") VALUES (1, 1, 1, '9.30');

INSERT INTO "address" ("address_id", "street", "landmark", "city", "zip", "state", "latitude", "longitude", "cinema_id") VALUES (1, 'Napa Valley', 'Nr Shiv Temmple', 'Lakeland', '33801', 'FL', 28.03, -81.94, 1);
INSERT INTO "address" ("address_id", "street", "landmark", "city", "zip", "state", "latitude", "longitude", "cinema_id") VALUES (2, 'Napa Valley', 'Nr Shiv Temmple', 'Lakeland', '33801', 'FL', 28.03, -81.94, 2);


INSERT INTO "cinema" ("cinema_id", "cinema_name", "start_time", "close_time") VALUES (1, 'Cineplex', 9.00, 23.59);
INSERT INTO "cinema" ("cinema_id", "cinema_name", "start_time", "close_time") VALUES (2, 'Mukta Arts', 9.00, 23.59);
INSERT INTO "cinema" ("cinema_id", "cinema_name", "start_time", "close_time") VALUES (3, 'Inox', 9.00, 23.59);

INSERT INTO "movie" ("movie_id", "movie_name", "movie_type", "show_release_date", "show_end_date", "total_duration", "cinema_id") VALUES (1, 'Golmaal', 'HINDI', '2023-02-31 23.59.59+07:30','2023-12-31 23.59.59+07:30', 90, 1);
INSERT INTO "movie" ("movie_id", "movie_name", "movie_type", "show_release_date", "show_end_date", "total_duration", "cinema_id") VALUES (2, 'Avatar', 'English', '2023-02-31 23.59.59+07:30','2023-12-31 23.59.59+07:30', 90, 1);
INSERT INTO "movie" ("movie_id", "movie_name", "movie_type", "show_release_date", "show_end_date", "total_duration", "cinema_id") VALUES (3, 'Inception', 'English', '2023-02-31 23.59.59+07:30','2023-12-31 23.59.59+07:30', 90, 1);
INSERT INTO "movie" ("movie_id", "movie_name", "movie_type", "show_release_date", "show_end_date", "total_duration", "cinema_id") VALUES (4, 'Avatar', 'English', '2023-02-31 23.59.59+07:30','2023-12-31 23.59.59+07:30', 90, 2);

INSERT INTO "address" ("address_id", "street", "landmark", "city", "zip", "state", "latitude", "longitude", "cinema_id") VALUES (1, 'Napa Valley', 'Nr Shiv Temmple', 'Lakeland', '33801', 'FL', 28.03, -81.94, 1);
INSERT INTO "address" ("address_id", "street", "landmark", "city", "zip", "state", "latitude", "longitude", "cinema_id") VALUES (2, 'Napa Valley', 'Nr Shiv Temmple', 'Lakeland', '33801', 'FL', 28.03, -81.94, 2);


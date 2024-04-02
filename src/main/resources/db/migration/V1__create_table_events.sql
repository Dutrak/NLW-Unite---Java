CREATE TABLE events (
    ev_id VARCHAR(255) NOT NULL PRIMARY KEY,
    ev_title VARCHAR(255) NOT NULL,
    ev_details VARCHAR(255) NOT NULL,
    ev_slug VARCHAR(255) NOT NULL,
    ev_maxAttendees INTEGER NOT NULL
);
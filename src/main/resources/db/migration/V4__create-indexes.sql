CREATE UNIQUE INDEX events_slug_key ON events (ev_slug);
CREATE UNIQUE INDEX attendees_events_id_email_key ON attendees (ev_id, att_email);
CREATE UNIQUE INDEX check_ins_attendee_id_key ON check_ins (att_id)
INSERT INTO `player` (`id`, `birthplace`, `dob`, `height`, `name`, `position`, `weight`)
VALUES
  (1, 'Toronto', 1990, 190, 'Bo Horvat', 'Forward', 200);


INSERT INTO `team` (`id`, `city`, `coach`, `division`, `name`)
VALUES
  (1, 'Vancouver', 'Travis Green', 'Pacific', 'Canucks');

INSERT INTO `roster_spot` (`player_id`, `team_id`)
VALUES
  (1, 1);


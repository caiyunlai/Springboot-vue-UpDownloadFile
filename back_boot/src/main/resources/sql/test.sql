

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_chunk_info`
-- ----------------------------
DROP TABLE IF EXISTS `t_chunk_info`;
CREATE TABLE `t_chunk_info` (
  `id` varchar(64) NOT NULL,
  `chunk_number` decimal(10,0) NOT NULL,
  `chunk_size` decimal(10,0) NOT NULL,
  `current_chunkSize` decimal(10,0) NOT NULL,
  `identifier` varchar(64) NOT NULL,
  `filename` varchar(500) DEFAULT NULL,
  `relative_path` varchar(500) NOT NULL,
  `total_chunks` decimal(10,0) NOT NULL,
  `type` decimal(10,0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- ----------------------------
-- Table structure for `t_file_info`
-- ----------------------------
DROP TABLE IF EXISTS `t_file_info`;
CREATE TABLE `t_file_info` (
  `id` varchar(64) NOT NULL,
  `filename` varchar(500) NOT NULL,
  `identifier` varchar(64) NOT NULL,
  `type` varchar(10) DEFAULT NULL,
  `total_size` decimal(10,0) NOT NULL,
  `location` varchar(200) NOT NULL,
  `del_flag` varchar(2) NOT NULL DEFAULT '0',
  `ref_project_id` varchar(64) NOT NULL,
  `upload_by` varchar(64) DEFAULT NULL,
  `upload_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3307
-- Generation Time: May 31, 2023 at 04:03 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `quanlitintuc`
--

-- --------------------------------------------------------

--
-- Table structure for table `categories`
--

CREATE TABLE `categories` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `description` varchar(255) NOT NULL,
  `created_date` datetime DEFAULT current_timestamp(),
  `updated_date` datetime DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `categories`
--

INSERT INTO `categories` (`id`, `name`, `description`, `created_date`, `updated_date`) VALUES
(1, 'Thể thao', 'Danh mục chứa các tin tức về các môn thể thao như bóng đá, bóng rổ, tennis, cầu lông, v.v.', '2023-05-25 23:13:47', '2023-05-25 23:32:13'),
(3, 'Âm nhạc', 'Danh mục này tập trung vào các tin tức, sự kiện, và thông tin mới nhất về các nghệ sĩ, album, ca khúc, và các thể loại âm nhạc khác nhau', '2023-05-25 23:24:32', '2023-05-25 23:24:32'),
(4, 'Công nghệ', 'Danh mục này cung cấp thông tin về các công nghệ mới, sản phẩm điện tử, các cuộc thi, và xu hướng công nghệ đổi mới.', '2023-05-25 23:24:46', '2023-05-25 23:24:46'),
(5, 'Du lịch', 'Danh mục này chia sẻ thông tin về các điểm đến du lịch, các hoạt động, khám phá văn hóa, và kinh nghiệm du lịch.', '2023-05-25 23:25:04', '2023-05-25 23:25:04'),
(6, 'Ẩm thực', 'Danh mục này tập trung vào các tin tức, công thức nấu ăn, nhà hàng, và đánh giá về các món ăn, quán ăn, và ẩm thực đa dạng trên thế giới.', '2023-05-25 23:25:14', '2023-05-25 23:25:14');

-- --------------------------------------------------------

--
-- Table structure for table `comments`
--

CREATE TABLE `comments` (
  `id` int(11) NOT NULL,
  `content` longtext NOT NULL,
  `created_date` datetime DEFAULT current_timestamp(),
  `news_id` int(11) DEFAULT NULL,
  `user_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `comments`
--

INSERT INTO `comments` (`id`, `content`, `created_date`, `news_id`, `user_id`) VALUES
(2, 'tuyệt vời quá đi', '2023-05-31 20:48:48', 1, 11),
(3, 'Cái này thật tuyệt', '2023-05-31 20:48:57', 1, 11);

-- --------------------------------------------------------

--
-- Table structure for table `news`
--

CREATE TABLE `news` (
  `id` int(11) NOT NULL,
  `title` varchar(60) NOT NULL,
  `image` varchar(200) DEFAULT NULL,
  `content` longtext NOT NULL,
  `created_date` datetime DEFAULT current_timestamp(),
  `author_id` int(11) NOT NULL,
  `category_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `news`
--

INSERT INTO `news` (`id`, `title`, `image`, `content`, `created_date`, `author_id`, `category_id`) VALUES
(1, 'Thông tin chương trình trợ giá Apple Watch', 'dog_with_gun.jpg', 'Sở hữu thiết kế quen thuộc mà chúng ta vẫn thường thấy, chiếc smartwatch với phần viền xung quanh được làm mỏng và mặt kính được bo cong nhẹ tạo cảm giác tràn viền. Màn hình với tấm nền OLED cùng độ phân giải 430 x 352 pixels cho các nội dung hiển thị sắc nét từng chi tiết, màu sắc sống động và độ tương phản cao.\n\nSản phẩm chạy trên chip Apple S8 lõi kép với sức mạnh vượt trội cho khả năng xử lý tốt mọi nhu cầu. Thêm vào đó, cũng cung cấp một không gian lưu trữ rộng lớn khi được trang bị bộ nhớ trong 32 GB. Hệ điều hành WatchOS 9 mới nhất với khả năng thay đổi giao diện trở nên đẹp mắt và thú vị.', '2023-05-30 00:55:38', 10, 4);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(255) NOT NULL,
  `email` varchar(40) NOT NULL,
  `full_name` varchar(40) NOT NULL,
  `created_date` datetime DEFAULT current_timestamp(),
  `updated_date` datetime DEFAULT current_timestamp(),
  `is_admin` tinyint(1) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `username`, `password`, `email`, `full_name`, `created_date`, `updated_date`, `is_admin`) VALUES
(10, 'buihoangducanh0987', 'buihoangducanh0987', 'buihoangducanh0987@gmail.com', 'Bùi Hoàng Đức Anh', '2023-05-25 21:33:30', '2023-05-25 21:33:30', 1),
(11, 'buianh1', 'buianh1', 'buianh1@gmail.com', 'Nguyễn Văn Đá', '2023-05-26 01:29:19', '2023-05-26 01:29:19', 0),
(12, 'buianh2', 'buianh2', 'buianh2@gmail.com', 'nguyễn văn c', '2023-05-26 01:29:55', '2023-05-26 01:29:55', 0),
(13, 'buianh3', 'buianh3', 'buianh3@gmail.com', 'Lê văn quỷ', '2023-05-26 01:30:17', '2023-05-26 01:30:17', 0),
(14, 'testuser', 'testuser', 'testuser@gmail.com', 'nguyen van a', '2023-05-30 13:26:24', '2023-05-30 13:26:24', 0),
(15, 'buihoangducanh09', 'buihoangducanh09', 'buihoangducanh0987@gmail.com', 'buihoangducanh0987', '2023-05-30 13:31:06', '2023-05-30 13:31:06', 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `categories`
--
ALTER TABLE `categories`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `comments`
--
ALTER TABLE `comments`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_comments_news` (`news_id`),
  ADD KEY `fk_comments_user` (`user_id`);

--
-- Indexes for table `news`
--
ALTER TABLE `news`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_news_categories` (`category_id`),
  ADD KEY `fk_news_users` (`author_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `username` (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `categories`
--
ALTER TABLE `categories`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `comments`
--
ALTER TABLE `comments`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `news`
--
ALTER TABLE `news`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `comments`
--
ALTER TABLE `comments`
  ADD CONSTRAINT `fk_comments_news` FOREIGN KEY (`news_id`) REFERENCES `news` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_comments_user` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `news`
--
ALTER TABLE `news`
  ADD CONSTRAINT `fk_news_categories` FOREIGN KEY (`category_id`) REFERENCES `categories` (`id`) ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_news_users` FOREIGN KEY (`author_id`) REFERENCES `users` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

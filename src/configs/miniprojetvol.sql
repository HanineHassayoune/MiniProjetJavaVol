-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : ven. 29 déc. 2023 à 00:28
-- Version du serveur : 10.4.28-MariaDB
-- Version de PHP : 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `miniprojetvol`
--

-- --------------------------------------------------------

--
-- Structure de la table `aeroport`
--

CREATE TABLE `aeroport` (
  `idAeroport` int(11) NOT NULL,
  `nomAeroport` varchar(255) NOT NULL,
  `nomPays` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `aeroport`
--

INSERT INTO `aeroport` (`idAeroport`, `nomAeroport`, `nomPays`) VALUES
(4, 'Tunis-Carthage Airport', 'Tunis'),
(5, 'Aéroport international de Narita ', 'Japon'),
(6, ' Istanbul Airport ', 'Turquie'),
(7, ' Pearson de Toronto', 'Canada');

-- --------------------------------------------------------

--
-- Structure de la table `escale`
--

CREATE TABLE `escale` (
  `idAeroport` int(11) NOT NULL,
  `codeVol` varchar(255) NOT NULL,
  `heureDepart` varchar(255) NOT NULL,
  `heureArrive` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `escale`
--

INSERT INTO `escale` (`idAeroport`, `codeVol`, `heureDepart`, `heureArrive`) VALUES
(6, '9M6K', '14:00', '16:00'),
(6, '9M6K', '12:00', '19:00'),
(4, '5AD6', '13:00', '16:00');

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `firstname` varchar(255) NOT NULL,
  `lastname` varchar(255) NOT NULL,
  `login` varchar(255) NOT NULL,
  `pwd` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=armscii8 COLLATE=armscii8_general_ci;

--
-- Déchargement des données de la table `user`
--

INSERT INTO `user` (`id`, `firstname`, `lastname`, `login`, `pwd`) VALUES
(1, 'hanine', 'hassayoune', 'hassayounehanine@gmail.com', '123');

-- --------------------------------------------------------

--
-- Structure de la table `vol`
--

CREATE TABLE `vol` (
  `idVol` int(11) NOT NULL,
  `AeroportDepart` int(11) NOT NULL,
  `AeroportArrive` int(11) NOT NULL,
  `dateDepart` varchar(255) NOT NULL,
  `dateArrive` varchar(255) NOT NULL,
  `heureDepart` varchar(255) NOT NULL,
  `heureArrive` varchar(255) NOT NULL,
  `codeVol` varchar(255) NOT NULL,
  `reservable` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=armscii8 COLLATE=armscii8_general_ci;

--
-- Déchargement des données de la table `vol`
--

INSERT INTO `vol` (`idVol`, `AeroportDepart`, `AeroportArrive`, `dateDepart`, `dateArrive`, `heureDepart`, `heureArrive`, `codeVol`, `reservable`) VALUES
(19, 4, 6, '29-12-2023', '28-12-2023', '12:00', '10:00', '5AD6', 1),
(20, 4, 7, '30-12-2023', '28-12-2023', '16:00', '6:00', '9M6K', 0),
(21, 4, 7, '31-12-2023', '29-12-2023', '19:00', '03:00', '5POL', 1);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `aeroport`
--
ALTER TABLE `aeroport`
  ADD PRIMARY KEY (`idAeroport`);

--
-- Index pour la table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `vol`
--
ALTER TABLE `vol`
  ADD PRIMARY KEY (`idVol`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `aeroport`
--
ALTER TABLE `aeroport`
  MODIFY `idAeroport` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT pour la table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT pour la table `vol`
--
ALTER TABLE `vol`
  MODIFY `idVol` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

package wow.components;

import java.util.Arrays;

public enum Faction {
    F1(1, 3, 2, 12),
    F2(2, 5, 4, 10),
    F3(3, 3, 2, 12),
    F4(4, 3, 2, 12),
    F5(5, 5, 4, 10),
    F6(6, 5, 4, 10),
    F7(7, 0, 0, 0),
    F10(10, 3, 2, 0),
    F11(11, 3, 2, 12),
    F12(12, 2, 2, 4),
    F14(14, 8, 0, 1),
    F15(15, 0, 0, 0),
    F16(16, 8, 0, 1),
    F17(17, 8, 0, 1),
    F18(18, 8, 0, 1),
    F19(19, 8, 0, 1),
    F20(20, 8, 0, 1),
    F21(21, 8, 0, 1),
    F22(22, 8, 0, 1),
    F23(23, 2, 2, 4),
    F24(24, 8, 0, 1),
    F25(25, 8, 0, 0),
    F26(26, 8, 0, 1),
    F27(27, 8, 0, 1),
    F28(28, 8, 0, 1),
    F29(29, 4, 4, 2),
    F30(30, 8, 0, 1),
    F31(31, 0, 0, 0),
    F32(32, 0, 0, 0),
    F33(33, 5, 4, 0),
    F34(34, 8, 0, 0),
    F35(35, 0, 1, 0),
    F36(36, 0, 0, 0),
    F37(37, 8, 0, 1),
    F38(38, 8, 0, 1),
    F39(39, 8, 0, 1),
    F40(40, 8, 0, 1),
    F41(41, 8, 0, 1),
    F42(42, 1, 1, 0),
    F43(43, 8, 0, 0),
    F44(44, 8, 0, 1),
    F45(45, 8, 0, 1),
    F46(46, 8, 0, 1),
    F47(47, 8, 0, 1),
    F48(48, 8, 0, 1),
    F49(49, 8, 0, 1),
    F50(50, 8, 0, 1),
    F51(51, 8, 0, 1),
    F52(52, 8, 0, 0),
    F53(53, 2, 2, 12),
    F54(54, 8, 0, 1),
    F55(55, 2, 2, 4),
    F56(56, 2, 2, 12),
    F57(57, 3, 2, 12),
    F58(58, 8, 0, 0),
    F59(59, 8, 0, 1),
    F60(60, 8, 0, 1),
    F61(61, 8, 0, 1),
    F62(62, 8, 0, 1),
    F63(63, 8, 0, 1),
    F64(64, 2, 2, 4),
    F65(65, 0, 0, 0),
    F66(66, 8, 0, 1),
    F67(67, 8, 0, 1),
    F68(68, 4, 4, 2),
    F69(69, 0, 0, 0),
    F70(70, 8, 0, 1),
    F71(71, 5, 4, 10),
    F72(72, 8, 0, 1),
    F73(73, 8, 0, 1),
    F74(74, 8, 0, 1),
    F76(76, 0, 2, 4),
    F77(77, 8, 0, 0),
    F78(78, 8, 0, 1),
    F79(79, 3, 2, 12),
    F80(80, 2, 2, 4),
    F81(81, 8, 0, 1),
    F82(82, 8, 0, 1),
    F83(83, 4, 4, 2),
    F84(84, 2, 2, 4),
    F85(85, 5, 4, 10),
    F86(86, 0, 1, 0),
    F87(87, 8, 0, 1),
    F88(88, 2, 2, 4),
    F89(89, 8, 0, 1),
    F90(90, 8, 0, 1),
    F91(91, 8, 0, 1),
    F92(92, 8, 0, 1),
    F93(93, 8, 0, 1),
    F94(94, 0, 8, 0),
    F95(95, 8, 0, 1),
    F96(96, 2, 2, 0),
    F97(97, 8, 0, 0),
    F98(98, 4, 4, 10),
    F99(99, 8, 0, 0),
    F100(100, 0, 0, 9),
    F101(101, 0, 8, 4),
    F102(102, 0, 8, 2),
    F103(103, 8, 0, 1),
    F104(104, 4, 4, 2),
    F105(105, 5, 4, 10),
    F106(106, 4, 4, 10),
    F107(107, 8, 0, 1),
    F108(108, 0, 0, 0),
    F109(109, 8, 0, 1),
    F110(110, 8, 0, 1),
    F111(111, 8, 0, 1),
    F112(112, 8, 0, 1),
    F113(113, 1, 1, 0),
    F114(114, 0, 0, 1),
    F115(115, 3, 2, 12),
    F116(116, 5, 4, 10),
    F118(118, 4, 4, 2),
    F119(119, 8, 0, 1),
    F120(120, 0, 0, 0),
    F121(121, 1, 0, 8),
    F122(122, 2, 2, 4),
    F123(123, 2, 2, 4),
    F124(124, 2, 2, 4),
    F125(125, 4, 4, 2),
    F126(126, 4, 4, 2),
    F127(127, 0, 0, 1),
    F128(128, 8, 0, 1),
    F129(129, 8, 0, 1),
    F130(130, 8, 0, 1),
    F131(131, 8, 0, 1),
    F132(132, 8, 0, 1),
    F133(133, 8, 0, 1),
    F134(134, 8, 0, 1),
    F148(148, 8, 0, 1),
    F149(149, 2, 2, 0),
    F150(150, 3, 2, 12),
    F151(151, 2, 0, 4),
    F152(152, 8, 0, 1),
    F153(153, 8, 0, 0),
    F154(154, 8, 0, 1),
    F168(168, 0, 0, 1),
    F188(188, 0, 0, 0),
    F189(189, 0, 0, 0),
    F190(190, 0, 0, 0),
    F208(208, 2, 2, 0),
    F209(209, 2, 2, 0),
    F210(210, 2, 2, 12),
    F230(230, 8, 0, 1),
    F231(231, 3, 2, 8),
    F232(232, 5, 4, 8),
    F233(233, 8, 0, 1),
    F250(250, 1, 1, 8),
    F270(270, 8, 0, 1),
    F290(290, 1, 1, 0),
    F310(310, 8, 0, 1),
    F311(311, 8, 0, 0),
    F312(312, 8, 0, 1),
    F330(330, 8, 0, 0),
    F350(350, 8, 0, 0),
    F370(370, 8, 8, 1),
    F371(371, 2, 2, 4),
    F390(390, 0, 0, 0),
    F410(410, 8, 0, 1),
    F411(411, 8, 0, 1),
    F412(412, 4, 4, 2),
    F413(413, 8, 0, 1),
    F414(414, 8, 0, 1),
    F415(415, 8, 0, 1),
    F416(416, 8, 0, 0),
    F430(430, 0, 0, 0),
    F450(450, 8, 0, 1),
    F470(470, 8, 0, 1),
    F471(471, 0, 0, 0),
    F472(472, 8, 0, 1),
    F473(473, 0, 0, 0),
    F474(474, 0, 0, 0),
    F475(475, 1, 0, 8),
    F494(494, 8, 0, 1),
    F495(495, 1, 1, 8),
    F514(514, 8, 0, 1),
    F534(534, 2, 2, 0),
    F554(554, 8, 0, 7),
    F574(574, 8, 0, 1),
    F575(575, 8, 0, 1),
    F594(594, 8, 0, 0),
    F614(614, 0, 1, 0),
    F634(634, 8, 0, 0),
    F635(635, 0, 0, 0),
    F636(636, 8, 0, 1),
    F637(637, 1, 0, 8),
    F654(654, 8, 0, 1),
    F655(655, 8, 0, 5),
    F674(674, 0, 0, 0),
    F694(694, 2, 2, 4),
    F695(695, 0, 0, 0),
    F714(714, 4, 4, 0),
    F734(734, 1, 1, 0),
    F735(735, 1, 1, 0),
    F736(736, 8, 0, 1),
    F754(754, 8, 0, 1),
    F774(774, 3, 2, 0),
    F775(775, 5, 4, 0),
    F776(776, 0, 0, 0),
    F777(777, 1, 1, 0),
    F778(778, 8, 0, 1),
    F794(794, 0, 0, 0),
    F795(795, 8, 0, 1),
    F814(814, 0, 0, 0),
    F834(834, 8, 0, 1),
    F854(854, 1, 0, 8),
    F855(855, 0, 0, 0),
    F874(874, 2, 2, 4),
    F875(875, 2, 2, 4),
    F876(876, 4, 4, 2),
    F877(877, 5, 4, 10),
    F894(894, 2, 2, 4),
    F914(914, 0, 0, 0),
    F934(934, 8, 0, 1),
    F954(954, 8, 0, 1),
    F974(974, 8, 0, 1),
    F994(994, 0, 0, 0),
    F995(995, 4, 4, 2),
    F996(996, 1, 0, 8),
    F1014(1014, 0, 0, 0),
    F1015(1015, 0, 0, 0),
    F1034(1034, 4, 0, 2),
    F1054(1054, 3, 2, 12),
    F1055(1055, 2, 2, 4),
    F1074(1074, 4, 4, 2),
    F1075(1075, 2, 2, 4),
    F1076(1076, 2, 2, 4),
    F1077(1077, 2, 2, 4),
    F1078(1078, 2, 2, 4),
    F1080(1080, 0, 1, 0),
    F1081(1081, 8, 0, 1),
    F1094(1094, 0, 0, 0),
    F1095(1095, 0, 0, 0),
    F1096(1096, 3, 2, 12),
    F1097(1097, 2, 2, 4),
    F1114(1114, 8, 0, 1),
    F1134(1134, 5, 4, 10),
    F1154(1154, 5, 4, 10),
    F1174(1174, 4, 4, 2),
    F1194(1194, 0, 0, 0),
    F1214(1214, 5, 4, 10),
    F1215(1215, 4, 4, 2),
    F1216(1216, 3, 2, 12),
    F1217(1217, 2, 2, 4),
    F1234(1234, 8, 0, 1),
    F1235(1235, 8, 0, 1),
    F1236(1236, 8, 0, 1),
    F1254(1254, 1, 0, 8),
    F1274(1274, 0, 0, 4),
    F1275(1275, 0, 0, 2),
    F1294(1294, 8, 0, 1),
    F1314(1314, 4, 4, 2),
    F1315(1315, 2, 2, 4),
    F1334(1334, 2, 2, 4),
    F1335(1335, 4, 4, 2),
    F1354(1354, 0, 0, 0),
    F1355(1355, 0, 0, 0),
    F1374(1374, 8, 0, 1),
    F1375(1375, 0, 0, 9),
    F1394(1394, 8, 0, 1),
    F1395(1395, 8, 0, 1),
    F1414(1414, 0, 0, 4),
    F1415(1415, 0, 0, 2),
    F1434(1434, 8, 0, 1),
    F1454(1454, 0, 1, 0),
    F1474(1474, 0, 0, 0),
    F1475(1475, 0, 0, 0),
    F1494(1494, 4, 4, 2),
    F1495(1495, 5, 4, 10),
    F1496(1496, 4, 4, 2),
    F1514(1514, 2, 2, 4),
    F1515(1515, 4, 4, 2),
    F1534(1534, 2, 2, 4),
    F1554(1554, 5, 4, 8),
    F1555(1555, 0, 0, 0),
    F1574(1574, 0, 0, 0),
    F1575(1575, 3, 2, 12),
    F1576(1576, 2, 2, 4),
    F1577(1577, 2, 2, 4),
    F1594(1594, 3, 2, 12),
    F1595(1595, 5, 4, 10),
    F1596(1596, 3, 2, 12),
    F1597(1597, 5, 4, 10),
    F1598(1598, 4, 4, 2),
    F1599(1599, 2, 2, 4),
    F1600(1600, 2, 2, 8),
    F1601(1601, 0, 0, 0),
    F1602(1602, 4, 4, 2),
    F1603(1603, 5, 4, 10),
    F1604(1604, 4, 4, 2),
    F1605(1605, 0, 0, 1),
    F1606(1606, 0, 4, 2),
    F1607(1607, 0, 4, 2),
    F1608(1608, 1, 0, 8),
    F1610(1610, 5, 4, 10),
    F1611(1611, 3, 2, 4),
    F1612(1612, 5, 4, 2),
    F1613(1613, 1, 1, 0),
    F1614(1614, 8, 0, 1),
    F1615(1615, 1, 0, 8),
    F1616(1616, 0, 15, 0),
    F1617(1617, 0, 0, 1),
    F1618(1618, 2, 2, 12),
    F1619(1619, 4, 4, 10),
    F1620(1620, 0, 0, 15),
    F1621(1621, 2, 0, 4),
    F1622(1622, 2, 0, 4),
    F1623(1623, 4, 4, 2),
    F1624(1624, 1, 0, 8),
    F1625(1625, 1, 0, 8),
    F1626(1626, 8, 0, 1),
    F1627(1627, 4, 4, 2),
    F1628(1628, 4, 4, 2),
    F1629(1629, 3, 2, 12),
    F1630(1630, 0, 0, 15),
    F1634(1634, 8, 0, 0),
    F1635(1635, 0, 0, 0),
    F1636(1636, 4, 4, 2),
    F1637(1637, 4, 4, 2),
    F1638(1638, 2, 2, 4),
    F1639(1639, 3, 2, 12),
    F1640(1640, 2, 2, 4),
    F1641(1641, 4, 4, 2),
    F1642(1642, 2, 2, 4),
    F1643(1643, 8, 0, 1),
    F1644(1644, 2, 2, 4),
    F1645(1645, 3, 2, 12),
    F1646(1646, 2, 2, 4),
    F1647(1647, 3, 2, 12),
    F1648(1648, 2, 2, 4),
    F1649(1649, 2, 2, 4),
    F1650(1650, 5, 4, 10),
    F1651(1651, 4, 4, 2),
    F1652(1652, 4, 4, 2),
    F1653(1653, 4, 4, 2),
    F1654(1654, 2, 2, 4),
    F1655(1655, 2, 2, 4),
    F1656(1656, 5, 4, 10),
    F1657(1657, 4, 4, 2),
    F1658(1658, 4, 4, 2),
    F1659(1659, 1, 0, 8),
    F1660(1660, 1, 0, 8),
    F1661(1661, 1, 0, 8),
    F1662(1662, 8, 0, 1),
    F1663(1663, 8, 0, 1),
    F1664(1664, 8, 0, 1),
    F1665(1665, 2080, 1, 7),
    F1666(1666, 3, 2, 12),
    F1667(1667, 2, 2, 4),
    F1668(1668, 5, 4, 10),
    F1669(1669, 4, 4, 2),
    F1670(1670, 4, 4, 2),
    F1671(1671, 2, 2, 4),
    F1672(1672, 1, 7, 0),
    F1673(1673, 0, 0, 0),
    F1674(1674, 0, 15, 0),
    F1675(1675, 0, 15, 0),
    F1676(1676, 0, 15, 0),
    F1677(1677, 0, 15, 0),
    F1678(1678, 8, 0, 1),
    F1679(1679, 8, 0, 1),
    F1680(1680, 0, 1, 0),
    F1681(1681, 8, 0, 1),
    F1682(1682, 0, 0, 0),
    F1683(1683, 0, 0, 0),
    F1684(1684, 0, 0, 0),
    F1685(1685, 2, 0, 4),
    F1686(1686, 2, 2, 4),
    F1687(1687, 8, 0, 1),
    F1688(1688, 0, 1, 0),
    F1689(1689, 0, 1, 0),
    F1690(1690, 0, 1, 0),
    F1691(1691, 0, 1, 0),
    F1692(1692, 8, 8, 1),
    F1693(1693, 8, 8, 1),
    F1694(1694, 2, 2, 4),
    F1695(1695, 4, 4, 2),
    F1696(1696, 0, 0, 0),
    F1697(1697, 8, 0, 1),
    F1698(1698, 2, 2, 4),
    F1699(1699, 2, 2, 4),
    F1700(1700, 2, 2, 4),
    F1701(1701, 8, 0, 7),
    F1702(1702, 8, 0, 7),
    F1703(1703, 0, 0, 0),
    F1704(1704, 8, 0, 1),
    F1705(1705, 8, 0, 1),
    F1706(1706, 8, 0, 1),
    F1707(1707, 1, 0, 8),
    F1708(1708, 1, 0, 8),
    F1709(1709, 1, 0, 8),
    F1710(1710, 1, 0, 8),
    F1711(1711, 8, 0, 1),
    F1712(1712, 8, 0, 1),
    F1713(1713, 8, 0, 1),
    F1714(1714, 8, 0, 7),
    F1715(1715, 8, 0, 1),
    F1716(1716, 0, 1, 8),
    F1717(1717, 0, 1, 0),
    F1718(1718, 0, 1, 0),
    F1719(1719, 0, 1, 8),
    F1720(1720, 8, 0, 1),
    F1721(1721, 3, 2, 12),
    F1722(1722, 2, 2, 4),
    F1723(1723, 2, 2, 4),
    F1724(1724, 2, 2, 4),
    F1725(1725, 0, 7, 8),
    F1726(1726, 0, 7, 0),
    F1727(1727, 0, 7, 8),
    F1728(1728, 1, 0, 8),
    F1729(1729, 4, 4, 2),
    F1730(1730, 1, 0, 8),
    F1731(1731, 1, 0, 8),
    F1732(1732, 2, 2, 4),
    F1733(1733, 2, 2, 4),
    F1734(1734, 4, 4, 2),
    F1735(1735, 4, 4, 2),
    F1736(1736, 8, 8, 0),
    F1737(1737, 2, 2, 4),
    F1738(1738, 8, 0, 1),
    F1739(1739, 0, 0, 1),
    F1740(1740, 0, 0, 1),
    F1741(1741, 1, 0, 8),
    F1742(1742, 0, 0, 1),
    F1743(1743, 0, 0, 0),
    F1744(1744, 0, 0, 0),
    F1745(1745, 4, 4, 2),
    F1746(1746, 0, 0, 0),
    F1747(1747, 1, 1, 0),
    F1748(1748, 8, 0, 1),
    F1749(1749, 0, 0, 0),
    F1750(1750, 8, 0, 1),
    F1751(1751, 8, 0, 1),
    F1752(1752, 8, 0, 7),
    F1753(1753, 8, 0, 7),
    F1754(1754, 8, 0, 7),
    F1755(1755, 2, 2, 0),
    F1756(1756, 2, 2, 0),
    F1757(1757, 2, 2, 0),
    F1758(1758, 4, 4, 0),
    F1759(1759, 4, 4, 0),
    F1760(1760, 4, 4, 0),
    F1761(1761, 0, 0, 15),
    F1762(1762, 0, 0, 7),
    F1763(1763, 0, 0, 7),
    F1764(1764, 0, 0, 7),
    F1765(1765, 0, 0, 7),
    F1766(1766, 0, 0, 0),
    F1767(1767, 0, 0, 0),
    F1768(1768, 0, 0, 15),
    F1769(1769, 0, 0, 15),
    F1770(1770, 0, 1, 0),
    F1771(1771, 0, 0, 1),
    F1772(1772, 8, 0, 1),
    F1773(1773, 0, 1, 0),
    F1774(1774, 0, 1, 0),
    F1775(1775, 1, 0, 8),
    F1776(1776, 0, 0, 0),
    F1777(1777, 0, 0, 0),
    F1778(1778, 0, 0, 0),
    F1779(1779, 0, 0, 0),
    F1780(1780, 8, 0, 1),
    F1781(1781, 8, 0, 1),
    F1782(1782, 8, 0, 1),
    F1783(1783, 8, 0, 1),
    F1784(1784, 8, 0, 1),
    F1785(1785, 8, 0, 1),
    F1786(1786, 8, 0, 1),
    F1787(1787, 8, 0, 1),
    F1788(1788, 1, 0, 8),
    F1789(1789, 8, 0, 7),
    F1790(1790, 8, 0, 1),
    F1791(1791, 8, 0, 1),
    F1792(1792, 8, 0, 1),
    F1793(1793, 8, 0, 7),
    F1794(1794, 0, 1, 0),
    F1795(1795, 0, 1, 0),
    F1796(1796, 8, 0, 1),
    F1797(1797, 0, 1, 0),
    F1798(1798, 8, 0, 1),
    F1799(1799, 8, 0, 1),
    F1800(1800, 8, 0, 1),
    F1801(1801, 5, 4, 10),
    F1802(1802, 3, 2, 12),
    F1803(1803, 0, 0, 4),
    F1804(1804, 0, 0, 2),
    F1805(1805, 1, 1, 0),
    F1806(1806, 0, 1, 8),
    F1807(1807, 1, 1, 8),
    F1808(1808, 8, 0, 1),
    F1809(1809, 8, 0, 1),
    F1810(1810, 8, 0, 1),
    F1811(1811, 8, 0, 1),
    F1812(1812, 0, 1, 8),
    F1813(1813, 8, 0, 1),
    F1814(1814, 8, 8, 1),
    F1815(1815, 8, 0, 1),
    F1816(1816, 0, 1, 0),
    F1818(1818, 0, 0, 0),
    F1819(1819, 2, 2, 12),
    F1820(1820, 0, 0, 0),
    F1821(1821, 0, 1, 0),
    F1822(1822, 0, 1, 0),
    F1823(1823, 8, 0, 1),
    F1824(1824, 0, 0, 0),
    F1825(1825, 0, 0, 15),
    F1826(1826, 8, 0, 1),
    F1827(1827, 8, 0, 1),
    F1828(1828, 0, 0, 0),
    F1829(1829, 0, 1, 0),
    F1830(1830, 0, 1, 0),
    F1831(1831, 0, 1, 0),
    F1832(1832, 0, 1, 0),
    F1833(1833, 0, 1, 0),
    F1834(1834, 0, 0, 15),
    F1835(1835, 4, 4, 10),
    F1836(1836, 1, 0, 8),
    F1837(1837, 1, 0, 8),
    F1838(1838, 0, 0, 0),
    F1839(1839, 8, 0, 1),
    F1840(1840, 1, 7, 0),
    F1841(1841, 0, 1, 0),
    F1842(1842, 0, 0, 1),
    F1843(1843, 8, 0, 1),
    F1844(1844, 0, 0, 0),
    F1845(1845, 0, 0, 0),
    F1846(1846, 8, 0, 1),
    F1847(1847, 8, 8, 1),
    F1848(1848, 8, 8, 1),
    F1849(1849, 8, 0, 1),
    F1850(1850, 0, 0, 0),
    F1851(1851, 1, 0, 8),
    F1852(1852, 0, 1, 0),
    F1853(1853, 8, 0, 1),
    F1854(1854, 0, 0, 0),
    F1855(1855, 0, 0, 0),
    F1856(1856, 1, 0, 0),
    F1857(1857, 1, 1, 8),
    F1858(1858, 0, 1, 0),
    F1859(1859, 0, 1, 0),
    F1860(1860, 0, 1, 0),
    F1862(1862, 8, 0, 1),
    F1863(1863, 8, 0, 1),
    F1864(1864, 8, 0, 1),
    F1865(1865, 8, 0, 1),
    F1866(1866, 1, 0, 0),
    F1867(1867, 0, 1, 0),
    F1868(1868, 0, 1, 0),
    F1869(1869, 8, 0, 0),
    F1870(1870, 1, 0, 0),
    F1871(1871, 8, 0, 1),
    F1872(1872, 1, 0, 0),
    F1873(1873, 8, 0, 1),
    F1874(1874, 1, 0, 0),
    F1875(1875, 0, 0, 0),
    F1876(1876, 0, 0, 0),
    F1877(1877, 8, 0, 1),
    F1878(1878, 8, 0, 1),
    F1879(1879, 8, 0, 1),
    F1880(1880, 8, 0, 1),
    F1881(1881, 8, 0, 1),
    F1882(1882, 8, 0, 1),
    F1883(1883, 8, 0, 7),
    F1890(1890, 8, 0, 1),
    F1896(1896, 1, 1, 8),
    F1909(1909, 0, 0, 9),
    F1913(1913, 0, 7, 0),
    F1916(1916, 0, 1, 0),
    F1930(1930, 0, 0, 0),
    F1931(1931, 0, 0, 0),
    F1934(1934, 2, 2, 4),
    F1935(1935, 4, 4, 2),
    F1936(1936, 0, 0, 0),
    F1937(1937, 0, 0, 0),
    F1938(1938, 0, 0, 0),
    F1939(1939, 0, 0, 0),
    F1940(1940, 0, 0, 0),
    F1941(1941, 0, 0, 0),
    F1942(1942, 0, 0, 0),
    F1943(1943, 0, 0, 0),
    F1944(1944, 0, 0, 0),
    F1945(1945, 0, 0, 0),
    F1951(1951, 2, 2, 12),
    F1952(1952, 0, 1, 0),
    F1956(1956, 1, 0, 0),
    F1957(1957, 1, 0, 0),
    F1958(1958, 8, 0, 1),
    F1959(1959, 0, 1, 0),
    F1960(1960, 1, 0, 0),
    F1961(1961, 0, 15, 0),
    F1962(1962, 8, 0, 1),
    F1963(1963, 8, 0, 1),
    F1964(1964, 8, 0, 1),
    F1965(1965, 8, 8, 1),
    F1966(1966, 8, 0, 0),
    F1967(1967, 1, 0, 0),
    F1971(1971, 0, 1, 0),
    F1972(1972, 0, 0, 0);

    private static final Faction[] factions;

    static {
        int maxFactionId = Arrays.stream(values()).map((faction) -> {
            return faction.id;
        }).max(Integer::compare).orElse(Integer.valueOf(1972)).intValue();
        factions = new Faction[maxFactionId + 1];
        Arrays.stream(values()).forEach((faction) -> {
            factions[faction.id] = faction;
        });
    }

    public final int id;
    public final int ourMask;
    public final int friendlyMask;
    public final int hostileMask;

    private Faction(
        int id,
        int ourMask,
        int friendlyMask,
        int hostileMask)
    {
        this.id = id;
        this.ourMask = ourMask;
        this.friendlyMask = friendlyMask;
        this.hostileMask = hostileMask;
    }

    public static Faction getFaction(int id) {
        try {
            Faction faction = factions[id];
            if (faction == null) {
                throw new RuntimeException("Unknown factoin: " + id);
            } else {
                return faction;
            }
        } catch (Exception var2) {
            return null;
        }
    }

    public boolean isHorde() {
        return this.id == 2 || this.id == 5 || this.id == 6 || this.id == 116 || this.id == 1610;
    }

    public boolean isAlliance() {
        return this.id == 1 || this.id == 3 || this.id == 4 || this.id == 115 || this.id == 1629;
    }

    public String getFactionName() {
        if (isHorde()) {
            return "horde";
        }
        return "alliance";
    }

    public String toString() {
        return "Factions{id=" + this.id + ", ourMask=" + this.ourMask + ", friendlyMask=" + this.friendlyMask + ", hostileMask=" + this.hostileMask + '}';
    }
}

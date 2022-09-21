/**
 * 
 */
package co.edu.uniquindio.proyecto.modelo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Cristian
 *
 */
public class Ascii {

	private Map<Integer, Character> codigo_ascii;
	
	private Map<Character, Integer> codigo_ascii_inv;
	
	/**
	 * Este constructor inicializa los valores de dos diccionrios, los cuales tienen la informacion del codigo ascii hasta el caracter 255
	 * Se necesitan dos porque asi se puede acceder facil a al informacion con la llave de cada uno
	 */
	public Ascii() {
		// TODO Auto-generated constructor stub
		
		this.codigo_ascii = new HashMap<>();
		
		this.codigo_ascii.put(1, '☺');
		this.codigo_ascii.put(2, '☻');
		this.codigo_ascii.put(3, '♥');
		this.codigo_ascii.put(4, '♦');
		this.codigo_ascii.put(5, '♣');
		this.codigo_ascii.put(6, '♠');
		this.codigo_ascii.put(7, '•');
		this.codigo_ascii.put(8, '◘');
		this.codigo_ascii.put(9, '○');
		this.codigo_ascii.put(10, '◙');
		this.codigo_ascii.put(11, '♂');
		this.codigo_ascii.put(12, '♀');
		this.codigo_ascii.put(13, '♪');
		this.codigo_ascii.put(14, '♫');
		this.codigo_ascii.put(15, '☼');
		this.codigo_ascii.put(16, '►');
		this.codigo_ascii.put(17, '◄');
		this.codigo_ascii.put(18, '↕');
		this.codigo_ascii.put(19, '‼');
		this.codigo_ascii.put(20, '¶');
		this.codigo_ascii.put(21, '§');
		this.codigo_ascii.put(22, '▬');
		this.codigo_ascii.put(23, '↨');
		this.codigo_ascii.put(24, '↑');
		
		this.codigo_ascii.put(25, '↓');
		this.codigo_ascii.put(26, '→');
		this.codigo_ascii.put(27, '←');
		this.codigo_ascii.put(28, '∟');
		this.codigo_ascii.put(29, '↔');
		this.codigo_ascii.put(30, '▲');
		this.codigo_ascii.put(31, '▼');
		this.codigo_ascii.put(32, ' ');
		this.codigo_ascii.put(33, '!');
		this.codigo_ascii.put(34, '"');
		this.codigo_ascii.put(35, '#');
		this.codigo_ascii.put(36, '$');
		this.codigo_ascii.put(37, '%');
		this.codigo_ascii.put(38, '&');
		this.codigo_ascii.put(39, '\'');
		this.codigo_ascii.put(40, '(');
		this.codigo_ascii.put(41, ')');
		this.codigo_ascii.put(42, '*');
		this.codigo_ascii.put(43, '+');
		this.codigo_ascii.put(44, ',');
		this.codigo_ascii.put(45, '-');
		this.codigo_ascii.put(46, '.');
		this.codigo_ascii.put(47, '/');
		this.codigo_ascii.put(48, '0');
		
		this.codigo_ascii.put(49, '1');
		this.codigo_ascii.put(50, '2');
		this.codigo_ascii.put(51, '3');
		this.codigo_ascii.put(52, '4');
		this.codigo_ascii.put(53, '5');
		this.codigo_ascii.put(54, '6');
		this.codigo_ascii.put(55, '7');
		this.codigo_ascii.put(56, '8');
		this.codigo_ascii.put(57, '9');
		this.codigo_ascii.put(58, ';');
		this.codigo_ascii.put(59, ';');
		this.codigo_ascii.put(60, '<');
		this.codigo_ascii.put(61, '=');
		this.codigo_ascii.put(62, '>');
		this.codigo_ascii.put(63, '?');
		this.codigo_ascii.put(64, '@');
		this.codigo_ascii.put(65, 'A');
		this.codigo_ascii.put(66, 'B');
		this.codigo_ascii.put(67, 'C');
		this.codigo_ascii.put(68, 'D');
		this.codigo_ascii.put(69, 'E');
		this.codigo_ascii.put(70, 'F');
		this.codigo_ascii.put(71, 'G');
		this.codigo_ascii.put(72, 'H');
		
		this.codigo_ascii.put(73, 'I');
		this.codigo_ascii.put(74, 'J');
		this.codigo_ascii.put(75, 'K');
		this.codigo_ascii.put(76, 'L');
		this.codigo_ascii.put(77, 'M');
		this.codigo_ascii.put(78, 'N');
		this.codigo_ascii.put(79, 'O');
		this.codigo_ascii.put(80, 'P');
		this.codigo_ascii.put(81, 'Q');
		this.codigo_ascii.put(82, 'R');
		this.codigo_ascii.put(83, 'S');
		this.codigo_ascii.put(84, 'T');
		this.codigo_ascii.put(85, 'U');
		this.codigo_ascii.put(86, 'V');
		this.codigo_ascii.put(87, 'W');
		this.codigo_ascii.put(88, 'X');
		this.codigo_ascii.put(89, 'Y');
		this.codigo_ascii.put(90, 'Z');
		this.codigo_ascii.put(91, '[');
		this.codigo_ascii.put(92, '\\');
		this.codigo_ascii.put(93, ']');
		this.codigo_ascii.put(94, '^');
		this.codigo_ascii.put(95, '_');
		this.codigo_ascii.put(96, '`');
		
		this.codigo_ascii.put(97, 'a');
		this.codigo_ascii.put(98, 'b');
		this.codigo_ascii.put(99, 'c');
		this.codigo_ascii.put(100, 'd');
		this.codigo_ascii.put(101, 'e');
		this.codigo_ascii.put(102, 'f');
		this.codigo_ascii.put(103, 'g');
		this.codigo_ascii.put(104, 'h');
		this.codigo_ascii.put(105, 'i');
		this.codigo_ascii.put(106, 'j');
		this.codigo_ascii.put(107, 'k');
		this.codigo_ascii.put(108, 'l');
		this.codigo_ascii.put(109, 'm');
		this.codigo_ascii.put(110, 'n');
		this.codigo_ascii.put(111, 'o');
		this.codigo_ascii.put(112, 'p');
		this.codigo_ascii.put(113, 'q');
		this.codigo_ascii.put(114, 'r');
		this.codigo_ascii.put(115, 's');
		this.codigo_ascii.put(116, 't');
		this.codigo_ascii.put(117, 'u');
		this.codigo_ascii.put(118, 'v');
		this.codigo_ascii.put(119, 'w');
		this.codigo_ascii.put(120, 'x');
		
		this.codigo_ascii.put(121, 'y');
		this.codigo_ascii.put(122, 'z');
		this.codigo_ascii.put(123, '{');
		this.codigo_ascii.put(124, '|');
		this.codigo_ascii.put(125, '}');
		this.codigo_ascii.put(126, '~');
		this.codigo_ascii.put(127, '⌂');
		this.codigo_ascii.put(128, 'Ç');
		this.codigo_ascii.put(129, 'ü');
		this.codigo_ascii.put(130, 'é');
		this.codigo_ascii.put(131, 'â');
		this.codigo_ascii.put(132, 'ä');
		this.codigo_ascii.put(133, 'à');
		this.codigo_ascii.put(134, 'å');
		this.codigo_ascii.put(135, 'ç');
		this.codigo_ascii.put(136, 'ê');
		this.codigo_ascii.put(137, 'ë');
		this.codigo_ascii.put(138, 'è');
		this.codigo_ascii.put(139, 'ï');
		this.codigo_ascii.put(140, 'î');
		this.codigo_ascii.put(141, 'ì');
		this.codigo_ascii.put(142, 'Ä');
		this.codigo_ascii.put(143, 'Å');
		this.codigo_ascii.put(144, 'É');
		
		this.codigo_ascii.put(145, 'æ');
		this.codigo_ascii.put(146, 'Æ');
		this.codigo_ascii.put(147, 'ô');
		this.codigo_ascii.put(148, 'ö');
		this.codigo_ascii.put(149, 'ò');
		this.codigo_ascii.put(150, 'û');
		this.codigo_ascii.put(151, 'ù');
		this.codigo_ascii.put(152, 'ÿ');
		this.codigo_ascii.put(153, 'Ö');
		this.codigo_ascii.put(154, 'Ü');
		this.codigo_ascii.put(155, 'ø');
		this.codigo_ascii.put(156, '£');
		this.codigo_ascii.put(157, 'Ø');
		this.codigo_ascii.put(158, '×');
		this.codigo_ascii.put(159, 'ƒ');
		this.codigo_ascii.put(160, 'á');
		this.codigo_ascii.put(161, '%');
		this.codigo_ascii.put(162, 'ó');
		this.codigo_ascii.put(163, 'ú');
		this.codigo_ascii.put(164, 'ñ');
		this.codigo_ascii.put(165, 'Ñ');
		this.codigo_ascii.put(166, 'ª');
		this.codigo_ascii.put(167, 'º');
		this.codigo_ascii.put(168, '¿');
		
		this.codigo_ascii.put(169, '®');
		this.codigo_ascii.put(170, '¬');
		this.codigo_ascii.put(171, '½');
		this.codigo_ascii.put(172, '¼');
		this.codigo_ascii.put(173, '¡');
		this.codigo_ascii.put(174, '«');
		this.codigo_ascii.put(175, '»');
		this.codigo_ascii.put(176, '░');
		this.codigo_ascii.put(177, '▒');
		this.codigo_ascii.put(178, '▓');
		this.codigo_ascii.put(179, '│');
		this.codigo_ascii.put(180, '┤');
		this.codigo_ascii.put(181, 'Á');
		this.codigo_ascii.put(182, 'Â');
		this.codigo_ascii.put(183, 'À');
		this.codigo_ascii.put(184, '©');
		this.codigo_ascii.put(185, '╣');
		this.codigo_ascii.put(186, '║');
		this.codigo_ascii.put(187, '╗');
		this.codigo_ascii.put(188, '╝');
		this.codigo_ascii.put(189, '¢');
		this.codigo_ascii.put(190, '¥');
		this.codigo_ascii.put(191, '┐');
		this.codigo_ascii.put(192, '└');
		
		this.codigo_ascii.put(193, '┴');
		this.codigo_ascii.put(194, '┬');
		this.codigo_ascii.put(195, '├');
		this.codigo_ascii.put(196, '─');
		this.codigo_ascii.put(197, '┼');
		this.codigo_ascii.put(198, 'ã');
		this.codigo_ascii.put(199, 'Ã');
		this.codigo_ascii.put(200, '╚');
		this.codigo_ascii.put(201, '╔');
		this.codigo_ascii.put(202, '╩');
		this.codigo_ascii.put(203, '╦');
		this.codigo_ascii.put(204, '╠');
		this.codigo_ascii.put(205, '═');
		this.codigo_ascii.put(206, '╬');
		this.codigo_ascii.put(207, '¶');
		this.codigo_ascii.put(208, 'ð');
		this.codigo_ascii.put(209, 'Ð');
		this.codigo_ascii.put(210, 'Ê');
		this.codigo_ascii.put(211, 'Ë');
		this.codigo_ascii.put(212, 'È');
		this.codigo_ascii.put(213, 'ı');
		this.codigo_ascii.put(214, 'Í');
		this.codigo_ascii.put(215, 'Î');
		this.codigo_ascii.put(216, 'Ï');
		
		this.codigo_ascii.put(217, '┘');
		this.codigo_ascii.put(218, '┌');
		this.codigo_ascii.put(219, '█');
		this.codigo_ascii.put(220, '▄');
		this.codigo_ascii.put(221, '¦');
		this.codigo_ascii.put(222, 'Ì');
		this.codigo_ascii.put(223, '▀');
		this.codigo_ascii.put(224, 'Ó');
		this.codigo_ascii.put(225, 'ß');
		this.codigo_ascii.put(226, 'Ô');
		this.codigo_ascii.put(227, 'Ò');
		this.codigo_ascii.put(228, 'õ');
		this.codigo_ascii.put(229, 'Õ');
		this.codigo_ascii.put(230, 'µ');
		this.codigo_ascii.put(231, 'þ');
		this.codigo_ascii.put(232, 'Þ');
		this.codigo_ascii.put(233, 'Ú');
		this.codigo_ascii.put(234, 'Û');
		this.codigo_ascii.put(235, 'Ù');
		this.codigo_ascii.put(236, 'ý');
		this.codigo_ascii.put(237, 'Ý');
		this.codigo_ascii.put(238, '¯');
		this.codigo_ascii.put(239, '´');
		this.codigo_ascii.put(240, '­');
		
		this.codigo_ascii.put(241, '±');
		this.codigo_ascii.put(242, '‗');
		this.codigo_ascii.put(243, '¾');
		this.codigo_ascii.put(244, '¶');
		this.codigo_ascii.put(245, '§');
		this.codigo_ascii.put(246, '÷');
		this.codigo_ascii.put(247, '¸');
		this.codigo_ascii.put(248, '°');
		this.codigo_ascii.put(249, '¨');
		this.codigo_ascii.put(250, '·');
		this.codigo_ascii.put(251, '¹');
		this.codigo_ascii.put(252, '³');
		this.codigo_ascii.put(253, '²');
		this.codigo_ascii.put(254, '■');
		this.codigo_ascii.put(255, ' ');
		
		this.codigo_ascii_inv = new HashMap<>();
		
		this.codigo_ascii_inv.put('☺', 1);
		this.codigo_ascii_inv.put('☻', 2);
		this.codigo_ascii_inv.put('♥', 3);
		this.codigo_ascii_inv.put('♦', 4);
		this.codigo_ascii_inv.put('♣', 5);
		this.codigo_ascii_inv.put('♠', 6);
		this.codigo_ascii_inv.put('•', 7);
		this.codigo_ascii_inv.put('◘', 8);
		this.codigo_ascii_inv.put('○', 9);
		this.codigo_ascii_inv.put('◙', 10);
		this.codigo_ascii_inv.put('♂', 11);
		this.codigo_ascii_inv.put('♀', 12);
		this.codigo_ascii_inv.put('♪', 13);
		this.codigo_ascii_inv.put('♫', 14);
		this.codigo_ascii_inv.put('☼', 15);
		this.codigo_ascii_inv.put('►', 16);
		this.codigo_ascii_inv.put('◄', 17);
		this.codigo_ascii_inv.put('↕', 18);
		this.codigo_ascii_inv.put('‼', 19);
		this.codigo_ascii_inv.put('¶', 20);
		this.codigo_ascii_inv.put('§', 21);
		this.codigo_ascii_inv.put('▬', 22);
		this.codigo_ascii_inv.put('↨', 23);
		this.codigo_ascii_inv.put('↑', 24);
		this.codigo_ascii_inv.put('↓', 25);
		this.codigo_ascii_inv.put('→', 26);
		this.codigo_ascii_inv.put('←', 27);
		this.codigo_ascii_inv.put('∟', 28);
		this.codigo_ascii_inv.put('↔', 29);
		this.codigo_ascii_inv.put('▲', 30);
		this.codigo_ascii_inv.put('▼', 31);
		this.codigo_ascii_inv.put(' ', 32);
		this.codigo_ascii_inv.put('!', 33);
		this.codigo_ascii_inv.put('"', 34);
		this.codigo_ascii_inv.put('#', 35);
		this.codigo_ascii_inv.put('$', 36);
		this.codigo_ascii_inv.put('%', 37);
		this.codigo_ascii_inv.put('&', 38);
		this.codigo_ascii_inv.put('\'', 39);
		this.codigo_ascii_inv.put('(', 40);
		this.codigo_ascii_inv.put(')', 41);
		this.codigo_ascii_inv.put('*', 42);
		this.codigo_ascii_inv.put('+', 43);
		this.codigo_ascii_inv.put(',', 44);
		this.codigo_ascii_inv.put('-', 45);
		this.codigo_ascii_inv.put('.', 46);
		this.codigo_ascii_inv.put('/', 47);
		this.codigo_ascii_inv.put('0', 48);
		this.codigo_ascii_inv.put('1', 49);
		this.codigo_ascii_inv.put('2', 50);
		this.codigo_ascii_inv.put('3', 51);
		this.codigo_ascii_inv.put('4', 52);
		this.codigo_ascii_inv.put('5', 53);
		this.codigo_ascii_inv.put('6', 54);
		this.codigo_ascii_inv.put('7', 55);
		this.codigo_ascii_inv.put('8', 56);
		this.codigo_ascii_inv.put('9', 57);
		this.codigo_ascii_inv.put(';', 58);
		this.codigo_ascii_inv.put(';', 59);
		this.codigo_ascii_inv.put('<', 60);
		this.codigo_ascii_inv.put('=', 61);
		this.codigo_ascii_inv.put('>', 62);
		this.codigo_ascii_inv.put('?', 63);
		this.codigo_ascii_inv.put('@', 64);
		this.codigo_ascii_inv.put('A', 65);
		this.codigo_ascii_inv.put('B', 66);
		this.codigo_ascii_inv.put('C', 67);
		this.codigo_ascii_inv.put('D', 68);
		this.codigo_ascii_inv.put('E', 69);
		this.codigo_ascii_inv.put('F', 70);
		this.codigo_ascii_inv.put('G', 71);
		this.codigo_ascii_inv.put('H', 72);
		this.codigo_ascii_inv.put('I', 73);
		this.codigo_ascii_inv.put('J', 74);
		this.codigo_ascii_inv.put('K', 75);
		this.codigo_ascii_inv.put('L', 76);
		this.codigo_ascii_inv.put('M', 77);
		this.codigo_ascii_inv.put('N', 78);
		this.codigo_ascii_inv.put('O', 79);
		this.codigo_ascii_inv.put('P', 80);
		this.codigo_ascii_inv.put('Q', 81);
		this.codigo_ascii_inv.put('R', 82);
		this.codigo_ascii_inv.put('S', 83);
		this.codigo_ascii_inv.put('T', 84);
		this.codigo_ascii_inv.put('U', 85);
		this.codigo_ascii_inv.put('V', 86);
		this.codigo_ascii_inv.put('W', 87);
		this.codigo_ascii_inv.put('X', 88);
		this.codigo_ascii_inv.put('Y', 89);
		this.codigo_ascii_inv.put('Z', 90);
		this.codigo_ascii_inv.put('[', 91);
		this.codigo_ascii_inv.put('\\', 92);
		this.codigo_ascii_inv.put(']', 93);
		this.codigo_ascii_inv.put('^', 94);
		this.codigo_ascii_inv.put('_', 95);
		this.codigo_ascii_inv.put('`', 96);
		this.codigo_ascii_inv.put('a', 97);
		this.codigo_ascii_inv.put('b', 98);
		this.codigo_ascii_inv.put('c', 99);
		this.codigo_ascii_inv.put('d', 100);
		this.codigo_ascii_inv.put('e', 101);
		this.codigo_ascii_inv.put('f', 102);
		this.codigo_ascii_inv.put('g', 103);
		this.codigo_ascii_inv.put('h', 104);
		this.codigo_ascii_inv.put('i', 105);
		this.codigo_ascii_inv.put('j', 106);
		this.codigo_ascii_inv.put('k', 107);
		this.codigo_ascii_inv.put('l', 108);
		this.codigo_ascii_inv.put('m', 109);
		this.codigo_ascii_inv.put('n', 110);
		this.codigo_ascii_inv.put('o', 111);
		this.codigo_ascii_inv.put('p', 112);
		this.codigo_ascii_inv.put('q', 113);
		this.codigo_ascii_inv.put('r', 114);
		this.codigo_ascii_inv.put('s', 115);
		this.codigo_ascii_inv.put('t', 116);
		this.codigo_ascii_inv.put('u', 117);
		this.codigo_ascii_inv.put('v', 118);
		this.codigo_ascii_inv.put('w', 119);
		this.codigo_ascii_inv.put('x', 120);
		this.codigo_ascii_inv.put('y', 121);
		this.codigo_ascii_inv.put('z', 122);
		this.codigo_ascii_inv.put('{', 123);
		this.codigo_ascii_inv.put('|', 124);
		this.codigo_ascii_inv.put('}', 125);
		this.codigo_ascii_inv.put('~', 126);
		this.codigo_ascii_inv.put('⌂', 127);
		this.codigo_ascii_inv.put('Ç', 128);
		this.codigo_ascii_inv.put('ü', 129);
		this.codigo_ascii_inv.put('é', 130);
		this.codigo_ascii_inv.put('â', 131);
		this.codigo_ascii_inv.put('ä', 132);
		this.codigo_ascii_inv.put('à', 133);
		this.codigo_ascii_inv.put('å', 134);
		this.codigo_ascii_inv.put('ç', 135);
		this.codigo_ascii_inv.put('ê', 136);
		this.codigo_ascii_inv.put('ë', 137);
		this.codigo_ascii_inv.put('è', 138);
		this.codigo_ascii_inv.put('ï', 139);
		this.codigo_ascii_inv.put('î', 140);
		this.codigo_ascii_inv.put('ì', 141);
		this.codigo_ascii_inv.put('Ä', 142);
		this.codigo_ascii_inv.put('Å', 143);
		this.codigo_ascii_inv.put('É', 144);
		this.codigo_ascii_inv.put('æ', 145);
		this.codigo_ascii_inv.put('Æ', 146);
		this.codigo_ascii_inv.put('ô', 147);
		this.codigo_ascii_inv.put('ö', 148);
		this.codigo_ascii_inv.put('ò', 149);
		this.codigo_ascii_inv.put('û', 150);
		this.codigo_ascii_inv.put('ù', 151);
		this.codigo_ascii_inv.put('ÿ', 152);
		this.codigo_ascii_inv.put('Ö', 153);
		this.codigo_ascii_inv.put('Ü', 154);
		this.codigo_ascii_inv.put('ø', 155);
		this.codigo_ascii_inv.put('£', 156);
		this.codigo_ascii_inv.put('Ø', 157);
		this.codigo_ascii_inv.put('×', 158);
		this.codigo_ascii_inv.put('ƒ', 159);
		this.codigo_ascii_inv.put('á', 160);
		this.codigo_ascii_inv.put('%', 161);
		this.codigo_ascii_inv.put('ó', 162);
		this.codigo_ascii_inv.put('ú', 163);
		this.codigo_ascii_inv.put('ñ', 164);
		this.codigo_ascii_inv.put('Ñ', 165);
		this.codigo_ascii_inv.put('ª', 166);
		this.codigo_ascii_inv.put('º', 167);
		this.codigo_ascii_inv.put('¿', 168);
		this.codigo_ascii_inv.put('®', 169);
		this.codigo_ascii_inv.put('¬', 170);
		this.codigo_ascii_inv.put('½', 171);
		this.codigo_ascii_inv.put('¼', 172);
		this.codigo_ascii_inv.put('¡', 173);
		this.codigo_ascii_inv.put('«', 174);
		this.codigo_ascii_inv.put('»', 175);
		this.codigo_ascii_inv.put('░', 176);
		this.codigo_ascii_inv.put('▒', 177);
		this.codigo_ascii_inv.put('▓', 178);
		this.codigo_ascii_inv.put('│', 179);
		this.codigo_ascii_inv.put('┤', 180);
		this.codigo_ascii_inv.put('Á', 181);
		this.codigo_ascii_inv.put('Â', 182);
		this.codigo_ascii_inv.put('À', 183);
		this.codigo_ascii_inv.put('©', 184);
		this.codigo_ascii_inv.put('╣', 185);
		this.codigo_ascii_inv.put('║', 186);
		this.codigo_ascii_inv.put('╗', 187);
		this.codigo_ascii_inv.put('╝', 188);
		this.codigo_ascii_inv.put('¢', 189);
		this.codigo_ascii_inv.put('¥', 190);
		this.codigo_ascii_inv.put('┐', 191);
		this.codigo_ascii_inv.put('└', 192);
		this.codigo_ascii_inv.put('┴', 193);
		this.codigo_ascii_inv.put('┬', 194);
		this.codigo_ascii_inv.put('├', 195);
		this.codigo_ascii_inv.put('─', 196);
		this.codigo_ascii_inv.put('┼', 197);
		this.codigo_ascii_inv.put('ã', 198);
		this.codigo_ascii_inv.put('Ã', 199);
		this.codigo_ascii_inv.put('╚', 200);
		this.codigo_ascii_inv.put('╔', 201);
		this.codigo_ascii_inv.put('╩', 202);
		this.codigo_ascii_inv.put('╦', 203);
		this.codigo_ascii_inv.put('╠', 204);
		this.codigo_ascii_inv.put('═', 205);
		this.codigo_ascii_inv.put('╬', 206);
		this.codigo_ascii_inv.put('¶', 207);
		this.codigo_ascii_inv.put('ð', 208);
		this.codigo_ascii_inv.put('Ð', 209);
		this.codigo_ascii_inv.put('Ê', 210);
		this.codigo_ascii_inv.put('Ë', 211);
		this.codigo_ascii_inv.put('È', 212);
		this.codigo_ascii_inv.put('ı', 213);
		this.codigo_ascii_inv.put('Í', 214);
		this.codigo_ascii_inv.put('Î', 215);
		this.codigo_ascii_inv.put('Ï', 216);
		this.codigo_ascii_inv.put('┘', 217);
		this.codigo_ascii_inv.put('┌', 218);
		this.codigo_ascii_inv.put('█', 219);
		this.codigo_ascii_inv.put('▄', 220);
		this.codigo_ascii_inv.put('¦', 221);
		this.codigo_ascii_inv.put('Ì', 222);
		this.codigo_ascii_inv.put('▀', 223);
		this.codigo_ascii_inv.put('Ó', 224);
		this.codigo_ascii_inv.put('ß', 225);
		this.codigo_ascii_inv.put('Ô', 226);
		this.codigo_ascii_inv.put('Ò', 227);
		this.codigo_ascii_inv.put('õ', 228);
		this.codigo_ascii_inv.put('Õ', 229);
		this.codigo_ascii_inv.put('µ', 230);
		this.codigo_ascii_inv.put('þ', 231);
		this.codigo_ascii_inv.put('Þ', 232);
		this.codigo_ascii_inv.put('Ú', 233);
		this.codigo_ascii_inv.put('Û', 234);
		this.codigo_ascii_inv.put('Ù', 235);
		this.codigo_ascii_inv.put('ý', 236);
		this.codigo_ascii_inv.put('Ý', 237);
		this.codigo_ascii_inv.put('¯', 238);
		this.codigo_ascii_inv.put('´', 239);
		this.codigo_ascii_inv.put('­', 240);
		this.codigo_ascii_inv.put('±', 241);
		this.codigo_ascii_inv.put('‗', 242);
		this.codigo_ascii_inv.put('¾', 243);
		this.codigo_ascii_inv.put('¶', 244);
		this.codigo_ascii_inv.put('§', 245);
		this.codigo_ascii_inv.put('÷', 246);
		this.codigo_ascii_inv.put('¸', 247);
		this.codigo_ascii_inv.put('°', 248);
		this.codigo_ascii_inv.put('¨', 249);
		this.codigo_ascii_inv.put('·', 250);
		this.codigo_ascii_inv.put('¹', 251);
		this.codigo_ascii_inv.put('³', 252);
		this.codigo_ascii_inv.put('²', 253);
		this.codigo_ascii_inv.put('■', 254);
		this.codigo_ascii_inv.put(' ', 255);
		
	}
	
	
	/**
	 * Este metodo devuelve el caracter que corresponde a un numero en el codigo ascii, esto se logra buscandolo en el diccionario
	 * codigo_ascii, el cual tiene como clave los numeros y como valor el caracter en el codigo ascii
	 * 
	 * @param posicion es la posicion del codigo ascii
	 * @return El caracter que corresponde a la posicion
	 */
	public char obtenerCaracterPosicion(int posicion) {
		
		char salida = this.codigo_ascii.get(posicion);
		return salida;
	}
	
	/**
	 * Este metodo devuelve el numero que corresponde a un caracter en el codigo ascii, esto se logra buscandolo en el diccionario
	 * codigo_ascii_inv, el cual tiene como clave los caracteres y como valor en numero en el codigo ascii
	 * 
	 * @param caracter es el caracter del que se quiere saber la posicion en ascii
	 * @return La posicion que corresponde al caracter
	 */
	public int obtenerPosicionCaracter(char caracter) {
		
		int salida = this.codigo_ascii_inv.get(caracter);
		return salida;
	}

	/**
	 * @return the codigo_ascii
	 */
	public Map<Integer, Character> getCodigo_ascii() {
		return codigo_ascii;
	}

	/**
	 * @param codigo_ascii the codigo_ascii to set
	 */
	public void setCodigo_ascii(Map<Integer, Character> codigo_ascii) {
		this.codigo_ascii = codigo_ascii;
	}

	/**
	 * @return the codigo_ascii_inv
	 */
	public Map<Character, Integer> getCodigo_ascii_inv() {
		return codigo_ascii_inv;
	}

	/**
	 * @param codigo_ascii_inv the codigo_ascii_inv to set
	 */
	public void setCodigo_ascii_inv(Map<Character, Integer> codigo_ascii_inv) {
		this.codigo_ascii_inv = codigo_ascii_inv;
	}
	
	
	
	
	
	

}

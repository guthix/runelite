import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gb")
@Implements("ClientPacket")
public class ClientPacket implements class190 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket MESSAGE_PRIVATE;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket EVENT_KEYBOARD;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket OPOBJ2;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket EVENT_MOUSE_CLICK;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket IF_BUTTON10;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket MOVE_GAMECLICK;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	static final ClientPacket field2233;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket EVENT_APPLET_FOCUS;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket MAP_BUILD_COMPLETE;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket OPNPC1;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket OPLOCT;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket OPPLAYER2;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket RESUME_P_COUNTDIALOG;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket IF_BUTTON1;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket FRIENDLIST_ADD;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket OPPLAYER6;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket IF_BUTTON7;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket FREECAM_EXIT;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket RESUME_P_NAMEDIALOG;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket OPNPC2;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket FRIENDLIST_DEL;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket OPOBJ4;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket IF_BUTTON3;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket RESUME_P_OBJDIALOG;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket CLICKWORLDMAP;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket IF_BUTTON8;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket OPNPCU;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket OPOBJ3;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket PING_STATISTICS;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket OPPLAYERT;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket IF1_BUTTON5;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	static final ClientPacket field2227;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket OPHELD3;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket OPPLAYER1;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket IF_BUTTONT;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket OPNPC3;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket OPOBJU;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket IF_BUTTON5;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket OPHELD4;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket RESUME_PAUSEBUTTON;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket OPLOC3;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket REFLECTION_CHECK_REPLY;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket CLICKWORLDMAP_TELEPORT;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket OPLOC4;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket OPLOC5;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket MOVE_MINIMAP_CLICK;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket OPLOCU;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket OPNPCT;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket EVENT_CAMERA_POSITION;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket OPNPC5;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket OPPLAYER4;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket OPPLAYER5;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket OPPLAYER3;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket OPPLAYER7;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket OPOBJT;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket OPPLAYER8;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket OPPLAYERU;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket OPHELD1;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket CLAN_JOINCHAT_LEAVECHAT;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket IF_BUTTON2;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	static final ClientPacket field2323;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket OPOBJ6;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket IF_BUTTON6;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket EVENT_MOUSE_MOVE;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket MESSAGE_PUBLIC;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	static final ClientPacket field2297;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket OPLOC1;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket BUG_REPORT;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket OPHELDU;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket UNKNOWN_6;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket IF1_BUTTON3;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket CLAN_SETRANK;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket DETECT_MODIFIED_CLIENT;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket CLOSE_MODAL;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket PLAYER_REPORT;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket IF_BUTTOND;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket EVENT_MOUSE_IDLE;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket RESUME_P_STRINGDIALOG;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket OPOBJ5;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket CLAN_KICKUSER;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket IF_BUTTON9;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket CHAT_SETMODE;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket OPHELD5;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket OPLOC2;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket OPOBJ1;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	static final ClientPacket field2314;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket OPNPC6;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket OPNPC4;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket IF1_BUTTON4;
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket UPDATE_APPEARANCE;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket IF_BUTTON4;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket IGNORELIST_DEL;
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket IGNORELIST_ADD;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket OPHELDT;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket OPLOC6;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket NO_TIMEOUT;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket IF1_BUTTON1;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket OPHELDD;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket OPHELD2;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket IF1_BUTTON2;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket LOGIN_TIMINGS;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket WINDOW_STATUS;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final ClientPacket CLIENT_CHEAT;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -1798949877
	)
	@Export("id")
	final int id;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = -402834233
	)
	@Export("length")
	final int length;

	static {
		MESSAGE_PRIVATE = new ClientPacket(0, -2); // L: 5
		EVENT_KEYBOARD = new ClientPacket(1, -2); // L: 6
		OPOBJ2 = new ClientPacket(2, 7); // L: 7
		EVENT_MOUSE_CLICK = new ClientPacket(3, 6); // L: 8
		IF_BUTTON10 = new ClientPacket(4, 8); // L: 9
		MOVE_GAMECLICK = new ClientPacket(5, -1); // L: 10
		field2233 = new ClientPacket(6, -1); // L: 11
		EVENT_APPLET_FOCUS = new ClientPacket(7, 1); // L: 12
		MAP_BUILD_COMPLETE = new ClientPacket(8, 0); // L: 13
		OPNPC1 = new ClientPacket(9, 3); // L: 14
		OPLOCT = new ClientPacket(10, 13); // L: 15
		OPPLAYER2 = new ClientPacket(11, 3); // L: 16
		RESUME_P_COUNTDIALOG = new ClientPacket(12, 4); // L: 17
		IF_BUTTON1 = new ClientPacket(13, 8); // L: 18
		FRIENDLIST_ADD = new ClientPacket(14, -1); // L: 19
		OPPLAYER6 = new ClientPacket(15, 3); // L: 20
		IF_BUTTON7 = new ClientPacket(16, 8); // L: 21
		FREECAM_EXIT = new ClientPacket(17, 0); // L: 22
		RESUME_P_NAMEDIALOG = new ClientPacket(18, -1); // L: 23
		OPNPC2 = new ClientPacket(19, 3); // L: 24
		FRIENDLIST_DEL = new ClientPacket(20, -1); // L: 25
		OPOBJ4 = new ClientPacket(21, 7); // L: 26
		IF_BUTTON3 = new ClientPacket(22, 8); // L: 27
		RESUME_P_OBJDIALOG = new ClientPacket(23, 2); // L: 28
		CLICKWORLDMAP = new ClientPacket(24, 4); // L: 29
		IF_BUTTON8 = new ClientPacket(25, 8); // L: 30
		OPNPCU = new ClientPacket(26, 11); // L: 31
		OPOBJ3 = new ClientPacket(27, 7); // L: 32
		PING_STATISTICS = new ClientPacket(28, 10); // L: 33
		OPPLAYERT = new ClientPacket(29, 9); // L: 34
		IF1_BUTTON5 = new ClientPacket(30, 8); // L: 35
		field2227 = new ClientPacket(31, -1); // L: 36
		OPHELD3 = new ClientPacket(32, 8); // L: 37
		OPPLAYER1 = new ClientPacket(33, 3); // L: 38
		IF_BUTTONT = new ClientPacket(34, 16); // L: 39
		OPNPC3 = new ClientPacket(35, 3); // L: 40
		OPOBJU = new ClientPacket(36, 15); // L: 41
		IF_BUTTON5 = new ClientPacket(37, 8); // L: 42
		OPHELD4 = new ClientPacket(38, 8); // L: 43
		RESUME_PAUSEBUTTON = new ClientPacket(39, 6); // L: 44
		OPLOC3 = new ClientPacket(40, 7); // L: 45
		REFLECTION_CHECK_REPLY = new ClientPacket(41, -1); // L: 46
		CLICKWORLDMAP_TELEPORT = new ClientPacket(42, 9); // L: 47
		OPLOC4 = new ClientPacket(43, 7); // L: 48
		OPLOC5 = new ClientPacket(44, 7); // L: 49
		MOVE_MINIMAP_CLICK = new ClientPacket(45, -1); // L: 50
		OPLOCU = new ClientPacket(46, 15); // L: 51
		OPNPCT = new ClientPacket(47, 9); // L: 52
		EVENT_CAMERA_POSITION = new ClientPacket(48, 4); // L: 53
		OPNPC5 = new ClientPacket(49, 3); // L: 54
		OPPLAYER4 = new ClientPacket(50, 3); // L: 55
		OPPLAYER5 = new ClientPacket(51, 3);
		OPPLAYER3 = new ClientPacket(52, 3); // L: 57
		OPPLAYER7 = new ClientPacket(53, 3); // L: 58
		OPOBJT = new ClientPacket(54, 13); // L: 59
		OPPLAYER8 = new ClientPacket(55, 3); // L: 60
		OPPLAYERU = new ClientPacket(56, 11); // L: 61
		OPHELD1 = new ClientPacket(57, 8); // L: 62
		CLAN_JOINCHAT_LEAVECHAT = new ClientPacket(58, -1); // L: 63
		IF_BUTTON2 = new ClientPacket(59, 8); // L: 64
		field2323 = new ClientPacket(60, 7); // L: 65
		OPOBJ6 = new ClientPacket(61, 2); // L: 66
		IF_BUTTON6 = new ClientPacket(62, 8); // L: 67
		EVENT_MOUSE_MOVE = new ClientPacket(63, -1); // L: 68
		MESSAGE_PUBLIC = new ClientPacket(64, -1); // L: 69
		field2297 = new ClientPacket(65, -1); // L: 70
		OPLOC1 = new ClientPacket(66, 7); // L: 71
		BUG_REPORT = new ClientPacket(67, -2); // L: 72
		OPHELDU = new ClientPacket(68, 16); // L: 73
		UNKNOWN_6 = new ClientPacket(69, 4); // L: 74
		IF1_BUTTON3 = new ClientPacket(70, 8); // L: 75
		CLAN_SETRANK = new ClientPacket(71, -1); // L: 76
		DETECT_MODIFIED_CLIENT = new ClientPacket(72, 4); // L: 77
		CLOSE_MODAL = new ClientPacket(73, 0); // L: 78
		PLAYER_REPORT = new ClientPacket(74, -1); // L: 79
		IF_BUTTOND = new ClientPacket(75, 9); // L: 80
		EVENT_MOUSE_IDLE = new ClientPacket(76, 0); // L: 81
		RESUME_P_STRINGDIALOG = new ClientPacket(77, -1); // L: 82
		OPOBJ5 = new ClientPacket(78, 7); // L: 83
		CLAN_KICKUSER = new ClientPacket(79, -1); // L: 84
		IF_BUTTON9 = new ClientPacket(80, 8); // L: 85
		CHAT_SETMODE = new ClientPacket(81, 3); // L: 86
		OPHELD5 = new ClientPacket(82, 8); // L: 87
		OPLOC2 = new ClientPacket(83, 7); // L: 88
		OPOBJ1 = new ClientPacket(84, 7); // L: 89
		field2314 = new ClientPacket(85, 2); // L: 90
		OPNPC6 = new ClientPacket(86, 2); // L: 91
		OPNPC4 = new ClientPacket(87, 3); // L: 92
		IF1_BUTTON4 = new ClientPacket(88, 8); // L: 93
		UPDATE_APPEARANCE = new ClientPacket(89, 13); // L: 94
		IF_BUTTON4 = new ClientPacket(90, 8); // L: 95
		IGNORELIST_DEL = new ClientPacket(91, -1); // L: 96
		IGNORELIST_ADD = new ClientPacket(92, -1); // L: 97
		OPHELDT = new ClientPacket(93, 14); // L: 98
		OPLOC6 = new ClientPacket(94, 2); // L: 99
		NO_TIMEOUT = new ClientPacket(95, 0); // L: 100
		IF1_BUTTON1 = new ClientPacket(96, 8); // L: 101
		OPHELDD = new ClientPacket(97, 16); // L: 102
		OPHELD2 = new ClientPacket(98, 8); // L: 103
		IF1_BUTTON2 = new ClientPacket(99, 8); // L: 104
		LOGIN_TIMINGS = new ClientPacket(100, -1); // L: 105
		WINDOW_STATUS = new ClientPacket(101, 5); // L: 106
		CLIENT_CHEAT = new ClientPacket(102, -1); // L: 107
	}

	ClientPacket(int var1, int var2) {
		this.id = var1; // L: 112
		this.length = var2; // L: 113
	} // L: 114

	@ObfuscatedName("w")
	public static int method3671(long var0) {
		return (int)(var0 >>> 0 & 127L); // L: 56
	}
}

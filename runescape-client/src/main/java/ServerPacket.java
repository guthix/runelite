import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gt")
@Implements("ServerPacket")
public class ServerPacket {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket UPDATE_UID192;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket REBUILD_REGION;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket LOGOUT_TRANSFER;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket UPDATE_INV_FULL;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket UPDATE_ZONE_PARTIAL_ENCLOSED;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket UPDATE_STAT;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket field2201;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket UNKNOWN_1;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket MAP_ANIM;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket CAM_RESET;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket UPDATE_RUNWEIGHT;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket IF_SETPLAYERHEAD;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket IF_SETCOLOUR;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket OBJ_ADD;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket MESSAGE_GAME;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket MIDI_JINGLE;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket IF_MOVESUB;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket MAP_PROJANIM;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket CAM_SETANGLE;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket UPDATE_INV_STOP_TRANSIT;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket IF_SETTEXT;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket IF_CLOSESUB;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket PING_STATISTICS_REQUEST;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket UPDATE_IGNORELIST;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket UNKNOWN_2;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket LOC_PREFETCH;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket LOC_ANIM;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket MESSAGE_CLANCHAT;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket SYNC_CLIENT_VARCACHE;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket OBJ_COUNT;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket UPDATE_ZONE_PARTIAL_FOLLOWS;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket VARP_LARGE;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket LOC_ADD_CHANGE;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket MIDI_SONG;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket LOGOUT_FULL;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket UPDATE_STOCKMARKET_SLOT;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket NPC_INFO_LARGE_VIEWPORT;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket REFLECTION_CHECKER;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket UPDATE_INV_PARTIAL;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket IF_OPENTOP;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket IF_SETNPCHEAD;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket UNKNOWN_3;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket SOUND_AREA;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket NPC_INFO_SMALL_VIEWPORT;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket Logout;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket UNKNOWN_5;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket IF_SETOBJECT;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket MINIMAP_FLAG_SET;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket SYNTH_SOUND;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket RESET_ANIMS;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket RUNCLIENTSCRIPT;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket UPDATE_CLANCHAT_CHANNEL_FULL;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket IF_SETSCROLLPOS;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket CAM2_ENABLE;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket SET_PLAYER_OP;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket MESSAGE_PRIVATE;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket UNKNOWN_4;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket IF_SETHIDE;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket UPDATE_REBOOT_TIMER;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket VARP_SMALL;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket UPDATE_INV_CLEAR;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket UPDATE_RUNENERGY;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket OBJ_DEL;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket IF_SETANIM;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket URL_OPEN;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket REBUILD_NORMAL;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket CHAT_FILTER_SETTINGS;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket CAM_SHAKE;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket UPDATE_FRIENDLIST;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket IF_OPENSUB;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket RESET_CLIENT_VARCACHE;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket UPDATE_SITESETTINGS;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket IF_SETANGLE;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket CAM_LOOKAT;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket LOC_DEL;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket PLAYER_INFO;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket HINT_ARROW;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket MESSAGE_PRIVATE_ECHO;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket UPDATE_CLANCHAT_SINGLE_USER;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket IF_SETTARGETPARAM;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket MINIMAP_TOGGLE;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket CHAT_FILTER_SETTINGS_PRIVATE_CHAT;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket UPDATE_ZONE_FULL_FOLLOWS;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket IF_SETPOSITION;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket IF_SETMODEL;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final ServerPacket TRIGGER_ONDIALOG_ABORT;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -61586593
	)
	@Export("id")
	public final int id;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 875851551
	)
	@Export("length")
	public final int length;

	static {
		UPDATE_UID192 = new ServerPacket(0, 28); // L: 5
		REBUILD_REGION = new ServerPacket(1, -2); // L: 6
		LOGOUT_TRANSFER = new ServerPacket(2, -1); // L: 7
		UPDATE_INV_FULL = new ServerPacket(3, -2); // L: 8
		UPDATE_ZONE_PARTIAL_ENCLOSED = new ServerPacket(4, -2);
		UPDATE_STAT = new ServerPacket(5, 6); // L: 10
		field2201 = new ServerPacket(6, 0); // L: 11
		UNKNOWN_1 = new ServerPacket(7, 4); // L: 12
		MAP_ANIM = new ServerPacket(8, 6); // L: 13
		CAM_RESET = new ServerPacket(9, 0); // L: 14
		UPDATE_RUNWEIGHT = new ServerPacket(10, 2); // L: 15
		IF_SETPLAYERHEAD = new ServerPacket(11, 4); // L: 16
		IF_SETCOLOUR = new ServerPacket(12, 6); // L: 17
		OBJ_ADD = new ServerPacket(13, 5); // L: 18
		MESSAGE_GAME = new ServerPacket(14, -1); // L: 19
		MIDI_JINGLE = new ServerPacket(15, 5); // L: 20
		IF_MOVESUB = new ServerPacket(16, 8); // L: 21
		MAP_PROJANIM = new ServerPacket(17, 15); // L: 22
		CAM_SETANGLE = new ServerPacket(18, 6); // L: 23
		UPDATE_INV_STOP_TRANSIT = new ServerPacket(19, 2); // L: 24
		IF_SETTEXT = new ServerPacket(20, -2); // L: 25
		IF_CLOSESUB = new ServerPacket(21, 4); // L: 26
		PING_STATISTICS_REQUEST = new ServerPacket(22, 8); // L: 27
		UPDATE_IGNORELIST = new ServerPacket(23, -2); // L: 28
		UNKNOWN_2 = new ServerPacket(24, 8); // L: 29
		LOC_PREFETCH = new ServerPacket(25, 14); // L: 30
		LOC_ANIM = new ServerPacket(26, 4); // L: 31
		MESSAGE_CLANCHAT = new ServerPacket(27, -1);
		SYNC_CLIENT_VARCACHE = new ServerPacket(28, 0);
		OBJ_COUNT = new ServerPacket(29, 7);
		UPDATE_ZONE_PARTIAL_FOLLOWS = new ServerPacket(30, 2); // L: 35
		VARP_LARGE = new ServerPacket(31, 6); // L: 36
		LOC_ADD_CHANGE = new ServerPacket(32, 4); // L: 37
		MIDI_SONG = new ServerPacket(33, 2); // L: 38
		LOGOUT_FULL = new ServerPacket(34, 0); // L: 39
		UPDATE_STOCKMARKET_SLOT = new ServerPacket(35, 20); // L: 40
		NPC_INFO_LARGE_VIEWPORT = new ServerPacket(36, -2); // L: 41
		REFLECTION_CHECKER = new ServerPacket(37, -2); // L: 42
		UPDATE_INV_PARTIAL = new ServerPacket(38, -2); // L: 43
		IF_OPENTOP = new ServerPacket(39, 2); // L: 44
		IF_SETNPCHEAD = new ServerPacket(40, 6); // L: 45
		UNKNOWN_3 = new ServerPacket(41, 1); // L: 46
		SOUND_AREA = new ServerPacket(42, 5); // L: 47
		NPC_INFO_SMALL_VIEWPORT = new ServerPacket(43, -2); // L: 48
		Logout = new ServerPacket(44, 1); // L: 49
		UNKNOWN_5 = new ServerPacket(45, -2); // L: 50
		IF_SETOBJECT = new ServerPacket(46, 10); // L: 51
		MINIMAP_FLAG_SET = new ServerPacket(47, 2); // L: 52
		SYNTH_SOUND = new ServerPacket(48, 5); // L: 53
		RESET_ANIMS = new ServerPacket(49, 0); // L: 54
		RUNCLIENTSCRIPT = new ServerPacket(50, -2); // L: 55
		UPDATE_CLANCHAT_CHANNEL_FULL = new ServerPacket(51, -2); // L: 56
		IF_SETSCROLLPOS = new ServerPacket(52, 6); // L: 57
		CAM2_ENABLE = new ServerPacket(53, 1); // L: 58
		SET_PLAYER_OP = new ServerPacket(54, -1); // L: 59
		MESSAGE_PRIVATE = new ServerPacket(55, -2); // L: 60
		UNKNOWN_4 = new ServerPacket(56, -2); // L: 61
		IF_SETHIDE = new ServerPacket(57, 5); // L: 62
		UPDATE_REBOOT_TIMER = new ServerPacket(58, 2); // L: 63
		VARP_SMALL = new ServerPacket(59, 3); // L: 64
		UPDATE_INV_CLEAR = new ServerPacket(60, 4); // L: 65
		UPDATE_RUNENERGY = new ServerPacket(61, 1); // L: 66
		OBJ_DEL = new ServerPacket(62, 3); // L: 67
		IF_SETANIM = new ServerPacket(63, 6); // L: 68
		URL_OPEN = new ServerPacket(64, -2); // L: 69
		REBUILD_NORMAL = new ServerPacket(65, -2); // L: 70
		CHAT_FILTER_SETTINGS = new ServerPacket(66, 2); // L: 71
		CAM_SHAKE = new ServerPacket(67, 4); // L: 72
		UPDATE_FRIENDLIST = new ServerPacket(68, -2); // L: 73
		IF_OPENSUB = new ServerPacket(69, 7); // L: 74
		RESET_CLIENT_VARCACHE = new ServerPacket(70, 0); // L: 75
		UPDATE_SITESETTINGS = new ServerPacket(71, -1); // L: 76
		IF_SETANGLE = new ServerPacket(72, 10); // L: 77
		CAM_LOOKAT = new ServerPacket(73, 6); // L: 78
		LOC_DEL = new ServerPacket(74, 2); // L: 79
		PLAYER_INFO = new ServerPacket(75, -2); // L: 80
		HINT_ARROW = new ServerPacket(76, 6); // L: 81
		MESSAGE_PRIVATE_ECHO = new ServerPacket(77, -2); // L: 82
		UPDATE_CLANCHAT_SINGLE_USER = new ServerPacket(78, -1); // L: 83
		IF_SETTARGETPARAM = new ServerPacket(79, 12); // L: 84
		MINIMAP_TOGGLE = new ServerPacket(80, 1); // L: 85
		CHAT_FILTER_SETTINGS_PRIVATE_CHAT = new ServerPacket(81, 1); // L: 86
		UPDATE_ZONE_FULL_FOLLOWS = new ServerPacket(82, 2); // L: 87
		IF_SETPOSITION = new ServerPacket(83, 8); // L: 88
		IF_SETMODEL = new ServerPacket(84, 6); // L: 89
		TRIGGER_ONDIALOG_ABORT = new ServerPacket(85, 0); // L: 90
	}

	ServerPacket(int var1, int var2) {
		this.id = var1; // L: 99
		this.length = var2; // L: 100
	} // L: 101

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1751724590"
	)
	@Export("Widget_unpackTargetMask")
	public static int Widget_unpackTargetMask(int var0) {
		return var0 >> 11 & 63; // L: 9
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lib;Lib;I)V",
		garbageValue = "-1425205882"
	)
	public static void method3669(AbstractArchive var0, AbstractArchive var1) {
		class225.HealthBarDefinition_archive = var0; // L: 32
		HealthBarDefinition.HitSplatDefinition_spritesArchive = var1; // L: 33
	} // L: 34

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1710358127"
	)
	public static String method3663(String var0) {
		int var1 = var0.length(); // L: 159
		char[] var2 = new char[var1]; // L: 160
		byte var3 = 2; // L: 161

		for (int var4 = 0; var4 < var1; ++var4) { // L: 162
			char var5 = var0.charAt(var4); // L: 163
			if (var3 == 0) { // L: 164
				var5 = Character.toLowerCase(var5);
			} else if (var3 == 2 || Character.isUpperCase(var5)) { // L: 165
				char var6;
				if (var5 != 181 && var5 != 402) { // L: 168
					var6 = Character.toTitleCase(var5); // L: 172
				} else {
					var6 = var5; // L: 169
				}

				var5 = var6; // L: 174
			}

			if (Character.isLetter(var5)) { // L: 176
				var3 = 0;
			} else if (var5 != '.' && var5 != '?' && var5 != '!') { // L: 177
				if (Character.isSpaceChar(var5)) { // L: 178
					if (var3 != 2) { // L: 179
						var3 = 1;
					}
				} else {
					var3 = 1; // L: 181
				}
			} else {
				var3 = 2;
			}

			var2[var4] = var5; // L: 182
		}

		return new String(var2); // L: 184
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1225574522"
	)
	static final void method3668() {
		Object var10000 = null; // L: 126
		String var0 = "You can't add yourself to your own friend list";
		class234.addGameMessage(30, "", var0); // L: 128
	} // L: 130

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "36"
	)
	static final void method3664() {
		PacketBufferNode var0 = ItemContainer.getPacketBufferNode(ClientPacket.CLOSE_MODAL, Client.packetWriter.isaacCipher); // L: 10786
		Client.packetWriter.addNode(var0); // L: 10787

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) { // L: 10788
			if (var1.type == 0 || var1.type == 3) { // L: 10789
				MouseRecorder.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) { // L: 10791
			CollisionMap.invalidateWidget(Client.meslayerContinueWidget); // L: 10792
			Client.meslayerContinueWidget = null; // L: 10793
		}

	} // L: 10795
}

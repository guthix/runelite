import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bi")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("h")
	@Export("Tiles_heights")
	static int[][][] Tiles_heights;
	@ObfuscatedName("v")
	@Export("Tiles_renderFlags")
	static byte[][][] Tiles_renderFlags;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -2047065695
	)
	@Export("Tiles_minPlane")
	static int Tiles_minPlane;
	@ObfuscatedName("w")
	static byte[][][] field514;
	@ObfuscatedName("t")
	static byte[][][] field508;
	@ObfuscatedName("p")
	static byte[][][] field511;
	@ObfuscatedName("y")
	static final int[] field512;
	@ObfuscatedName("r")
	static final int[] field513;
	@ObfuscatedName("q")
	static final int[] field518;
	@ObfuscatedName("g")
	static final int[] field515;
	@ObfuscatedName("s")
	static final int[] field509;
	@ObfuscatedName("o")
	static final int[] field517;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -172195291
	)
	static int field516;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 870257593
	)
	static int field510;

	static {
		Tiles_heights = new int[4][105][105]; // L: 16
		Tiles_renderFlags = new byte[4][104][104]; // L: 17
		Tiles_minPlane = 99; // L: 18
		field512 = new int[]{1, 2, 4, 8}; // L: 34
		field513 = new int[]{16, 32, 64, 128}; // L: 35
		field518 = new int[]{1, 0, -1, 0}; // L: 36
		field515 = new int[]{0, -1, 0, 1}; // L: 37
		field509 = new int[]{1, -1, -1, 1}; // L: 38
		field517 = new int[]{-1, -1, 1, 1}; // L: 39
		field516 = (int)(Math.random() * 17.0D) - 8; // L: 40
		field510 = (int)(Math.random() * 33.0D) - 16; // L: 41
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)[Lgt;",
		garbageValue = "47"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.UPDATE_UID192, ServerPacket.REBUILD_REGION, ServerPacket.LOGOUT_TRANSFER, ServerPacket.UPDATE_INV_FULL, ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED, ServerPacket.UPDATE_STAT, ServerPacket.field2201, ServerPacket.UNKNOWN_1, ServerPacket.MAP_ANIM, ServerPacket.CAM_RESET, ServerPacket.UPDATE_RUNWEIGHT, ServerPacket.IF_SETPLAYERHEAD, ServerPacket.IF_SETCOLOUR, ServerPacket.OBJ_ADD, ServerPacket.MESSAGE_GAME, ServerPacket.MIDI_JINGLE, ServerPacket.IF_MOVESUB, ServerPacket.MAP_PROJANIM, ServerPacket.CAM_SETANGLE, ServerPacket.UPDATE_INV_STOP_TRANSIT, ServerPacket.IF_SETTEXT, ServerPacket.IF_CLOSESUB, ServerPacket.PING_STATISTICS_REQUEST, ServerPacket.UPDATE_IGNORELIST, ServerPacket.UNKNOWN_2, ServerPacket.LOC_PREFETCH, ServerPacket.LOC_ANIM, ServerPacket.MESSAGE_CLANCHAT, ServerPacket.SYNC_CLIENT_VARCACHE, ServerPacket.OBJ_COUNT, ServerPacket.UPDATE_ZONE_PARTIAL_FOLLOWS, ServerPacket.VARP_LARGE, ServerPacket.LOC_ADD_CHANGE, ServerPacket.MIDI_SONG, ServerPacket.LOGOUT_FULL, ServerPacket.UPDATE_STOCKMARKET_SLOT, ServerPacket.NPC_INFO_LARGE_VIEWPORT, ServerPacket.REFLECTION_CHECKER, ServerPacket.UPDATE_INV_PARTIAL, ServerPacket.IF_OPENTOP, ServerPacket.IF_SETNPCHEAD, ServerPacket.UNKNOWN_3, ServerPacket.SOUND_AREA, ServerPacket.NPC_INFO_SMALL_VIEWPORT, ServerPacket.Logout, ServerPacket.UNKNOWN_5, ServerPacket.IF_SETOBJECT, ServerPacket.MINIMAP_FLAG_SET, ServerPacket.SYNTH_SOUND, ServerPacket.RESET_ANIMS, ServerPacket.RUNCLIENTSCRIPT, ServerPacket.UPDATE_CLANCHAT_CHANNEL_FULL, ServerPacket.IF_SETSCROLLPOS, ServerPacket.CAM2_ENABLE, ServerPacket.SET_PLAYER_OP, ServerPacket.MESSAGE_PRIVATE, ServerPacket.UNKNOWN_4, ServerPacket.IF_SETHIDE, ServerPacket.UPDATE_REBOOT_TIMER, ServerPacket.VARP_SMALL, ServerPacket.UPDATE_INV_CLEAR, ServerPacket.UPDATE_RUNENERGY, ServerPacket.OBJ_DEL, ServerPacket.IF_SETANIM, ServerPacket.URL_OPEN, ServerPacket.REBUILD_NORMAL, ServerPacket.CHAT_FILTER_SETTINGS, ServerPacket.CAM_SHAKE, ServerPacket.UPDATE_FRIENDLIST, ServerPacket.IF_OPENSUB, ServerPacket.RESET_CLIENT_VARCACHE, ServerPacket.UPDATE_SITESETTINGS, ServerPacket.IF_SETANGLE, ServerPacket.CAM_LOOKAT, ServerPacket.LOC_DEL, ServerPacket.PLAYER_INFO, ServerPacket.HINT_ARROW, ServerPacket.MESSAGE_PRIVATE_ECHO, ServerPacket.UPDATE_CLANCHAT_SINGLE_USER, ServerPacket.IF_SETTARGETPARAM, ServerPacket.MINIMAP_TOGGLE, ServerPacket.CHAT_FILTER_SETTINGS_PRIVATE_CHAT, ServerPacket.UPDATE_ZONE_FULL_FOLLOWS, ServerPacket.IF_SETPOSITION, ServerPacket.IF_SETMODEL, ServerPacket.TRIGGER_ONDIALOG_ABORT}; // L: 95
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lib;Lib;ZII)V",
		garbageValue = "1438840019"
	)
	static void method1208(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) { // L: 128
			if (var3 == 4) { // L: 129
				Login.loginIndex = 4; // L: 130
			}

		} else {
			Login.loginIndex = var3; // L: 134
			Rasterizer2D.Rasterizer2D_clear(); // L: 135
			byte[] var4 = var0.takeFileByNames("title.jpg", ""); // L: 136
			class25.leftTitleSprite = WorldMapSection0.convertJpgToSprite(var4); // L: 137
			class224.rightTitleSprite = class25.leftTitleSprite.mirrorHorizontally(); // L: 138
			int var5 = Client.worldProperties; // L: 139
			if ((var5 & 536870912) != 0) { // L: 141
				class224.logoSprite = class51.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", ""); // L: 142
			} else if ((var5 & 1073741824) != 0) { // L: 144
				class224.logoSprite = class51.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", ""); // L: 145
			} else {
				class224.logoSprite = class51.SpriteBuffer_getIndexedSpriteByName(var1, "logo", ""); // L: 148
			}

			WorldMapEvent.titleboxSprite = class51.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", ""); // L: 151
			Login.titlebuttonSprite = class51.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", ""); // L: 152
			GZipDecompressor.runesSprite = class89.method2123(var1, "runes", ""); // L: 153
			Login.title_muteSprite = class89.method2123(var1, "title_mute", ""); // L: 154
			DirectByteArrayCopier.options_buttons_0Sprite = class51.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", ""); // L: 155
			AccessFile.field4101 = class51.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", ""); // L: 156
			ItemContainer.options_buttons_2Sprite = class51.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", ""); // L: 157
			class204.field2408 = class51.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", ""); // L: 158
			FriendSystem.field1071 = DirectByteArrayCopier.options_buttons_0Sprite.subWidth; // L: 159
			Players.field1260 = DirectByteArrayCopier.options_buttons_0Sprite.subHeight; // L: 160
			class1.loginScreenRunesAnimation = new LoginScreenAnimation(GZipDecompressor.runesSprite); // L: 161
			if (var2) { // L: 162
				Login.Login_username = ""; // L: 163
				Login.Login_password = ""; // L: 164
			}

			WorldMapSection1.field313 = 0; // L: 166
			SecureRandomCallable.otp = ""; // L: 167
			Login.field1200 = true; // L: 168
			Login.worldSelectOpen = false; // L: 169
			if (!Timer.clientPreferences.titleMusicDisabled) { // L: 170
				WorldMapSectionType.method300(2, class217.archive6, "scape main", "", 255, false);
			} else {
				SecureRandomCallable.method1220(2); // L: 171
			}

			SoundSystem.method2564(false); // L: 172
			Login.clearLoginScreen = true; // L: 173
			Login.xPadding = (IgnoreList.canvasWidth - 765) / 2; // L: 174
			Login.loginBoxX = Login.xPadding + 202; // L: 175
			Login.loginBoxCenter = Login.loginBoxX + 180; // L: 176
			class25.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 177
			class224.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 178
			class224.logoSprite.drawAt(Login.xPadding + 382 - class224.logoSprite.subWidth / 2, 18); // L: 179
		}
	} // L: 132 180

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "5"
	)
	public static int method1170(int var0) {
		long var2 = ViewportMouse.ViewportMouse_entityTags[var0]; // L: 61
		int var1 = (int)(var2 >>> 7 & 127L); // L: 63
		return var1; // L: 65
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-834710380"
	)
	static void method1203() {
		Messages.Messages_channels.clear(); // L: 54
		Messages.Messages_hashTable.clear(); // L: 55
		Messages.Messages_queue.clear(); // L: 56
		Messages.Messages_count = 0; // L: 57
	} // L: 58

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "(Lbq;III)V",
		garbageValue = "1651593642"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) { // L: 4151
			int var3 = ParamComposition.SequenceDefinition_get(var1).field3548; // L: 4152
			if (var3 == 1) { // L: 4153
				var0.sequenceFrame = 0; // L: 4154
				var0.sequenceFrameCycle = 0; // L: 4155
				var0.sequenceDelay = var2; // L: 4156
				var0.field974 = 0; // L: 4157
			}

			if (var3 == 2) { // L: 4159
				var0.field974 = 0; // L: 4160
			}
		} else if (var1 == -1 || var0.sequence == -1 || ParamComposition.SequenceDefinition_get(var1).field3557 >= ParamComposition.SequenceDefinition_get(var0.sequence).field3557) { // L: 4163
			var0.sequence = var1; // L: 4164
			var0.sequenceFrame = 0; // L: 4165
			var0.sequenceFrameCycle = 0; // L: 4166
			var0.sequenceDelay = var2; // L: 4167
			var0.field974 = 0; // L: 4168
			var0.field996 = var0.pathLength; // L: 4169
		}

	} // L: 4171

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "2048"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (WorldMapArea.clanChat != null) { // L: 11021
			PacketBufferNode var1 = ItemContainer.getPacketBufferNode(ClientPacket.field2228, Client.packetWriter.isaacCipher); // L: 11022
			var1.packetBuffer.writeByte(FloorDecoration.stringCp1252NullTerminatedByteSize(var0)); // L: 11023
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 11024
			Client.packetWriter.addNode(var1); // L: 11025
		}
	} // L: 11026
}

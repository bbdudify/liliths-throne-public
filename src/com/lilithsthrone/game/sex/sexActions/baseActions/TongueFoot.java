package com.lilithsthrone.game.sex.sexActions.baseActions;

import com.lilithsthrone.game.character.attributes.CorruptionLevel;
import com.lilithsthrone.game.dialogue.utils.UtilText;
import com.lilithsthrone.game.sex.ArousalIncrease;
import com.lilithsthrone.game.sex.Sex;
import com.lilithsthrone.game.sex.SexAreaPenetration;
import com.lilithsthrone.game.sex.SexPace;
import com.lilithsthrone.game.sex.SexParticipantType;
import com.lilithsthrone.game.sex.sexActions.SexAction;
import com.lilithsthrone.game.sex.sexActions.SexActionType;
import com.lilithsthrone.utils.Util;
import com.lilithsthrone.utils.Util.Value;

/**
 * @since 0.2.10
 * @version 0.2.10
 * @author Innoxia
 */
public class TongueFoot {

	// Foot tease
	
	public static final SexAction FOOT_WORSHIP_SINGLE_RECEIVING_START = new SexAction(
			SexActionType.START_ONGOING,
			ArousalIncrease.FOUR_HIGH,
			ArousalIncrease.THREE_NORMAL,
			CorruptionLevel.TWO_HORNY,
			Util.newHashMapOfValues(new Value<>(SexAreaPenetration.TONGUE, SexAreaPenetration.FOOT)),
			SexParticipantType.NORMAL) {

		@Override
		public boolean isBaseRequirementsMet() {
			return !Sex.isDoubleFootJob(Sex.getCharacterTargetedForSexAction(this));
		}
		
		@Override
		public String getActionTitle() {
			return "Worship [npc2.foot]";
		}

		@Override
		public String getActionDescription() {
			return "Worship [npc2.namePos] [npc2.foot].";
		}

		@Override
		public String getDescription() {
			
			UtilText.nodeContentSB.setLength(0);
			
			switch(Sex.getCharacterPerformingAction().getLegType().getFootType()) {
				case HUMANOID:
				case PAWS:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							"Grabbing [npc2.namePos] [npc2.foot+] and pressing it against [npc.her] [npc.lips+], [npc.name] [npc.verb(begin)] kissing [npc2.her] sole and [npc2.toes+],"
										+ " before [npc.eagerly] running [npc.her] [npc.tongue] along the entire length of [npc2.her] [npc2.foot]"
							, "[npc.Name] [npc.verb(bring)] [npc2.namePos] [npc2.foot+] to [npc.her] [npc.lips+],"
										+ " before [npc.eagerly] kissing onto [npc2.her] sole and [npc2.toes]."
					));
					
					switch(Sex.getSexPace(Sex.getCharacterTargetedForSexAction(this))) {
						case SUB_RESISTING:
							UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
									" [npc2.Name] [npc2.verb(let)] out [npc2.a_sob+] as [npc.name] [npc.verb(start)] grabbing and licking [npc2.her] [npc2.foot], and,"
											+ " with tears running down [npc2.her] [npc2.face], [npc2.she] desperately [npc2.verb(beg)] for [npc.herHim] to stop.",
		
									" With [npc2.a_sob+], [npc2.name] [npc2.verb(try)] to pull away from [npc.name];"
											+ " tears running down [npc2.her] [npc2.face] as [npc.namePos] [npc.tongue] [npc.verb(start)] licking [npc2.her] [npc2.foot]."));
							break;
						default:
							UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
									" [npc2.Name] [npc2.verb(let)] out [npc2.a_moan+] as [npc.name] [npc.verb(start)] worshiping [npc2.her] [npc2.foot+],"
											+ " before [npc2.eagerly] pressing it onto [npc.her] face.",
		
									" With [npc2.a_moan+], [npc2.name] [npc2.verb(start)] [npc2.eagerly] pressing [npc2.her] [npc2.foot+] into [npc.namePos] face as [npc.she] continues to worship it."));
							break;
					}
					break;
				
				case HOOFS:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							"[npc.Eagerly(bringing)] [npc2.namePos] hard hoof up to [npc.her] face, [npc.name] carefully [npc.verb(press)] the sole to [npc.her] [npc.lips],"
											+ " before [npc.eagerly] running [npc.her] [npc.tongue] along the entire length of [npc2.her] hoof.",
		
									"[npc.Name] [npc.verb(begin)] kissing the sole of [npc2.namePos] hard hoof,"
											+ " before [npc.eagerly] running [npc.her] [npc.tongue] along the entire length of [npc2.her] hoof."));
					
					switch(Sex.getSexPace(Sex.getCharacterTargetedForSexAction(this))) {
						case SUB_RESISTING:
							UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
									" [npc2.Name] [npc2.verb(let)] out [npc2.a_sob+] as [npc.name] [npc.verb(start)] using [npc2.her] [npc2.foot], and,"
											+ " with tears running down [npc2.her] [npc2.face], [npc2.she] desperately [npc2.verb(beg)] for [npc.herHim] to stop.",
		
									" With [npc2.a_sob+], [npc2.name] [npc2.verb(try)] to pull away from [npc.name];"
											+ " tears running down [npc2.her] [npc2.face] as [npc.Name] kisses [npc2.her] [npc2.foot]."));
							break;
						default:
							UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
									" [npc2.Name] [npc2.verb(let)] out [npc2.a_moan+] as [npc.name] [npc.verb(start)] worshipping [npc2.her] [npc2.foot+],"
											+ " before [npc2.eagerly] pressing it harder into [npc.her] face.",
		
									" With [npc2.a_moan+], [npc2.name] [npc2.verb(start)] [npc2.eagerly] pressing [npc2.her] [npc2.foot+] into [npc.namePos] face."));
							break;
					}
					break;
					
				case TALONS:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							"[npc.Eagerly(curling)] [npc2.namePos] bird-like foot around [npc.her] face, [npc.name] makes sure that [npc2.her] sharp talons are clear"
											+ " before kissing and suckling on [npc2.her] sole and [npc2.toes+].",

									"[npc.Name] [npc.verb(begin)] kissing the sole of [npc2.namePos] bird-like foot,"
											+ " bringing it up to [npc.her] face as [npc.she] suckles on [npc2.her] [npc2.toes+]."));
					
					switch(Sex.getSexPace(Sex.getCharacterTargetedForSexAction(this))) {
						case SUB_RESISTING:
							UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
									" [npc2.Name] [npc2.verb(let)] out [npc2.a_sob+] as [npc.name] [npc.verb(start)] using [npc2.her] [npc2.foot], and,"
											+ " with tears running down [npc2.her] [npc2.face], [npc2.she] desperately [npc2.verb(beg)] for [npc.herHim] to stop.",
		
									" With [npc2.a_sob+], [npc2.name] [npc2.verb(try)] to pull away from [npc.name];"
											+ " tears running down [npc2.her] [npc2.face] as [npc.Name] kisses [npc2.her] [npc2.foot]."));
							break;
						default:
							UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
									" [npc2.Name] [npc2.verb(let)] out [npc2.a_moan+] as [npc.name] [npc.verb(start)] worshipping [npc2.her] [npc2.foot],"
											+ " before [npc2.eagerly] pressing it harder into [npc.her] face.",
		
									" With [npc2.a_moan+], [npc2.name] [npc2.verb(start)] [npc2.eagerly] pressing [npc2.her] [npc2.foot] into [npc.namePos] face."));
							break;
					}
					break;
			}
			
			return UtilText.nodeContentSB.toString();
		}
		
	};

	private static String getTargetedCharacterResponse(SexAction action) {
		switch(Sex.getSexPace(Sex.getCharacterTargetedForSexAction(action))) {
			case SUB_EAGER:
			case DOM_NORMAL:
				UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
						" [npc2.Name] [npc2.verb(start)] eagerly pressing [npc2.her] [npc2.foot+] into [npc.namePos] face in response,"
								+ " letting out [npc2.a_moan+] as [npc.she] [npc.verb(worship)] [npc2.herHim] [npc2.foot].",
	
						" [npc2.A_moan+] bursts out from between [npc2.namePos] [npc2.lips+] as [npc2.she] eagerly [npc2.verb(press)] [npc2.her] [npc2.foot+] into [npc.namePos] face.",
	
						" [npc2.Moaning] in delight, [npc2.name] eagerly [npc2.verb(press)] [npc2.her] [npc2.foot+] into [npc.namePos] face as [npc.she] [npc.verb(worship)] [npc2.herHim] [npc2.foot]."));
				break;
			case SUB_RESISTING:
				UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
						" Desperately trying, and failing, to pull [npc2.her] [npc2.foot] away from [npc.namePos] face,"
								+ " [npc2.name] [npc2.verb(let)] out [npc2.a_sob+], tears streaming down [npc2.her] [npc2.face] as [npc2.she] weakly [npc2.verb(beg)] for [npc.name] to stop using [npc2.her] [npc2.foot].",
	
						" [npc2.A_sob+] bursts out from between [npc2.namePos] [npc2.lips] as [npc2.she] weakly [npc2.verb(try)] to push [npc.name] away,"
								+ " tears streaming down [npc2.her] [npc2.face] as [npc2.she] [npc2.verb(plead)] for [npc.herHim] to let go of [npc2.her] [npc2.foot].",
	
						" [npc2.Sobbing] in distress, and with tears running down [npc2.her] [npc2.face],"
								+ " [npc2.name] weakly [npc2.verb(struggle)] against [npc.name], pleading and crying for [npc.herHim] to get away from [npc2.her] [npc2.foot]."));
				break;
			case SUB_NORMAL:
				UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
						" [npc2.Name] [npc2.verb(start)] pressing [npc2.her] [npc2.foot+] into [npc.namePos] face in response,"
								+ " letting out [npc2.a_moan+] as [npc.name] [npc.verb(lick)] [npc2.herHim] [npc2.foot].",
	
						" [npc2.A_moan+] bursts out from between [npc2.namePos] [npc2.lips+] as [npc2.she] [npc2.verb(push)] [npc2.her] [npc2.foot+] into [npc.namePos] face.",
	
						" [npc2.Moaning] in delight, [npc2.name] [npc2.verb(push)] [npc2.her] [npc2.foot+] into [npc.namePos] face as [npc.she] [npc.verb(lick)] it."));
				break;
			case DOM_GENTLE:
				UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
						" [npc2.Name] [npc2.verb(start)] pushing [npc2.her] [npc2.foot+] into [npc.namePos] face in response,"
								+ " letting out [npc2.a_moan+] as [npc.name] [npc.verb(kiss)] it.",
	
						" [npc2.A_moan+] bursts out from between [npc2.namePos] [npc2.lips+] as [npc2.she] gently [npc2.verb(rub)] [npc2.her] [npc2.foot+] into [npc.namePos] face.",
	
						" [npc2.Moaning] in delight, [npc2.name] softly [npc2.verb(press)] [npc2.her] [npc2.foot+] into [npc.namePos] face as [npc.she] [npc.verb(kiss)] it."));
				break;
			case DOM_ROUGH:
				switch(Sex.getCharacterPerformingAction().getLegType().getFootType()) {
					case HUMANOID:
					case PAWS:
						UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
								" [npc2.Name] [npc2.verb(start)] grinding [npc2.her] [npc2.foot+] into [npc.namePos] face in response,"
										+ " letting out [npc2.a_moan+] as [npc2.she] [npc2.verb(force)] [npc2.her] [npc2.foot] into [npc.her] mouth.",
			
								" [npc2.A_moan+] bursts out from between [npc2.namePos] [npc2.lips+] as [npc2.she] forcefully [npc2.verb(grind)] [npc2.her] [npc2.foot+] into [npc.namePos] face.",
			
								" [npc2.Moaning] in delight, [npc2.name] violently [npc2.verb(grind)] [npc2.her] [npc2.foot+] into [npc.namePos] face as [npc2.she] [npc2.verb(force)] [npc2.her] [npc.foot] into [npc.her] mouth."));
						break;
					case HOOFS:
						UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
								" [npc2.Name] [npc2.verb(start)] grinding [npc2.her] [npc2.foot+] into [npc.namePos] face in response,"
										+ " not caring about the fact that using [npc2.her] hard hoof in such a violent manner is extremely uncomfortable for [npc.herHim].",

								" [npc2.A_moan+] bursts out from between [npc2.namePos] [npc2.lips+] as [npc2.she] forcefully [npc2.verb(grind)] [npc2.her] [npc2.foot+] into [npc.namePos] face,"
										+ " not caring in the least about how uncomfortable this is for [npc.name] .",

								" [npc2.Moaning] in delight, [npc2.name] violently [npc2.verb(grind)] [npc2.her] [npc2.foot+] into [npc.namePos] face,"
										+ " laughing derisively at [npc.herHim] as [npc2.she] [npc2.she] [npc2.verb(force)] [npc2.her] [npc.foot] into [npc.her] mouth."));
						break;
					case TALONS:
						UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
								" [npc2.Name] [npc2.verb(start)] grinding [npc2.her] [npc2.foot+] into [npc.namePos] face in response,"
										+ " not caring about the fact that [npc2.her] sharp talons keep on coming dangerously close to cutting [npc.herHim].",

								" [npc2.A_moan+] bursts out from between [npc2.namePos] [npc2.lips+] as [npc2.she] forcefully [npc2.verb(grind)] [npc2.her] [npc2.foot+] into [npc.namePos] face,"
										+ " not caring in the least about how close [npc2.her] sharp talons come to cutting [npc.herHim].",

								" [npc2.Moaning] in delight, [npc2.name] violently [npc2.verb(grind)] [npc2.her] [npc2.foot+] into [npc.namePos] face,"
										+ " laughing derisively at [npc.herHim] as [npc2.she] [npc2.verb(draw)] dangerously close to cutting [npc.herHim] with [npc2.her] sharp talons."));
						break;
				}
				break;
		}
		return "";
	}
	
	public static final SexAction FOOT_WORSHIP_SINGLE_RECEIVING_DOM_GENTLE = new SexAction(
			SexActionType.ONGOING,
			ArousalIncrease.FOUR_HIGH,
			ArousalIncrease.THREE_NORMAL,
			CorruptionLevel.TWO_HORNY,
			Util.newHashMapOfValues(new Value<>(SexAreaPenetration.TONGUE, SexAreaPenetration.FOOT)),
			SexParticipantType.NORMAL,
			SexPace.DOM_GENTLE) {

		@Override
		public boolean isBaseRequirementsMet() {
			return !Sex.isDoubleFootJob(Sex.getCharacterTargetedForSexAction(this));
		}
		
		@Override
		public String getActionTitle() {
			return "Gentle [npc2.foot] worship";
		}

		@Override
		public String getActionDescription() {
			return "Gently worship [npc2.namePos] [npc2.foot].";
		}
		
		@Override
		public String getDescription() {
			UtilText.nodeContentSB.setLength(0);
			
			UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
					"Gently kissing up and down [npc2.namePos] [npc2.foot+],"
							+ " [npc.name] [npc.verb(caress)] it while [npc.moaning] and rubbing it against [npc.her] face.",

					"Softly rubbing [npc2.namePos] [npc2.foot+] with [npc.her] hand,"
							+ " [npc.name] [npc.verb(start)] gently kissing each one of [npc2.her] [npc2.toes], letting out a little [npc.moan] in the process.",

					"Gently pushing [npc2.namePos] [npc2.foot+] to [npc.her] face, [npc.name] [npc.verb(let)] out a little [npc.moan] as [npc.she] [npc.verb(start)] to gently kiss the sole,"
							+ " breathing in [npc2.her] [npc2.scent] as [npc.she] [npc.verb(rub)] it into [npc.her] face."));

			UtilText.nodeContentSB.append(getTargetedCharacterResponse(this));
					
			return UtilText.nodeContentSB.toString();
		}
		
	};
	
	public static final SexAction FOOT_WORSHIP_SINGLE_RECEIVING_DOM_NORMAL = new SexAction(
			SexActionType.ONGOING,
			ArousalIncrease.FOUR_HIGH,
			ArousalIncrease.THREE_NORMAL,
			CorruptionLevel.TWO_HORNY,
			Util.newHashMapOfValues(new Value<>(SexAreaPenetration.TONGUE, SexAreaPenetration.FOOT)),
			SexParticipantType.NORMAL,
			SexPace.DOM_NORMAL) {

		@Override
		public boolean isBaseRequirementsMet() {
			return !Sex.isDoubleFootJob(Sex.getCharacterTargetedForSexAction(this));
		}
		
		@Override
		public String getActionTitle() {
			return "Normal [npc2.foot] worship";
		}

		@Override
		public String getActionDescription() {
			return "Continue worshiping [npc2.namePos] [npc2.foot].";
		}
		
		@Override
		public String getDescription() {

			UtilText.nodeContentSB.setLength(0);

			UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
					"Eagerly grasping at [npc2.namePos] [npc2.foot+],"
							+ " [npc.name] [npc.verb(start)] energetically running [npc.her] [npc.tongue] up and down [npc2.her] sole, letting out [npc.a_moan+] with every lick.",

					"Desperately grasping [npc2.namePos] [npc2.foot+],"
							+ " [npc.name] [npc.verb(suckles)] on [npc2.her] [npc2.toes], letting out [npc.a_moan+] as [npc.she] [npc.verb(savor)] [npc2.her] [npc2.foot].",

					"Greedily running [npc.her] [npc.tongue] all over [npc2.namePos] [npc2.foot+], [npc.name] [npc.verb(let)] out [npc.a_moan+] as [npc.she] [npc.verb(continue)] to hold [npc2.her] [npc.foot] onto [npc.her] face,"
							+ " breathing in [npc2.her] [npc2.scent]."));

			UtilText.nodeContentSB.append(getTargetedCharacterResponse(this));
			
			return UtilText.nodeContentSB.toString();
		}
		
	};
	
	public static final SexAction FOOT_WORSHIP_SINGLE_RECEIVING_DOM_ROUGH = new SexAction(
			SexActionType.ONGOING,
			ArousalIncrease.FOUR_HIGH,
			ArousalIncrease.THREE_NORMAL,
			CorruptionLevel.THREE_DIRTY,
			Util.newHashMapOfValues(new Value<>(SexAreaPenetration.TONGUE, SexAreaPenetration.FOOT)),
			SexParticipantType.NORMAL,
			SexPace.DOM_ROUGH) {

		@Override
		public boolean isBaseRequirementsMet() {
			return !Sex.isDoubleFootJob(Sex.getCharacterTargetedForSexAction(this));
		}
		
		@Override
		public String getActionTitle() {
			return "Rough [npc2.foot] worship";
		}

		@Override
		public String getActionDescription() {
			return "Roughly worship [npc2.namePos] [npc2.foot].";
		}
		
		@Override
		public String getDescription() {

			UtilText.nodeContentSB.setLength(0);

			UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
					"Forcefully pulling [npc2.namePos] [npc2.foot+] into [npc.her] face,"
							+ " [npc.name] [npc.verb(start)] running [npc.her] [npc.tongue] all over [npc2.her] sole and [npc2.toes], letting out [npc.a_moan+] as [npc.she] [npc.verb(take)] [npc2.her] [npc2.toes] into [npc.her] mouth.",

					"Forcefully bringing [npc2.namePos] [npc2.toes+] into [npc.her] mouth,"
							+ " [npc.name] [npc.verb(start)] aggressively suckling on [npc2.her] [npc.foot], letting out [npc.a_moan+] as [npc.she] [npc.verb(taste)] [npc2.her] flavor.",

					"Burying [npc.her] face into [npc2.namePos] [npc2.feet+], [npc.name] [npc.verb(let)] out [npc.a_moan+] as [npc.she] [npc.verb(start)] to nibble and bite at [npc2.her] [npc2.feet],"
							+ " breathing [npc2.her] [npc2.scent] in deeply as [npc.she] [npc.verb(suckle)] [npc2.her] [npc2.foot]."));

			UtilText.nodeContentSB.append(getTargetedCharacterResponse(this));
			
			return UtilText.nodeContentSB.toString();
		}
		
	};
	
	public static final SexAction FOOT_WORSHIP_SINGLE_RECEIVING_SUB_NORMAL = new SexAction(
			SexActionType.ONGOING,
			ArousalIncrease.FOUR_HIGH,
			ArousalIncrease.THREE_NORMAL,
			CorruptionLevel.TWO_HORNY,
			Util.newHashMapOfValues(new Value<>(SexAreaPenetration.TONGUE, SexAreaPenetration.FOOT)),
			SexParticipantType.NORMAL,
			SexPace.SUB_NORMAL) {

		@Override
		public boolean isBaseRequirementsMet() {
			return !Sex.isDoubleFootJob(Sex.getCharacterTargetedForSexAction(this));
		}

		@Override
		public String getActionTitle() {
			return "Normal [npc2.foot] worship";
		}

		@Override
		public String getActionDescription() {
			return "Continue worshiping [npc2.namePos] [npc2.foot].";
		}
		
		@Override
		public String getDescription() {

			UtilText.nodeContentSB.setLength(0);

			UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
					"Pulling [npc2.namePos] [npc2.foot+] into [npc.her] face,"
							+ " [npc.name] [npc.verb(start)] energetically running [npc.her] [npc.tongue] up and down [npc2.her] sole, letting out [npc.a_moan+] with every lick as [npc.she] worships [npc2.her] [npc2.foot].",

					"Grasping at [npc2.namePos] [npc2.foot+],"
							+ " [npc.name] [npc.verb(suckle)] on [npc2.her] [npc2.toes], letting out [npc.a_moan+] as [npc.she] [npc.verb(savor)] [npc2.her] [npc2.foot].",

					"Running [npc.her] [npc.tongue] all over [npc2.namePos] [npc2.foot+], [npc.name] [npc.verb(let)] out [npc.a_moan+] as [npc.she] [npc.verb(start)] to pull [npc2.her] [npc.foot] into [npc.her] face,"
							+ " breathing in [npc2.her] [npc2.scent]."));

			UtilText.nodeContentSB.append(getTargetedCharacterResponse(this));
			
			return UtilText.nodeContentSB.toString();
		}
		
	};
	
	public static final SexAction FOOT_WORSHIP_SINGLE_RECEIVING_SUB_EAGER = new SexAction(
			SexActionType.ONGOING,
			ArousalIncrease.FOUR_HIGH,
			ArousalIncrease.THREE_NORMAL,
			CorruptionLevel.TWO_HORNY,
			Util.newHashMapOfValues(new Value<>(SexAreaPenetration.TONGUE, SexAreaPenetration.FOOT)),
			SexParticipantType.NORMAL,
			SexPace.SUB_EAGER) {

		@Override
		public boolean isBaseRequirementsMet() {
			return !Sex.isDoubleFootJob(Sex.getCharacterTargetedForSexAction(this));
		}
		
		@Override
		public String getActionTitle() {
			return "Eager [npc2.foot] worship";
		}

		@Override
		public String getActionDescription() {
			return "Eagerly worship [npc2.namePos] [npc2.foot]";
		}

		@Override
		public String getDescription() {

			UtilText.nodeContentSB.setLength(0);

			UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
					"Eagerly pulling [npc2.namePos] [npc2.foot+] into [npc.her] face,"
							+ " [npc.name] [npc.verb(start)] energetically running [npc.her] [npc.tongue] up and down [npc2.her] sole, letting out [npc.a_moan+] with every lick as [npc.she] worships [npc2.her] [npc2.foot].",

					"Desperately grasping [npc2.namePos] [npc2.foot+],"
							+ " [npc.name] [npc.verb(suckle)] on [npc2.her] [npc2.toes], letting out [npc.a_moan+] as [npc.she] [npc.verb(savor)] [npc2.her] [npc2.foot].",

					"Greedily running [npc.her] [npc.tongue] all over [npc2.namePos] [npc2.foot+], [npc.name] [npc.verb(let)] out [npc.a_moan+] as [npc.she] [npc.verb(start)] to pull [npc2.her] [npc.foot] into [npc.her] face,"
							+ " breathing in [npc2.her] [npc2.scent]."));

			UtilText.nodeContentSB.append(getTargetedCharacterResponse(this));
			
			return UtilText.nodeContentSB.toString();
		}
		
	};
	
	public static final SexAction FOOT_WORSHIP_SINGLE_RECEIVING_SUB_RESIST = new SexAction(
			SexActionType.ONGOING,
			ArousalIncrease.TWO_LOW,
			ArousalIncrease.THREE_NORMAL,
			CorruptionLevel.ZERO_PURE,
			Util.newHashMapOfValues(new Value<>(SexAreaPenetration.TONGUE, SexAreaPenetration.FOOT)),
			SexParticipantType.NORMAL,
			SexPace.SUB_RESISTING) {

		@Override
		public boolean isBaseRequirementsMet() {
			return !Sex.isDoubleFootJob(Sex.getCharacterTargetedForSexAction(this));
		}
		
		@Override
		public String getActionTitle() {
			return "Resist [npc2.foot] worship";
		}

		@Override
		public String getActionDescription() {
			return "Try to push [npc2.namePos] [npc2.foot+] off your face.";
		}

		@Override
		public String getDescription() {

			UtilText.nodeContentSB.setLength(0);
			
			switch(Sex.getSexPace(Sex.getCharacterTargetedForSexAction(this))) {
				case DOM_GENTLE:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							"Desperately trying, and failing, to pull [npc.her] mouth away from [npc2.namePos] [npc2.foot], [npc.name] [npc.verb(let)] out [npc.a_sob+] as, ignoring [npc.her] protests,"
									+ " [npc2.she] slowly, yet firmly, [npc2.verb(push)] [npc2.her] [npc2.foot] against [npc.her] face.",

							"[npc.A_sob+] bursts out from between [npc.namePos] [npc.lips] as [npc.she] weakly tries to push [npc2.namePos] [npc2.foot] away, but, totally ignoring [npc.her] protests,"
									+ " [npc2.name] firmly [npc2.verb(hold)] [npc.herHim] in place,"
									+ " gently pushing [npc2.her] [npc2.foot] into [npc.her] face.",

							"[npc.Sobbing] in distress, [npc.name] weakly [npc.verb(struggle)] against [npc2.name] as [npc.she] [npc.verb(plead)] for [npc2.herHim] to get [npc2.her] [npc2.foot] off of [npc.her]."
									+ " [npc2.Moaning] in delight, [npc2.name] totally [npc2.verb(ignore)] [npc.her] protests, slowly grinding [npc2.her] [npc2.foot] into [npc.her] face."));
					break;
				case DOM_ROUGH:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							"Desperately trying, and failing, to pull [npc.her] mouth away from [npc2.namePos] [npc2.foot], [npc.name] [npc.verb(let)] out [npc.a_sob+] as, ignoring [npc.her] protests,"
									+ " [npc2.she] violently [npc2.verb(grind)] [npc2.her] [npc2.foot] against [npc.her] face.",

							"[npc.A_sob+] bursts out from between [npc.namePos] [npc.lips] as [npc.she] weakly tries to push [npc2.namePos] [npc2.foot] away, but, totally ignoring [npc.her] protests,"
									+ " [npc2.she] dominantly [npc2.verb(hold)] [npc.herHim] in place,"
									+ " violently pressing [npc2.her] [npc2.foot] into [npc.her] face.",

							"[npc.Sobbing] in distress, [npc.name] weakly [npc.verb(struggle)] against [npc2.name] as [npc.she] [npc.verb(plead)] for [npc2.name] to get [npc2.her] [npc2.foot] off of [npc.her]."
									+ " [npc2.Moaning] in delight, [npc2.name] totally [npc2.verb(ignore)] [npc.her] protests, roughly grinding [npc2.her] [npc2.foot] into [npc.her] face."));
					break;
				default: // DOM_NORMAL and in case anything goes wrong:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							"Desperately trying, and failing, to pull [npc.her] mouth away from [npc2.namePos] [npc2.foot], [npc.name] [npc.verb(let)] out [npc.a_sob+] as, ignoring [npc.her] protests,"
									+ " [npc2.she] slowly, yet firmly, [npc2.verb(push)] [npc2.her] [npc2.foot] against [npc.her] face.",

							"[npc.A_sob+] bursts out from between [npc.namePos] [npc.lips] as [npc.she] weakly tries to push [npc2.namePos] [npc2.foot] away, but, totally ignoring [npc.her] protests,"
									+ " [npc2.name] firmly [npc2.verb(hold)] [npc.herHim] in place,"
									+ " gently pushing [npc2.her] [npc2.foot] into [npc.her] face.",

							"[npc.Sobbing] in distress, [npc.name] weakly [npc.verb(struggle)] against [npc2.name] as [npc.she] [npc.verb(plead)] for [npc2.herHim] to get [npc2.her] [npc2.foot] off of [npc.her]."
									+ " [npc2.Moaning] in delight, [npc2.name] totally [npc2.verb(ignore)] [npc.her] protests, slowly grinding [npc2.her] [npc2.foot] into [npc.her] face."));
					break;
			}
			
			return UtilText.nodeContentSB.toString();
		}
		
	};
	
	public static final SexAction FOOT_WORSHIP_SINGLE_RECEIVING_STOP = new SexAction(
			SexActionType.STOP_ONGOING,
			ArousalIncrease.ONE_MINIMUM,
			ArousalIncrease.ONE_MINIMUM,
			CorruptionLevel.ZERO_PURE,
			Util.newHashMapOfValues(new Value<>(SexAreaPenetration.TONGUE, SexAreaPenetration.FOOT)),
			SexParticipantType.NORMAL) {

		@Override
		public boolean isBaseRequirementsMet() {
			return !Sex.isDoubleFootJob(Sex.getCharacterTargetedForSexAction(this));
		}
		
		@Override
		public String getActionTitle() {
			return "Stop [npc2.foot] worship";
		}

		@Override
		public String getActionDescription() {
			return "Pull your mouth away from [npc2.namePos] [npc2.foot].";
		}

		@Override
		public String getDescription() {
			
			UtilText.nodeContentSB.setLength(0);
			
			switch(Sex.getSexPace(Sex.getCharacterPerformingAction())) {
				case DOM_ROUGH:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							"Roughly grabbing [npc2.namePos] [npc2.foot+] from [npc.her] face,"
									+ " [npc.name] gives [npc2.her] [npc2.toes+] one last nibble before pulling [npc2.her] [npc2.foot] away.",

							"Giving [npc2.namePos] [npc2.foot+] one last bite, [npc.name] then [npc2.verb(pull)] [npc2.her] [npc2.foot] back, stopping the worship for now."));
					break;
				default:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							"Grabbing onto [npc2.namePos] [npc2.foot+],"
									+ " [npc.name] gives [npc2.her] [npc2.toes+] one last kiss before pulling [npc2.her] [npc2.foot] away.",

							"Giving [npc2.namePos] [npc2.foot+] one last lick, [npc.name] then [npc2.verb(pull)] [npc2.her] [npc2.foot] back, stopping the worship for now."));
					break;
			}
			
			switch(Sex.getSexPace(Sex.getCharacterTargetedForSexAction(this))) {
				case SUB_RESISTING:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							" [npc2.Name] can't help but let out [npc2.sob+] as [npc.name] moves away,"
									+ " and [npc2.she] [npc2.verb(continue)] crying and protesting as [npc2.she] [npc2.verb(plead)] for [npc.herHim] to leave [npc.herHim] alone.",

							" With [npc2.a_sob+], [npc2.name] [npc2.verb(continue)] to struggle against [npc.name], tears streaming down [npc2.her] [npc2.face] as [npc2.she] [npc2.verb(beg)] to be left alone."));
					break;
				default:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							" [npc2.Name] [npc2.verb(let)] out [npc2.a_moan+] as [npc.name] [npc.verb(pull)] [npc2.her] [npc2.foot+] back, eager to give it more attention.",

							" [npc2.A_moan+] escapes from between [npc2.namePos] [npc2.lips+], betraying [npc2.her] lust for [npc.namePos] [npc.tongue+]."));
					break;
			}
			
			return UtilText.nodeContentSB.toString();
		}
	};
	
	
	public static final SexAction FOOT_WORSHIP_SINGLE_GIVING_START = new SexAction(
			SexActionType.START_ONGOING,
			ArousalIncrease.THREE_NORMAL,
			ArousalIncrease.FOUR_HIGH,
			CorruptionLevel.TWO_HORNY,
			Util.newHashMapOfValues(new Value<>(SexAreaPenetration.FOOT, SexAreaPenetration.TONGUE)),
			SexParticipantType.NORMAL) {

		@Override
		public boolean isBaseRequirementsMet() {
			return !Sex.isDoubleFootJob(Sex.getCharacterPerformingAction());
		}
		
		@Override
		public String getActionTitle() {
			return "Give [npc.foot]";
		}

		@Override
		public String getActionDescription() {
			return "Put your [npc.foot] in [npc2.namePos] face and let [npc2.herHim] worship it.";
		}

		@Override
		public String getDescription() {
			
			UtilText.nodeContentSB.setLength(0);
			
			switch(Sex.getCharacterPerformingAction().getLegType().getFootType()) {
				case HUMANOID:
				case PAWS:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							"With [npc.a_moan+], [npc.name] [npc.eagerly] [npc.verb(put)] [npc.her] [npc.foot+] into [npc2.namePos] face,"
									+ " allowing [npc2.her] to begin worshipping it.",

							"Pushing [npc.her] [npc.foot+] into [npc2.namePos] face, [npc.name] [npc.verb(splay)] [npc.her] [npc.toes+] out,"
									+ " allowing [npc2.name] to begin worshipping it."));
					
					switch(Sex.getSexPace(Sex.getCharacterTargetedForSexAction(this))) {
						case SUB_RESISTING:
							UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
									" [npc2.Name] [npc2.verb(let)] out [npc2.a_sob+] as [npc.name] [npc.verb(force)] [npc.her] [npc.foot] into [npc2.her] face,"
											+ " and, struggling against [npc.herHim], [npc2.she] desperately tries to pull away.",
	
									" With [npc2.a_sob+], [npc2.name] struggles against [npc.name] as [npc.she] [npc.verb(force)] [npc.her] [npc.foot] into [npc2.her] face."));
							break;
						default:
							UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
									" [npc2.Name] [npc2.verb(let)] out [npc2.a_moan+], [npc2.eagerly] taking [npc.namePos] [npc.foot] and lavishing it with kisses and licks.",
	
									" With [npc2.a_moan+], [npc2.name] [npc2.eagerly] [npc2.verb(grab)] hold of [npc.namePos] [npc.foot+] and [npc2.verb(give)] it a long lick."));
							break;
					}
					break;
				
				case HOOFS:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							"With [npc.a_moan+], [npc.name] [npc.eagerly] [npc.verb(put)] [npc.her] hoof into [npc2.namePos] face,"
									+ " allowing [npc2.her] to begin worshipping it.",

							"Pushing [npc.her] hoof into [npc2.namePos] face, [npc.name] [npc.verb(wiggle)] it up and down,"
									+ " allowing [npc2.name] to begin worshipping it."));
					
					switch(Sex.getSexPace(Sex.getCharacterTargetedForSexAction(this))) {
						case SUB_RESISTING:
							UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
									" [npc2.Name] [npc2.verb(let)] out [npc2.a_sob+] as [npc.name] [npc.verb(force)] [npc.her] [npc.foot] into [npc2.her] face,"
											+ " and, struggling against [npc.herHim], [npc2.she] desperately tries to pull away.",

									" With [npc2.a_sob+], [npc2.name] struggles against [npc.name] as [npc.she] [npc.verb(force)] [npc.her] [npc.foot] into [npc2.her] face."));
							break;
						default:
							UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
									" [npc2.Name] [npc2.verb(let)] out [npc2.a_moan+], [npc2.eagerly] taking [npc.namePos] [npc.foot] and lavishing it with kisses and licks.",

									" With [npc2.a_moan+], [npc2.name] [npc2.eagerly] [npc2.verb(grab)] hold of [npc.namePos] [npc.foot+] and [npc2.verb(give)] it a long lick."));
							break;
					}
					break;
					
				case TALONS:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							"With [npc.a_moan+], [npc.name] [npc.eagerly] [npc.verb(put)] [npc.her] bird-like claw into [npc2.namePos] face,"
									+ " allowing [npc2.her] to begin worshipping it.",

							"Pushing [npc.her] [npc.foot+] into [npc2.namePos] face, [npc.name] [npc.verb(splay)] [npc.her] [npc.toes+] out,"
									+ " allowing [npc2.name] to begin worshipping it."));
					
					switch(Sex.getSexPace(Sex.getCharacterTargetedForSexAction(this))) {
						case SUB_RESISTING:
							UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
									" [npc2.Name] [npc2.verb(let)] out [npc2.a_sob+] as [npc.name] [npc.verb(force)] [npc.her] [npc.foot] into [npc2.her] face,"
											+ " and, struggling against [npc.herHim], [npc2.she] desperately tries to pull away.",

									" With [npc2.a_sob+], [npc2.name] struggles against [npc.name] as [npc.she] [npc.verb(force)] [npc.her] [npc.foot] into [npc2.her] face."));
							break;
						default:
							UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
									" [npc2.Name] [npc2.verb(let)] out [npc2.a_moan+], [npc2.eagerly] taking [npc.namePos] [npc.foot] and lavishing it with kisses and licks.",

									" With [npc2.a_moan+], [npc2.name] [npc2.eagerly] grabs hold of [npc.namePos] [npc.foot+] and gives it a long lick."));
							break;
					}
					break;
			}
			
			return UtilText.nodeContentSB.toString();
		}
		
	};
	
	private static String getTargetedCharacterReceivingResponse(SexAction action) {
		switch(Sex.getSexPace(Sex.getCharacterTargetedForSexAction(action))) {
			case SUB_EAGER:
			case DOM_NORMAL:
				UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
						" [npc2.Name] greedily [npc2.verb(pull)] [npc.namePos] [npc.foot+] to [npc2.her] face,"
								+ " letting out [npc2.a_moan+] as [npc2.she] enthusiastically [npc2.verb(lick)] [npc.namePos] soles.",

						" [npc2.A_moan+] bursts out from [npc2.namePos] mouth, before [npc2.she] [npc2.verb(start)] eagerly running [npc2.her] [npc2.tongue] along [npc.namePos] [npc.foot+].",

						" [npc2.Moaning] in delight, [npc2.name] eagerly [npc2.verb(run)] [npc2.her] tongue along [npc.namePos] [npc.foot+] and [npc.toes]."));
				break;
			case SUB_RESISTING:
				UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
						" Failing to pull [npc.namePos] [npc.foot] away from [npc2.her] face,"
								+ " [npc2.name] [npc2.verb(let)] out [npc2.a_sob+] as [npc2.she] weakly [npc2.verb(try)] to struggle free.",

						" [npc2.A_sob+] bursts out from between [npc2.namePos] [npc2.lips] as [npc2.she] weakly [npc2.verb(try)] to push [npc.name] away,"
								+ " squirming and protesting as [npc.name] [npc.verb(begin)] to push [npc.her] [npc.foot+] into [npc2.her] mouth.",

						" [npc2.Sobbing] in distress, [npc2.name] [npc2.verb(try)], in vain, to pull [npc.namePos] [npc.foot+] off of [npc2.her] face."));
				break;
			case SUB_NORMAL:
				UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
						" [npc2.Name] greedily [npc2.verb(pull)] [npc.namePos] [npc.foot+] to [npc2.her] face,"
								+ " letting out [npc2.a_moan+] as [npc2.she] enthusiastically [npc2.verb(lick)] [npc.namePos] soles.",

						" [npc2.A_moan+] bursts out from [npc2.namePos] mouth, before [npc2.she] [npc2.verb(start)] eagerly running [npc2.her] [npc2.tongue] along [npc.namePos] [npc.foot+].",

						" [npc2.Moaning] in delight, [npc2.name] eagerly [npc2.verb(run)] [npc2.her] tongue along [npc.namePos] [npc.foot+] and [npc.toes]."));
				break;
			case DOM_GENTLE:
				UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
						" [npc2.Name] gently [npc2.verb(pull)] [npc.namePos] [npc.foot+] to [npc2.her] face,"
								+ " letting out [npc2.a_moan+] as [npc2.she] enthusiastically [npc2.verb(kiss)] [npc.namePos] soles.",

						" [npc2.A_moan+] bursts out from [npc2.namePos] mouth, before [npc2.she] [npc2.verb(start)] planting gentle kisses along [npc.namePos] [npc.foot+].",

						" [npc2.Moaning] in delight, [npc2.name] [npc2.verb(plant)] gentle kisses along [npc.namePos] [npc.foot+] and [npc.toes]."));
				break;
			case DOM_ROUGH:
				UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
						" [npc2.Name] roughly [npc2.verb(pull)] [npc.namePos] [npc.foot+] to [npc2.her] face,"
								+ " letting out [npc2.a_moan+] as [npc2.she] desparately [npc2.verb(take)] [npc.namePos] [npc.toes] into [npc2.her] mouth.",

						" [npc2.A_moan+] bursts out from [npc2.namePos] mouth, before [npc2.she] greedily [npc2.verb(nibble)] and [npc2.verb(suck)]] on [npc.namePos] [npc.foot+].",

						" [npc2.Moaning] in delight, [npc2.name] hungrily [npc2.verb(suck)] on [npc.namePos] [npc.toes+]."));
				break;
		}
		return "";
	}
	
	public static final SexAction FOOT_WORSHIP_SINGLE_GIVING_DOM_GENTLE = new SexAction(
			SexActionType.ONGOING,
			ArousalIncrease.THREE_NORMAL,
			ArousalIncrease.FOUR_HIGH,
			CorruptionLevel.TWO_HORNY,
			Util.newHashMapOfValues(new Value<>(SexAreaPenetration.FOOT, SexAreaPenetration.TONGUE)),
			SexParticipantType.NORMAL,
			SexPace.DOM_GENTLE) {

		@Override
		public boolean isBaseRequirementsMet() {
			return !Sex.isDoubleFootJob(Sex.getCharacterPerformingAction());
		}
		
		@Override
		public String getActionTitle() {
			return "Gently press [npc.foot]";
		}

		@Override
		public String getActionDescription() {
			return "Gently press your [npc.foot] down against [npc2.namePos] face.";
		}

		@Override
		public String getDescription() {
			UtilText.nodeContentSB.setLength(0);
			
			UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
					"Gently rubbing [npc.her] [npc.foot] up and down over [npc2.namePos] face, [npc.name] [npc.verb(let)] out a soft [npc.moan].",

					"With a soft [npc.moan], [npc.name] gently [npc.verb(start)] sliding [npc.her] [npc.foot+] up and down over [npc2.namePos] face.",

					"Slowly pressing [npc.her] [npc.foot+] into [npc2.namePos] face, [npc.name] [npc.verb(let)] out [npc.a_moan+]."));

			UtilText.nodeContentSB.append(getTargetedCharacterReceivingResponse(this));
			
			return UtilText.nodeContentSB.toString();
		}
		
	};
	
	public static final SexAction FOOT_WORSHIP_SINGLE_GIVING_DOM_NORMAL = new SexAction(
			SexActionType.ONGOING,
			ArousalIncrease.THREE_NORMAL,
			ArousalIncrease.FOUR_HIGH,
			CorruptionLevel.TWO_HORNY,
			Util.newHashMapOfValues(new Value<>(SexAreaPenetration.FOOT, SexAreaPenetration.TONGUE)),
			SexParticipantType.NORMAL,
			SexPace.DOM_NORMAL) {

		@Override
		public boolean isBaseRequirementsMet() {
			return !Sex.isDoubleFootJob(Sex.getCharacterPerformingAction());
		}
		
		@Override
		public String getActionTitle() {
			return "Press [npc.foot]";
		}

		@Override
		public String getActionDescription() {
			return "Press your [npc.foot] down against [npc2.namePos] face.";
		}

		@Override
		public String getDescription() {
			UtilText.nodeContentSB.setLength(0);

			UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
					"Eagerly rubbing [npc.her] [npc.foot] on [npc2.namePos] face, [npc.name] [npc.verb(let)] out [npc.a_moan+].",

					"With [npc.a_moan+], [npc.name] happily [npc.verb(rub)] [npc.her] [npc.foot+] along [npc2.namePos] face.",

					"Eagerly rubbing [npc.her] [npc.foot+] into [npc2.namePos] face, [npc.name] [npc.verb(let)] out [npc.a_moan+]."));

			UtilText.nodeContentSB.append(getTargetedCharacterReceivingResponse(this));
			
			return UtilText.nodeContentSB.toString();
		}
		
	};
	
	public static final SexAction FOOT_WORSHIP_SINGLE_GIVING_DOM_ROUGH = new SexAction(
			SexActionType.ONGOING,
			ArousalIncrease.THREE_NORMAL,
			ArousalIncrease.FOUR_HIGH,
			CorruptionLevel.THREE_DIRTY,
			Util.newHashMapOfValues(new Value<>(SexAreaPenetration.FOOT, SexAreaPenetration.TONGUE)),
			SexParticipantType.NORMAL,
			SexPace.DOM_ROUGH) {

		@Override
		public boolean isBaseRequirementsMet() {
			return !Sex.isDoubleFootJob(Sex.getCharacterPerformingAction());
		}
		
		@Override
		public String getActionTitle() {
			return "Roughly press [npc.foot]";
		}

		@Override
		public String getActionDescription() {
			return "Roughly grind your [npc.foot] against [npc2.namePos] face.";
		}

		@Override
		public String getDescription() {
			UtilText.nodeContentSB.setLength(0); //TODO

			UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
					"Roughly grinding [npc.her] [npc.foot] into [npc2.namePos] face, [npc.name] [npc.verb(let)] out [npc.a_moan+].",

					"With [npc.a_moan+], [npc.name] happily [npc.verb(start)] grinds [npc.her] [npc.foot+] into [npc2.namePos] face.",

					"Eagerly grinding [npc.her] [npc.foot+] against [npc2.namePos] face, [npc.name] [npc.verb(let)] out [npc.a_moan+]."));

			UtilText.nodeContentSB.append(getTargetedCharacterReceivingResponse(this));
			
			return UtilText.nodeContentSB.toString();
		}
		
	};
	
	public static final SexAction FOOT_WORSHIP_SINGLE_GIVING_SUB_NORMAL = new SexAction(
			SexActionType.ONGOING,
			ArousalIncrease.THREE_NORMAL,
			ArousalIncrease.FOUR_HIGH,
			CorruptionLevel.TWO_HORNY,
			Util.newHashMapOfValues(new Value<>(SexAreaPenetration.FOOT, SexAreaPenetration.TONGUE)),
			SexParticipantType.NORMAL,
			SexPace.SUB_NORMAL) {

		@Override
		public boolean isBaseRequirementsMet() {
			return !Sex.isDoubleFootJob(Sex.getCharacterPerformingAction());
		}
		
		@Override
		public String getActionTitle() {
			return "Press [npc.foot]";
		}

		@Override
		public String getActionDescription() {
			return "Press your [npc.foot] down against [npc2.namePos] face.";
		}

		@Override
		public String getDescription() {
			UtilText.nodeContentSB.setLength(0);

			UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
					"Pushing [npc.her] [npc.foot] into [npc2.namePos] face, [npc.name] [npc.verb(let)] out [npc.a_moan+].",

					"With [npc.a_moan+], [npc.name] happily [npc.verb(start)] pushing [npc.her] [npc.foot+] into [npc2.namePos] face.",

					"Pressing [npc.her] [npc.foot+] into [npc2.namePos] face, [npc.name] [npc.verb(let)] out [npc.a_moan+]."));

			UtilText.nodeContentSB.append(getTargetedCharacterReceivingResponse(this));
			
			return UtilText.nodeContentSB.toString();
		}
		
	};
	
	public static final SexAction FOOT_WORSHIP_SINGLE_GIVING_SUB_EAGER = new SexAction(
			SexActionType.ONGOING,
			ArousalIncrease.THREE_NORMAL,
			ArousalIncrease.FOUR_HIGH,
			CorruptionLevel.TWO_HORNY,
			Util.newHashMapOfValues(new Value<>(SexAreaPenetration.FOOT, SexAreaPenetration.TONGUE)),
			SexParticipantType.NORMAL,
			SexPace.SUB_EAGER) {

		@Override
		public boolean isBaseRequirementsMet() {
			return !Sex.isDoubleFootJob(Sex.getCharacterPerformingAction());
		}
		
		@Override
		public String getActionTitle() {
			return "Eagerly press [npc.foot]";
		}

		@Override
		public String getActionDescription() {
			return "Eagerly press your [npc.foot] against [npc2.namePos] face.";
		}

		@Override
		public String getDescription() {
			UtilText.nodeContentSB.setLength(0);

			UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
					"Eagerly pushing [npc.her] [npc.foot] into [npc2.namePos] face, [npc.name] [npc.verb(let)] out [npc.a_moan+].",

					"With [npc.a_moan+], [npc.name] happily [npc.verb(start)] pushing [npc.her] [npc.foot+] into [npc2.namePos] face.",

					"Eagerly pressing [npc.her] [npc.foot+] into [npc2.namePos] face, [npc.name] [npc.verb(let)] out [npc.a_moan+]."));

			UtilText.nodeContentSB.append(getTargetedCharacterReceivingResponse(this));
			
			return UtilText.nodeContentSB.toString();
		}
		
	};
	
	public static final SexAction FOOT_WORSHIP_SINGLE_GIVING_SUB_RESIST = new SexAction(
			SexActionType.ONGOING,
			ArousalIncrease.ZERO_NONE,
			ArousalIncrease.FOUR_HIGH,
			CorruptionLevel.ZERO_PURE,
			Util.newHashMapOfValues(new Value<>(SexAreaPenetration.FOOT, SexAreaPenetration.TONGUE)),
			SexParticipantType.NORMAL,
			SexPace.SUB_RESISTING) {

		@Override
		public boolean isBaseRequirementsMet() {
			return !Sex.isDoubleFootJob(Sex.getCharacterPerformingAction());
		}
		
		@Override
		public String getActionTitle() {
			return "Resist [npc.foot] worship";
		}

		@Override
		public String getActionDescription() {
			return "Try and pull your [npc.foot+] away from [npc2.namePos] grasp.";
		}
		
		@Override
		public String getDescription() {

			UtilText.nodeContentSB.setLength(0);
			
			switch(Sex.getSexPace(Sex.getCharacterTargetedForSexAction(this))) {
				case DOM_GENTLE:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							"[npc.Name] [npc.verb(feel)] tears start to well up in [npc.her] [npc.eyes], and, not being able to hold back any longer, [npc.she] suddenly [npc.verb(let)] out [npc.a_sob+],"
									+ " weakly trying to pull [npc.her] [npc.foot] away from [npc2.namePos] [npc2.lips].",

							"[npc.A_sob+] bursts out from [npc.namePos] mouth as [npc.she] frantically [npc.verb(try)] to pull [npc.her] [npc.foot] away from [npc2.namePos] face,"
									+ " struggling in desperation as [npc2.she] [npc2.verb(continue)] kisses [npc.her] [npc.foot].",

							"Trying desperately to pull [npc.her] [npc.foot] away from [npc2.name], [npc.name] [npc.sobVerb] in distress as [npc2.her] [npc2.lips+] [npc2.verb(continue)] gently kissing [npc.her] [npc.foot]."));
					break;
				case DOM_NORMAL:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							"[npc.Name] [npc.verb(feel)] tears start to well up in [npc.her] [npc.eyes], and, not being able to hold back any longer, [npc.she] suddenly [npc.verb(let)] out [npc.a_sob+],"
									+ " weakly trying to pull [npc.her] [npc.foot] away from [npc2.namePos] [npc2.tongue].",

							"[npc.A_sob+] bursts out from [npc.namePos] mouth as [npc.she] frantically [npc.verb(try)] to pull [npc.her] [npc.foot] away from [npc2.namePos] face,"
									+ " struggling in desperation as [npc2.she] [npc2.verb(continue)] licking [npc.her] [npc.foot].",

							"Trying desperately to pull [npc.her] [npc.foot] away from [npc2.name], [npc.name] [npc.sobVerb] in distress as [npc2.her] [npc2.tongue+] [npc2.verb(continue)] slobbering on [npc.her] [npc.foot]."));
					break;
				case DOM_ROUGH:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							"[npc.Name] [npc.verb(feel)] tears start to well up in [npc.her] [npc.eyes], and, not being able to hold back any longer, [npc.she] suddenly [npc.verb(let)] out [npc.a_sob+],"
									+ " weakly trying to pull [npc.her] [npc.foot] away from [npc2.namePos] hungry mouth.",

							"[npc.A_sob+] bursts out from [npc.namePos] mouth as [npc.she] frantically [npc.verb(try)] to pull [npc.her] [npc.foot] away from [npc2.namePos] face,"
									+ " struggling in desperation as [npc2.she] [npc2.verb(continue)] sucking and biting [npc.her] [npc.foot].",

							"Trying desperately to pull [npc.her] [npc.foot] away from [npc2.name], [npc.name] [npc.sobVerb] in distress as [npc2.her] mouth [npc2.verb(continue)] sucking and biting [npc.her] [npc.foot]."));
					break;
				default:
					break;
			}
			
			return UtilText.nodeContentSB.toString();
		}
		
	};
	
	public static final SexAction FOOT_WORSHIP_SINGLE_GIVING_STOP = new SexAction(
			SexActionType.STOP_ONGOING,
			ArousalIncrease.ONE_MINIMUM,
			ArousalIncrease.ONE_MINIMUM,
			CorruptionLevel.ZERO_PURE,
			Util.newHashMapOfValues(new Value<>(SexAreaPenetration.FOOT, SexAreaPenetration.TONGUE)),
			SexParticipantType.NORMAL) {

		@Override
		public boolean isBaseRequirementsMet() {
			return !Sex.isDoubleFootJob(Sex.getCharacterPerformingAction());
		}
		
		@Override
		public String getActionTitle() {
			return "Stop [npc.foot] worship";
		}

		@Override
		public String getActionDescription() {
			return "Pull your [npc.foot] away from [npc2.name].";
		}

		@Override
		public String getDescription() {
			
			UtilText.nodeContentSB.setLength(0);
			
			switch(Sex.getSexPace(Sex.getCharacterPerformingAction())) {
				case DOM_ROUGH:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							"Taking [npc.her] [npc.foot] away from [npc2.namePos] face, [npc.name] [npc.verb(let)] out a menacing growl as [npc.she] [npc.verb(command)] [npc2.herHim] to leave [npc.her] [npc.feet] alone.",

							"[npc.Name] [npc.verb(lean)] into [npc2.namePos] [npc2.foot+], inhaling [npc2.her] [npc2.scent] before quickly taking [npc.her] [npc.foot] away from [npc2.her] [npc2.lips]."));
					break;
				default:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							"Taking [npc.her] [npc.foot] away from [npc2.namePos] face, [npc.name] [npc.verb(let)] out [npc.a_moan+] as [npc.she] [npc.verb(tell)] [npc2.herHim] to leave [npc.her] [npc.feet] alone.",

							"[npc.Name] [npc.verb(lean)] into [npc2.namePos] [npc2.foot+], inhaling [npc2.her] [npc2.scent] before taking [npc.her] [npc.foot] away from [npc2.her] [npc2.lips]."));
					break;
			}
			
			switch(Sex.getSexPace(Sex.getCharacterTargetedForSexAction(this))) {
				case SUB_RESISTING:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							" [npc2.Name] [npc2.verb(let)] out a relieved sigh, which soon turns into [npc2.a_sob+] as [npc2.she] realises that [npc.name] [npc.has]n't finished with [npc2.herHim] just yet.",

							" With [npc2.a_sob+], [npc2.name] [npc2.verb(continue)] to protest and struggle against [npc.name] as [npc.she] [npc.verb(hold)] [npc2.herHim] firmly in place."));
					break;
				default:
					UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
							" [npc2.A_moan+] escapes from against [npc2.namePos] [npc2.lips+], betraying [npc2.her] desire to continue worshipping [npc.her] [npc.foot]."));
					break;
			}
			
			return UtilText.nodeContentSB.toString();
			
		}
	};
	

}

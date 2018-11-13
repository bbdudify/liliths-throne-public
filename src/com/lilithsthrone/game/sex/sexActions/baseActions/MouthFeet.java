package com.lilithsthrone.game.sex.sexActions.baseActions;

import com.lilithsthrone.game.character.attributes.CorruptionLevel;
import com.lilithsthrone.game.dialogue.utils.UtilText;
import com.lilithsthrone.game.sex.ArousalIncrease;
import com.lilithsthrone.game.sex.Sex;
import com.lilithsthrone.game.sex.SexAreaOrifice;
import com.lilithsthrone.game.sex.SexAreaPenetration;
import com.lilithsthrone.game.sex.SexPace;
import com.lilithsthrone.game.sex.SexParticipantType;
import com.lilithsthrone.game.sex.sexActions.SexAction;
import com.lilithsthrone.game.sex.sexActions.SexActionType;
import com.lilithsthrone.utils.Util;
import com.lilithsthrone.utils.Util.Value;

/**
 * @author Innoxia
 * @version 0.2.10
 * @since 0.2.10
 */
public class MouthFeet {

  // Foot tease

  public static final SexAction FOOT_WORSHIP_DOUBLE_RECEIVING_START = new SexAction(
      SexActionType.START_ONGOING,
      ArousalIncrease.FOUR_HIGH,
      ArousalIncrease.THREE_NORMAL,
      CorruptionLevel.TWO_HORNY,
      Util.newHashMapOfValues(new Value<>(SexAreaOrifice.MOUTH, SexAreaPenetration.FOOT)),
      SexParticipantType.NORMAL) {

    @Override
    public boolean isBaseRequirementsMet() {
      return Sex.isDoubleFootJob(Sex.getCharacterTargetedForSexAction(this));
    }

    @Override
    public String getActionTitle() {
      return "Worship [npc2.feet]";
    }

    @Override
    public String getActionDescription() {
      return "Pull [npc2.namePos] [npc2.feet] to your [npc.lips] and worship them.";
    }

    @Override
    public String getDescription() {

      UtilText.nodeContentSB.setLength(0);

      switch (Sex.getCharacterPerformingAction().getLegType().getFootType()) {
        case HUMANOID:
        case PAWS:
          UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
              "Grabbing [npc2.namePos] [npc2.feet+] and pressing them against [npc.her] [npc.lips+], [npc.name] [npc.verb(begin)] kissing [npc2.her] soles and [npc2.toes+],"
                  + " before [npc.eagerly] running [npc.her] [npc.tongue] along the entire length of [npc2.her] [npc2.foot]."
              , "[npc.Name] [npc.verb(bring)] [npc2.namePos] [npc2.feet+] to [npc.her] [npc.lips+],"
                  + " before [npc.eagerly] kissing onto [npc2.her] soles and [npc2.toes]."));

          switch (Sex.getSexPace(Sex.getCharacterTargetedForSexAction(this))) {
            case SUB_RESISTING:
              UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
                  " [npc2.Name] [npc2.verb(let)] out [npc2.a_sob+] as [npc.name] [npc.verb(start)] grabbing and licking [npc2.her] [npc2.feet], and,"
                      + " with tears running down [npc2.her] [npc2.face], [npc2.she] desperately [npc2.verb(beg)] for [npc.herHim] to stop.",

                  " With [npc2.a_sob+], [npc2.name] [npc2.verb(try)] to pull away from [npc.name];"
                      + " tears running down [npc2.her] [npc2.face] as [npc.namePos] [npc.tongue] [npc.verb(start)] licking [npc2.her] [npc2.feet]."));
              break;
            default:
              UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
                  " [npc2.Name] [npc2.verb(let)] out [npc2.a_moan+] as [npc.name] [npc.verb(start)] worshiping [npc2.her] [npc2.feet+],"
                      + " before [npc2.eagerly] pressing them onto [npc.her] face.",

                  " With [npc2.a_moan+], [npc2.name] [npc2.eagerly] [npc2.verb(press)] [npc2.her] [npc2.feet+] into [npc.namePos] face as [npc.she] [npc.verb(begin)] worshiping them."));
              break;
          }
          break;

        case HOOFS:
          UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
              "[npc.Eagerly(bringing)] [npc2.namePos] hard hoofs up to [npc.her] face, [npc.name] carefully [npc.verb(press)] one of the to [npc.her] [npc.lips],"
                  + " before [npc.eagerly] running [npc.her] [npc.tongue] along the entire length of [npc2.her] hoof.",

              "[npc.Name] [npc.verb(begin)] kissing the sole of one of [npc2.namePos] hard hoofs,"
                  + " before [npc.eagerly] running [npc.her] [npc.tongue] along the entire length of one."));

          switch (Sex.getSexPace(Sex.getCharacterTargetedForSexAction(this))) {
            case SUB_RESISTING:
              UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
                  " [npc2.Name] [npc2.verb(let)] out [npc2.a_sob+] as [npc.name] [npc.verb(start)] using [npc2.her] [npc2.feet], and,"
                      + " with tears running down [npc2.her] [npc2.face], [npc2.she] desperately [npc2.verb(beg)] for [npc.herHim] to stop.",

                  " With [npc2.a_sob+], [npc2.name] [npc2.verb(try)] to pull away from [npc.name];"
                      + " tears running down [npc2.her] [npc2.face] as [npc.Name] kisses [npc2.her] [npc2.feet]."));
              break;
            default:
              UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
                  " [npc2.Name] [npc2.verb(let)] out [npc2.a_moan+] as [npc.name] [npc.verb(start)] worshipping [npc2.her] [npc2.feet+],"
                      + " before [npc2.eagerly] pressing them harder into [npc.her] face.",

                  " With [npc2.a_moan+], [npc2.name] [npc2.verb(start)] [npc2.eagerly] pressing [npc2.her] [npc2.feet+] into [npc.namePos] face."));
              break;
          }
          break;

        case TALONS:
          UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
              "[npc.Eagerly(curling)] [npc2.namePos] bird-like feet around [npc.her] face, [npc.name] makes sure that [npc2.her] sharp talons are clear"
                  + " before kissing and suckling on [npc2.her] soles and [npc2.toes+].",

              "[npc.Name] [npc.verb(begin)] kissing the sole of [npc2.namePos] bird-like feet,"
                  + " bringing them up to [npc.her] face as [npc.she] suckles on [npc2.her] [npc2.toes+]."));

          switch (Sex.getSexPace(Sex.getCharacterTargetedForSexAction(this))) {
            case SUB_RESISTING:
              UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
                  " [npc2.Name] [npc2.verb(let)] out [npc2.a_sob+] as [npc.name] [npc.verb(start)] using [npc2.her] [npc2.feet], and,"
                      + " with tears running down [npc2.her] [npc2.face], [npc2.she] desperately [npc2.verb(beg)] for [npc.herHim] to stop.",

                  " With [npc2.a_sob+], [npc2.name] [npc2.verb(try)] to pull away from [npc.name];"
                      + " tears running down [npc2.her] [npc2.face] as [npc.Name] kisses [npc2.her] [npc2.feet]."));
              break;
            default:
              UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
                  " [npc2.Name] [npc2.verb(let)] out [npc2.a_moan+] as [npc.name] [npc.verb(start)] worshipping [npc2.her] [npc2.feet],"
                      + " [npc2.eagerly] pressing them harder into [npc.her] face.",

                  " With [npc2.a_moan+], [npc2.name] [npc2.verb(start)] [npc2.eagerly] pressing [npc2.her] [npc2.feet+] into [npc.namePos] face."));
              break;
          }
          break;
      }

      return UtilText.nodeContentSB.toString();
    }

  };

  public static final SexAction FOOT_WORSHIP_DOUBLE_RECEIVING_DOM_GENTLE = new SexAction(
      SexActionType.ONGOING,
      ArousalIncrease.FOUR_HIGH,
      ArousalIncrease.THREE_NORMAL,
      CorruptionLevel.TWO_HORNY,
      Util.newHashMapOfValues(new Value<>(SexAreaOrifice.MOUTH, SexAreaPenetration.FOOT)),
      SexParticipantType.NORMAL,
      SexPace.DOM_GENTLE) {

    @Override
    public boolean isBaseRequirementsMet() {
      return Sex.isDoubleFootJob(Sex.getCharacterTargetedForSexAction(this));
    }

    @Override
    public String getActionTitle() {
      return "Gentle [npc2.foot] worship";
    }

    @Override
    public String getActionDescription() {
      return "Gently worship [npc2.namePos] [npc2.feet].";
    }

    @Override
    public String getDescription() {
      UtilText.nodeContentSB.setLength(0);

      UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
          "Gently kissing up and down [npc2.namePos] [npc2.feet+],"
              + " [npc.name] [npc.verb(caress)] them while [npc.moaning] and rubbing them against [npc.her] face.",

          "Softly rubbing [npc2.namePos] [npc2.feet+] with [npc.her] hands,"
              + " [npc.name] [npc.verb(start)] gently kissing each one of [npc2.her] [npc2.toes], letting out a little [npc.moan] in the process.",

          "Gently pushing [npc2.namePos] [npc2.feet+] to [npc.her] face, [npc.name] [npc.verb(let)] out a little [npc.moan] as [npc.she] [npc.verb(start)] to gently kiss each sole,"
              + " breathing in [npc2.her] [npc2.scent] as [npc.she] [npc.verb(rub)] them into [npc.her] face."));

      UtilText.nodeContentSB.append(getTargetedCharacterResponse(this));

      return UtilText.nodeContentSB.toString();
    }

  };

  public static final SexAction FOOT_WORSHIP_DOUBLE_RECEIVING_DOM_NORMAL = new SexAction(
      SexActionType.ONGOING,
      ArousalIncrease.FOUR_HIGH,
      ArousalIncrease.THREE_NORMAL,
      CorruptionLevel.TWO_HORNY,
      Util.newHashMapOfValues(new Value<>(SexAreaOrifice.MOUTH, SexAreaPenetration.FOOT)),
      SexParticipantType.NORMAL,
      SexPace.DOM_NORMAL) {

    @Override
    public boolean isBaseRequirementsMet() {
      return Sex.isDoubleFootJob(Sex.getCharacterTargetedForSexAction(this));
    }

    @Override
    public String getActionTitle() {
      return "Normal [npc2.foot] worship";
    }

    @Override
    public String getActionDescription() {
      return "Continue worshipping [npc2.namePos] [npc2.feet].";
    }

    @Override
    public String getDescription() {

      UtilText.nodeContentSB.setLength(0);

      UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
          "Eagerly grasping at [npc2.namePos] [npc2.feet+],"
              + " [npc.name] [npc.verb(start)] energetically running [npc.her] [npc.tongue] up and down [npc2.her] soles, letting out [npc.a_moan+] with every lick.",

          "Desperately grasping [npc2.namePos] [npc2.feet+],"
              + " [npc.name] [npc.verb(suckle)] on [npc2.her] [npc2.toes], letting out [npc.a_moan+] as [npc.she] [npc.verb(savor)] [npc2.her] [npc2.feet].",

          "Greedily running [npc.her] [npc.tongue] all over [npc2.namePos] [npc2.feet+], [npc.name] [npc.verb(let)] out [npc.a_moan+] as [npc.she] [npc.verb(continue)] to hold [npc2.her] [npc.feet] on [npc.her] face,"
              + " breathing in [npc2.her] [npc2.scent]."));

      UtilText.nodeContentSB.append(getTargetedCharacterResponse(this));

      return UtilText.nodeContentSB.toString();
    }

  };

  public static final SexAction FOOT_WORSHIP_DOUBLE_RECEIVING_DOM_ROUGH = new SexAction(
      SexActionType.ONGOING,
      ArousalIncrease.FOUR_HIGH,
      ArousalIncrease.THREE_NORMAL,
      CorruptionLevel.THREE_DIRTY,
      Util.newHashMapOfValues(new Value<>(SexAreaOrifice.MOUTH, SexAreaPenetration.FOOT)),
      SexParticipantType.NORMAL,
      SexPace.DOM_ROUGH) {

    @Override
    public boolean isBaseRequirementsMet() {
      return Sex.isDoubleFootJob(Sex.getCharacterTargetedForSexAction(this));
    }

    @Override
    public String getActionTitle() {
      return "Rough [npc2.foot] worship ";
    }

    @Override
    public String getActionDescription() {
      return "Roughly worship [npc2.namePos] [npc2.feet].";
    }

    @Override
    public String getDescription() {

      UtilText.nodeContentSB.setLength(0);

      UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
          "Forcefully holding [npc2.namePos] [npc2.feet+] onto [npc.her] face,"
              + " [npc.name] [npc.verb(start)] running [npc.her] [npc.tongue] all over [npc2.her] soles and [npc2.toes], letting out [npc.a_moan+] as [npc.she] [npc.verb(take)] [npc2.her] [npc2.toes] into [npc.her] mouth.",

          "Forcefully bringing [npc2.namePos] [npc2.toes+] into [npc.her] mouth,"
              + " [npc.name] [npc.verb(start)] aggressively suckling on [npc2.her] [npc.feet], letting out [npc.a_moan+] as [npc.she] [npc.verb(taste)] [npc2.her] flavor.",

          "Burying [npc.her] face into [npc2.namePos] [npc2.feet+], [npc.name] [npc.verb(let)] out [npc.a_moan+] as [npc.she] [npc.verb(start)] to nibble and bite at [npc2.her] [npc2.feet],"
              + " breathing [npc2.her] [npc2.scent] in deeply as [npc.she] [npc.verb(suckle)] each [npc2.foot]."));

      UtilText.nodeContentSB.append(getTargetedCharacterResponse(this));

      return UtilText.nodeContentSB.toString();
    }

  };

  public static final SexAction FOOT_WORSHIP_DOUBLE_RECEIVING_SUB_NORMAL = new SexAction(
      SexActionType.ONGOING,
      ArousalIncrease.FOUR_HIGH,
      ArousalIncrease.THREE_NORMAL,
      CorruptionLevel.TWO_HORNY,
      Util.newHashMapOfValues(new Value<>(SexAreaOrifice.MOUTH, SexAreaPenetration.FOOT)),
      SexParticipantType.NORMAL,
      SexPace.SUB_NORMAL) {

    @Override
    public boolean isBaseRequirementsMet() {
      return Sex.isDoubleFootJob(Sex.getCharacterTargetedForSexAction(this));
    }

    @Override
    public String getActionTitle() {
      return "Worship [npc2.feet]";
    }

    @Override
    public String getActionDescription() {
      return "Continue worshipping [npc2.namePos] [npc2.feet].";
    }

    @Override
    public String getDescription() {

      UtilText.nodeContentSB.setLength(0);

      UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
          "Holding [npc2.namePos] [npc2.feet+] onto [npc.her] face,"
              + " [npc.name] [npc.verb(start)] energetically running [npc.her] [npc.tongue] up and down [npc2.her] soles, letting out [npc.a_moan+] with every lick.",

          "Grasping at [npc2.namePos] [npc2.feet+],"
              + " [npc.name] [npc.verb(suckle)] on [npc2.her] [npc2.toes], letting out [npc.a_moan+] as [npc.she] [npc.verb(savor)] [npc2.her] [npc2.feet].",

          "Running [npc.her] [npc.tongue] all over [npc2.namePos] [npc2.feet+], [npc.name] [npc.verb(let)] out [npc.a_moan+] as [npc.she] [npc.verb(start)] to pull [npc2.her] [npc.feet] into [npc.her] face,"
              + " breathing in [npc2.her] [npc2.scent]."));

      UtilText.nodeContentSB.append(getTargetedCharacterResponse(this));

      return UtilText.nodeContentSB.toString();
    }

  };

  public static final SexAction FOOT_WORSHIP_DOUBLE_RECEIVING_SUB_EAGER = new SexAction(
      SexActionType.ONGOING,
      ArousalIncrease.FOUR_HIGH,
      ArousalIncrease.THREE_NORMAL,
      CorruptionLevel.TWO_HORNY,
      Util.newHashMapOfValues(new Value<>(SexAreaOrifice.MOUTH, SexAreaPenetration.FOOT)),
      SexParticipantType.NORMAL,
      SexPace.SUB_EAGER) {

    @Override
    public boolean isBaseRequirementsMet() {
      return Sex.isDoubleFootJob(Sex.getCharacterTargetedForSexAction(this));
    }

    @Override
    public String getActionTitle() {
      return "Eager [npc2.foot] worship";
    }

    @Override
    public String getActionDescription() {
      return "Eagerly worship [npc2.namePos] [npc2.feet].";
    }

    @Override
    public String getDescription() {

      UtilText.nodeContentSB.setLength(0);

      UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
          "Eagerly grabbing onto [npc2.namePos] [npc2.feet+] into [npc.her] face,"
              + " [npc.name] [npc.verb(start)] energetically running [npc.her] [npc.tongue] up and down [npc2.her] soles, letting out [npc.a_moan+] with every lick.",

          "Desperately grasping [npc2.namePos] [npc2.feet+],"
              + " [npc.name] [npc.verb(suckle)] on [npc2.her] [npc2.toes], letting out [npc.a_moan+] as [npc.she] [npc.verb(savor)] [npc2.her] [npc2.feet].",

          "Greedily running [npc.her] [npc.tongue] all over [npc2.namePos] [npc2.feet+], [npc.name] [npc.verb(let)] out [npc.a_moan+] as [npc.she] [npc.verb(start)] to pull [npc2.her] [npc.feet] into [npc.her] face,"
              + " breathing in [npc2.her] [npc2.scent]."));

      UtilText.nodeContentSB.append(getTargetedCharacterResponse(this));

      return UtilText.nodeContentSB.toString();
    }

  };

  public static final SexAction FOOT_WORSHIP_DOUBLE_RECEIVING_SUB_RESIST = new SexAction(
      SexActionType.ONGOING,
      ArousalIncrease.TWO_LOW,
      ArousalIncrease.THREE_NORMAL,
      CorruptionLevel.ZERO_PURE,
      Util.newHashMapOfValues(new Value<>(SexAreaOrifice.MOUTH, SexAreaPenetration.FOOT)),
      SexParticipantType.NORMAL,
      SexPace.SUB_RESISTING) {

    @Override
    public boolean isBaseRequirementsMet() {
      return Sex.isDoubleFootJob(Sex.getCharacterTargetedForSexAction(this));
    }

    @Override
    public String getActionTitle() {
      return "Resist [npc2.feet]";
    }

    @Override
    public String getActionDescription() {
      return "Try to pull [npc2.namePos] [npc2.feet+] away from your face.";
    }

    @Override
    public String getDescription() {

      UtilText.nodeContentSB.setLength(0);

      switch (Sex.getSexPace(Sex.getCharacterTargetedForSexAction(this))) {
        case DOM_GENTLE:
          UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
              "Desperately trying, and failing, to pull [npc.her] mouth away from [npc2.namePos] [npc2.feet], [npc.name] [npc.verb(let)] out [npc.a_sob+] as, ignoring [npc.her] protests,"
                  + " [npc2.she] slowly, yet firmly, [npc2.verb(push)] [npc2.her] [npc2.feet] against [npc.her] face.",

              "[npc.A_sob+] bursts out from between [npc.namePos] [npc.lips] as [npc.she] weakly tries to push [npc2.namePos] [npc2.feet] away, but, totally ignoring [npc.her] protests,"
                  + " [npc2.name] firmly [npc2.verb(hold)] [npc.herHim] in place,"
                  + " gently pushing [npc2.her] [npc2.feet] into [npc.her] face.",

              "[npc.Sobbing] in distress, [npc.name] weakly [npc.verb(struggle)] against [npc2.name] as [npc.she] [npc.verb(plead)] for [npc2.herHim] to get [npc2.her] [npc2.feet] off of [npc.her]."
                  + " [npc2.Moaning] in delight, [npc2.name] totally [npc2.verb(ignore)] [npc.her] protests, slowly grinding [npc2.her] [npc2.feet] into [npc.her] face."));
          break;
        case DOM_ROUGH:
          UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
              "Desperately trying, and failing, to pull [npc.her] mouth away from [npc2.namePos] [npc2.feet], [npc.name] [npc.verb(let)] out [npc.a_sob+] as, ignoring [npc.her] protests,"
                  + " [npc2.she] violently [npc2.verb(grind)] [npc2.her] [npc2.feet] against [npc.her] face.",

              "[npc.A_sob+] bursts out from between [npc.namePos] [npc.lips] as [npc.she] weakly tries to push [npc2.namePos] [npc2.feet] away, but, totally ignoring [npc.her] protests,"
                  + " [npc2.she] dominantly [npc2.verb(hold)] [npc.herHim] in place,"
                  + " violently pressing [npc2.her] [npc2.feet] into [npc.her] face.",

              "[npc.Sobbing] in distress, [npc.name] weakly [npc.verb(struggle)] against [npc2.name] as [npc.she] [npc.verb(plead)] for [npc2.name] to get [npc2.her] [npc2.feet] off of [npc.her]."
                  + " [npc2.Moaning] in delight, [npc2.name] totally [npc2.verb(ignore)] [npc.her] protests, roughly grinding [npc2.her] [npc2.feet] into [npc.her] face."));
          break;
        default: // DOM_NORMAL and in case anything goes wrong:
          UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
              "Desperately trying, and failing, to pull [npc.her] mouth away from [npc2.namePos] [npc2.feet], [npc.name] [npc.verb(let)] out [npc.a_sob+] as, ignoring [npc.her] protests,"
                  + " [npc2.she] slowly, yet firmly, [npc2.verb(push)] [npc2.her] [npc2.feet] against [npc.her] face.",

              "[npc.A_sob+] bursts out from between [npc.namePos] [npc.lips] as [npc.she] weakly tries to push [npc2.namePos] [npc2.feet] away, but, totally ignoring [npc.her] protests,"
                  + " [npc2.name] firmly [npc2.verb(hold)] [npc.herHim] in place,"
                  + " gently pushing [npc2.her] [npc2.feet] into [npc.her] face.",

              "[npc.Sobbing] in distress, [npc.name] weakly [npc.verb(struggle)] against [npc2.name] as [npc.she] [npc.verb(plead)] for [npc2.herHim] to get [npc2.her] [npc2.feet] off of [npc.her]."
                  + " [npc2.Moaning] in delight, [npc2.name] totally [npc2.verb(ignore)] [npc.her] protests, slowly grinding [npc2.her] [npc2.feet] into [npc.her] face."));
          break;
      }

      return UtilText.nodeContentSB.toString();
    }

  };

  public static final SexAction FOOT_WORSHIP_DOUBLE_RECEIVING_STOP = new SexAction(
      SexActionType.STOP_ONGOING,
      ArousalIncrease.ONE_MINIMUM,
      ArousalIncrease.ONE_MINIMUM,
      CorruptionLevel.ZERO_PURE,
      Util.newHashMapOfValues(new Value<>(SexAreaOrifice.MOUTH, SexAreaPenetration.FOOT)),
      SexParticipantType.NORMAL) {

    @Override
    public boolean isBaseRequirementsMet() {
      return Sex.isDoubleFootJob(Sex.getCharacterTargetedForSexAction(this));
    }

    @Override
    public String getActionTitle() {
      return "Stop [npc2.foot] worship";
    }

    @Override
    public String getActionDescription() {
      return "Pull [npc2.namePos] [npc2.feet] away from your face.";
    }

    @Override
    public String getDescription() {

      UtilText.nodeContentSB.setLength(0);

      switch (Sex.getSexPace(Sex.getCharacterPerformingAction())) {
        case DOM_ROUGH:
          UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
              "Roughly grabbing [npc2.namePos] [npc2.feet+] from [npc.her] face,"
                  + " [npc.name] gives [npc2.her] [npc2.toes+] one last nibble before pulling [npc2.her] [npc2.feet] away.",

              "Giving [npc2.namePos] [npc2.feet+] one last bite, [npc.name] then [npc.verb(move)] [npc2.her] [npc2.feet] back, stopping the worship for now."));
          break;
        default:
          UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
              "Grabbing onto [npc2.namePos] [npc2.feet+],"
                  + " [npc.name] gives [npc2.her] [npc2.toes+] one last kiss before pulling [npc2.her] [npc2.feet] away.",

              "Giving [npc2.namePos] [npc2.feet+] one last lick, [npc.name] then [npc.verb(pull)] [npc2.her] [npc2.feet] back, stopping the worship for now."));
          break;
      }

      switch (Sex.getSexPace(Sex.getCharacterTargetedForSexAction(this))) {
        case SUB_RESISTING:
          UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
              " [npc2.Name] can't help but let out [npc2.sob+] as [npc.name] moves away,"
                  + " and [npc2.she] [npc2.verb(continue)] crying and protesting as [npc2.she] [npc2.verb(plead)] for [npc.herHim] to leave [npc.herHim] alone.",

              " With [npc2.a_sob+], [npc2.name] [npc2.verb(continue)] to struggle against [npc.name], tears streaming down [npc2.her] [npc2.face] as [npc2.she] [npc2.verb(beg)] to be left alone."));
          break;
        default:
          UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
              " [npc2.Name] [npc2.verb(let)] out [npc2.a_moan+] as [npc.name] [npc.verb(pull)] [npc2.her] [npc2.feet+] back, eager to give them more attention.",

              " [npc2.A_moan+] escapes from between [npc2.namePos] [npc2.lips+], betraying [npc2.her] lust for [npc.namePos] [npc.tongue+]."));
          break;
      }

      return UtilText.nodeContentSB.toString();
    }
  };

  public static final SexAction FOOT_WORSHIP_DOUBLE_GIVING_START = new SexAction(
      SexActionType.START_ONGOING,
      ArousalIncrease.THREE_NORMAL,
      ArousalIncrease.FOUR_HIGH,
      CorruptionLevel.TWO_HORNY,
      Util.newHashMapOfValues(new Value<>(SexAreaPenetration.FOOT, SexAreaOrifice.MOUTH)),
      SexParticipantType.NORMAL) {

    @Override
    public boolean isBaseRequirementsMet() {
      return Sex.isDoubleFootJob(Sex.getCharacterPerformingAction());
    }

    @Override
    public String getActionTitle() {
      return "Give [npc.toes]";
    }

    @Override
    public String getActionDescription() {
      return "Have [npc2.name] suck your [npc.toes].";
    }

    @Override
    public String getDescription() {

      UtilText.nodeContentSB.setLength(0);

      UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
          "[npc.name] [npc.verb(begin)] slowly walking [npc.her] [npc.feet+] up [npc2.namePos] body until they arrive near [npc2.her] [npc2.face]. [npc.speech(How about you give these some love?)], [npc.she] [npc.verb(say)] mischievously, splaying [npc.her] [npc.toes+] out in front of [npc2.her] [npc2.face]. ",
          "Playfully swinging [npc.her] [npc.legs] over,  [npc.name] [npc.verb(rest)] [npc.her] [npc.feet+] on [npc2.namePos] [npc2.face] and [npc.verb(begin)] rubbing them up and down. [npc.speech(My feet ache, could you help with that?)] ",
          "[npc.speech(You'll like this...)], [npc.namePos] [npc.moansVerb] as [npc.she] [npc.verb(take)] one of [npc.her] [npc.feet+] puts [npc.her] [npc.toes] on [npc2.namePos] mouth. Slowly, [npc.she] [npc.verb(begin)] circling [npc.her] [npc.toes] around [npc2.her] [npc2.lips] before whispering, [npc.speech(Open wide…)] "));

      switch (Sex.getSexPace(Sex.getCharacterTargetedForSexAction(this))) {
        case SUB_EAGER:
          UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
              "[npc2.A_moan] escapes [npc2.namePos] [npc2.lips] as [npc2.she] immediately [npc2.verb(grab)] hold of [npc.namePos] [npc.foot], burying [npc2.her] [npc2.face] in it. Inhaling [npc.her] [npc.scent], [npc2.name] hungrily [npc2.verb(open)] [npc2.her] mouth and [npc2.verb(begin)] sucking on [npc.her] [npc.toes].",
              "[npc.name] [npc.do] not need to wait for a response as [npc2.name] immediately [npc2.verb(begin)] licking up and down [npc.her] [npc.foot], causing [npc.her] to gasp. [npc2.She] eagerly [npc2.verb(make)] [npc2.her] way up to [npc.namePos] [npc.toes] before placing them in [npc2.her] mouth and sucking."));
          break;
        case SUB_RESISTING:
          UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
              " [npc2.Name] [npc2.verb(let)] out [npc2.a_sob+] as [npc.name] [npc.verb(force)] [npc.her] [npc.feet] into [npc2.her] face,"
                  + " and, struggling against [npc.herHim], [npc2.she] desperately tries to pull away.",

              " With [npc2.a_sob+], [npc2.name] struggles against [npc.name] as [npc.she] [npc.verb(force)] [npc.her] [npc.feet] into [npc2.her] face."));
          break;
        default:
          UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
              "Giving [npc.name] a mischievous smile, [npc2.name] [npc2.verb(wrap)] [npc2.her] [npc2.fingers+] around it and [npc2.verb(begin)] gingerly kissing up [npc.her] [npc.foot]. Arriving at [npc.her] [npc.toes], [npc2.she] [npc2.verb(give)] them each a kiss and [npc2.verb(begin)] sucking on them.",
              "Smiling, [npc2.name] [npc2.verb(press)] [npc2.her] [npc2.fingers+] into the sole of [npc.her] [npc.foot], kneading [npc.her] [npc.skin+]. [npc.name] [npc.verb(begin)] to moan seductively, and, giving [npc.her] a naughty look, [npc2.name] [npc2.verb(place)] [npc.her] [npc.toes] in [npc2.her] mouth and begin sucking on them."));
          break;
      }
      return UtilText.nodeContentSB.toString();
    }

  };

  public static final SexAction FOOT_WORSHIP_DOUBLE_GIVING_DOM_GENTLE = new SexAction(
      SexActionType.ONGOING,
      ArousalIncrease.THREE_NORMAL,
      ArousalIncrease.FOUR_HIGH,
      CorruptionLevel.TWO_HORNY,
      Util.newHashMapOfValues(new Value<>(SexAreaPenetration.FOOT, SexAreaOrifice.MOUTH)),
      SexParticipantType.NORMAL,
      SexPace.DOM_GENTLE) {

    @Override
    public boolean isBaseRequirementsMet() {
      return Sex.isDoubleFootJob(Sex.getCharacterPerformingAction());
    }

    @Override
    public String getActionTitle() {
      return "Rub [npc.feet]";
    }

    @Override
    public String getActionDescription() {
      return "Rub your [npc.feet] on [npc2.namePos] face.";
    }

    @Override
    public String getDescription() {
      UtilText.nodeContentSB.setLength(0);

      UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
          "Pulling [npc.her] [npc.toes+] from [npc2.namePos] mouth, [npc.name] [npc.verb(place)] one [npc.foot] on [npc2.her] cheek and the other on [npc2.her] [npc2.face], drumming [npc.her] [npc.toes] on [npc2.her] [npc2.skin+]. ",
          "With a soft [npc.moan], [npc.name] [npc.verb(pull)] [npc.her] [npc.toes+] from [npc2.namePos] [npc2.mouth] and [npc.verb(rub)] [npc.her] [npc.feet] over [npc2.her] [npc2.face]. [npc.speech(Such a good [npc.foot][npc2.girl] you are…)] ",
          "[npc.name] [npc.verb(pull)] [npc.her] [npc.toes+] from [npc2.her] mouth and [npc.verb(place)] the base one [npc.foot] on [npc2.her] chin, giving [npc2.her] nose a squeeze with [npc.her] [npc.toes] before placing it over [npc2.her] face. "
      ));
      UtilText.nodeContentSB.append(getTargetedCharacterReceivingResponse(this, SexPace.DOM_GENTLE));

      return UtilText.nodeContentSB.toString();
    }

  };

  public static final SexAction FOOT_WORSHIP_DOUBLE_GIVING_DOM_NORMAL = new SexAction(
      SexActionType.ONGOING,
      ArousalIncrease.THREE_NORMAL,
      ArousalIncrease.FOUR_HIGH,
      CorruptionLevel.TWO_HORNY,
      Util.newHashMapOfValues(new Value<>(SexAreaPenetration.FOOT, SexAreaOrifice.MOUTH)),
      SexParticipantType.NORMAL,
      SexPace.DOM_NORMAL) {

    @Override
    public boolean isBaseRequirementsMet() {
      return Sex.isDoubleFootJob(Sex.getCharacterPerformingAction());
    }

    @Override
    public String getActionTitle() {
      return "Enjoy [npc.toes] sucking";
    }

    @Override
    public String getActionDescription() {
      return "Enjoy getting your [npc.toes] sucked.";
    }

    @Override
    public String getDescription() {
      UtilText.nodeContentSB.setLength(0);

      UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
          "Enjoying having [npc.her] [npc.toes+] sucked on,[npc.name] [npc.verb(rub)] the other [npc.foot] along the side of[npc2.namePos][npc2.face] affectionately.[npc.speech(That's right, suck them nice and good...)] ",
          "[npc.name] [npc.verb(let)] out [npc.a_moan] as [npc.she] [npc.verb(wiggle)] [npc.her] [npc.toes+] in [npc2.namePos] mouth, enjoying the sensation. [npc.speech(Fuck, that feels good, keep going...)] ",
          "[npc.speech(You like my [npc.toes+]?)], [npc.name] [npc.moansVerb], as [npc.she] slowly [npc.verb(drag)] [npc.her] [npc.toes] along [npc2.namePos] [npc2.tongue] before shoving them right back in [npc2.her] mouth. "));

      UtilText.nodeContentSB.append(getTargetedCharacterReceivingResponse(this, SexPace.DOM_NORMAL));

      return UtilText.nodeContentSB.toString();
    }

  };

  public static final SexAction FOOT_WORSHIP_DOUBLE_GIVING_DOM_ROUGH = new SexAction(
      SexActionType.ONGOING,
      ArousalIncrease.THREE_NORMAL,
      ArousalIncrease.FOUR_HIGH,
      CorruptionLevel.THREE_DIRTY,
      Util.newHashMapOfValues(new Value<>(SexAreaPenetration.FOOT, SexAreaOrifice.MOUTH)),
      SexParticipantType.NORMAL,
      SexPace.DOM_ROUGH) {

    @Override
    public boolean isBaseRequirementsMet() {
      return Sex.isDoubleFootJob(Sex.getCharacterPerformingAction());
    }

    @Override
    public String getActionTitle() {
      return "Choke with [npc.toes]";
    }

    @Override
    public String getActionDescription() {
      return "Shove your [npc.toes] down [npc2.namePos] throat.";
    }

    @Override
    public String getDescription() {
      UtilText.nodeContentSB.setLength(0); //TODO

      UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
          "[npc.name] roughly [npc.verb(pull)] [npc.her] [npc.foot] away from [npc2.name] and [npc.verb(hover)] [npc.her] [npc.toes+] in front of [npc2.her] [npc2.face]. [npc.speech(Open wide, little [npc.foot][npc2.girl]...)], [npc.she] [npc.moansVerb], and [npc.verb(force)] [npc.her] [npc.foot] deep into [npc2.her] throat. ",
          "Placing one [npc.foot] behind [npc2.namePos] head and bracing it, [npc.name] roughly [npc.verb(force)] [npc.her] [npc.toes+] deeper into [npc2.her] mouth. [npc.speech(That’s right, choke on my foot.)] ",
          "Pulling [npc.her] [npc.foot] away and giving [npc2.namePos] [npc2.face] a quick slap with it, [npc.name] [npc.verb(move)] it back to [npc2.her] mouth and [npc.verb(shove)] [npc.her] [npc.foot+] inside as deep as [npc.she] can. "));

      UtilText.nodeContentSB.append(getTargetedCharacterReceivingResponse(this, SexPace.DOM_ROUGH));

      return UtilText.nodeContentSB.toString();
    }

  };

  public static final SexAction FOOT_WORSHIP_DOUBLE_GIVING_SUB_NORMAL = new SexAction(
      SexActionType.ONGOING,
      ArousalIncrease.THREE_NORMAL,
      ArousalIncrease.FOUR_HIGH,
      CorruptionLevel.TWO_HORNY,
      Util.newHashMapOfValues(new Value<>(SexAreaPenetration.FOOT, SexAreaOrifice.MOUTH)),
      SexParticipantType.NORMAL,
      SexPace.SUB_NORMAL) {

    @Override
    public boolean isBaseRequirementsMet() {
      return Sex.isDoubleFootJob(Sex.getCharacterPerformingAction());
    }

    @Override
    public String getActionTitle() {
      return "Press [npc.feet]";
    }

    @Override
    public String getActionDescription() {
      return "Press your [npc.feet+] down against [npc2.namePos] face.";
    }

    @Override
    public String getDescription() {
      UtilText.nodeContentSB.setLength(0);

      UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
          "Pushing [npc.her] [npc.feet] into [npc2.namePos] face, [npc.name] [npc.verb(let)] out [npc.a_moan+].",

          "With [npc.a_moan+], [npc.name] happily [npc.verb(start)] pushing [npc.her] [npc.feet+] into [npc2.namePos] face.",

          "Pressing [npc.her] [npc.feet+] into [npc2.namePos] face, [npc.name] [npc.verb(let)] out [npc.a_moan+]."));

      UtilText.nodeContentSB.append(getTargetedCharacterReceivingResponse(this, SexPace.SUB_NORMAL));

      return UtilText.nodeContentSB.toString();
    }

  };

  public static final SexAction FOOT_WORSHIP_DOUBLE_GIVING_SUB_EAGER = new SexAction(
      SexActionType.ONGOING,
      ArousalIncrease.THREE_NORMAL,
      ArousalIncrease.FOUR_HIGH,
      CorruptionLevel.TWO_HORNY,
      Util.newHashMapOfValues(new Value<>(SexAreaPenetration.FOOT, SexAreaOrifice.MOUTH)),
      SexParticipantType.NORMAL,
      SexPace.SUB_EAGER) {

    @Override
    public boolean isBaseRequirementsMet() {
      return Sex.isDoubleFootJob(Sex.getCharacterPerformingAction());
    }

    @Override
    public String getActionTitle() {
      return "Eagerly press [npc.feet]";
    }

    @Override
    public String getActionDescription() {
      return "Eagerly press your [npc.feet] against [npc2.namePos] face.";
    }

    @Override
    public String getDescription() {
      UtilText.nodeContentSB.setLength(0);

      UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
          "Eagerly pushing [npc.her] [npc.feet] into [npc2.namePos] face, [npc.name] [npc.verb(let)] out [npc.a_moan+].",

          "With [npc.a_moan+], [npc.name] happily [npc.verb(start)] pushing [npc.her] [npc.feet+] into [npc2.namePos] face.",

          "Eagerly pressing [npc.her] [npc.feet+] into [npc2.namePos] face, [npc.name] [npc.verb(let)] out [npc.a_moan+]."));

      UtilText.nodeContentSB.append(getTargetedCharacterReceivingResponse(this, SexPace.SUB_EAGER));

      return UtilText.nodeContentSB.toString();
    }

  };

  public static final SexAction FOOT_WORSHIP_DOUBLE_GIVING_SUB_RESIST = new SexAction(
      SexActionType.ONGOING,
      ArousalIncrease.ZERO_NONE,
      ArousalIncrease.FOUR_HIGH,
      CorruptionLevel.ZERO_PURE,
      Util.newHashMapOfValues(new Value<>(SexAreaPenetration.FOOT, SexAreaOrifice.MOUTH)),
      SexParticipantType.NORMAL,
      SexPace.SUB_RESISTING) {

    @Override
    public boolean isBaseRequirementsMet() {
      return Sex.isDoubleFootJob(Sex.getCharacterPerformingAction());
    }

    @Override
    public String getActionTitle() {
      return "Resist [npc.foot] worship";
    }

    @Override
    public String getActionDescription() {
      return "Try and pull your [npc.feet+] away from [npc2.namePos] grasp.";
    }

    @Override
    public String getDescription() {

      UtilText.nodeContentSB.setLength(0);

      switch (Sex.getSexPace(Sex.getCharacterTargetedForSexAction(this))) {
        case DOM_GENTLE:
          UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
              "[npc.Name] [npc.verb(feel)] tears start to well up in [npc.her] [npc.eyes], and, not being able to hold back any longer, [npc.she] suddenly [npc.verb(let)] out [npc.a_sob+],"
                  + " weakly trying to pull [npc.her] [npc.feet] away from [npc2.namePos] [npc2.lips].",

              "[npc.A_sob+] bursts out from [npc.namePos] mouth as [npc.she] frantically [npc.verb(try)] to pull [npc.her] [npc.feet] away from [npc2.namePos] face,"
                  + " struggling in desperation as [npc2.she] [npc2.verb(continue)] kisses [npc.her] [npc.feet].",

              "Trying desperately to pull [npc.her] [npc.feet] away from [npc2.name], [npc.name] [npc.sobVerb] in distress as [npc2.her] [npc2.lips+] [npc2.verb(continue)] gently kissing [npc.her] [npc.feet]."));
          break;
        case DOM_NORMAL:
          UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
              "[npc.Name] [npc.verb(feel)] tears start to well up in [npc.her] [npc.eyes], and, not being able to hold back any longer, [npc.she] suddenly [npc.verb(let)] out [npc.a_sob+],"
                  + " weakly trying to pull [npc.her] [npc.feet] away from [npc2.namePos] [npc2.tongue].",

              "[npc.A_sob+] bursts out from [npc.namePos] mouth as [npc.she] frantically [npc.verb(try)] to pull [npc.her] [npc.foot] away from [npc2.namePos] face,"
                  + " struggling in desperation as [npc2.she] [npc2.verb(continue)] licking [npc.her] [npc.feet].",

              "Trying desperately to pull [npc.her] [npc.feet] away from [npc2.name], [npc.name] [npc.sobVerb] in distress as [npc2.her] [npc2.tongue+] [npc2.verb(continue)] slobbering on [npc.her] [npc.feet]."));
          break;
        case DOM_ROUGH:
          UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
              "[npc.Name] [npc.verb(feel)] tears start to well up in [npc.her] [npc.eyes], and, not being able to hold back any longer, [npc.she] suddenly [npc.verb(let)] out [npc.a_sob+],"
                  + " weakly trying to pull [npc.her] [npc.feet] away from [npc2.namePos] hungry mouth.",

              "[npc.A_sob+] bursts out from [npc.namePos] mouth as [npc.she] frantically [npc.verb(try)] to pull [npc.her] [npc.foot] away from [npc2.namePos] face,"
                  + " struggling in desperation as [npc2.she] [npc2.verb(continue)] sucking and biting [npc.her] [npc.feet].",

              "Trying desperately to pull [npc.her] [npc.feet] away from [npc2.name], [npc.name] [npc.sobVerb] in distress as [npc2.her] mouth [npc2.verb(continue)] sucking and biting [npc.her] [npc.feet]."));
          break;
        default:
          break;
      }

      return UtilText.nodeContentSB.toString();
    }

  };

  public static final SexAction FOOT_WORSHIP_DOUBLE_GIVING_STOP = new SexAction(
      SexActionType.STOP_ONGOING,
      ArousalIncrease.ONE_MINIMUM,
      ArousalIncrease.ONE_MINIMUM,
      CorruptionLevel.ZERO_PURE,
      Util.newHashMapOfValues(new Value<>(SexAreaPenetration.FOOT, SexAreaOrifice.MOUTH)),
      SexParticipantType.NORMAL) {

    @Override
    public boolean isBaseRequirementsMet() {
      return Sex.isDoubleFootJob(Sex.getCharacterPerformingAction());
    }

    @Override
    public String getActionTitle() {
      return "Stop [npc.toes] sucking";
    }

    @Override
    public String getActionDescription() {
      return "Take your [npc.feet] away from [npc2.namePos] mouth.";
    }

    @Override
    public String getDescription() {

      UtilText.nodeContentSB.setLength(0);

      switch (Sex.getSexPace(Sex.getCharacterPerformingAction())) {
        case DOM_ROUGH:
          UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
              "*DOM_ROUGH*"));
//              "Taking [npc.her] [npc.feet] away from [npc2.namePos] face, [npc.name] [npc.verb(let)] out a menacing growl as [npc.she] [npc.verb(command)] [npc2.herHim] to leave [npc.her] [npc.feet] alone.",
//
//              "[npc2.Name] [npc2.verb(bury)] into [npc.namePos] [npc.feet+] one last time, inhaling [npc.her] [npc.scent] before [npc.name] [npc.verb(take)] [npc.her] [npc.feet] away from [npc2.her] [npc2.lips]."));
          break;
        default:
          UtilText.nodeContentSB.append(Sex.getSexPace(Sex.getCharacterPerformingAction()).getName() + " " + Sex.getSexPace(Sex.getCharacterPerformingAction()).isDom());
//              "Taking [npc.her] [npc.feet] away from [npc2.namePos] face, [npc.name] [npc.verb(let)] out [npc.a_moan+] as [npc.she] [npc.verb(tell)] [npc2.herHim] to leave [npc.her] [npc.feet] alone.",
//
//              "[npc2.Name] [npc2.verb(lean)] into [npc.namePos] [npc.feet+], inhaling [npc.her] [npc.scent] before [npc.name] [npc.verb(take)] [npc.her] [npc.feet] away from [npc2.her] [npc2.lips]."));
          break;
      }

      switch (Sex.getSexPace(Sex.getCharacterTargetedForSexAction(this))) {
        case SUB_RESISTING:
          UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
              " [npc2.Name] [npc2.verb(let)] out a relieved sigh, which soon turns into [npc2.a_sob+] as [npc2.she] realises that [npc.name] [npc.has]n't finished with [npc2.herHim] just yet.",

              " With [npc2.a_sob+], [npc2.name] [npc2.verb(continue)] to protest and struggle against [npc.name] as [npc.she] [npc.verb(hold)] [npc2.herHim] firmly in place."));
          break;
        default:
          UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
              " [npc2.A_moan+] escapes from against [npc2.namePos] [npc2.lips+], betraying [npc2.her] desire to continue enjoying [npc.her] [npc.feet]."));
          break;
      }

      return UtilText.nodeContentSB.toString();

    }
  };

  private static String getTargetedCharacterResponse(SexAction action) {
    switch (Sex.getSexPace(Sex.getCharacterTargetedForSexAction(action))) {
      case SUB_EAGER:
        UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(" *SUB_EAGER*"));
        break;
      case DOM_NORMAL:
        UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(" *DOM_NORMAL*"));
//            " [npc2.Name] [npc2.verb(start)] eagerly pressing [npc2.her] [npc2.feet+] into [npc.namePos] face in response,"
//                + " letting out [npc2.a_moan+] as [npc.she] [npc.verb(worship)] [npc2.herHim] [npc2.feet].",
//
//            " [npc2.A_moan+] bursts out from between [npc2.namePos] [npc2.lips+] as [npc2.she] eagerly [npc2.verb(press)] [npc2.her] [npc2.feet+] into [npc.namePos] face.",
//
//            " [npc2.Moaning] in delight, [npc2.name] eagerly [npc2.verb(press)] [npc2.her] [npc2.feet+] into [npc.namePos] face as [npc.she] [npc.verb(worship)] [npc2.herHim] [npc2.feet]."));
        break;
      case SUB_RESISTING:
        UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(" *SUB_RESISTING*"));
//            " Desperately trying, and failing, to pull [npc2.her] [npc2.feet] away from [npc.namePos] face,"
//                + " [npc2.name] [npc2.verb(let)] out [npc2.a_sob+], tears streaming down [npc2.her] [npc2.face] as [npc2.she] weakly [npc2.verb(beg)] for [npc.name] to stop using [npc2.her] [npc2.feet].",
//
//            " [npc2.A_sob+] bursts out from between [npc2.namePos] [npc2.lips] as [npc2.she] weakly [npc2.verb(try)] to push [npc.name] away,"
//                + " tears streaming down [npc2.her] [npc2.face] as [npc2.she] [npc2.verb(plead)] for [npc.herHim] to let go of [npc2.her] [npc2.feet].",
//
//            " [npc2.Sobbing] in distress, and with tears running down [npc2.her] [npc2.face],"
//                + " [npc2.name] weakly [npc2.verb(struggle)] against [npc.name], pleading and crying for [npc.herHim] to get away from [npc2.her] [npc2.feet]."));
        break;
      case SUB_NORMAL:
        UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(" *SUB_NORMAL*"));
//            " [npc2.Name] [npc2.verb(start)] pressing [npc2.her] [npc2.feet+] into [npc.namePos] face in response,"
//                + " letting out [npc2.a_moan+] as [npc.name] [npc.verb(lick)] [npc2.herHim] [npc2.feet].",
//
//            " [npc2.A_moan+] bursts out from between [npc2.namePos] [npc2.lips+] as [npc2.she] [npc2.verb(push)] [npc2.her] [npc2.feet+] into [npc.namePos] face.",
//
//            " [npc2.Moaning] in delight, [npc2.name] [npc2.verb(push)] [npc2.her] [npc2.feet+] into [npc.namePos] face as [npc.she] [npc.verb(lick)] them."));
        break;
      case DOM_GENTLE:
        UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(" *DOM_GENTLE*"));
//            " [npc2.Name] [npc2.verb(start)] pushing [npc2.her] [npc2.feet+] into [npc.namePos] face in response,"
//                + " letting out [npc2.a_moan+] as [npc.name] [npc.verb(kiss)] them.",
//
//            " [npc2.A_moan+] bursts out from between [npc2.namePos] [npc2.lips+] as [npc2.she] gently [npc2.verb(rub)] [npc2.her] [npc2.feet+] into [npc.namePos] face.",
//
//            " [npc2.Moaning] in delight, [npc2.name] softly [npc2.verb(press)] [npc2.her] [npc2.feet+] into [npc.namePos] face as [npc.she] [npc.verb(kiss)] them."));
        break;
      case DOM_ROUGH:
        switch (Sex.getCharacterPerformingAction().getLegType().getFootType()) {
          case HUMANOID:
          case PAWS:
            UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(" *DOM_ROUGH*"));
//                " [npc2.Name] [npc2.verb(start)] grinding [npc2.her] [npc2.feet+] into [npc.namePos] face in response,"
//                    + " letting out [npc2.a_moan+] as [npc2.she] [npc2.verb(force)] [npc2.her] [npc2.foot] into [npc.her] mouth.",
//
//                " [npc2.A_moan+] bursts out from between [npc2.namePos] [npc2.lips+] as [npc2.she] forcefully [npc2.verb(grind)] [npc2.her] [npc2.feet+] into [npc.namePos] face.",
//
//                " [npc2.Moaning] in delight, [npc2.name] violently [npc2.verb(grind)] [npc2.her] [npc2.feet+] into [npc.namePos] face as [npc2.she] [npc2.verb(force)] [npc2.her] [npc.foot] into [npc.her] mouth."));
            break;
          case HOOFS:
            UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(" *DOM_ROUGH*"));
//                " [npc2.Name] [npc2.verb(start)] grinding [npc2.her] [npc2.feet+] into [npc.namePos] face in response,"
//                    + " not caring about the fact that using [npc2.her] hard hoofs in such a violent manner is extremely uncomfortable for [npc.herHim].",
//
//                " [npc2.A_moan+] bursts out from between [npc2.namePos] [npc2.lips+] as [npc2.she] forcefully [npc2.verb(grind)] [npc2.her] [npc2.feet+] into [npc.namePos] face,"
//                    + " not caring in the least about how uncomfortable this is for [npc.name] .",
//
//                " [npc2.Moaning] in delight, [npc2.name] violently [npc2.verb(grind)] [npc2.her] [npc2.feet+] into [npc.namePos] face,"
//                    + " laughing derisively at [npc.herHim] as [npc2.she] [npc2.she] [npc2.verb(force)] [npc2.her] [npc.foot] into [npc.her] mouth."));
            break;
          case TALONS:
            UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(" *DOM_ROUGH*"));
//                " [npc2.Name] [npc2.verb(start)] grinding [npc2.her] [npc2.feet+] into [npc.namePos] face in response,"
//                    + " not caring about the fact that [npc2.her] sharp talons keep on coming dangerously close to cutting [npc.herHim].",
//
//                " [npc2.A_moan+] bursts out from between [npc2.namePos] [npc2.lips+] as [npc2.she] forcefully [npc2.verb(grind)] [npc2.her] [npc2.feet+] into [npc.namePos] face,"
//                    + " not caring in the least about how close [npc2.her] sharp talons come to cutting [npc.herHim].",
//
//                " [npc2.Moaning] in delight, [npc2.name] violently [npc2.verb(grind)] [npc2.her] [npc2.feet+] into [npc.namePos] face,"
//                    + " laughing derisively at [npc.herHim] as [npc2.she] [npc2.verb(draw)] dangerously close to cutting [npc.herHim] with [npc2.her] sharp talons."));
            break;
        }
        break;
    }
    return "";
  }

  private static String getTargetedCharacterReceivingResponse(SexAction action, SexPace givingPace) {
    switch (Sex.getSexPace(Sex.getCharacterTargetedForSexAction(action))) {
      case SUB_EAGER:
        switch (givingPace) {
          case DOM_GENTLE:
            UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
                "Letting out [npc2.a_moan], [npc2.name] greedily [npc2.verb(press)] [npc.namePos] [npc.feet] into [npc2.her] [npc2.face], breathing in [npc.her] [npc.scent] before hungrily putting [npc.her] [npc.toes] back in [npc2.her] mouth.",
                "[npc2.Moaning] loudly, [npc2.name] [npc2.verb(grab)] hold of one of [npc.her] [npc.feet] and [npc2.verb(begin)] running [npc2.her] [npc2.tongue] over every inch of [npc.namePos] sole, tasting [npc.her] [npc.skin+], before shoving [npc.her] [npc.toes] back in [npc2.her] mouth."
            ));
            break;
          case DOM_ROUGH:
            UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
                "Grasping at [npc.namePos] [npc.legs], [npc2.namePos] [npc2.eyes] roll back into [npc2.her] head as [npc2.she] [npc2.verb(force)] as much of [npc.namePos] [npc.foot] into [npc2.her] mouth as [npc2.she] can. Gagging, [npc2.she] [npc2.verb(pull)] the [npc.foot] out to catch [npc2.her] breath, right before hungrily shoving it back in [npc2.her] mouth.",
                "[npc2.name] [npc2.verb(let)] out [npc2.a_moan] as [npc2.she] hungrily [npc2.verb(deepthroat)] [npc.namePos] [npc.foot], holding it in as long as possible. [npc2.She] [npc2.verb(gaze)] deep into [npc.her] [npc.eyes] until [npc.she] can hold it no longer, backing off and returning to sucking on [npc.her] [npc.toes+]."
            ));
            break;
          default:
            UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
                "With [npc2.a_moan], [npc2.name] eagerly [npc2.verb(swirl)] [npc2.her] [npc2.tongue] over every one of [npc.namePos] [npc.toes], running it in between each one as [npc2.she] hungrily [npc2.verb(hold)] [npc.her] [npc.foot] in [npc2.her] mouth.",
                "[npc2.Moaning] in response, [npc2.name] hungrily [npc2.verb(savor)] each of [npc.namePos] [npc.toes], running  [npc2.her] [npc2.tongue]over each of them. [npc2.She] then [npc2.verb(remove)] the [npc.foot] from [npc2.her] mouth and [npc2.verb(begin)] sucking the other one, eager to have [npc.namePos] [npc.toes] in [npc2.her] mouth again."
            ));
        }
        break;
      case SUB_NORMAL:
        switch (givingPace) {
          case DOM_GENTLE:
            UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
                "[npc2.A_moan] escapes [npc2.namePos] [npc2.lips] as [npc2.she] [npc2.verb(plant)] kisses on [npc.namePos] [npc.foot], starting at the heel and working [npc2.her] way up, finally taking [npc.namePos] [npc.toes] back in [npc2.her] mouth.",
                "With [npc2.a_moan], [npc2.name] [npc2.verb(give)] [npc.namePos] [npc.foot] a long, slow lick from the heel to [npc.her] [npc.toes], before placing [npc.her [npc.toes] back into [npc2.her] mouth."
            ));
            break;
          case DOM_ROUGH:
            UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
                "[npc2.name] [npc2.was] not prepared for this and immediately [npc2.verb(pull)] [npc.her] [npc.foot] from [npc2.her] mouth, coughing and sputtering. [npc2.name] [npc2.verb(let)] out a little chuckle, and [npc2.verb(begin)] sucking on [npc.her] [npc.toes] once more.",
                "[npc2.name] [npc2.verb(let)] out a startled grunt, coughing a bit as [npc2.she] [npc2.verb(attempt)] to deepthroat [npc.her] [npc.toes]. [npc2.name] [npc2.do] not last long, and soon [npc2.is] forced to pull [npc.namePos] [npc.foot] away to catch [npc2.her] breath. Still, it isn't long before [npc2.she] [npc2.verb(take)] [npc.namePos] [npc.toes] back in [npc2.her] mouth."
            ));
            break;
          default:
            UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
                "[npc2.Moaning], [npc2.name] [npc2.verb(savor)] the taste of [npc.namePos] [npc.toes] in [npc2.her] mouth, closing [npc2.her] [npc2.eyes] and rolling  [npc2.her] [npc2.tongue] over each one.",
                "[npc2.name] [npc2.verb(let)] out [npc2.a_moan] as [npc2.she] [npc2.verb(hold)] [npc."
                    + "namePos] [npc.toes] in [npc2.her] mouth, sucking each of them. [npc2.She] [npc2.verb(reach)] up and [npc2.verb(grab)] [npc.legs], pulling [npc.her] [npc.feet] in closer."
            ));
        }
        break;
      case SUB_RESISTING:
        UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
            " Failing to pull [npc.namePos] [npc.feet] away from [npc2.her] face,"
                + " [npc2.name] [npc2.verb(let)] out [npc2.a_sob+] as [npc2.she] weakly [npc2.verb(try)] to struggle free.",

            " [npc2.A_sob+] bursts out from between [npc2.namePos] [npc2.lips] as [npc2.she] weakly [npc2.verb(try)] to push [npc.name] away,"
                + " squirming and protesting as [npc.name] [npc.verb(begin)] to push [npc.her] [npc.foot+] into [npc2.her] mouth.",

            " [npc2.Sobbing] in distress, [npc2.name] [npc2.verb(try)], in vain, to pull [npc.namePos] [npc.feet+] off of [npc2.her] face."));
        break;
      case DOM_GENTLE:
        UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
            " [npc2.Name] gently [npc2.verb(pull)] [npc.namePos] [npc.feet+] to [npc2.her] face,"
                + " letting out [npc2.a_moan+] as [npc2.she] enthusiastically [npc2.verb(kiss)] [npc.namePos] soles.",

            " [npc2.A_moan+] bursts out from [npc2.namePos] mouth, before [npc2.she] [npc2.verb(start)] planting gentle kisses along [npc.namePos] [npc.feet+].",

            " [npc2.Moaning] in delight, [npc2.name] [npc2.verb(plant)] gentle kisses along [npc.namePos] [npc.feet+] and [npc.toes]."));
        break;
      case DOM_NORMAL:
        UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
            " [npc2.Name] greedily [npc2.verb(pull)] [npc.namePos] [npc.feet+] to [npc2.her] face,"
                + " letting out [npc2.a_moan+] as [npc2.she] enthusiastically [npc2.verb(lick)] [npc.namePos] soles.",

            " [npc2.A_moan+] bursts out from [npc2.namePos] mouth, before [npc2.she] [npc2.verb(start)] eagerly running [npc2.her] [npc2.tongue] along [npc.namePos] [npc.feet+].",

            " [npc2.Moaning] in delight, [npc2.name] eagerly [npc2.verb(run)] [npc2.her] tongue along [npc.namePos] [npc.feet+] and [npc.toes]."));
        break;
      case DOM_ROUGH:
        UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
            " [npc2.Name] roughly [npc2.verb(pull)] [npc.namePos] [npc.feet+] to [npc2.her] face,"
                + " letting out [npc2.a_moan+] as [npc2.she] desparately [npc2.verb(take)] [npc.namePos] [npc.toes] into [npc2.her] mouth.",

            " [npc2.A_moan+] bursts out from [npc2.namePos] mouth, before [npc2.she] greedily [npc2.verb(nibble)] and [npc2.verb(suck)] on [npc.namePos] [npc.feet+].",

            " [npc2.Moaning] in delight, [npc2.name] hungrily [npc2.verb(suck)] on [npc.namePos] [npc.toes+]."));
        break;
    }
    return "";
  }
}

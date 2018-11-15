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
      return "Suck [npc2.toes]";
    }

    @Override
    public String getActionDescription() {
      return "Suck [npc2.namePos] [npc2.toes].";
    }

    @Override
    public String getDescription() {

      UtilText.nodeContentSB.setLength(0);

      switch (Sex.getSexPace(Sex.getCharacterPerformingAction())) {
        case DOM_GENTLE:
        case DOM_NORMAL:
        case DOM_ROUGH:
          UtilText.nodeContentSB.append(UtilText.returnStringAtRandom());
          break;
        default:
          UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
              "With lust in [npc.her] [npc.eyes], [npc.namePos] gaze lingers on [npc2.namePos] [npc2.foot+].  [npc.She] [npc.verb(reach)] out and [npc.verb(wrap)] [npc.her] hands around it, massaging the [npc2.skin+] underneath with [npc.her] [npc.fingers]. ",
              "Gazing at [npc2.namePos] [npc2.feet+], [npc.name] [npc.verb(wrap)] [npc.her] hands around them and [npc.verb(begin)] rubbing the soles with [npc.her] [npc.fingers], massaging the [npc2.skin+]. "
          ));
          break;
      }

      switch (Sex.getSexPace(Sex.getCharacterTargetedForSexAction(this))) {
        case SUB_EAGER:
          UtilText.nodeContentSB.append(UtilText.returnStringAtRandom());
          break;
        case SUB_NORMAL:
          UtilText.nodeContentSB.append(UtilText.returnStringAtRandom());
          break;
        case SUB_RESISTING:
          UtilText.nodeContentSB.append(UtilText.returnStringAtRandom());
          break;
        case DOM_GENTLE:
          UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
              "[npc2.speech(Mmm, that feels nice...)], [npc2.name] [npc2.moansVerb], enjoying [npc.namePos] [npc.fingers] on [npc2.her] sole. [npc2.speech(Keep going...)] Obliging [npc2.herHim], [npc.name] [npc.verb(begin)] kissing up [npc2.her] sole until [npc.she] [npc.verb(get)] to [npc2.her] [npc2.toes], placing them into [npc.her] mouth and sucking on them.",
              "[npc2.name] [npc2.verb(let)] out [npc2.a_moan], clearly enjoying the sensation.  Spurred on, [npc.name] [npc.verb(rub)] each of [npc2.her] [npc2.toes] with [npc.her] [npc.fingers], bringing them closer to [npc.her] [npc.lips] and placing them in [npc.her] mouth."
          ));
          break;
        case DOM_NORMAL:
          UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
              "[npc2.speech(Aww, does someone want my [npc2.feet]?)], [npc2.name] [npc2.verb(tease)], curling [npc2.her] [npc2.toes] around [npc.namePos] hands and placing the other [npc2.foot] on [npc.her] [npc.face]. [npc2.speech(Well then, how about some more...)], [npc2.she] [npc2.moansVerb], before pushing [npc2.her] [npc2.toes] into [npc.her] mouth.",
              "[npc2.speech(Ooo, someone likes my [npc2.feet]...)], [npc2.name] [npc2.verb(tease)], pressing [npc2.her] [npc2.foot] into [npc.namePos] hands. [npc2.speech(Well, if you like it so much, how about a taste...)], [npc2.she] [npc2.moansVerb], bringing [npc2.her] other [npc2.foot] to [npc.namePos] [npc.lips] and gently pressing [npc2.her] [npc2.toes] into [npc.her] mouth."
          ));
          break;
        case DOM_ROUGH:
          UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
              "Immediately, [npc2.name] [npc2.verb(yank)] [npc2.her] [npc2.foot] from [npc.namePos] grasp and [npc2.verb(grind)] it into [npc.her] [npc.face]. [npc2.speech(So you like my [npc2.feet] huh? Well then, put that mouth to use my little [npc2.foot][npc.boy])], [npc2.she] [npc.verb(taunt)], before roughly shoving [npc2.her] [npc2.toes] into [npc.namePos] mouth.",
              "[npc2.name] [npc2.verb(let)] out a chuckle before shoving [npc2.her] [npc2.foot] out of [npc.namePos] grasp and into [npc.her] face, grinding [npc2.her] heel on [npc.her] mouth. [npc2.speech(If you're gonna enjoy my [npc2.feet], you're gonna use your mouth)], [npc2.she] [npc2.verb(order)], moving [npc2.her] [npc2.foot] down and shoving [npc2.her] [npc2.toes] past [npc.her] lips."
          ));
          break;
        default:
          UtilText.nodeContentSB.append(UtilText.returnStringAtRandom());
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
      return "Suck [npc2.toes]";
    }

    @Override
    public String getActionDescription() {
      return "Continue sucking [npc2.namePos] [npc2.toes].";
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
      return "Worship [npc2.feet]";
    }

    @Override
    public String getActionDescription() {
      return "Worship [npc2.namePos] [npc2.feet].";
    }

    @Override
    public String getDescription() {

      UtilText.nodeContentSB.setLength(0);

      UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
          "Overcome with lust, [npc.name] eagerly [npc.verb(suck)] on [npc2.namePos] [npc2.toes+], tasting [npc2.her] [npc2.scent] on [npc.her] [npc.tongue].  Unable to control [npc.herself], [npc.name] [npc.verb(pull)] [npc2.her] [npc2.foot] from [npc.her] mouth and [npc.verb(begin)] dragging [npc.her] [npc.tongue] along the sole. ",
          "[npc.Moaning] loudly, [npc.name] [npc.verb(savor)] the feeling of [npc2.namePos] [npc2.skin+] in [npc.her] mouth and on [npc.her] [npc.tongue], sucking desparately at each of [npc2.her] [npc2.toes+].  [npc.She] [npc.verb(pull)] [npc2.her] [npc2.toes] from [npc.her] [npc.lips] and [npc.verb(begin)] running [npc.her] [npc.tongue] along [npc2.her] sole. "
      ));

      UtilText.nodeContentSB.append(getTargetedCharacterResponseSubEager(this));

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
        case DOM_GENTLE:
        case DOM_NORMAL:
        case DOM_ROUGH:

          UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
//              "Roughly grabbing [npc2.namePos] [npc2.feet+] from [npc.her] face,"
//                  + " [npc.name] gives [npc2.her] [npc2.toes+] one last nibble before pulling [npc2.her] [npc2.feet] away.",
//
//              "Giving [npc2.namePos] [npc2.feet+] one last bite, [npc.name] then [npc.verb(move)] [npc2.her] [npc2.feet] back, stopping the worship for now."
 ));
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
      return "Get [npc.toes] sucked";
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
          "Pulling [npc.her] [npc.toes+] from [npc2.namePos] mouth, [npc.name] [npc.verb(place)] one [npc.foot] on [npc2.her] cheek and the other on [npc2.her] [npc2.face], drumming [npc.her] [npc.toes] on [npc2.her] [npc2.faceSkin+]. ",
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
          "Enjoying having [npc.her] [npc.toes+] sucked on, [npc.name] [npc.verb(rub)] the other [npc.foot] along the side of [npc2.namePos] [npc2.face] affectionately.[npc.speech(That's right, suck them nice and good...)] ",
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
        case DOM_GENTLE:
        case DOM_NORMAL:
        case DOM_ROUGH:
          UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
              "Rubbing one [npc.foot] on the side of [npc2.namePos] head, [npc.name] [npc.verb(slide)] [npc.her] [npc.toes+] from [npc2.her] mouth and [npc.verb(tap)] [npc2.herHim] on the nose with them before pulling [npc.her] [npc.legs] away from [npc2.herHim]. ",
              "[npc.speech(That's enough for now)], [npc.name] [npc.moansVerb], before retracting [npc.her] [npc.toes+] from [npc2.namePos] mouth. [npc.She] [npc.verb(give)] [npc2.her] [npc2.face] one last push with [npc.her] [npc.foot] before pulling [npc.her] [npc.legs] back. ",
              "[npc.namePos] [npc.verb(pull)] [npc.her] [npc.toes+] from [npc2.namePos] [npc2.lips] and [npc.verb(wiggle)] them in front of [npc2.her] [npc2.face]. [npc.speech(You did such a good job with these)], [npc.she] [npc.verb(smirk)], then [npc.verb(pull)] [npc.her] [npc.feet] away from [npc2.her] [npc2.face]. "
          ));
          break;
        case SUB_EAGER:
        case SUB_NORMAL:
        case SUB_RESISTING:
          //TODO
          break;
        default:
          break;
      }

      switch (Sex.getSexPace(Sex.getCharacterTargetedForSexAction(this))) {
        case SUB_EAGER:
          UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
              "[npc2.name] [npc2.verb(let)] out a wimper and [npc2.verb(attempt)] to shove the [npc.foot] back in [npc2.her] mouth, only for [npc.name] to yank it back. npc.speech(I said no!)], [npc.she] [npc.verb(exclaim)], and [npc.verb(push)] [npc2.her] head away with [npc.her] [npc.foot]. [npc2.name] [npc2.verb(decide)] to obey [npc.herHim)."
          ));
          break;
        case SUB_NORMAL:
          UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
              "Before [npc.she] can, [npc2.name] [npc2.verb(give)] each [npc.foot] one last squeeze, giving [npc.herHim] a smile and eagerly awaiting what [npc.name] has in store for [npc2.herHim] next."
          ));
          break;
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
        break;
      case DOM_GENTLE:
        UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(" *DOM_GENTLE*"));
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

  private static String getTargetedCharacterResponseSubEager(SexAction action) {
    switch (Sex.getSexPace(Sex.getCharacterTargetedForSexAction(action))) {
      case DOM_GENTLE:
        return UtilText.returnStringAtRandom(
            "[npc2.name] [npc2.moansVerb], pressing [npc2.her] [npc2.foot] into [npc.namePos] [npc.tongue]. [npc2.She] [npc2.verb(let)] [npc.herHim] enjoy [npc.herself], closing [npc2.her] [npc2.eyes] as [npc.name] [npc.verb(finish)] licking [npc2.her] [npc2.foot] and [npc.verb(bring)] [npc2.her] [npc2.toes] back into [npc.her] mouth.",
            "[npc2.speech(Aw, aren't you just the cutest? So eager to taste my [npc2.feet]...)], [npc2.namePos] [npc2.moansVerb], rubbing [npc2.her] other [npc2.foot] along the side of [npc.her] [npc.face]. With [npc.a_moan], [npc.name] hungrily [npc.verb(grab)] the [npc2.foot] from [npc.her] cheek and [npc.verb(shove)] [npc2.namePos] [npc2.toes] in [npc.her] mouth."
        );
      case DOM_NORMAL:
        return UtilText.returnStringAtRandom(
            "Letting out [npc2.a_moan], [npc2.name] eagerly presses [npc2.her] [npc2.foot] into [npc.her] [npc.tongue].  Bringing up [npc2.her] other [npc2.foot], [npc2.she] [npc2.verb(wiggle)] [npc2.her] [npc2.toes] in front of [npc.name]. [npc2.speech(This one needs love too.)], [npc2.she] [npc2.moansVerb], pushing [npc2.her] [npc2.toes] into [npc.her] mouth.",
            "[npc2.speech(Yes, taste my entire [npc2.foot]!)], [npc2.name] [npc2.moansVerb], dragging the sole of [npc2.her] [npc2.foot] across [npc.namePos] [npc.tongue]. [npc2.She] then [npc2.verb(run)] [npc2.her] [npc2.toes] across [npc.her] [npc.tongue], ensuring each one is loved, before pushing [npc2.her] [npc2.toes] back in [npc.her] mouth."
        );
      case DOM_ROUGH:
        return UtilText.returnStringAtRandom(
            "[npc2.speech(That's right little footboy, lick it harder)], [npc2.name] [npc2.moansVerb], grinding [npc2.her] [npc2.foot] into [npc.namePos] [npc.face]. Putting [npc2.her] [npc2.toes] to [npc.her] [npc.lips], [npc2.name] roughly [npc2.verb(shove)] [npc2.her] [npc2.toes] down [npc.name] throat, causing [npc.her] to gag, before laughing and allowing [npc.her] to resume sucking on [npc2.her] [npc2.toes].",
            "[npc2.name] roughly [npc2.verb(pull)] [npc2.her] [npc2.foot] away and [npc2.verb(slap)] [npc.name] in the [npc.face] with it. npc2.speech(Did I say you could stop sucking?), [npc2.she] [npc2.verb(scold)], before roughly shoving [npc2.her] [npc2.toes] back into [npc.namePos] mouth again."
        );
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
                "[npc2.Moaning] in response, [npc2.name] hungrily [npc2.verb(savor)] each of [npc.namePos] [npc.toes], running  [npc2.her] [npc2.tongue] over each of them. [npc2.She] then [npc2.verb(remove)] the [npc.foot] from [npc2.her] mouth and [npc2.verb(begin)] sucking the other one, eager to have [npc.namePos] [npc.toes] in [npc2.her] mouth again."
            ));
        }
        break;
      case SUB_NORMAL:
        switch (givingPace) {
          case DOM_GENTLE:
            UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
                "[npc2.A_moan] escapes [npc2.namePos] [npc2.lips] as [npc2.she] [npc2.verb(plant)] kisses on [npc.namePos] [npc.foot], starting at the heel and working [npc2.her] way up, finally taking [npc.namePos] [npc.toes] back in [npc2.her] mouth.",
                "With [npc2.a_moan], [npc2.name] [npc2.verb(give)] [npc.namePos] [npc.foot] a long, slow lick from the heel to [npc.her] [npc.toes], before placing [npc.her] [npc.toes] back into [npc2.her] mouth."
            ));
            break;
          case DOM_ROUGH:
            UtilText.nodeContentSB.append(UtilText.returnStringAtRandom(
                "[npc2.name] [npc2.was] not prepared for this and immediately [npc2.verb(pull)] [npc.her] [npc.foot] from [npc2.her] mouth, coughing and sputtering. [npc2.name] [npc2.verb(let)] out a little chuckle, right before [npc.name] [npc.verb(shove)] [npc.her] [npc.toes] back into [npc2.her] mouth.",
                "[npc2.name] [npc2.verb(let)] out a startled grunt, coughing a bit as [npc2.she] [npc2.verb(attempt)] to deepthroat [npc.her] [npc.toes]. [npc2.name] [npc2.do] not last long, and soon [npc2.is] forced to pull [npc.namePos] [npc.foot] away to catch [npc2.her] breath. Just when [npc2.she] [npc2.verb(recover)], [npc.name] [npc.verb(smile)] and [npc.verb(force)] [npc.her] [npc.toes] back in [npc2.her] mouth."
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

/*
* Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
*
* Redistribution and use in source and binary forms, with or without modification, are
* permitted provided that the following conditions are met:
*
*    1. Redistributions of source code must retain the above copyright notice, this list of
*       conditions and the following disclaimer.
*
*    2. Redistributions in binary form must reproduce the above copyright notice, this list
*       of conditions and the following disclaimer in the documentation and/or other materials
*       provided with the distribution.
*
* THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com AS IS AND ANY EXPRESS OR IMPLIED
* WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
* FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
* CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
* CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
* SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
* ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
* NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
* ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*
* The views and conclusions contained in the software and documentation are those of the
* authors and should not be interpreted as representing official policies, either expressed
* or implied, of BetaSteward_at_googlemail.com.
 */
package mage.game.permanent.token;

import mage.constants.CardType;
import mage.constants.SubType;
import mage.MageInt;
import mage.ObjectColor;
import mage.abilities.keyword.FlankingAbility;
import mage.abilities.keyword.HasteAbility;
import mage.abilities.keyword.ProtectionAbility;

/**
 *
 * @author spjspj
 */
public class RiftmarkedKnightToken extends Token {

    public RiftmarkedKnightToken() {
        super("Knight", "2/2 black Knight creature token with flanking, protection from white, and haste");
        cardType.add(CardType.CREATURE);
        color.setBlack(true);
        subtype.add(SubType.KNIGHT);
        power = new MageInt(2);
        toughness = new MageInt(2);
        this.addAbility(ProtectionAbility.from(ObjectColor.WHITE));
        this.addAbility(new FlankingAbility());
        this.addAbility(HasteAbility.getInstance());
    }

    public RiftmarkedKnightToken(final RiftmarkedKnightToken token) {
        super(token);
    }

    public RiftmarkedKnightToken copy() {
        return new RiftmarkedKnightToken(this);
    }
}

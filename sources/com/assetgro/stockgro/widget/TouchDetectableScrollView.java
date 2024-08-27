package com.assetgro.stockgro.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.widget.NestedScrollView;
import com.assetgro.stockgro.feature_market.presentation.market.search.MarketAdvancedSearchActivity;
import com.assetgro.stockgro.feature_market.presentation.market.search.MarketAdvancedSearchViewModel;
import com.assetgro.stockgro.ui.chat.activation.DeactivatedMembersListActivity;
import com.assetgro.stockgro.ui.chat.activation.DeactivatedMembersListViewModel;
import com.assetgro.stockgro.ui.chat.detail.members.GroupMemberListActivity;
import com.assetgro.stockgro.ui.chat.detail.members.GroupMemberListViewModel;
import com.assetgro.stockgro.ui.chat.members.BannedMemberListViewModel;
import com.assetgro.stockgro.ui.chat.members.BannedMembersListActivity;
import com.assetgro.stockgro.ui.chat.search.SocialAdvancedSearchActivity;
import com.assetgro.stockgro.ui.chat.search.SocialAdvancedSearchViewModel;
import com.assetgro.stockgro.ui.social.presentation.block.BlockedUserListActivity;
import com.assetgro.stockgro.ui.social.presentation.block.BlockedUserListViewModel;
import qj.o0;
import va.b;
import va.e;

/* loaded from: classes.dex */
public class TouchDetectableScrollView extends NestedScrollView {
    public o0 F;

    public TouchDetectableScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public o0 getMyScrollChangeListener() {
        return this.F;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        if (this.F != null) {
            if (getChildAt(getChildCount() - 1).getBottom() - (getScrollY() + getHeight()) == 0) {
                b bVar = (b) this.F;
                int i14 = bVar.f37817a;
                gd.b bVar2 = bVar.f37818b;
                switch (i14) {
                    case 0:
                        MarketAdvancedSearchActivity marketAdvancedSearchActivity = (MarketAdvancedSearchActivity) bVar2;
                        if (((MarketAdvancedSearchViewModel) marketAdvancedSearchActivity.x()).f8692s != e.f37822b && ((MarketAdvancedSearchViewModel) marketAdvancedSearchActivity.x()).f8694u) {
                            ((MarketAdvancedSearchViewModel) marketAdvancedSearchActivity.x()).f8695v++;
                            ((MarketAdvancedSearchViewModel) marketAdvancedSearchActivity.x()).i();
                            return;
                        }
                        return;
                    case 1:
                        DeactivatedMembersListActivity deactivatedMembersListActivity = (DeactivatedMembersListActivity) bVar2;
                        ((DeactivatedMembersListViewModel) deactivatedMembersListActivity.x()).f9112t += ((DeactivatedMembersListViewModel) deactivatedMembersListActivity.x()).f9113u;
                        ((DeactivatedMembersListViewModel) deactivatedMembersListActivity.x()).h();
                        return;
                    case 2:
                        GroupMemberListActivity groupMemberListActivity = (GroupMemberListActivity) bVar2;
                        if (!((GroupMemberListViewModel) groupMemberListActivity.x()).G) {
                            ((GroupMemberListViewModel) groupMemberListActivity.x()).H += ((GroupMemberListViewModel) groupMemberListActivity.x()).C;
                            ((GroupMemberListViewModel) groupMemberListActivity.x()).m();
                            return;
                        }
                        return;
                    case 3:
                        BannedMembersListActivity bannedMembersListActivity = (BannedMembersListActivity) bVar2;
                        if (!((BannedMemberListViewModel) bannedMembersListActivity.x()).f9416w) {
                            ((BannedMemberListViewModel) bannedMembersListActivity.x()).f9415v += ((BannedMemberListViewModel) bannedMembersListActivity.x()).f9412s;
                            ((BannedMemberListViewModel) bannedMembersListActivity.x()).h();
                            return;
                        }
                        return;
                    case 4:
                        SocialAdvancedSearchActivity socialAdvancedSearchActivity = (SocialAdvancedSearchActivity) bVar2;
                        if (((SocialAdvancedSearchViewModel) socialAdvancedSearchActivity.x()).f9435u != qe.e.f31904b && ((SocialAdvancedSearchViewModel) socialAdvancedSearchActivity.x()).f9437w) {
                            ((SocialAdvancedSearchViewModel) socialAdvancedSearchActivity.x()).f9438x += ((SocialAdvancedSearchViewModel) socialAdvancedSearchActivity.x()).f9439y;
                            ((SocialAdvancedSearchViewModel) socialAdvancedSearchActivity.x()).i();
                            return;
                        }
                        return;
                    default:
                        BlockedUserListActivity blockedUserListActivity = (BlockedUserListActivity) bVar2;
                        if (!((BlockedUserListViewModel) blockedUserListActivity.x()).f10129u) {
                            ((BlockedUserListViewModel) blockedUserListActivity.x()).f10128t += ((BlockedUserListViewModel) blockedUserListActivity.x()).f10127s;
                            ((BlockedUserListViewModel) blockedUserListActivity.x()).h();
                            return;
                        }
                        return;
                }
            }
        }
    }

    public void setMyScrollChangeListener(o0 o0Var) {
        this.F = o0Var;
    }
}

package jd;

import ae.j;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import ba.n8;
import ba.t8;
import com.assetgro.stockgro.data.model.ChatChannel;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.data.model.InvitedFriendDto;
import com.assetgro.stockgro.data.model.NonStockgroContact;
import com.assetgro.stockgro.data.remote.response.SocialSearchHistoryItem;
import com.assetgro.stockgro.data.remote.response.StockgroContact;
import com.assetgro.stockgro.feature_social.presentation.RiaProfileActivity;
import com.assetgro.stockgro.ui.chat.activation.DeactivatedMembersListActivity;
import com.assetgro.stockgro.ui.chat.create.GroupCreateHostActivity;
import com.assetgro.stockgro.ui.chat.detail.group.info.GroupInfoActivity;
import com.assetgro.stockgro.ui.chat.detail.members.GroupInvitedListActivity;
import com.assetgro.stockgro.ui.chat.detail.menu.ChatBottomSheetListItemViewModel;
import com.assetgro.stockgro.ui.chat.detail.messages.pin.PinnedMessagesItemViewModel;
import com.assetgro.stockgro.ui.chat.detail.messages.thread.MessageThreadInfoListItemViewModel;
import com.assetgro.stockgro.ui.chat.discover.horizontal.HorizontalGroupsItemViewModel;
import com.assetgro.stockgro.ui.chat.discover.vertical.VerticalGroupsItemViewModel;
import com.assetgro.stockgro.ui.chat.helper.search.InviteContactViewModel;
import com.assetgro.stockgro.ui.chat.helper.search.StockgroContactViewModel;
import com.assetgro.stockgro.ui.chat.list.UserGroupListItemViewModel;
import com.assetgro.stockgro.ui.chat.members.BannedMembersListActivity;
import com.assetgro.stockgro.ui.chat.message_invites.MessageInvitesActivity;
import com.assetgro.stockgro.ui.chat.preview.MediaAssetUploadPreviewActivity;
import com.assetgro.stockgro.ui.chat.search.history.SearchHistoryItemViewModel;
import com.assetgro.stockgro.ui.chat.utils.MediaPlayerActivity;
import com.assetgro.stockgro.ui.drawer.about.AppPrivacyPolicyActivity;
import com.assetgro.stockgro.ui.drawer.about.AppTncActivity;
import com.assetgro.stockgro.ui.drawer.championsChart.ChampionsChartActivity;
import com.assetgro.stockgro.ui.drawer.championsChart.adapters.ChampionsItemViewModel;
import com.assetgro.stockgro.ui.drawer.faq.FaqActivity;
import com.assetgro.stockgro.ui.drawer.invite.InvitedFriendItemViewModel;
import com.assetgro.stockgro.ui.drawer.invite.InvitedFriendsActivity;
import com.assetgro.stockgro.ui.drawer.stockgyan.StockGyanGroupsActivity;
import com.assetgro.stockgro.ui.drawer.stockgyan.StockGyanIndexActivity;
import com.assetgro.stockgro.ui.drawer.stockgyan.adapter.StockGyanGroupsItemViewModel;
import com.assetgro.stockgro.ui.drawer.tutorials.TutorialsActivity;
import com.assetgro.stockgro.ui.profile.user.UserProfileActivity;
import ge.i;
import ge.w;
import je.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ye.h;
import zd.m;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21299a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21300b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f21299a = i10;
        this.f21300b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Class cls;
        int i10 = this.f21299a;
        Object obj = this.f21300b;
        switch (i10) {
            case 0:
                DeactivatedMembersListActivity this$0 = (DeactivatedMembersListActivity) obj;
                sb.b bVar = DeactivatedMembersListActivity.f9104l;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.finish();
                return;
            case 1:
                GroupCreateHostActivity this$02 = (GroupCreateHostActivity) obj;
                int i11 = GroupCreateHostActivity.f9114k;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                this$02.finish();
                return;
            case 2:
                Function1 onDismissClicked = (Function1) obj;
                Intrinsics.checkNotNullParameter(onDismissClicked, "$onDismissClicked");
                onDismissClicked.invoke(Boolean.TRUE);
                return;
            case 3:
                GroupInfoActivity this$03 = (GroupInfoActivity) obj;
                int i12 = GroupInfoActivity.f9214l;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                this$03.onBackPressed();
                return;
            case 4:
                GroupInvitedListActivity this$04 = (GroupInvitedListActivity) obj;
                int i13 = GroupInvitedListActivity.f9272l;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                this$04.finish();
                return;
            case 5:
                xd.c this$05 = (xd.c) obj;
                int i14 = xd.c.f40178y;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                Object value = ((ChatBottomSheetListItemViewModel) this$05.v()).f9075c.getValue();
                Intrinsics.c(value);
                this$05.f40179x.invoke((xd.a) value);
                return;
            case 6:
                n8 option = (n8) obj;
                yd.c cVar = yd.e.f41535b;
                Intrinsics.checkNotNullParameter(option, "$option");
                option.f5529s.performClick();
                return;
            case 7:
                m this$06 = (m) obj;
                int i15 = m.A;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                ChatMessage chatMessage = (ChatMessage) ((PinnedMessagesItemViewModel) this$06.v()).f9075c.getValue();
                if (chatMessage != null) {
                    this$06.f42433y.invoke(chatMessage);
                    return;
                }
                return;
            case 8:
                j this$07 = (j) obj;
                int i16 = j.B;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                ChatMessage chatMessage2 = (ChatMessage) ((MessageThreadInfoListItemViewModel) this$07.v()).f9075c.getValue();
                if (chatMessage2 != null) {
                    this$07.f394y.invoke(chatMessage2);
                    return;
                }
                return;
            case 9:
                de.c this$08 = (de.c) obj;
                int i17 = de.c.f14315y;
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                Group group = (Group) ((HorizontalGroupsItemViewModel) this$08.v()).f9075c.getValue();
                if (group != null) {
                    this$08.f14316x.invoke(group);
                    return;
                }
                return;
            case 10:
                fe.c this$09 = (fe.c) obj;
                int i18 = fe.c.f16045y;
                Intrinsics.checkNotNullParameter(this$09, "this$0");
                Group group2 = (Group) ((VerticalGroupsItemViewModel) this$09.v()).f9075c.getValue();
                if (group2 != null) {
                    this$09.f16046x.invoke(group2);
                    return;
                }
                return;
            case 11:
                i this$010 = (i) obj;
                int i19 = i.f17317y;
                Intrinsics.checkNotNullParameter(this$010, "this$0");
                NonStockgroContact contact = (NonStockgroContact) ((InviteContactViewModel) this$010.v()).f9075c.getValue();
                if (contact != null) {
                    ge.j jVar = this$010.f17318x;
                    jVar.getClass();
                    Intrinsics.checkNotNullParameter(contact, "contact");
                    jVar.f17319a.f17320h.invoke(contact);
                    return;
                }
                return;
            case 12:
                w this$011 = (w) obj;
                int i20 = w.f17350y;
                Intrinsics.checkNotNullParameter(this$011, "this$0");
                StockgroContact contact2 = (StockgroContact) ((StockgroContactViewModel) this$011.v()).f9075c.getValue();
                if (contact2 != null) {
                    ge.c cVar2 = this$011.f17351x;
                    cVar2.getClass();
                    Intrinsics.checkNotNullParameter(contact2, "contact");
                    cVar2.f17305a.f17306h.invoke(contact2);
                    return;
                }
                return;
            case 13:
                g this$012 = (g) obj;
                int i21 = g.f21331y;
                Intrinsics.checkNotNullParameter(this$012, "this$0");
                if (((ChatChannel) ((UserGroupListItemViewModel) this$012.v()).f9075c.getValue()) != null) {
                    ((t8) this$012.f17291u).f6167s.performClick();
                    return;
                }
                return;
            case 14:
                BannedMembersListActivity this$013 = (BannedMembersListActivity) obj;
                int i22 = BannedMembersListActivity.f9417l;
                Intrinsics.checkNotNullParameter(this$013, "this$0");
                this$013.finish();
                return;
            case 15:
                MessageInvitesActivity this$014 = (MessageInvitesActivity) obj;
                int i23 = MessageInvitesActivity.f9420l;
                Intrinsics.checkNotNullParameter(this$014, "this$0");
                this$014.onBackPressed();
                return;
            case 16:
                MediaAssetUploadPreviewActivity this$015 = (MediaAssetUploadPreviewActivity) obj;
                int i24 = MediaAssetUploadPreviewActivity.f9422k;
                Intrinsics.checkNotNullParameter(this$015, "this$0");
                this$015.setResult(0);
                this$015.finish();
                return;
            case 17:
                se.e this$016 = (se.e) obj;
                int i25 = se.e.f34601y;
                Intrinsics.checkNotNullParameter(this$016, "this$0");
                SocialSearchHistoryItem socialSearchHistoryItem = (SocialSearchHistoryItem) ((SearchHistoryItemViewModel) this$016.v()).f9075c.getValue();
                if (socialSearchHistoryItem != null) {
                    this$016.f34602x.invoke(socialSearchHistoryItem);
                    return;
                }
                return;
            case 18:
                MediaPlayerActivity mediaPlayerActivity = (MediaPlayerActivity) obj;
                if (mediaPlayerActivity.f9466j) {
                    mediaPlayerActivity.f9457a.seekTo(0);
                    mediaPlayerActivity.f9457a.start();
                    mediaPlayerActivity.f9469m.f4775t.setVisibility(4);
                    mediaPlayerActivity.f9466j = false;
                    return;
                }
                if (mediaPlayerActivity.f9457a.isPlaying()) {
                    mediaPlayerActivity.f9457a.pause();
                    mediaPlayerActivity.f9469m.f4775t.setVisibility(0);
                    return;
                } else {
                    mediaPlayerActivity.f9457a.start();
                    mediaPlayerActivity.f9469m.f4775t.setVisibility(4);
                    return;
                }
            case 19:
                AppPrivacyPolicyActivity this$017 = (AppPrivacyPolicyActivity) obj;
                int i26 = AppPrivacyPolicyActivity.f9471k;
                Intrinsics.checkNotNullParameter(this$017, "this$0");
                this$017.onBackPressed();
                return;
            case 20:
                AppTncActivity this$018 = (AppTncActivity) obj;
                int i27 = AppTncActivity.f9472k;
                Intrinsics.checkNotNullParameter(this$018, "this$0");
                this$018.onBackPressed();
                return;
            case 21:
                ChampionsChartActivity this$019 = (ChampionsChartActivity) obj;
                int i28 = ChampionsChartActivity.f9473l;
                Intrinsics.checkNotNullParameter(this$019, "this$0");
                this$019.onBackPressed();
                return;
            case 22:
                xe.d this$020 = (xe.d) obj;
                int i29 = xe.d.f40188y;
                Intrinsics.checkNotNullParameter(this$020, "this$0");
                Function1 function1 = this$020.f40189x;
                Object value2 = ((ChampionsItemViewModel) this$020.v()).f9075c.getValue();
                Intrinsics.c(value2);
                function1.invoke(value2);
                return;
            case 23:
                FaqActivity this$021 = (FaqActivity) obj;
                int i30 = FaqActivity.f9485k;
                Intrinsics.checkNotNullParameter(this$021, "this$0");
                this$021.onBackPressed();
                return;
            case 24:
                h this$022 = (h) obj;
                int i31 = h.f41611x;
                Intrinsics.checkNotNullParameter(this$022, "this$0");
                InvitedFriendDto invitedFriendDto = (InvitedFriendDto) ((InvitedFriendItemViewModel) this$022.v()).f9075c.getValue();
                if (invitedFriendDto != null) {
                    if (invitedFriendDto.isExpert()) {
                        cls = RiaProfileActivity.class;
                    } else {
                        cls = UserProfileActivity.class;
                    }
                    View view2 = this$022.f22629a;
                    Context context = view2.getContext();
                    Intent intent = new Intent(view2.getContext(), (Class<?>) cls);
                    intent.putExtra("USER_IDENTIFIER", invitedFriendDto.getUuid());
                    intent.putExtra("USER_NAME", invitedFriendDto.getDisplayName());
                    context.startActivity(intent);
                    return;
                }
                return;
            case 25:
                InvitedFriendsActivity this$023 = (InvitedFriendsActivity) obj;
                int i32 = InvitedFriendsActivity.f9495l;
                Intrinsics.checkNotNullParameter(this$023, "this$0");
                this$023.finish();
                return;
            case 26:
                StockGyanGroupsActivity this$024 = (StockGyanGroupsActivity) obj;
                int i33 = StockGyanGroupsActivity.f9499l;
                Intrinsics.checkNotNullParameter(this$024, "this$0");
                this$024.onBackPressed();
                return;
            case 27:
                StockGyanIndexActivity this$025 = (StockGyanIndexActivity) obj;
                int i34 = StockGyanIndexActivity.f9509l;
                Intrinsics.checkNotNullParameter(this$025, "this$0");
                this$025.onBackPressed();
                return;
            case 28:
                bf.d this$026 = (bf.d) obj;
                int i35 = bf.d.f6963y;
                Intrinsics.checkNotNullParameter(this$026, "this$0");
                Function1 function12 = this$026.f6964x;
                Object value3 = ((StockGyanGroupsItemViewModel) this$026.v()).f9075c.getValue();
                Intrinsics.c(value3);
                function12.invoke(value3);
                return;
            default:
                TutorialsActivity this$027 = (TutorialsActivity) obj;
                int i36 = TutorialsActivity.f9515k;
                Intrinsics.checkNotNullParameter(this$027, "this$0");
                this$027.onBackPressed();
                return;
        }
    }
}

package id;

import com.assetgro.stockgro.data.model.CharLimit;
import com.assetgro.stockgro.data.model.DiscoverCategory;
import com.assetgro.stockgro.data.model.DiscoverDto;
import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.data.model.UserConfig;
import com.assetgro.stockgro.data.model.UserPermissions;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.SocialRoleResponseDto;
import com.assetgro.stockgro.ui.chat.SocialChatListViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19861a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SocialChatListViewModel f19862b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(SocialChatListViewModel socialChatListViewModel, int i10) {
        super(1);
        this.f19861a = i10;
        this.f19862b = socialChatListViewModel;
    }

    public final void invoke(Throwable th2) {
        int i10 = this.f19861a;
        SocialChatListViewModel socialChatListViewModel = this.f19862b;
        switch (i10) {
            case 2:
                socialChatListViewModel.f9084g.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
            case 3:
            default:
                socialChatListViewModel.f9084g.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
            case 4:
                socialChatListViewModel.f9084g.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CharLimit charLimits;
        int i10 = this.f19861a;
        SocialChatListViewModel socialChatListViewModel = this.f19862b;
        switch (i10) {
            case 0:
                kj.j jVar = (kj.j) obj;
                if (jVar != null && ((Unit) jVar.a()) != null) {
                    socialChatListViewModel.m();
                }
                return Unit.f23355a;
            case 1:
                socialChatListViewModel.f9084g.postValue(Boolean.FALSE);
                socialChatListViewModel.f9099v.postValue((Group) obj);
                return Unit.f23355a;
            case 2:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 3:
                socialChatListViewModel.f9084g.postValue(Boolean.FALSE);
                ArrayList arrayList = (ArrayList) ((BaseResponseDto) obj).getData();
                if (arrayList != null && (!arrayList.isEmpty())) {
                    String chatRole = ((SocialRoleResponseDto) arrayList.get(0)).getChatRole();
                    if (!Intrinsics.a(chatRole, "Rogue")) {
                        Intrinsics.checkNotNullParameter(chatRole, "<set-?>");
                        socialChatListViewModel.C = chatRole;
                        socialChatListViewModel.f9096s.postValue(Boolean.valueOf(!Intrinsics.a(chatRole, "Rogue")));
                    }
                }
                return Unit.f23355a;
            case 4:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 5:
                DiscoverDto discoverDto = (DiscoverDto) obj;
                socialChatListViewModel.f9084g.postValue(Boolean.FALSE);
                List<DiscoverCategory> categories = discoverDto.getCategories();
                if (categories != null) {
                    socialChatListViewModel.f9094q.postValue(categories);
                }
                Map<String, String> groupJoinStatus = discoverDto.getGroupJoinStatus();
                if (groupJoinStatus != null) {
                    Intrinsics.checkNotNullParameter(groupJoinStatus, "<set-?>");
                    socialChatListViewModel.f9101x = groupJoinStatus;
                }
                UserConfig userConfig = discoverDto.getUserConfig();
                if (userConfig != null && (charLimits = userConfig.getCharLimits()) != null) {
                    socialChatListViewModel.f9100w.postValue(charLimits);
                }
                UserPermissions userPermissions = discoverDto.getUserPermissions();
                if (userPermissions != null) {
                    socialChatListViewModel.f9095r.postValue(userPermissions);
                }
                return Unit.f23355a;
            default:
                invoke((Throwable) obj);
                return Unit.f23355a;
        }
    }
}

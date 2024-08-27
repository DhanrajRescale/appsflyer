package ea;

import androidx.lifecycle.LiveData;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.arena.my.LeagueSharedViewModel;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import com.assetgro.stockgro.ui.chat.activation.DeactivatedMembersListViewModel;
import com.assetgro.stockgro.ui.chat.detail.group.edit.GroupDescriptionEditViewModel;
import com.assetgro.stockgro.ui.chat.detail.group.edit.GroupNameEditViewModel;
import com.assetgro.stockgro.ui.chat.detail.members.GroupInvitedListViewModel;
import com.assetgro.stockgro.ui.chat.detail.members.GroupMemberListViewModel;
import com.assetgro.stockgro.ui.chat.detail.messages.pin.GroupPinnedMessagesViewModel;
import com.assetgro.stockgro.ui.chat.list.UserGroupListViewModel;
import com.assetgro.stockgro.ui.chat.members.BannedMemberListViewModel;
import com.assetgro.stockgro.ui.profile.UserProfileSharedViewModel;
import com.assetgro.stockgro.ui.profile.group.GroupMyProfileViewModel;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15129a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pj.a f15130b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ct.a f15131c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ UserRepository f15132d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ChatRepository f15133e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(kq.e eVar, ct.a aVar, ChatRepository chatRepository, UserRepository userRepository, int i10) {
        super(0);
        this.f15129a = i10;
        this.f15130b = eVar;
        this.f15131c = aVar;
        this.f15133e = chatRepository;
        this.f15132d = userRepository;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [com.assetgro.stockgro.ui.base.BaseViewModel, com.assetgro.stockgro.ui.chat.home.SocialSharedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        int i10 = this.f15129a;
        ChatRepository chatRepository = this.f15133e;
        UserRepository userRepository = this.f15132d;
        ct.a compositeDisposable = this.f15131c;
        pj.a schedulerProvider = this.f15130b;
        switch (i10) {
            case 0:
                return new BannedMemberListViewModel(chatRepository, userRepository, schedulerProvider, compositeDisposable);
            case 1:
                return new DeactivatedMembersListViewModel(chatRepository, userRepository, schedulerProvider, compositeDisposable);
            case 2:
                return new GroupInvitedListViewModel(chatRepository, userRepository, schedulerProvider, compositeDisposable);
            case 3:
                return new GroupMemberListViewModel(chatRepository, userRepository, schedulerProvider, compositeDisposable);
            case 4:
                return new GroupPinnedMessagesViewModel(chatRepository, userRepository, schedulerProvider, compositeDisposable);
            case 5:
                switch (i10) {
                    case 5:
                        return new LeagueSharedViewModel(chatRepository, userRepository, schedulerProvider, compositeDisposable);
                    default:
                        return new LeagueSharedViewModel(chatRepository, userRepository, schedulerProvider, compositeDisposable);
                }
            case 6:
                return new UserGroupListViewModel(chatRepository, userRepository, schedulerProvider, compositeDisposable);
            case 7:
                switch (i10) {
                    case 7:
                        return new UserProfileSharedViewModel(chatRepository, userRepository, schedulerProvider, compositeDisposable);
                    default:
                        return new UserProfileSharedViewModel(chatRepository, userRepository, schedulerProvider, compositeDisposable);
                }
            case 8:
                return new GroupDescriptionEditViewModel(chatRepository, userRepository, schedulerProvider, compositeDisposable);
            case 9:
                return new GroupMyProfileViewModel(chatRepository, userRepository, schedulerProvider, compositeDisposable);
            case 10:
                return new GroupNameEditViewModel(chatRepository, userRepository, schedulerProvider, compositeDisposable);
            case 11:
                switch (i10) {
                    case 5:
                        return new LeagueSharedViewModel(chatRepository, userRepository, schedulerProvider, compositeDisposable);
                    default:
                        return new LeagueSharedViewModel(chatRepository, userRepository, schedulerProvider, compositeDisposable);
                }
            case 12:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                Intrinsics.checkNotNullParameter(userRepository, "userRepository");
                Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
                ?? baseViewModel = new BaseViewModel(schedulerProvider, compositeDisposable, userRepository);
                baseViewModel.f9366n = new LiveData(new Pair(null, Boolean.FALSE));
                baseViewModel.f9367o = new LiveData();
                baseViewModel.f9368p = new LiveData();
                return baseViewModel;
            default:
                switch (i10) {
                    case 7:
                        return new UserProfileSharedViewModel(chatRepository, userRepository, schedulerProvider, compositeDisposable);
                    default:
                        return new UserProfileSharedViewModel(chatRepository, userRepository, schedulerProvider, compositeDisposable);
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(pj.a aVar, ct.a aVar2, UserRepository userRepository, ChatRepository chatRepository, int i10) {
        super(0);
        this.f15129a = i10;
        this.f15130b = aVar;
        this.f15131c = aVar2;
        this.f15132d = userRepository;
        this.f15133e = chatRepository;
    }
}

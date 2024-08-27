package vd;

import com.assetgro.stockgro.data.repository.FollowerRepository;
import com.assetgro.stockgro.ui.chat.detail.members.AddMembersViewModel;
import g7.x3;
import kotlin.jvm.functions.Function0;
import okhttp3.HttpUrl;
import ue.a0;
import ue.y;

/* loaded from: classes.dex */
public final class c extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37962a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddMembersViewModel f37963b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f37964c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(AddMembersViewModel addMembersViewModel, String str, int i10) {
        super(0);
        this.f37962a = i10;
        this.f37963b = addMembersViewModel;
        this.f37964c = str;
    }

    public final x3 a() {
        int i10 = this.f37962a;
        String str = this.f37964c;
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        AddMembersViewModel addMembersViewModel = this.f37963b;
        switch (i10) {
            case 0:
                FollowerRepository followerRepository = addMembersViewModel.f9265o;
                String str3 = addMembersViewModel.f9267q;
                if (str3 != null) {
                    str2 = str3;
                }
                return new y(followerRepository, str, str2);
            default:
                FollowerRepository followerRepository2 = addMembersViewModel.f9265o;
                String str4 = addMembersViewModel.f9267q;
                if (str4 != null) {
                    str2 = str4;
                }
                return new a0(followerRepository2, str, str2);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f37962a) {
            case 0:
                return a();
            default:
                return a();
        }
    }
}

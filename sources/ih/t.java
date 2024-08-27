package ih;

import androidx.fragment.app.d1;
import ba.q2;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.profile.self.MyProfileActivity;
import com.assetgro.stockgro.ui.profile.user.UserProfileViewModel;
import kh.y;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20031a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MyProfileActivity f20032b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(MyProfileActivity myProfileActivity, int i10) {
        super(1);
        this.f20031a = i10;
        this.f20032b = myProfileActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f20031a;
        MyProfileActivity myProfileActivity = this.f20032b;
        switch (i10) {
            case 0:
                d1 supportFragmentManager = myProfileActivity.getSupportFragmentManager();
                supportFragmentManager.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                Intrinsics.checkNotNullExpressionValue(aVar, "beginTransaction(...)");
                int i11 = y.f23187n;
                String userId = ((UserProfileViewModel) myProfileActivity.x()).h();
                String userDisplayName = ((UserProfileViewModel) myProfileActivity.x()).f9081d.getUserDisplayName();
                Intrinsics.checkNotNullParameter(userId, "userId");
                y yVar = new y();
                yVar.setArguments(hl.f.y(new Pair("USER_IDENTIFIER", userId), new Pair("USER_NAME", userDisplayName)));
                aVar.e(R.id.container_fragment, yVar, "UserStatisticsFragment", 1);
                aVar.h(false);
                return Unit.f23355a;
            default:
                Boolean bool = (Boolean) obj;
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    ((q2) myProfileActivity.w()).f5826t.setVisibility(0);
                } else if (Intrinsics.a(bool, Boolean.FALSE)) {
                    ((q2) myProfileActivity.w()).f5826t.setVisibility(8);
                }
                return Unit.f23355a;
        }
    }
}

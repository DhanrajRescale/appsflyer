package eh;

import android.content.Intent;
import androidx.constraintlayout.widget.ConstraintLayout;
import ba.c0;
import com.assetgro.stockgro.data.model.UserFollowerFollowing;
import com.assetgro.stockgro.feature_social.presentation.RiaProfileActivity;
import com.assetgro.stockgro.ui.profile.followers.FollowerFollowingActivity;
import com.assetgro.stockgro.ui.profile.followers.FollowerFollowingViewModel;
import com.assetgro.stockgro.ui.profile.user.UserProfileActivity;
import iu.k;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qu.r0;

/* loaded from: classes.dex */
public final class c extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15429a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FollowerFollowingActivity f15430b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(FollowerFollowingActivity followerFollowingActivity, int i10) {
        super(1);
        this.f15429a = i10;
        this.f15430b = followerFollowingActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.kaopiz.kprogresshud.f fVar;
        Class cls;
        int i10 = this.f15429a;
        FollowerFollowingActivity followerFollowingActivity = this.f15430b;
        switch (i10) {
            case 0:
                List list = (List) obj;
                followerFollowingActivity.setResult(-1);
                if (list != null) {
                    if (list.isEmpty()) {
                        ConstraintLayout noFollowersOrFollowingContainer = ((c0) followerFollowingActivity.w()).f4329t;
                        Intrinsics.checkNotNullExpressionValue(noFollowersOrFollowingContainer, "noFollowersOrFollowingContainer");
                        zq.f.m0(noFollowersOrFollowingContainer);
                    } else {
                        ConstraintLayout noFollowersOrFollowingContainer2 = ((c0) followerFollowingActivity.w()).f4329t;
                        Intrinsics.checkNotNullExpressionValue(noFollowersOrFollowingContainer2, "noFollowersOrFollowingContainer");
                        zq.f.M(noFollowersOrFollowingContainer2);
                    }
                    ch.f fVar2 = followerFollowingActivity.f9979l;
                    if (fVar2 != null) {
                        fVar2.u(list);
                        yk.g.H(hl.f.d(r0.f32256b), null, null, new b(followerFollowingActivity, null), 3);
                    } else {
                        Intrinsics.k("followerFollowingViewPagerAdapter");
                        throw null;
                    }
                }
                return Unit.f23355a;
            case 1:
                Boolean bool = (Boolean) obj;
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    com.kaopiz.kprogresshud.f fVar3 = followerFollowingActivity.f17255c;
                    if (fVar3 != null) {
                        fVar3.d();
                    }
                } else if (Intrinsics.a(bool, Boolean.FALSE) && (fVar = followerFollowingActivity.f17255c) != null) {
                    fVar.b();
                }
                return Unit.f23355a;
            default:
                UserFollowerFollowing it = (UserFollowerFollowing) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                FollowerFollowingViewModel followerFollowingViewModel = (FollowerFollowingViewModel) followerFollowingActivity.x();
                String userId = it.getUuid();
                Intrinsics.checkNotNullParameter(userId, "userId");
                if (!Intrinsics.a(userId, followerFollowingViewModel.f9081d.getCurrentUserId()) && !Intrinsics.a(it.getUuid(), ((FollowerFollowingViewModel) followerFollowingActivity.x()).f9981n)) {
                    if (it.isExpert()) {
                        cls = RiaProfileActivity.class;
                    } else {
                        cls = UserProfileActivity.class;
                    }
                    Intent intent = new Intent(followerFollowingActivity, (Class<?>) cls);
                    intent.putExtra("USER_IDENTIFIER", it.getUuid());
                    intent.putExtra("USER_NAME", it.getDisplayName());
                    followerFollowingActivity.f9978k.a(intent);
                }
                return Unit.f23355a;
        }
    }
}

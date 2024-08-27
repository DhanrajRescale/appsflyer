package ch;

import android.widget.ImageView;
import android.widget.TextView;
import ba.r8;
import com.assetgro.stockgro.data.model.FollowerFollowingData;
import com.assetgro.stockgro.data.model.UserFollowerFollowing;
import com.assetgro.stockgro.prod.R;
import iu.k;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8141a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f8142b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int i10) {
        super(1);
        this.f8141a = i10;
        this.f8142b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f8141a;
        e eVar = this.f8142b;
        switch (i10) {
            case 0:
                FollowerFollowingData followerFollowingData = (FollowerFollowingData) obj;
                List<UserFollowerFollowing> userFollowerFollowings = followerFollowingData.getUserFollowerFollowings();
                if (userFollowerFollowings != null && !userFollowerFollowings.isEmpty()) {
                    followerFollowingData.getUserFollowerFollowings();
                    g gVar = eVar.f8144y;
                    if (gVar != null) {
                        gVar.u(followerFollowingData.getUserFollowerFollowings());
                    } else {
                        Intrinsics.k("innerFollowerFollowingAdapter");
                        throw null;
                    }
                } else {
                    if (Intrinsics.a(followerFollowingData.getTitleFollowerFollowing(), "Followers")) {
                        ((r8) eVar.f17291u).f5938t.setText(eVar.f22629a.getContext().getString(R.string.no_followers_yet));
                    } else {
                        ((r8) eVar.f17291u).f5938t.setText(eVar.f22629a.getContext().getString(R.string.no_following_yet));
                    }
                    ImageView imageNoFollowersFollowing = ((r8) eVar.f17291u).f5937s;
                    Intrinsics.checkNotNullExpressionValue(imageNoFollowersFollowing, "imageNoFollowersFollowing");
                    zq.f.m0(imageNoFollowersFollowing);
                    TextView noFollowersFollowingText = ((r8) eVar.f17291u).f5938t;
                    Intrinsics.checkNotNullExpressionValue(noFollowersFollowingText, "noFollowersFollowingText");
                    zq.f.m0(noFollowersFollowingText);
                }
                return Unit.f23355a;
            default:
                UserFollowerFollowing it = (UserFollowerFollowing) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                eVar.f8143x.invoke(it);
                return Unit.f23355a;
        }
    }
}

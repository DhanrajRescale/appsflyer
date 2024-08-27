package vd;

import androidx.recyclerview.widget.RecyclerView;
import k7.y1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends gd.d {

    /* renamed from: h, reason: collision with root package name */
    public final String f37965h;

    /* renamed from: i, reason: collision with root package name */
    public final Function1 f37966i;

    /* renamed from: j, reason: collision with root package name */
    public final Function1 f37967j;

    /* renamed from: k, reason: collision with root package name */
    public final Function2 f37968k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f37969l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f37970m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v4, types: [k7.w, java.lang.Object] */
    public d(androidx.lifecycle.o parentLifecycle, String str, Function1 onUserProfileClicked, Function1 onUserChatClicked, Function2 onUserMenuClicked, boolean z10, boolean z11) {
        super(parentLifecycle, new Object());
        Intrinsics.checkNotNullParameter(parentLifecycle, "parentLifecycle");
        Intrinsics.checkNotNullParameter(onUserProfileClicked, "onUserProfileClicked");
        Intrinsics.checkNotNullParameter(onUserChatClicked, "onUserChatClicked");
        Intrinsics.checkNotNullParameter(onUserMenuClicked, "onUserMenuClicked");
        this.f37965h = str;
        this.f37966i = onUserProfileClicked;
        this.f37967j = onUserChatClicked;
        this.f37968k = onUserMenuClicked;
        this.f37969l = z10;
        this.f37970m = z11;
    }

    @Override // d7.v, k7.z0
    public final y1 i(int i10, RecyclerView parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new h(parent, this.f37965h, this.f37966i, this.f37967j, this.f37968k, this.f37969l, this.f37970m);
    }
}

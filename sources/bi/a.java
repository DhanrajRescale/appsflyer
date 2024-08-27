package bi;

import androidx.lifecycle.o;
import androidx.recyclerview.widget.RecyclerView;
import k7.y1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends gd.d {

    /* renamed from: h, reason: collision with root package name */
    public final String f6977h;

    /* renamed from: i, reason: collision with root package name */
    public final Function1 f6978i;

    /* renamed from: j, reason: collision with root package name */
    public final Function1 f6979j;

    /* renamed from: k, reason: collision with root package name */
    public final Function2 f6980k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v4, types: [k7.w, java.lang.Object] */
    public a(o parentLifecycle, String str, e onUserProfileClicked, e onUserChatClicked, be.b onUserMenuClicked) {
        super(parentLifecycle, new Object());
        Intrinsics.checkNotNullParameter(parentLifecycle, "parentLifecycle");
        Intrinsics.checkNotNullParameter(onUserProfileClicked, "onUserProfileClicked");
        Intrinsics.checkNotNullParameter(onUserChatClicked, "onUserChatClicked");
        Intrinsics.checkNotNullParameter(onUserMenuClicked, "onUserMenuClicked");
        this.f6977h = str;
        this.f6978i = onUserProfileClicked;
        this.f6979j = onUserChatClicked;
        this.f6980k = onUserMenuClicked;
    }

    @Override // d7.v, k7.z0
    public final y1 i(int i10, RecyclerView parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new c(parent, this.f6977h, this.f6978i, this.f6979j, this.f6980k);
    }
}
